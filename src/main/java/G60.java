import java.util.Scanner;

public class G60 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int i;
        int j;

        for(i = 1; i <= a; i++){
            for(j = a; j > 0; j--){
                if(i < j){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println("");

        }

    }

}