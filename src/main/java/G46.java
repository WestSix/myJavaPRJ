public class G46 {

    public static void main(String[] args) {

        int sum = 0;
        int i;

        for(i = 1; i <= 10; i++){

            if (i % 3 == 0)
                continue;
            sum += i;

        }

        System.out.println("1 ~ 100 까지의 합 (3의 배수 제외) : " + sum);

    }

}