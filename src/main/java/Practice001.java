import java.util.Scanner;

public class Practice001 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = a + b;
        int d = b - a;
        int e = a * b;
        int f = b / a;
        int g = b % a;

        System.out.println("더하기 결과는 : " + c);
        System.out.println("빼기 결과는 : " + d);
        System.out.println("곱하기 결과는 : " + e);
        System.out.println("나누기 결과는 : " + f);
        System.out.println("나머지 결과는 : " + g);

        int h = 1;
        ++h;
        System.out.println(h++);
        System.out.println(h);

        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        float j = sc.nextFloat();
        String k = sc.nextLine();

        System.out.println(i + j + k);
    }
}
