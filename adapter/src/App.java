import adaptee.Mobile;
import adapter.AdapterMovil;

public class App {
    public static void main(String[] args) throws Exception {
        Mobile movil = new Mobile();
        AdapterMovil adapter = new AdapterMovil(movil);
        adapter.up();
        adapter.down();
    }
}
