package real;

import subject.Autentication;

public class AutenticationGoogle  implements Autentication{

    @Override
    public String login(String email, String password) {
        if (email.equals("admin") && password.equals("admin")) {
            return "google: Login success";
        } else {
            return "google: Login failed";
        }
    }
}
