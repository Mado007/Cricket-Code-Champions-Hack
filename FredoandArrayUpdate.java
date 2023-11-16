import java.util.Scanner;

class TestClass {
    public static void main(String args[]) throws Exception {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] A = new int[N];
        int sum = 0;

        for (int i = 0; i < N; i++) {
            A[i] = scan.nextInt();
            sum += A[i];
        }

        double avg = (double) sum / N; // Using double for more precision
        int mini = (int) Math.ceil(avg); // Round up to ensure all elements are at least avg
        System.out.println(mini);
    }
}
