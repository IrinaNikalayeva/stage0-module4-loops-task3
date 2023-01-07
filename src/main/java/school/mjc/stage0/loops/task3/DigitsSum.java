package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t) {
        if (t < 0) {
            t = t * -1;
        }
        int numberLength = (t + "").length();
        int sum = 0;
        for (int i = 0; i <= numberLength; i++) {
            int tempNum = (int) (t % Math.pow(10, numberLength - i));
            int digit = (int) (tempNum / Math.pow(10, numberLength - 1 - i));
            sum += digit;
        }
        System.out.println(sum);
    }
}
