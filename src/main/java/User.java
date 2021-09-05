public class User {

    String login = "john";
    String email = "test@test.com";

    public User(){

    }

    public User(String login, String email){
        this.login = login;
        this.email = email;
    }

    public String countLogin(String login){
        String str = new String(login);
        if ( str.length() > 5)
            return login;
        else return "Слишком короткое наименование логина";
    }

    public String checkEmail(String email){
        String s = email , sub = "@";
        String res = "Введите правильный потовый адре";
        if (s.contains(sub))
        return res = email;
        else
        return res;
    }


}
