import java.util.Scanner;

public class baitap1 {
    public static void main(String[] args)  {
        double a,b; 
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so a: ");
        a = sc.nextDouble();
        System.out.print("nhap so b: ");
        b = sc.nextDouble();
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " +( a -b) );
        System.out.println("a * b = " + (a*b));
        System.out.println("a / b = " + (a/b));
        System.out.println("a % b = "+(a%b)); 
        if(a > b){
            System.out.println("a>b");
        }else if(a<b){
            System.out.println("a < b");
        }else{
            System.out.println("a = b");
        }
    }
}
