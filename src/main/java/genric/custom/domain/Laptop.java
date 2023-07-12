package genric.custom.domain;

public class Laptop<T> {

    T obj;
    public Laptop(T obj){
        this.obj = obj;
    }

    public Laptop(){

    }

    public T val(){
        return this.obj;
    }

    public void getData(T element){
        System.out.println(element.getClass()+" "+element);
    }
}
