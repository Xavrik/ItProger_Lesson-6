public class User {

    String login = "John123";
    String email = "test@test.com";

    public User(){

    }

    public User(String login, String email){
        this.login = login;
        this.email = email;
    }

    public String countLogin(String login){
        String str = new String(login);
        if ( str.length() < 5)
            return "Login must contain at least 5 characters";
        else return login;
    }

    public String checkEmail(String email){
        String s = email , sub = "@",point = ".";
        if (s.contains(sub) && s.contains(point) )
        return  email;
        else
        return "Incorrect email";
    }


}
