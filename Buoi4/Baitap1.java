package Buoi4;
import java.util.Scanner;
class Sach{
    private String ms;
    private String ts;
    private String tg;
    private String nxb;
    private int nam;

    public Sach(){

    }

    public Sach(String ms2, String ts2, String tg2, String nxb2, int nam2){
        ms = ms2;
        ts = ts2;
        nxb = nxb2;
        tg = tg2;
        nam = nam2;
    }

    public String getms(){
        return ms;
    }

    public void setms(String ms2){
        ms = ms2;
    }

    public String getts(){
        return ts;
    }

    public void setts(String ts2){
        ts = ts2;
    }

    public String gettg(){
        return tg;
    }

    public void settg(String tg2){
        tg = tg2;
    }

    public String getnxb(){
        return nxb;
    }

    public void setxnb(String nxb2){
        nxb = nxb2;
    }

    public int getnam(){
        return nam;
    }

    public void setnam(int nam2){
        nam = nam2;
    }

    public void NhapThongtin(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã sách: ");
        ms = scanner.nextLine();
        System.out.print("Nhập tên sách: ");
        ts = scanner.nextLine();
        System.out.print("Nhập tên tác giả: ");
        tg = scanner.nextLine();
        System.out.print("Nhập nhà xuất bản: ");
        nxb = scanner.nextLine();
        System.out.print("Nhập năm xuất bản: ");
        nam = scanner.nextInt();
    }

    public void XuaThongtin(){
        System.out.printf("Mã sách: %s%n", ms);
        System.out.printf("Tên sách: %s%n", ts);
        System.out.printf("Tên tác giả: %s%n", tg);
        System.out.printf("Nhà xuất bản: %s%n", nxb);
        System.out.printf("Năm xuất bản: %d%n", nam);
    }
}
public class Baitap1 {
    public static void main(String[] args){
        Sach[] a = new Sach[5];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0 ; i < 5; i++){
            System.out.println("Nhập thông tin cho quyển thứ " + (i +1));
            a[i] = new Sach();
            a[i].NhapThongtin();
        }

        System.out.println("Thông tin của các quyển sách là: ");
        for(int i = 0; i < 5; i++){
            System.out.println("Quyển thứ " + (i +1));
            a[i].XuaThongtin();
            System.out.println("\n");
        }
    }
}
