import java.util.Scanner;

public class Bai2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Câu a
        System.out.print("Nhập vào số nguyên dương n cho biểu thức S(n): ");
        int nS = scanner.nextInt();

        while (nS <= 0) {
            System.out.print("Giá trị không hợp lệ, vui lòng nhập lại. ");
            nS = scanner.nextInt();
        }

        double sumS = 0;
        for (int i = 1; i <= nS; i++) {
            sumS += 1.0 / i;
        }
        //Câu b:
        System.out.print("Nhập vào số nguyên dương n cho biểu thức P(n): ");
        int nP = scanner.nextInt();

        while (nP <= 0) {
            System.out.print("Giá trị không hợp lệ, vui lòng nhập lại. ");
            nP = scanner.nextInt();
        }

        int sumP = 0;
        int factorial = 1;
        for (int i = 1; i <= nP; i++) {
            factorial *= i;
            sumP += factorial;
        }

        System.out.println("Giá trị của S(n) là: " + sumS);
        System.out.println("Giá trị của P(n) là: " + sumP);
    }
}
