public class G30 {

    public static void main(String[] args) {

        int i;
        int sum = 0;

        for(i = 1; i <= 100; i++){
            if(i % 3 == 0 || i % 5 == 0){
                sum += i;
            }
        }
        System.out.println(sum);

    }

}