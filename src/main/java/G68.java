import java.util.Scanner;

public class G68 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long i = 1;
        int j = 0;
        int a = 2;

        /*for(j = 0; j < 63; j++){
            i*=a;
            System.out.println(i);
        }*/

        while(j < 63){
            j++;
            i*=a;
            System.out.println(i);
        }

    }

}
