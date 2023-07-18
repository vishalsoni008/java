import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
        Map<Integer,Integer> map = new HashMap<>();

        int max= Integer.MAX_VALUE;
        int maxValue = 0;

        for(int i=0;i<arr.size();i++){
            if(map.containsKey(arr.get(i))){
                map.put(arr.get(i), (map.get(arr.get(i)))+1);
            }
            else{
                map.put(arr.get(i), 1);
            }
        }

        map.forEach((k,v) -> System.out.println(k+" -> "+v));

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            maxValue = Math.max(maxValue, entry.getValue());
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() == maxValue){
                max = Math.min(max, entry.getKey());
            }
        }

        return max;
    }
     public static void main(String[] args) {
         System.out.println(migratoryBirds(List.of(1,2,3,4,5,4,3,2,1,3,4)));

         int x = 1;
         int y=1;

         while(x<25){
             int z = x;
             x = x+y;
             y = z;
         }
         System.out.println(x);
    }
}