package pattern.factory;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by jiangry01 on 2018/3/11.
 */
public class Main {
    public static  void main(String args[]){
        Pattern pattern =  Pattern.compile("\\$\\s*(\\w+)\\s*\\$");
        Matcher matcher =  pattern.matcher("$Dn$");
        while(matcher.find()){
            System.out.println(matcher.group(1));
        }

    }
}
