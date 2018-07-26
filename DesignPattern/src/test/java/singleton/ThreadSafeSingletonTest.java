package singleton;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class ThreadSafeSingletonTest {

    @Test
    public void TestCreation() {
        List<Future<ThreadSafeSingleton>> futureTSS = new ArrayList<>();
        ExecutorService pool = Executors.newFixedThreadPool(16);
        for (int i = 0;i < 100;i++) {
            Future future = pool.submit(ThreadSafeSingleton.getInstance());
            futureTSS.add(future);
        }

        Set<ThreadSafeSingleton> allThreadSafeSingletons = new HashSet<>();

        futureTSS.forEach(tss -> {
            try {
                allThreadSafeSingletons.add(tss.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        });
        int size = allThreadSafeSingletons.size();
        Assert.assertEquals(1,size);

    }

}