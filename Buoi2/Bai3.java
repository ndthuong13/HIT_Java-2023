import java.util.Scanner;
public class Bai3 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số nguyên dương: ");
        int n = scanner.nextInt();

        while(n <= 0){
            System.out.println("Giá trị không hợp lệ, vui lòng nhập lại. ");
            n = scanner.nextInt();
        }

        if (n <= 2){
            System.out.println(n + " không là số nguyên tố. ");
        }
        else if (n < 0){
            System.out.println("Giá trị không hợp lệ, vui lòng nhập lại. ");
        }

        int s = 0;
        for(int i = 1; i <= n; i++){
            if (n % i == 0){
                s += 1;
            }
        }

        if(s > 2){
            System.out.println(n + " không là số nguyên tố.");
        }
        else if(s == 2){
            System.out.println(n + " là số nguyên tố.");
    }
    }
}

