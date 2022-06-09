import java.util.Scanner;

public class G0518_5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str, strRep, strSub, strAry[];

        System.out.print("문자열 입력 : ");
        str = sc.nextLine();

        strRep = str.replace(" ", "$");
        strSub = str.substring(3, 8);
        strAry = str.split(" ");

        System.out.println("입력 문자열 : " + str);
        System.out.println("바뀐 문자열 : " + strRep);
        System.out.println("일부 문자열 : " + strSub);

        for(int i = 0; i < strAry.length; i++){
            System.out.println("분리한 문자열" + i + " : " + strAry[i]);
        }

    }

}
