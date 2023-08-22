package Buoi4;

import java.util.Scanner;

class SinhVien{
    private int maSinhvien;
    private String hoten;
    private double diemToan;
    private double diemLy;
    private double diemHoa;

    public SinhVien(){

    }

    public SinhVien(String hoten2, int maSinhvien2, double diemToan2, double diemHoa2, double diemLy2){
        maSinhvien = maSinhvien2;
        hoten = hoten2;
        diemToan = diemToan2;
        diemLy = diemLy2;
        diemHoa = diemHoa2;
    }

    public int getMaSinhvien(){
        return maSinhvien;
    }

    public void setMaSinhvien(int maSinhvien2){
        maSinhvien = maSinhvien2;
    }

    public String getHoten(){
        return hoten;
    }

    public void setHoten(String hoten2){
        hoten = hoten2;
    }

    public double getDiemToan(){
        return diemToan;
    }

    public void setDiemToan(double diemToan2){
        diemToan = diemToan2;
    }

    public double getDiemLy(){
        return diemLy;
    }

    public void setDiemLy(double diemLy2){
        diemLy = diemLy2;
    }

    public double getDiemHoa(){
        return diemHoa;
    }

    public void setDiemHoa(double diemHoa2){
        diemHoa = diemHoa2;
    }

    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào mã sinh viên: ");
        maSinhvien = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập vào họ và tên: ");
        hoten = scanner.nextLine();
        System.out.println("Nhập vào điểm toán: ");
        diemToan = scanner.nextDouble();
        System.out.println("Nhập vào điểm lý: ");
        diemLy = scanner.nextDouble();
        System.out.println("Nhập vào điểm hoá: ");
        diemHoa = scanner.nextDouble();
    }

    public double diemTB(){
        return (diemToan + diemLy + diemHoa)/3;
    }

    public void xuat(){
        System.out.printf("Mã sinh viên: %s%n", maSinhvien);
        System.out.printf("Họ và tên: %s%n", hoten);
        System.out.printf("Điểm toán: %s%n", diemToan);
        System.out.printf("Điểm lý: %s%n", diemLy);
        System.out.printf("Điểm Hoá: %s%n", diemHoa);
        System.out.printf("Điểm trung bình: %s%n", diemTB());
    }

}

public class Baitap3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        SinhVien[] ds = new SinhVien[5];

        for (int i = 0 ; i < 5 ; i++ ){
            System.out.println("Nhập thông tin sinh viên thứ " + (i + 1));
            ds[i] = new SinhVien();
            ds[i].nhap();
        }

        System.out.println("Thông tin sinh viên: ");
        for(int i = 0 ; i < 5 ; i++){
            System.out.println("Sinh viên thứ " + (i+1));
            ds[i].xuat();
            System.out.println("\n");
        }
    }
}
