public class SD {

    static strictfp void squRoot(double  n){

        double d = n*n;
        d = d*d;

        System.out.println(Math.sqrt(d));
    }
    public static void main(String[] args) {

        double pi = 3.14;

        squRoot(pi);
    }
}
