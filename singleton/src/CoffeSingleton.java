public class CoffeSingleton {
    
    private static CoffeSingleton instance;

    private CoffeSingleton() {
    }

    public static CoffeSingleton getInstance() {
        if (instance == null) {
            instance = new CoffeSingleton();
        }
        return instance;
    }

    public void print() {
        System.out.println("Hello, World!");
    }

}
