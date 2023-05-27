package PracticsSem2.practice04;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceTest extends ThreadPoolExecutor implements ExecutorService {
    ExecutorServiceTest(int countOfThreads){
        super(countOfThreads, countOfThreads * 2, 10, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>(2));
    }
}
