import java.util.Scanner;

public class G13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("1~4 중에 선택하세요 : ");

        int a = sc.nextInt();

        System.out.println("");

        if(a == 1){
            System.out.println("1을 선택했다.");
        }else if(a == 2){
            System.out.println("2를 선택했다.");
        }
        else if(a == 3){
            System.out.println("3을 선택했다.");
        }
        else if(a == 4){
            System.out.println("4를 선택했다.");
        }
        else{
            System.out.println("다른 숫자를 선택했다.");
        }

    }

}
