import java.util.Arrays;
import java.util.Scanner;

public class G70 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int[] arr = new int[a];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.println(arr[arr.length - 1]);
        System.out.println(a);

    }

}
