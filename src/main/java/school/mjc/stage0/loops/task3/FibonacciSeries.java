package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int prevFib = 0;
        int nextFib = 1;
        System.out.println(prevFib);
        System.out.println(nextFib);
        for (int i = 3; i <= lastFibonacci; i++) {
            int fibonacciNum = prevFib + nextFib;
            System.out.println(fibonacciNum);
            prevFib = nextFib;
            nextFib = fibonacciNum;

        }
    }
}
