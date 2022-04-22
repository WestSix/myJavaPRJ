import java.util.Scanner;

public class G44 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("실행 횟수 입력 : ");
        int a = sc.nextInt();
        System.out.println("");
        System.out.print("종료 횟수 입력 : ");
        int b = sc.nextInt();
        System.out.println("");
        int i;

        for(i = 1; i <= a; i++){
            System.out.println(i + " 회 실행했습니다.");
            if(i == b){
                break;
            }
        }

        System.out.println("");
        System.out.println("종료했습니다.");

    }

}