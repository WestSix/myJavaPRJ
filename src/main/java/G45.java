import java.util.Scanner;

public class G45 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = "abc";

        System.out.println(a);
        System.out.println(b);

        System.out.println(a==b);

        if(b.equals(a)){
            System.out.println(":)");
        }else{
            System.out.println(":(");
        }

    }

}
