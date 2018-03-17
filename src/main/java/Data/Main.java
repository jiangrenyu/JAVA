package Data;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jiangry01 on 2018/3/11.
 */
public class Main {
    public static void main(String args[]){
        Map<String,String> map = new HashMap<String,String>();
        map.put("a","1");
        map.put("a","2");
        System.out.println(map.get("c"));
        String str = "20180308083000";
        System.out.println(str.substring(10,12));
    }
}
