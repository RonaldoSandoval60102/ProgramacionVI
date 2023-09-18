package proxy;

import java.util.HashMap;
import java.util.Map;

import real.AutenticationGithub;
import real.AutenticationGoogle;
import subject.Autentication;

public class ProxyAutentication  implements Autentication{
    
    private Map<String, Autentication> users = new HashMap<String, Autentication>();  

    public ProxyAutentication() {
        users.put("admin", new AutenticationGoogle());
        users.put("admin123", new AutenticationGithub());
    }

    @Override
    public String login(String email, String password) {
        if (users.containsKey(email)) {
            return users.get(email).login(email, password);
        } else {
            return "Login failed";
        }
    }
}
