package Buoi5;


import java.util.Scanner;

class School{
    private static String Name;
    private static String Date;

    public School(){

    }

    public School(String Name, String Date){
        this.Name = Name;
        this.Date = Date;
    }

    public String getName(){
        return Name;
    }

    public void setName(String Name){
        this.Name = Name;
    }

    public String getDate(){
        return Date;
    }

    public void setDate(String Date){
        this.Date = Date;
    }
}

class Faculty{
    private static String Name;
    private static String Date;
    private School x = new School();

    public Faculty(){

    }

    public Faculty(String Name, String Date){
        this.Name = Name;
        this.Date = Date;
    }

    public String getName(){
        return Name;
    }

    public void setName(String Name){
        this.Name = Name;
    }

    public String getDate(){
        return Date;
    }

    public void setDate(String Date){
        this.Date = Date;
    }
    //Thieu phan truyen du lieu cho x cua School

    public void Nhap(Scanner scanner){
        System.out.println("Nhap vao ten cua truong: ");
        x.setName(scanner.nextLine());
        System.out.println("Nhap vao ngay vao truong: ");
        x.setDate(scanner.nextLine());

        System.out.println("Nhap vao ten cua khoa: ");
        Name = scanner.nextLine();
        System.out.println("Nhap vao ngay hoc: ");
        Date = scanner.nextLine();
    }

    public void Xuat(){
        System.out.println("Ten cua truong: " + this.x.getName());
        System.out.println("Ngay vao truong: " + this.x.getDate());
        System.out.println("Ten khoa: " + this.Name);
        System.out.println("Ngay vao hoc: " + this.Date);
    }
}

class Student{
    private static String Name;
    private static String Class;
    private static Double Score;
    private Faculty y = new Faculty();

    public Student(){

    }

    public Student(String Name, String Class, Double Score){
        this.Name = Name;
        this.Class = Class;
        this.Score = Score;
    }

    public String getName(){
        return Name;
    }

    public void setName(String Name){
        this.Name = Name;
    }

    public String getClasses(){
        return Class;
    }

    public void setClasses(String Class){
        this.Class = Class;
    }

    public Double getScore(){
        return Score;
    }

    public void setScore(Double Score){
        this.Score = Score;
    }

    public void Nhap(Scanner scanner){
        y.Nhap(scanner);

        System.out.println("Nhap vao ten cua sinh vien: ");
        Name = scanner.nextLine();
        System.out.println("Nhap vao ten cua lop: ");
        Class = scanner.nextLine();
        System.out.println("Nhap vao diem so cua sinh vien: ");
        Score = scanner.nextDouble();
    }

    public void Xuat(){
        y.Xuat();
        System.out.println("Ten sinh vien la: " + this.Name);
        System.out.println("Lop: " + this.Class);
        System.out.println("Diem: " + this.Score);
    }
}




public class baitap2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap vao so luong sinh vien: ");
        int n = scanner.nextInt();

        while (n <= 0){
            System.out.println("So luong sinh vien khong hop le, vui long nhap lai");
                n = scanner.nextInt();
        }

        Student[] a = new Student[n];

        for (int i = 0; i < n; i++){
            Student b = new Student();
            System.out.println("Thong tin sinh vien thu " + (i+1) + ": ");
            scanner.nextLine();
            b.Nhap(scanner);
            a[i] = b;
        }

        System.out.println("\nThong tin sinh vien: ");
        for (int i = 0; i < n; i++){
            System.out.println("Sinh vien thu " + (i+1) + ": ");
            a[i].Xuat();
        }
    }
}
