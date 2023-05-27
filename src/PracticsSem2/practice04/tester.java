package PracticsSem2.practice04;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

public class tester {
    public static void main(String[] args) throws Exception {
        ExecutorServiceTest execService = new ExecutorServiceTest(3);
        Callable<String> func = () -> {
            Thread.sleep(1000);
            return "Поток: " + Thread.currentThread().getName();
        };
        List<Callable<String>> funcList = new LinkedList<>();
        funcList.add(func);
        funcList.add(func);
        funcList.add(func);
        funcList.add(func);
        funcList.add(func);
        funcList.add(func);

        List<Future<String>> futureList = execService.invokeAll(funcList);
        for (var i : futureList) {
            System.out.println(i.get());
        }
    }
}
