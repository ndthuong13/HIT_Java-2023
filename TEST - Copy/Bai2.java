package TEST;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Person{
    private String name;
    private int age;
    private String gender;


    public Person() {
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap vao ten sinh vien : ");
        this.name = scanner.nextLine();
        System.out.println("Nhap vao tuoi cua sinh vien: ");
        this.age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap vao gioi tinh cua sinh vien: ");
        this.gender = scanner.nextLine();
    }

    public void output(){
        System.out.println("Ten sinh vien: " + this.name);
        System.out.println("Tuoi sinh vien " + this.age);
        System.out.println("Gioi tinh sinh vien: " + this.gender);
    }


}

class Address{
    private String city;
    private String district;

    public Address() {
    }

    public Address(String city, String district) {
        this.city = city;
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }


    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao thanh pho: ");
        this.city = scanner.nextLine();
        System.out.println("Nhap vao huyen: ");
        this.district = scanner.nextLine();
    }

    public void output(){
        System.out.println("Thanh pho: " + this.city);
        System.out.println("Huyen: " + this.district);
    }

}

class Classroom{
    private int classId;
    private int numberOfStudent;
    private Student student = new Student();

    public Classroom() {
    }

    public Classroom(int classId, int numberOfStudent) {
        this.classId = classId;
        this.numberOfStudent = numberOfStudent;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public int getNumberOfStudent() {
        return numberOfStudent;
    }

    public void setNumberOfStudent(int numberOfStudent) {
        this.numberOfStudent = numberOfStudent;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao ma lop: ");
        this.classId = scanner.nextInt();
        System.out.println("Nhap vao so luong sinh vien: ");
        this.numberOfStudent = scanner.nextInt();
        for (int i = 0 ; i < numberOfStudent ;i++){
            student.input();
        }

    }

    public void output(){
        System.out.println("Ma lop: " + this.classId);
        System.out.println("So luong sinh vien: " + this.numberOfStudent);
        for(int i = 0; i < numberOfStudent; i++){
            student.output();
        }
    }
}

class Student{
    private int id;
    private double gpa;
    private Person person = new Person();
    private Address address = new Address();

    public Student() {
    }

    public Student(int id, Address address, double gpa) {
        this.id = id;
        this.address = address;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
        person.input();
        System.out.println("Nhap vao ma sinh vien: ");
        this.id = scanner.nextInt();
        System.out.println("Nhap vao dia chi sinh vien: ");
        address.input();
        System.out.println("Nhap vao GPA: ");
        this.gpa = scanner.nextDouble();
    }
    public void output(){
        System.out.println("Thong tin sinh vien: ");

        person.output();
        System.out.println("Ma sinh vien: " + this.id);

        System.out.println("Dia chi sinh vien: ");
        address.output();

        System.out.println("Diem GPA: " + this.gpa);

    }
}

public class Bai2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Classroom classroom = new Classroom();
        classroom.input();
        classroom.output();
    }
}
