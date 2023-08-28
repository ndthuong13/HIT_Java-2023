package Buoi5;

import java.util.Scanner;

class NSX{
    private static String MaNSX;
    private static String TenNSX;
    private static String DcNSX;

    public NSX(){

    }
    public NSX(String MaNSX, String TenNSX, String DcNSX){
        this.MaNSX = MaNSX;
        this.TenNSX = TenNSX;
        this.DcNSX = DcNSX;
    }

    public String getMaNSX(){
        return MaNSX;
    }
    public void setMaNSX(String MaNSX){
        this.MaNSX = MaNSX;
    }

    public String getDcNSX(){
        return DcNSX;
    }
    public void setDcNSX(String DcNSX){
        this.DcNSX = DcNSX;
    }

    public String getTenNSX(){
        return TenNSX;
    }
    public void setTenNSX(String TenNSX){
        this.TenNSX = TenNSX;
    }

    public void Nhap(Scanner scanner){

        System.out.println("Nhap vao ma nha san xuat: ");
        MaNSX = scanner.nextLine();

        System.out.println("Nhap vao ten nha san xuat: ");
        TenNSX = scanner.nextLine();

        System.out.println("Nhap vao dia chi nha san xuat: ");
        DcNSX = scanner.nextLine();
    }

    public void Xuat(){
        System.out.println("Ma nha san xuat: " + this.MaNSX);
        System.out.println("Ten nha san xuat: " + this.TenNSX);
        System.out.println("Dia chi nha san xuat: " + this.DcNSX);
    }
}

class Hang{
    private static String MaHang;
    private static String TenHang;
    private NSX a = new NSX();

    public Hang() {

    }
    public Hang(String Mahang, String Tenhang){
        this.MaHang = MaHang;
        this.TenHang = TenHang;
    }

    public String getMaHang(){
        return MaHang;
    }
    public void setMaHang(String Mahang){
        this.MaHang = Mahang;
    }

    public String getTenHang(){
        return TenHang;
    }
    public void setTenHang(String TenHang){
        this.TenHang = TenHang;
    }

    public void Nhap(Scanner scanner){
        System.out.println("Nhap vao ma hang: ");
        MaHang = scanner.nextLine();
        System.out.println("Nhap vao ten hang: ");
        TenHang = scanner.nextLine();
    }

    public void Xuat(){
        System.out.println("Ma hang: " + this.MaHang);
        System.out.println("Ten hang: " + this.TenHang);
    }
}



public class Baitap1 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Hang a = new Hang();
        NSX b = new NSX();
        a.Nhap(scanner);
        b.Nhap(scanner);
        a.Xuat();
        b.Xuat();
    }
}
