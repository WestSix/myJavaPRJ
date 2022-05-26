import java.util.Scanner;

public class G72 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x, a, b, uf, uh, oh;

        System.out.print("숫자 제시 : ");
        x = sc.nextInt();
        System.out.println();
        System.out.print("몇까지 부를 수 있음?? : ");
        if(x < 50){
            System.out.println("1 ~ 3 까지");
        }else if(x < 100){
            System.out.println("1 ~ 5 까지");
        }else{
            System.out.println("1 ~ n 까지");
        }
        a = sc.nextInt();
        System.out.println();


    }

}
