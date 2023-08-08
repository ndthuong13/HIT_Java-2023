import java.lang.Math;
import java.util.Scanner;
public class Bai4{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào giá trị của a: ");
        Double a = scanner.nextDouble();

        System.out.println("Nhập vào giá trị của b: ");
        Double b = scanner.nextDouble();

        System.out.println("Nhập vào giá trị của c: ");
        Double c = scanner.nextDouble();

        System.out.println("Giải phương trình " + a + "x^4 + " + b + "x^2 + " + c + "= 0");

        if(a == 0){// phuong trinh tro thanh dang bx^2 + c = 0
            if( b == 0){// =>0x^2 + c(0) = 0
                if( c == 0){
                    System.out.println("Phương trình có vô số nghiệm.");
                }
                else{ //tức là 0x^2 + c(!=0) = 0 => vô lí
                    System.out.println("Phương trình vô nghiệm.");
                }
            }
            else{
                if (-c/b < 0){
                    System.out.println("Phương trình vô nghiệm.");
                }
                else{
                    System.out.println("Phương trình có nghiệm x1 = " + Math.sqrt(-c/b));
                    System.out.println("Phương trình có nghiệm x2 = " + "-" + Math.sqrt(-c/b));
                }
            }
        }
        else if (a != 0){//phương trình có dạng ax^4 + bx^2 + c = 0
            Double delta = b * b - 4 * a * c;
            Double can = Math.sqrt(delta);

            Double t;

            if(delta < 0){//TH1: PHƯƠNG TRÌNH VÔ NGHIỆM
                System.out.println("Phương trình vô nghiệm.");
            }

            else if(delta == 0){//TH2: PHƯƠNG TRÌNH CÓ NGHIỆM KÉP: t1 = t2 = t mà t = x^2
                t = -b/(2*a);
                if(t < 0){
                    System.out.println("Phương trình vô nghiệm.");
                }
                else if(t == 0){
                    System.out.println("Phương triình có nghiệm duy nhất x1 = x2 = 0");
                }
                else{//Trường hợp x1 > 0
                    System.out.println("Phương trình có hai nghiệm: ");
                    System.out.println("x1 = " + Math.sqrt(t));
                    System.out.println("x2 = -" + Math.sqrt(t));
                }
            }
            else{//TH3: PHƯƠNG TRÌNH CÓ CÁC NGHIỆM
                Double x1, x2;

                x1 = (-b + can) / (2 * a);
                x2 = (-b - can) / (2 * a);

                if ( x1 < 0 && x2 < 0){
                    System.out.println("Phương trình vô nghiệm.");
                }

                if (x1 > 0 && x2 > 0){
                    System.out.println("Phương trình có 4 nghiệm: ");
                    System.out.println("x1 = " + Math.sqrt(x1));
                    System.out.println("x2 = -" + Math.sqrt(x1));
                    System.out.println("x3 = " + Math.sqrt(x2));
                    System.out.println("x4 = -" + Math.sqrt(x2));
                }

                else if(x1 > 0 &&  x2 == 0){
                    System.out.println("Phương trình có ba nghiệm ");
                    System.out.println("x1 = " + Math.sqrt(x1));
                    System.out.println("x2 = -" + Math.sqrt(x1));
                    System.out.println("x3 = 0" );
                }

                else if(x1 == 0 && x2 > 0){
                    System.out.println("Phương trình có ba nghiệm ");
                    System.out.println("x1 = " + Math.sqrt(x2));
                    System.out.println("x2 = -" + Math.sqrt(x2));
                    System.out.println("x3 = 0" );
                }

                if(x1 > 0 && x2 < 0){
                    System.out.println("Phương trình có hai nghiệm ");
                    System.out.println("x1 = " + Math.sqrt(x1));
                    System.out.println("x2 = -" + Math.sqrt(x1));
                }

                if( x1 < 0 && x2 > 0){
                    System.out.println("Phương trình có hai nghiệm ");
                    System.out.println("x1 = " + Math.sqrt(x2));
                    System.out.println("x2 = -" + Math.sqrt(x2));
                }



            }
        }


    }
}
