package Buoi3;

import java.util.Scanner;

public class baitap1 {
    //Nhap mang
    static void Input(int a[], int n){
        Scanner scanner = new Scanner(System.in);
        for( int i=0; i<n; i++){
            System.out.print("Nhap a["+i+"] = ");
            a[i] = scanner.nextInt();
        }
    }
    //Xuat mang
    static  void Output(int a[], int n){
        for(int i=0; i<n; i++){
            System.out.print(a[i]+ " ");
        }
    }
    //Ham dem
    static int Dem(int a[],int n, int x){
        int dem = 0;
        for(int i=0; i<n; i++){
            if(x == a[i]){
                dem++;
            }
        }
        return dem;
    }

    static void Dem_phan_tu(int a[], int n){
        for(int i=0; i<n; i++){
            int dem =0;
            for(int j=0; j<i; j++){
                if(a[i]==a[j]){
                    dem++;
                }
            }
            if(dem==0) {
                System.out.println(" ");
                System.out.println(a[i] + " xuat hien " + Dem(a, n, a[i]) + " lan. ");
            }else {
                continue;
            }
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap n = ");
        int n = scanner.nextInt();
        int a[] = new int[n];
        Input(a,n);
        Output(a,n);
        Dem_phan_tu(a,n);
    }
}
