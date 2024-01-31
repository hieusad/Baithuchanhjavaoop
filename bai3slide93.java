import java.util.Scanner;

public class bai3slide93 {
    public static void main(String[] args) {
        String n;
        System.out.print("nhap ten: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextLine();
        int tuoi ;
        System.out.print("nhap tuoi: ");
        tuoi = sc.nextInt();
        if (tuoi<16){
            System.out.println("ban " + n +"o tuoi vi thanh nien");
        }else if(tuoi>16 && tuoi<=18){
            System.out.println("ban "+ n +" o tuoi truong thanh");

        }else{
            System.out.println("ban "+n+" da gia");
        }

    }
}
