package xml;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by jiangry01 on 2018/3/9.
 */
public class Main {

    public static void main(String args[]){
        try {
            get();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void get() throws Exception{
        //InputStream stream = new FileInputStream(Thread.currentThread().getContextClassLoader().getResource("D:\\系统文件\\测试文件\\java\\b.xml").getPath());
        InputStream stream = new FileInputStream("D:\\系统文件\\测试文件\\java\\xml\\b.xml.xml");
        XMLInputFactory factory = XMLInputFactory.newInstance();
        XMLStreamReader parser = factory.createXMLStreamReader(stream);
        List<StudentGridlb> studentGridlbList = new ArrayList<>();
        StudentGridlb studentGridlb =  null;

        while (parser.hasNext()) {

            System.out.println("------------------   "+parser.getEventType());
            int event = parser.next();
            if (event == XMLStreamConstants.START_DOCUMENT) {
                System.out.println("stax 解析xml 开始.....");
            }
            if (event == XMLStreamConstants.START_ELEMENT) {
                System.out.println("解析开始。。。。。。。。");
                if (parser.getLocalName().equals("stu_id")) {
                    studentGridlb = new StudentGridlb();
                    String a = parser.getElementText();
                    studentGridlb.setStu_id(a);
                    System.out.println("打印元素:  "   +a);
                } else if (parser.getLocalName().equals("stu_name")) {
                    String b = parser.getElementText();
                    studentGridlb.setStu_name(b);
                    System.out.println("打印元素:  "   +b);
                } else if (parser.getLocalName().equals("stu_age")) {

                    int c = Integer.parseInt(parser.getElementText());
                    studentGridlb.setStu_age(c);
                    System.out.println("打印元素:  "   +c);
                } else if (parser.getLocalName().equals("stu_birthday")) {
                    DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                    Date d = format.parse(parser.getElementText());
                    studentGridlb.setStu_birthday(d);
                    System.out.println("打印元素:  "   +d);
                }
            }
            if (event == XMLStreamConstants.END_ELEMENT) {
                if (parser.getLocalName().equals("studentGridlb")) {
                    studentGridlbList.add(studentGridlb);

                }
            }
            if (event == XMLStreamConstants.END_DOCUMENT) {
                System.out.println("stax 解析xml 结束.....");
            }
        }
        parser.close();
    }
}
