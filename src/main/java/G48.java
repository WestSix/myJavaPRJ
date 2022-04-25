import java.util.Scanner;

public class G48 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        int min = 0;
        int max = 0;

        for(int i = 0; i < a; i++){
            arr[i] = sc.nextInt();

            if(arr[i] > arr[0]){
                max = arr[0];
            }else if(arr[i] < arr[0]){
                min = arr[0];
            }

        }

        System.out.println(min + " " + max);

    }

}
