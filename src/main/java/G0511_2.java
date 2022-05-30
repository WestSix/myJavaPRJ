import java.util.*;

public class G0511_2 {

    public static void main(String[] args) {

        //ArrayList 생성

        List<Map<String, String>> li = new ArrayList<>();

        //Map 생성

        Map<String, String> map = new HashMap<>();

        map.put("name", "이협건");
        map.put("email", "hglee67@kopo.ac.kr");
        map.put("addr", "서울");
        map.put("dept", "데이터분석과");

        li.add(map);

        map = null; // put, new HashMap 까지 사라짐

        //Map 추가

        map = new HashMap<>();

        map.put("name", "홍길동");
        map.put("email", "g.d.hong@kopo.ac.kr");
        map.put("addr", "경기");
        map.put("dept", "시각디자인과");

        li.add(map);

        map = null;

        //Map 추가

        map = new HashMap<>();

        map.put("name", "윤서준");
        map.put("email", "2220110020@kopo.ac.kr");
        map.put("addr", "서울");
        map.put("dept", "데이터분석과");

        li.add(map);

        map = null;

        //출력

        //for문
        int listSize = li.size();

        for(int i = 0; i < listSize; i++){

            Map rMap = li.get(i);
            System.out.println("-------------------------------");
            System.out.println("name: " + rMap.get("name"));
            System.out.println("email: " + rMap.get("email"));
            System.out.println("addr: " + rMap.get("addr"));
            System.out.println("dept: " + rMap.get("dept"));
            System.out.println("-------------------------------");

        }

        //foreach문
        for(Map<String, String> rMap : li){
            System.out.println("-------------------------------");
            System.out.println("name: " + rMap.get("name"));
            System.out.println("email: " + rMap.get("email"));
            System.out.println("addr: " + rMap.get("addr"));
            System.out.println("dept: " + rMap.get("dept"));
            System.out.println("-------------------------------");
        }

        //람다식
        li.forEach(rMap ->{
            System.out.println("-------------------------------");
            System.out.println("name: " + rMap.get("name"));
            System.out.println("email: " + rMap.get("email"));
            System.out.println("addr: " + rMap.get("addr"));
            System.out.println("dept: " + rMap.get("dept"));
            System.out.println("-------------------------------");
        });

        //Iterator
        Iterator<Map<String, String>> it = li.iterator();

        while(it.hasNext()){
            Map<String, String> rMap = it.next();
            System.out.println("-------------------------------");
            System.out.println("name: " + rMap.get("name"));
            System.out.println("email: " + rMap.get("email"));
            System.out.println("addr: " + rMap.get("addr"));
            System.out.println("dept: " + rMap.get("dept"));
            System.out.println("-------------------------------");
        }

    }

}
