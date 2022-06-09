import java.util.Scanner;

public class G0518_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str;

        System.out.printf("문자열 입력 : ");
        str = sc.nextLine();

        System.out.println();

        if(!str.startsWith("[")){
            System.out.printf("[");
        }

        for(int i = 0; i < str.length(); i++){
            System.out.printf("%c", str.charAt(i));
        }

        if(!str.endsWith("]")){
            System.out.printf("]");
        }

        System.out.println();

    }

}
