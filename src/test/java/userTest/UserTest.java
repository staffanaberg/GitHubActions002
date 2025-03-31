package userTest;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import user.User;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
//ny kommentar
    @Test
    public void testCreateUser() {
        User user = new User("Staffan", "password123");
    }

    @Test
    public void testGetUserName() {
        User user = new User("Staffan", "password123");
        String expected = "Staffan";
        String actual = user.getUserName();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetPassword() {
        User user = new User("Staffan", "password123");
        String expected = "password123";
        String actual = user.getPassword();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetUserName() {
        User user = new User("Staffan", "password123");
        String expected = "Henry";
        user.setUserName("Henry");
        String actual = user.getUserName();
        assertEquals(expected, actual);
    }

}
