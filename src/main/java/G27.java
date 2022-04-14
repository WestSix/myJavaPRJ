public class G27 {


    public static void main(String[] args) {

        int sum = 0;
        int i=0;

        for (i=0; i<=3; i++){
            System.out.println(sum++);
        }

        System.out.println("");

        sum = 0;

        for (i=0; i<=3; i++){
            System.out.println(++sum);
        }

    }

}
