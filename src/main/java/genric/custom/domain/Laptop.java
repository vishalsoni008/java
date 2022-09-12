package genric.custom.domain;

public class Laptop<T> {

    private T type;

    private String name;

    private String company;

    public T getType() {
        return type;
    }

    public void setType(T type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
