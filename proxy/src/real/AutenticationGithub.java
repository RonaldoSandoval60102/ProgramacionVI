package real;

import subject.Autentication;

public class AutenticationGithub implements Autentication{
    
    @Override
    public String login(String email, String password) {
        if (email.equals("admin123") && password.equals("admin")) {
            return "github: Login success";
        } else {
            return "github: Login failed";
        }
    }
}
