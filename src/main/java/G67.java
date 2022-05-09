import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class G67 {

    public static void main(String[] args) {

        //ArrayList 구현 방식으로 메모리에 올리기
        List<String> li = new ArrayList<>();

        //LinkedList 구현 방식으로 메모리에 올리기
        //List<String> li = new LinkedList<>();

        //List 객체에 데이터 추가하기
        li.add("윤윤");
        li.add("김김");
        li.add("이이");
        li.add("박박");

        //List의 데이터 수 구하기
        int listSize = li.size();

        //List 객체에 저장된 값 출력하기
        //여러 데이터가 저장되기 때문에 내용을 확인하기 위해서는 반복문을 사용함

        for(int i = 0; i < listSize; i++){
            System.out.println("이름 : " + li.get(i));
        }

        System.out.println();

        //foreach문으로 조회 / Java 1.8 부터 활용
        for(String name : li){
            System.out.println("이름 : "+ name);
        }

        System.out.println();

        //최근 개발자들에게 인기 높은 컬렉션 객체를 조회하는 방법
        //람다식 : Java 1.8 부터 정상적으로 지원
        //단, 적용 가능한 경우가 제한적
        li.forEach(name -> System.out.println("이름 : " + name));

        System.out.println();

        //람다식 이전까지 사용된 반복문 처리 방법
        //Java 1.7 이전에 많이 활용됨

        //Iterator을 활용한 방법 -> 개발 유지보수에 좋음
        Iterator<String> it = li.iterator();

        while(it.hasNext()){
            String name = it.next();
            System.out.println("이름 : " + name);
        }

    }

}
