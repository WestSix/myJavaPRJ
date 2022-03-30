import java.util.Scanner;

public class Termtest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if (a%2 == 0){
            System.out.println("짝");
        }else{
            System.out.println("홀");
        }

    }

}
