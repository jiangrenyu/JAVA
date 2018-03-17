package csv;

import com.csvreader.CsvWriter;

import java.io.FileWriter;
import java.io.Writer;
import java.nio.charset.Charset;


/**
 * Created by jiangry01 on 2018/3/10.
 */
public class CSVDemo {
   public static void writeCSV(){
       //定义一个csv写入路径
       String destFile = "D:\\工作文档\\广西移动\\广西邻区性能改造\\test2.csv";
       try{
           Writer writer = new FileWriter(destFile);
           CsvWriter cw = new CsvWriter(writer, '|');
           String [] header = {"a","b","c"};
           cw.writeRecord(header);
           for(int i=0;i<20;i++){
               String tmps[] = {i+"q-",i+"w-",i+"e-"};
               cw.writeRecord(tmps);
           }
           cw.close();
           writer.close();
           System.out.println("文件已经写入");
       }catch(Exception e){
           e.printStackTrace();
       }
   }

   public static void main(String args[]){
       writeCSV();
   }
}
