import java.util.Scanner;

public class G6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a >= 0 && b >= 45){
            System.out.println(a+" "+(b-45));
        }else if(a == 0){
            System.out.println((a+24-1)+" "+(b+60-45));
        }else if(b <= 44){
            System.out.println((a-1)+" "+(b+60-45));
        }

    }

}