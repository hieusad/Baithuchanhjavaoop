import java.util.Scanner;

public class phuongtrinhbac2 {
    public static void main(String[] args) {
        double a,b,c,x1,x2,delta;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so a: ");
        a = sc.nextDouble();
        System.out.print("nhap so b: ");
        b = sc.nextDouble();
        System.out.print("nhap so c: ");
        c = sc.nextDouble();
        delta = Math.pow(b,2) - (4*a*c);
        if(delta < 0){
            System.out.println("phuong trinh vo nghiem");
        }else if(delta == 0){
            x1 = -b/(2*a);
            System.out.println("phuong trinh co nghiem kep : x1 = x2 = " + x1);

        }else {
            x1 = (-b + Math.sqrt(delta))/(2*a);
            x2 = (-b - Math.sqrt(delta))/(2*a);
            System.out.println("phuong trinh co 2 nghiem : x1 ="+x1 + "x2 = "+x2);
        }
    }
}
