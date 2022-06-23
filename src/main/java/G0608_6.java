import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class G0608_6 {

    public static void main(String[] args) throws Exception{

        FileInputStream fis = new FileInputStream("c:/tmp/data1.txt");
        InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);

        int ch;

        //아스키 코드만 읽는 방식
        /*while( (ch = fis.read()) != -1){
            System.out.print((char) ch);
        }*/

        //utf-8 방식을 이용해 한글까지 읽는 방식
        while((ch = isr.read()) != -1){
            System.out.print((char) ch);
        }

        fis.close();

    }

}
