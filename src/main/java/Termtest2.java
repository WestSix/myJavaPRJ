import java.util.Scanner;

public class Termtest2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if(a%3 == 0 && a%5 == 0){
            System.out.println("3과 5의 배수입니다.");
        }else if(a%3 == 0){
            System.out.println("3의 배수 입니다.");
        }else if(a%5 == 0){
            System.out.println("5의 배수 입니다.");
        }else{
            System.out.println("3과 5의 배수가 아닙니다.");
        }
    }

}
