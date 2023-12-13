package loops;

import java.util.Scanner;

public class SimpleForLoop {

    public static void main(String[] args) {

        int n, i=1, sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n");
        n = scanner.nextInt();
        while ( i < n ){
            sum = sum + 1;
            i++;
        }
        System.out.println("Sum Of First " + n + "Natural Number Is" + sum);

    }
}
