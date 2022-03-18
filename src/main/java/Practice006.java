import java.util.Scanner;

public class Practice006 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        for(int i = 1; i<100; i++){
            for(int j = 1; j<100; j++){
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
