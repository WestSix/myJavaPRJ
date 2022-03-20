import java.util.Scanner;

public class Bf9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for (int i = 1; i <= a; i++){
            for (int j = a; j > 0; j--){
                if(i<j){
                    System.out.printf(" ");
                }else{
                    System.out.printf("*");
                }
            }
            System.out.println("");
        }

    }

}
