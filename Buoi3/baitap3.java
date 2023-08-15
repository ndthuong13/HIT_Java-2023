package Buoi3;

import java.util.Scanner;

public class baitap3 {
    static void input(int a[], int n){
        Scanner scanner = new Scanner(System.in);
        for( int i=0; i<n; i++){
            System.out.print("Nhập phần tử a["+i+"] = ");
            a[i] = scanner.nextInt();
        }
    }
    static void output(int a[], int n){
        for(int i=0; i<n; i++){
            System.out.print(a[i]+ " ");
        }
    }

    static void Sap_xep(int a[], int n){
        int temp;
        for(int i = 0; i < n; i++){
            for(int j = n-1; j > i; j--){
                if(a[j] < a[j-1]){
                    temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap n = ");
        int n = scanner.nextInt();
        int a[] = new int[n];
        input(a,n);
        Sap_xep(a,n);
        System.out.println("\nMảng sắp xếp tăng dần là: ");
        output(a,n);
    }
}
