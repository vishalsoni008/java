package keywords.abstract_keyword;

abstract class Vishal{

     abstract int sum(int a, int b);
}

public class AbstractClassDemo extends Vishal {
    @Override
    int sum(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) {

        AbstractClassDemo abstractClassDemo = new AbstractClassDemo();

        System.out.println(abstractClassDemo.sum(1,2));
    }
}
