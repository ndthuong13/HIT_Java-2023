package Buoi6;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Date {
    private Byte year;
    private Byte month;
    private Byte day;

    public Date() {

    }

    public Date(Byte year, Byte month, Byte day) {
        super();
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public Byte getYear() {
        return year;
    }

    public void setYear(Byte year) {
        this.year = year;
    }

    public Byte getMonth() {
        return month;
    }

    public void setMonth(Byte month) {
        this.month = month;
    }

    public Byte getDay() {
        return day;
    }

    public void setDay(Byte day) {
        this.day = day;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ngay: ");
        this.day = scanner.nextByte();
        System.out.print("Nhap thang: ");
        this.month = scanner.nextByte();
        System.out.print("Nhap nam (Nhap hai so cuoi): ");
        this.year = scanner.nextByte();
        scanner.nextLine();
    }


    public void output() {
        System.out.println("Ngay sinh nhat: " + this.day + "/" + this.month + "/" + this.year);
    }

}

class Person {
    protected String name;
    protected String age;
    protected String address;
    protected Date birthDay;

    public Person() {

    }

    public Person(String name, String age, String address, Date birthDay) {
        super();
        this.name = name;
        this.age = age;
        this.address = address;
        this.birthDay = birthDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten: ");
        String name = scanner.nextLine();
        System.out.print("Nhap tuoi: ");
        String age = scanner.nextLine();
        System.out.print("Nhap dia chi: ");
        String address = scanner.nextLine();
        birthDay = new Date();
        System.out.println("Nhap ngay sinh nhat: ");
        birthDay.input();
        this.name = name;
        this.age = age;
        this.address = address;
        this.birthDay = birthDay;
    }

    public void output() {
        System.out.println("Ten: " + this.name);
        System.out.println("Tuoi: " + this.age);
        System.out.println("Dia chi: " + this.address);
        System.out.println("Ngay sinh nhat: ");
        this.birthDay.output();
    }

}

class Student extends Person{
    private String id;
    private String clasS;
    private String school;

    public Student() {

    }

    public Student(String id, String clasS, String school, String name, String age, String address, Date birthDay) {
        super(name, age, address, birthDay);
        this.id = id;
        this.clasS = clasS;
        this.school = school;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClasS() {
        return clasS;
    }

    public void setClasS(String clasS) {
        this.clasS = clasS;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap id: ");
        this.id = scanner.nextLine();
        System.out.print("Nhap lop: ");
        this.clasS = scanner.nextLine();
        System.out.print("Nhap truong: ");
        this.school = scanner.nextLine();
        System.out.println("Nhap thong tin: ");
        super.input();
    }

    public void output() {
        System.out.println("Truong: " + this.school);
        System.out.println("Lop: " + this.clasS);
        System.out.println("Id: " + this.id);
        super.output();
    }

}

public class Baitap2 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so luong sinh vien: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        List<Student> list = new ArrayList<>();
        for (int i = 0; i < n;i++){
            Student student = new Student();
            System.out.println("Sinh vien thu: " + (i + 1));
            student.input();
            list.add(student);
        }

        System.out.println("Thong tin sinh vien: ");
        for(Student s : list){
            s.output();
        }
    }
}
