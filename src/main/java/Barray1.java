import java.util.Scanner;

public class Barray1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int c = sc.nextInt();
        int[] n = new int[c];
        int min = n[0];
        int max = n[0];

        for(int i = 0; i < c; i++){

            n[i] = sc.nextInt();
            if(min >= n[i]){
                max = n[i];
            }else if(min <= n[i]){
                min = n[i];
            }

        }
        System.out.println(max+" "+min);

    }

}
