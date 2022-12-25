package interview.one_to_ten;

public class SwapTwoNumberWithoutThired2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        a = b-a;
        b = b-a;
        a = b+a;

        System.out.println("a = "+a +"\n"+ "b = "+b);


    }
}
