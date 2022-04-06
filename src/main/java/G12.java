import java.util.Scanner;

public class G12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a;

        System.out.printf("1~4 중에 선택하세요 : ");

        a = sc.nextInt();

        System.out.println("");

        switch (a) {
            case 1:
                System.out.println("1을 선택했다");
                break;
            case 2:
                System.out.println("2를 선택했다");
                break;
            case 3:
                System.out.println("3을 선택했다");
                break;
            case 4:
                System.out.println("4를 선택했다");
                break;
            default:
                System.out.println("다른 숫자를 선택했다.");
        }

    }

}
