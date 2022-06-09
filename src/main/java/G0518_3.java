public class G0518_3 {

    public static void main(String[] args) {

        String str = "Java 공부 중, Java 꿀잼";

        System.out.println("문자열 : " + str);

        System.out.printf("처음에 나오는 Java 위치 : ");
        System.out.println(str.indexOf("Java"));
        System.out.printf("마지막에 나오는 Java 위치 : ");
        System.out.println(str.lastIndexOf("Java"));

    }

}
