import java.util.Scanner;
public class Homework4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("두 수를 입력하세요: ");
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        System.out.printf("두 수의 최대공약수는 %d입니다.", gcd(m,n));
    }

    public static int gcd(int m, int n) {
        if (n == 0)
        {
            return m;
        }
        else if (m % n == 0) {
            return n;
        }
        else {
            return gcd(n, m%n);
        }
    }
}
