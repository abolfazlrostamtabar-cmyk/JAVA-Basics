import java.util.Scanner;

public class Q7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int n = input.nextInt();
        if (isPrime(n)) {
            System.out.println(n + " is prime.");
        } else {
            System.out.println(n + " is not prime.");
        }

        System.out.print("Prime numbers less than " + n + ": ");
        printPrimesLessThan(n);

        System.out.print("Enter two numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("GCD = " + gcd(a, b));
        System.out.println("LCM = " + lcm(a, b));

        input.close();
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrimesLessThan(int n) {
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}
