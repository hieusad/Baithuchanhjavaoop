import java.util.Scanner;

public class baitapslide95bai8 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so phan tu cua mang: ");
        n = sc.nextInt();
        int A[] = new int[n];
        for (int i= 0; i <n;i++){
            System.out.println("nhap cac phan tu cua mang: ");
            A[i]= sc.nextInt();
        }
        int tong=0;
        for(int i = 0; i <n;i++){
              tong+= A[i];

        }
        int trungbinh = tong / n;
        System.out.println("trung binh cong cua cac phan tu la: "+trungbinh);
    }
}
