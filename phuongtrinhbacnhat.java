import java.util.Scanner;

public class phuongtrinhbacnhat {

    public static void main(String[] args) {
        double a,b,x;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap a: ");
        a = sc.nextDouble();
        System.out.print("nhap b: ");
        b = sc.nextDouble();
        if(a==0){
            x = b;
        }else {
            x = -b / a;
        }
        System.out.println("x = "+ x);
    }
}