import java.util.Scanner;

public class Practice010 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int h = in.nextInt();
        int m1 = in.nextInt();
        int m2 = in.nextInt();
        int s;

        s = (h*60) + m1 + m2;
        h = s/60;
        m1 = s%60;

        if(h >= 24){
            h = h - 24;
        }

        System.out.println(h +" "+ m1);

    }

}
