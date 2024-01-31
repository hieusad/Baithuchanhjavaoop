import java.util.Scanner;

public class bai5slide94 {
    public static void main(String[] args) {
        int n , sum = 0;
        int m = 0;
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.print("nhap vao so nguyen thu " + (m + 1) + ":");
            n = sc.nextInt();
            sum += n;
            m++;
    }while(sum<100);
    System.out.println("tong cua cac chu so da nhap la: "+sum);
    }
}
   