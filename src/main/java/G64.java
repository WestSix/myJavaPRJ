public class G64 {

    public static void main(String[] args) {

        int a;
        int sum = 0;

        for(a = 50; a < 101; a++){
            if(a % 3 != 0 && a % 7 != 0 && a % 11 != 0){
                sum += a;
            }
        }
        System.out.println(sum);

    }

}