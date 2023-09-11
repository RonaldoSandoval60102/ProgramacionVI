public class Prototype {
    
    private String name;
    private int age;

    public Prototype(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Prototype(Prototype prototype) {
        this.name = prototype.name;
        this.age = prototype.age;
    }

    public Prototype clone() {
        return new Prototype(this);
    }

    public String toString() {
        return "Name: " + this.name + ", Age: " + this.age;
    }

    public static void main(String[] args) {
        Prototype prototype = new Prototype("John", 20);
        System.out.println(prototype);
        Prototype clone = prototype.clone();
        System.out.println(clone);
    }
}
