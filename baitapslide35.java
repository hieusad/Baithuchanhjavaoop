import java.util.Scanner;

public class baitapslide35 {
    public static void main(String[] args) {
        int sothunhat, sothuhai;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so thu nhat: ");
        sothunhat = sc.nextInt();
        System.out.print("nhap so thu 2: ");
        sothuhai = sc.nextInt();
        if (sothunhat > sothuhai){
            System.out.println("so nho nhat trong 2 so nhap vao la: "+sothuhai);

        }else{
            System.out.println("so nho nhat trong 2 so nhap vao la: "+sothunhat);
        }
        
    }
}
