import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {

    static User user = null;

    @BeforeAll
    public static void setUp(){
        user = new User();
    }

    @Disabled
    @Test
    public void testUser(String login, String email){

    }

    //class CheckElements {
        @Disabled
        @Test
        public void testEmail() {
            String email = "testtest.com";
            user.checkEmail(email);
            String test = "test@test.com";
            assertEquals(email, test);
        }

        @Test
        public String testCountLogin(String login) {
           // String login = "John";
            String test = user.countLogin(login);
//            String test = "John";
//            assertEquals(test, login);
            return test;

        }

   //}

}

