import java.util.Scanner;

public class G11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if(a % 2 == 0){
            System.out.println(a + " 는 짝수입니다.");
        }else{
            System.out.println(a + " 는 홀수입니다.");
        }

    }
}