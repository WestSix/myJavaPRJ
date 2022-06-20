import java.util.Scanner;

public class G0525_5 {

    /*public static int coffee_machine(int button){

        System.out.println("1. 뜨거운 물 준비");
        System.out.println("2. 종이컵 준비");

        switch(button){
            case 1:
                System.out.println("3. 아");
                break;
            case 2:
                System.out.println("3. 헤이즐럿 아");
                break;
            case 3:
                System.out.println("3. 아 + 샷1");
                break;
            default:
                System.out.println("3. 란듐");
                break;
        }

        System.out.println("4. 물 붓기");
        System.out.println("5. 젓기");

        return 0;

    }*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int coffee;
        int ret;

        System.out.print("몇 번 커피? ");
        coffee = sc.nextInt();

        System.out.println("");

        //ret = coffee_machine(coffee);

        CoffeeMachine cm = new CoffeeMachine();
        cm.coffee_machine(coffee);

        System.out.println("");
        System.out.println("커피나옴");
        System.out.println("");

        /*if(ret ==0){
            System.out.println("함수 실행 성공");
        }*/

    }

}
