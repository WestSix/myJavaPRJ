public class G66 {

    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50};
        int count, size;

        count = arr.length;
        size = count * Integer.BYTES;

        System.out.println("배열 arr[]의 요소 개수는 " + count + " 개 입니다.");
        System.out.println("배열 arr[]의 요소 전체 크기는 " + size + " 바이트 입니다.");

    }

}
