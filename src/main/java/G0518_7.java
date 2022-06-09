public class G0518_7 {

    public static void main(String[] args) {

        String log = "111.222.33.44 - - [11/Jun/2012:22:12:32 +0900] \"GET /w/custom/jmnote20120124.ico HTTP/1.1\" 304 - \"-\" \"Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 6.1; Trident/5.0; SLCC2; .NET CLR 2.0.50727; .NET CLR 3.5.30729; .NET CLR 3.0.30729; .NET4.0C; MS-RTC LM 8)\"";

        String[] arr = log.split("\\.");

        System.out.println("log : " + arr[0]);

        int pos = log.indexOf(" ");
        System.out.println(pos);

        String ip = log.substring(0, pos);
        System.out.println("ip : " + ip);

        String[] item = log.split(" ");
        String time = item[3].substring(1);
        //System.out.println("time : " + time[3]);
        System.out.println("time : " + time);

        /*int start = log.indexOf("[");
        int finish = log.lastIndexOf("]");
        String arr[] = log.substring(start + 1, finish).split(" ");

        System.out.println(arr[0]);*/
    }

}