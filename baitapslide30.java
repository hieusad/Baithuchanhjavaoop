import java.util.Scanner;

public class baitapslide30 {
    public static void main(String[] args) {
        int n,phandu;
        int tong = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so n: ");
        n = sc.nextInt();
        while (n == 0) {
            System.out.println("vui long nhap 1 so nguyen lon hon 0!");
        }
        while(n > 0){
            phandu = n % 10;
            tong += phandu;
            n /= 10;
        }
        System.out.print("tong cac chu so cua so nguyen la: "+ tong);
        
    }
}
