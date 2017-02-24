package threads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * Created by jalpeshrajani on 24/02/17.
 */
public class myRunnableFuture implements RunnableFuture<Integer> {
    @Override
    public void run() {

    }

    @Override
    public boolean cancel(boolean mayInterruptIfRunning) {
        return false;
    }

    @Override
    public boolean isCancelled() {
        return false;
    }

    @Override
    public boolean isDone() {
        return false;
    }

    @Override
    public Integer get() throws InterruptedException, ExecutionException {
        return null;
    }

    @Override
    public Integer get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
        return null;
    }
}
