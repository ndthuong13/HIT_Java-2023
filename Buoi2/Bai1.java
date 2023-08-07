import java.util.Scanner;

public class Bai1{
    public static void main(String[] args) {
        //Bài tập 1
        System.out.println("Bài tập 1: ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên dương n: ");
        int n = scanner.nextInt();
        while (n <= 0) {
            System.out.print("Giá trị không hợp lệ, vui lòng nhập lại.");
            n = scanner.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

