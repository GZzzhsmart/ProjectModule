package arg.com;

import org.junit.Test;

import java.util.Calendar;


public class test  {
    @Test
    public void testUtil() throws Exception{
        //把指定的Calendar转换成各种格式
        System.out.println("calendar日期类："+Calendar.getInstance().getTime());
    }
}
