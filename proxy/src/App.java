import proxy.ProxyAutentication;
import subject.Autentication;

public class App {
    public static void main(String[] args) throws Exception {
        Autentication autentication = new ProxyAutentication();
        System.out.println(autentication.login("admin", "admin"));
        System.out.println(autentication.login("admin123", "admin"));
    }
}
