import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,1,1,2,1,2};

        Map<Integer, Integer> map = new HashMap<>();

        for (int i=0;i< arr.length;i++){

            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }
            else
                map.put(arr[i], 1);

        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("element " + entry.getKey() + " with freq of " + entry.getValue());
        }
    }
}
