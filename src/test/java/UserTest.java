import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class UserTest {

     User user = null;

    @BeforeAll
    public void setUp() {
        user = new User();
    }

    @AfterAll
    public void tearDown(){ user = null;}

    @DisplayName("Проверка создания объекта с двумя апарметрами")
    @Test
    public void testUserPlusParametr() {
        User userTest = new User("BOBMarley", "bob@marley.com");
        String testLogin = userTest.login;
        String testEmail = userTest.email;
        assertEquals(userTest.login, testLogin);
        assertEquals(userTest.email, testEmail);

    }

    @Nested
    @DisplayName("Проверка установки значений")
    public class CheckElements {

        @DisplayName("Проверка создания объекта без параметров")
        @Test
        public void testUser() {
            String testLogin = user.login;
            String testEmail = user.email;
            assertEquals(user.email,testEmail);
            assertEquals(user.login, testLogin);

        }

        @DisplayName("Установка email")
        @Test
        public void testEmail() {
            String test = "test@test.com";
            assertEquals(user.checkEmail(user.email), test);
        }

        @DisplayName("Установка login")
        @Test
        public void testCountLogin() {
            String test = "John123";
            assertEquals(test, user.countLogin(user.login));
        }


    }

}

