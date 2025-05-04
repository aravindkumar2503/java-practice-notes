
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class eee {

    public static void main(String[] args) {
  List<String> list1=Arrays.asList("a","b","c");
  List<Integer> list2=Arrays.asList(1,2,3);
  List<Object> mergedList=mergeList(list1,list2);
  System.out.println(mergedList);
  

    }
    
        public static List<Object>mergeList(List<?> list1,List<?>list2){
            List<Object> result=new ArrayList<>();
            int i=0,j=0;
            {
                while(i<list1.size()||j<list2.size())
                {
                    if(i<list1.size())result.add(list1.get(i));
                    if(j<list2.size())result.add(list2.get(j));
                    j++;
                    i++;
                }
            }
            return result;
        }
    }
    

