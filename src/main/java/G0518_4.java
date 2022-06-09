public class G0518_4 {

    public static void main(String[] args) {

        String str1 = "Java 공부 중 Java 꿀잼";
        String str2 = str1.replace("Java", "자바");

        String str3 = "Java 공부 중 Java 꿀잼";
        String str4 = str1.substring(0, 4);

        String str5 = "IT,CookBook,Java";
        String str6[] = str1.split(",");

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
        System.out.println(str6);

    }

}
