import java.util.Scanner;

public class G65 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("배열 몇 칸을 원하니? ");
        int[] arr = new int[sc.nextInt()];
        int sum = 0;

        System.out.println();

        for(int i = 0; i < arr.length; i++){
            System.out.print( (i+1) +" 번째 숫자 입력 : ");
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        System.out.println();

        for(int j = 0; j < arr.length; j++){
            System.out.println("arr[" + j + "] = " + arr[j]);
        }

        System.out.println();

        System.out.println("배열에 들어있는 수의 합 : " + sum);

    }

}
