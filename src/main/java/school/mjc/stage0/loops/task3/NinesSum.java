package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum = 0;
        for (int i = 1; i <= lengthOfLastNumber ; i++) {
            String tempNum = "";
            for (int j = 0; j < i; j++) {
                tempNum += "9";
            }
            sum += Integer.parseInt(tempNum);
        }
        System.out.println(sum);
    }
}
