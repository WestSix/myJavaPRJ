import java.util.Scanner;

public class G20 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.printf("시작 값 입력 : ");
        int a = sc.nextInt();
        System.out.println("");

        System.out.printf("끝 값 입력 : ");
        int b = sc.nextInt();
        System.out.println("");

        System.out.printf("증가 값 입력 : ");
        int c = sc.nextInt();
        System.out.println("");

        int d = a;
        int e = b;
        int f = c;

        if(b > a){
            for (int i = a; i <= b; i+=c){
                sum += i;
            }
            System.out.println("시작 값 [" + d + "]부터 끝 값 [" + e + "]까지 [" + f + "]씩 증가한 값을 더한 결과는 [" + sum + "]입니다.");
        }else{
            System.out.println("끝 값이 시작 값보다 작습니다!");
        }

    }

}
