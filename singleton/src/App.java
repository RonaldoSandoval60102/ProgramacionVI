public class App {
    public static void main(String[] args) throws Exception {
        CoffeSingleton coffeSingleton = CoffeSingleton.getInstance();
        coffeSingleton.print();
    }
}
