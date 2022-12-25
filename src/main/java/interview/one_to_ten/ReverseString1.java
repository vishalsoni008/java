package interview.one_to_ten;

public class ReverseString1 {
    public static void main(String[] args) {
        String name = "vishal";

        String reverse = "";

        for (int i=name.length()-1;i>=0;i--){
            reverse = reverse+name.charAt(i);
        }
        System.out.println(reverse);
    }
}
