import java.util.Scanner;

public class Practice004 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();

        for(int b=1; b <= 9; b++){
            System.out.println(a +" * "+ b +" = "+ a*b);
        }

    }

}
