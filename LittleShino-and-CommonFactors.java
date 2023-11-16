import java.util.ArrayList;
import java.util.Scanner;

class TestClass {
    public static void main(String args[]) {
        try (Scanner scan = new Scanner(System.in)) {
            long firstNumber = scan.nextLong();
            long secondNumber = scan.nextLong();

            long largerNumber = Math.max(firstNumber, secondNumber);
            long smallerNumber = Math.min(firstNumber, secondNumber);

            ArrayList<Long> factor = calculateFactors(largerNumber);

            int count = countCommonFactors(smallerNumber, factor);

            System.out.println(count);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static ArrayList<Long> calculateFactors(long num) {
        ArrayList<Long> factors = new ArrayList<>();
        int incrementer = num % 2 == 0 ? 1 : 2;

        for (long i = 1; i <= Math.sqrt(num); i += incrementer) {
            if (num % i == 0) {
                factors.add(i);
                if (i != num / i) {
                    factors.add(num / i);
                }
            }
        }
        return factors;
    }

    private static int countCommonFactors(long num, ArrayList<Long> factors) {
        int count = 0;
        for (int i = 0; i < factors.size(); i++) {
            if ((num % factors.get(i)) == 0) {
                count++;
            }
        }
        return count;
    }
}
