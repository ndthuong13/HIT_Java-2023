package Buoi3;

import java.util.Scanner;

public class baitap2 {
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

    static void chen_phan_tu(int a[], int n, int k, int h){

        if(k<1 || k>n){
            System.out.println("Vị trí không hợp lệ");
        }
        else {

            int array[] = new int[n+1];
            for(int i=0; i<n; i++){
                array[i]=a[i];
            }

            for(int i=n; i>=k; i--){
                array[i]=array[i-1];
            }
            array[k-1]=h;
            n++;

            System.out.print("Mảng sau khi chèn là: ");
            output(array,n);
        }

    }


    static void Xoa_phan_tu(int a[], int n, int k){
        if(k<1 || k>n){
            System.out.println("Vị trí không hợp lệ");
        }
        else {
            for(int i=k-1; i<n-1; i++){
                a[i]=a[i+1];
            }
            n--;
            System.out.print("Mảng sau khi xoá là: ");
            input(a,n);
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap n = ");
        int n = scanner.nextInt();
        int a[] = new int[n];
        input(a,n);
        output(a,n);
        System.out.println("Nhap gia tri can chen la: ");
        int chen = scanner.nextInt();
        System.out.print("Nhap vi tri chen la: ");
        int vitri = scanner.nextInt();
        chen_phan_tu(a,n,vitri,chen);
        System.out.println("Nhap vi tri can xoa la: ");
        int xoa = scanner.nextInt();
        Xoa_phan_tu(a,n,xoa);
    }
}
