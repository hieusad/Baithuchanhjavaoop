import java.util.Scanner;

public class baitapslide40 {
    public static void main(String[] args) {
        int ngay;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so ngay : ");
        ngay = sc.nextInt();
        switch (ngay) {
            case 1:
                System.out.print("thu hai!");
                break;
        case 2:System.out.println("thu 3");
        break;
        case 3: System.out.println("thu 4");
        break;
        case 4: System.out.println("thu nam");
        break;
        case 5: System.out.println("thu 6");
        break;
        case 6: System.out.println("thu 7");
        break;
        case 7: System.out.println("chu nhat");
        break;
            default:System.out.println("so ngay khong hop le!");

                break;
        }
    }
}
