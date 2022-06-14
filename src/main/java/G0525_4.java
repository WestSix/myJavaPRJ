public class G0525_4 {

    public static void main(String[] args) {

        int i = 1, j = 10;

        int k = sum1(i, j);

        System.out.println("k : " + k);

        int m = sum1(10, 11);
        System.out.println("m : " + m);

    }

    public static int sum(int i1, int i2){

        int sum = 0;

        for(int i = i1; i < i2; i++){
            sum += i;
        }

        return sum;

    }

    public static int sum1(int i1, int i2){

        int sum = i1 + i2;

        return sum;

    }

}
