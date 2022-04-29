import java.util.Scanner;

public class G56 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n1, n2, n3;

        System.out.print("시작값 입력 : ");
        n1 = sc.nextInt();

        System.out.print("끝값 입력 : ");
        n2 = sc.nextInt();

        System.out.print("증가값 입력 : ");
        n3 = sc.nextInt();

        if(n1 > n2){
            System.out.println("시작값이 끝값보다 큽니다.");
        }else{
            for(int i = n1; i <= n2; i += n3){
                sum += i;
            }
            System.out.println(n1 + " 에서 " + n2 + " 까지 " + n3 + " 씩 증가한 값의 합 : " + sum);
        }

    }

}
