package exceptions;

public class Main {
    public static void main(String[] args) throws CustomException {

        int age =12;

        if(age<18){
            throw new CustomException("not eligable");
        }
    }
}
