import java.util.Scanner;

public class baitapslide95bai6 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap vao so nguyen: ");
        n = sc.nextInt();
        int giaithua = 1;
        int temp = 1;
        while(temp <= n){
            giaithua *= temp;
            temp ++;
        }
        System.out.println(n +"!" + "= "+giaithua);
    }
}
