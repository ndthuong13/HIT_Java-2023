package Buoi4;

import java.util.Scanner;

class HinhChuNhat{
    private double chieudai;
    private double chieurong;

    public HinhChuNhat(){

    }

    public HinhChuNhat(double chieudai2, double chieurong2){
        chieudai = chieudai2;
        chieurong = chieurong2;
    }

    public double getChieudai(){
        return chieudai;
    }

    public void setChieudai(double chieudai2){
        chieudai = chieudai2;
    }

    public double getChieurong(){
        return chieurong;
    }

    public void setChieurong(double chieurong2){
        chieurong = chieurong2;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chiều dài: ");
        chieudai = scanner.nextDouble();
        System.out.println("Nhập vào chiều rộng: ");
        chieurong = scanner.nextDouble();
    }

    public double DT(){
        return chieudai * chieurong;
    }

    public double CV(){
        return 2 * (chieudai + chieurong);
    }

    public void ve(){
        for (int i = 0; i < chieurong; i++){
            for(int j = 0; j < chieudai; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

public class Baitap2 {
    public static void main(String[] args){
        HinhChuNhat hcn = new HinhChuNhat();
        hcn.input();
        System.out.println("Chiều dài: " + hcn.getChieudai());
        System.out.println("Chiều rộng: " + hcn.getChieurong());
        System.out.println("Diện tich: " + hcn.DT());
        System.out.println("Chu vi: " + hcn.CV());
        System.out.println("Vẽ hình chữ nhật: ");
        hcn.ve();
    }
}
