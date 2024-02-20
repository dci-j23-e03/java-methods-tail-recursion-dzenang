import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        getFibonacci(scanner);
    }

    public static void getFibonacci(Scanner scanner) {
        System.out.println("How many elements in the Fibonacci sequence you would like: ");
        int lengthOfSeries = scanner.nextInt();

        StringBuilder sb = new StringBuilder();
        StringBuilder sbTail = new StringBuilder();
        for (int numberInSeries = 0; numberInSeries < lengthOfSeries; numberInSeries++) {
            sb.append(fibonacci(numberInSeries) + " ");
            sbTail.append(fibonacciTail(numberInSeries, 0, 1) + " ");
        }

        System.out.println(sb);
        System.out.println(sbTail);
    }

    private static int fibonacci(int i) {
        // 0, 1, 1, 2, 3, 5, 8, 13, ...
        if (i == 0) {
            return 0;
        } else if (i == 1) {
            return 1;
        } else {
            return fibonacci(i - 1) + fibonacci(i - 2);
        }
    }

    private static int fibonacciTail(int i, int beforePrevious, int previous) {
        if (i == 0) {
            return beforePrevious;
        } else {
            return fibonacciTail(i - 1, previous, beforePrevious + previous);
        }
    }
}
