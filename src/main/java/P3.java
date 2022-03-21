import java.util.ArrayList;
import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList();
        int num=sc.nextInt();
        for(int i=0;i<num;i++) {
            int input=sc.nextInt();
            list.add(input);
        }
        int biggest=list.get(0);
        int smallest=list.get(0);
        for(int i=1;i<num;i++) {
            int temp=list.get(i);
            if(temp>biggest) biggest=temp;
            if(temp<smallest) smallest=temp;
        }
        System.out.println(smallest+" "+biggest);
    }
}