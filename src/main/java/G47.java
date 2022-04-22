public class G47 {

    public static void main(String[] args) {

        int sum = 0;
        int i;

        for(i = 1; i <= 100; i++){
            if(i % 3 != 0){
                sum += i;
            }
        }

        System.out.println(sum);

    }

}