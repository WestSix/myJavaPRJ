import java.util.Scanner;

public class Bif5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();

        if(45 > m){
            if(h >= 1 && h<=23){
                System.out.println((h-1)+" "+(m+60-45));
            }else if(h<=0){
                System.out.println((h+24-1)+" "+(m+60-45));
            }
        }else{
            System.out.println(h+" "+(m-45));
        }

    }

}
