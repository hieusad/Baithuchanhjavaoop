import java.util.Scanner;

public class baitapslide81 {

    public static void main(String[] args) {
        int h,c;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so hang cua ma tran: ");
        h =sc.nextInt();
        System.out.print("nhap so cot cua ma tran: ");
        c =sc.nextInt();
        int A [][] = new int[h][c];
        for(int i = 0; i < h ;i++){
            for(int j = 0 ;j<c;j++){
                System.out.println( "A["+i+"] ["+j+"] = ");
                A [i][j]= sc.nextInt();

            }
        }
        int max = A[0][0];
        for (int i = 0;i<h;i++){
            for(int j = 0;j<c;j++){
                 if(max < A[i][j]){
                    max = A[i][j];
                 }
            }
        }
          System.out.print("Phan tu lon nhat cua mang la:"+ max);
    }
}