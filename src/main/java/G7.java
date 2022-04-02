import java.util.Scanner;

public class G7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = (a*60)+b+c;

        if((d/60) >= 24){
            System.out.println((d/60)-24+" "+(d%60));
        }else{
            System.out.println((d/60)+" "+(d%60));
        }

    }

}
