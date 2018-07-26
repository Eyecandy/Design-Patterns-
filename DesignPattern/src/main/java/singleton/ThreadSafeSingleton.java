package singleton;

public class ThreadSafeSingleton  {
    private static ThreadSafeSingleton threadSafeSingleton = null;

    private ThreadSafeSingleton() {}

    public static ThreadSafeSingleton getInstance() {

        synchronized (threadSafeSingleton) {
            if (threadSafeSingleton == null) {
                threadSafeSingleton = new ThreadSafeSingleton();
            }
            return threadSafeSingleton;
        }
    }



}
