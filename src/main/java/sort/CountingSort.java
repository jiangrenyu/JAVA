package sort;

import java.util.*;

/**
 * Created by jiangry01 on 2018/3/15.
 */
public class CountingSort {
    /**
     *
     * @param array 数组
     * @param last 数组长度
     * @param <T>  限制类型
     */
    public static <T extends  Comparable<T>> void  CS(T[] array,int last){
         Map<T,Integer> frequency = new TreeMap<T,Integer>();
         List<T> sortArray = new ArrayList<T>();
         for(T t : array){ //遍历数组
              try{
                  frequency.put(t,frequency.get(t)+1); //TreeMap  保存 数组元素, 数组元素+1
              }catch(Exception e){
                  frequency.put(t,1);  //异常时候置1
              }
         }

         for(Map.Entry<T,Integer> element : frequency.entrySet()){//4,23,6,78,1,54,231,9,12
              for(int j=0;j<element.getValue();j++){
                  T key = element.getKey();
                  System.out.println("key: "+  key);
                  sortArray.add(key);
              }
             System.out.println("-----------------------------");
         }

         for(int i=0;i<array.length;i++){
               array[i] = sortArray.get(i);
         }
    }
    public static void main(String args[]){
          Integer [] arr = {4,23,6,78,1,54,231,9,12};
          int last = arr.length;
          System.out.println("排序前： ");
          for(int i=0;i<arr.length;i++){
              System.out.println(arr[i]+  "   ");
          }
          System.out.println();
          CS(arr,last);
          System.out.println("排序完成后: ");
          for(int i=0;i<arr.length;i++){
                   System.out.println(arr[i]);
          }
    }


}
