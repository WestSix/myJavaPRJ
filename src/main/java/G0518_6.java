public class G0518_6 {

    public static void main(String[] args) {

        String str = "   한글   ABCD   efgh   ";

        System.out.println("문자열 : [" + str + "]" );
        System.out.println("대문자로 : [" + str.toUpperCase() + "]");
        System.out.println("소문자로 : [" + str.toLowerCase() + "]");
        System.out.println("앞, 뒤 공백제거 : [" + str.trim() + "]");
        System.out.println("전체 공백제거 : [" + str.replaceAll(" ", "") + "]");
    }

}
