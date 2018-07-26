package singleton;

import java.util.concurrent.Callable;

public class ThreadSafeSingleton implements Callable<ThreadSafeSingleton> {
    private static ThreadSafeSingleton threadSafeSingleton = null;

    private ThreadSafeSingleton() {}

    public static synchronized ThreadSafeSingleton getInstance() {

        if (threadSafeSingleton == null) {
            threadSafeSingleton = new ThreadSafeSingleton();
        }
        return threadSafeSingleton;

    }


    @Override
    public ThreadSafeSingleton call() throws Exception {
        return getInstance();
    }
}
