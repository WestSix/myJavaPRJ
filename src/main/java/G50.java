import java.util.Scanner;

public class G50 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for(int i = 0; i < a; i++){
            for(int j = a; j >= 0; j--){
                if(j > i){
                    System.out.print("*");
                }else{
                    System.out.print("");
                }
            }
            System.out.println("");
        }

    }

}