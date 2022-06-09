public class CoffeeMachine {

    public int coffee_machine(int button){

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

    }

}
