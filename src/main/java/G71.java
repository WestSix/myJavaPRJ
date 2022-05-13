import java.util.ArrayList;
import java.util.List;

public class G71 {

    public static void main(String[] args) {

        //list = 홍길동, 이협건, 고길동, 둘리

        List<String> pList = new ArrayList<>();

        pList.add("홍길동");
        pList.add("이협건");
        pList.add("고길동");
        pList.add("둘리");

        int ls = pList.size();

        for(int i = 0; i < ls; i++){
            System.out.println("이름 : " + pList.get(i));
        }

    }

}
