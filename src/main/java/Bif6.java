import java.util.Scanner;

public class Bif6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();

        int sum = (h*60)+m1+m2;

        int fh = sum/60;
        int fm = sum%60;

        if(fh>=24){
            System.out.println((fh-24)+" "+fm);
        }else{
            System.out.println(fh+" "+fm);
        }

    }

}
