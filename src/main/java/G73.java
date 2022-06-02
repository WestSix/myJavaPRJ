import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class G73 {

    public static void main(String[] args) {

        List<Map<String, String>> list = new ArrayList<>();

        Map<String, String> map = new HashMap<>();

        map.put("name", "이협건");
        map.put("dept", "데이터분석");

        list.add(map);

        map = null;

        map = new HashMap<>();

        map.put("name", "홍길동");
        map.put("dept", "정보보안");

        list.add(map);

        /*list.forEach(rMap ->{
            System.out.println("name: " + rMap.get("name"));
            System.out.println("dept: " + rMap.get("dept"));
        });*/

        //int listSize = list.size();

        for(int i = 0; i < list.size(); i++){
            Map rMap = list.get(i);
            System.out.println("name: " + rMap.get("name"));
            System.out.println("dept: " + rMap.get("dept"));
        }

        for(Map<String, String> rMap : list){
            System.out.println("name: " + rMap.get("name"));
            System.out.println("dept: " + rMap.get("dept"));
        }

    }

}
