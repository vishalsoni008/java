package interview.ont_to_ten;

public class ReverseAString_1 {
    public static void main(String[] args) {
        String str = "vishal Soni";

        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
    }
}
