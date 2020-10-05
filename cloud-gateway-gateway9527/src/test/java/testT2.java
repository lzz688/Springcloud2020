import java.time.ZonedDateTime;

public class testT2 {

    public static void main(String[] args) {
        //得到默认时区
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);
        //2020-09-21T22:24:23.207+08:00[Asia/Shanghai]
    }
}
