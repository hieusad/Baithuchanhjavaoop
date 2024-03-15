import java.util.Scanner;

public class baitapslide74 {
public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    do {
        System.out.println("Nhap vao so phan tu cua mang: ");
        n = sc.nextInt();
    }while (n <= 0);
    int A[]= new int[n];
    for (int i=0;i<n;i++){
        System.out.println("nhap vao so phan tu thu "+i+" cua mang: " );
        A[i]=sc.nextInt();

    }
    int Tong = 0;
    for (int i = 0;i <n; i++){
        if (A[i] % 2 == 0){
            Tong += A[i];
        }
        
    }
    System.out.println("Tong cac so chan la : "+Tong);
}
    
}