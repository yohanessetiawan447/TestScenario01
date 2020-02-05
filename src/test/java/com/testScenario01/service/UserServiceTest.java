package com.testScenario01.service;

import com.testScenario01.model.User;
import com.testScenario01.repository.UserRepositories;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace= AutoConfigureTestDatabase.Replace.NONE)
public class UserServiceTest {

    @TestConfiguration
    static class EmployeeServiceImplTestContextConfiguration {
        @Bean
        public UserService userService() {
            return new UserService();
        }
    }

    @Autowired
    private UserService userService;

    @MockBean
    private UserRepositories userRepositories;

    @Test
    public void getUserA() throws JSONException {
        List<User> users = new ArrayList<>();
        User user = new User("UserA", "1", "Promo");
        users.add(user);
        user = new User("UserA", "2", "Category");
        users.add(user);
        user = new User("UserA", "3", "FlashSale");
        users.add(user);
        user = new User("UserA", "4", "History");
        users.add(user);
        user = new User("UserA", "5", "News");
        users.add(user);

        Mockito.when(userRepositories.getUserById("userA")).thenReturn(users);

        JSONObject result = userService.getUserById("userA");

        String expectedJson = "{\"modules\":[{\"moduleOrder\":\"1\",\"moduleName\":\"PromoCard\"},{\"moduleOrder\":\"2\",\"moduleName\":\"CategoryCard\"},{\"moduleOrder\":\"3\",\"moduleName\":\"FlashSaleCard\"},{\"moduleOrder\":\"4\",\"moduleName\":\"HistoryCard\"},{\"moduleOrder\":\"5\",\"moduleName\":\"NewsCard\"}]}";
        assertEquals(expectedJson, result.toString());

    }
    @Test
    public void getUserB() throws JSONException {
        List<User> users = new ArrayList<>();
        User user = new User("UserB", "1", "Promo");
        users.add(user);
        user = new User("UserB", "2", "News");
        users.add(user);
        user = new User("UserB", "3", "FlashSale");
        users.add(user);
        user = new User("UserB", "4", "Category");
        users.add(user);
        user = new User("UserB", "5", "News");
        users.add(user);

        Mockito.when(userRepositories.getUserById("userB")).thenReturn(users);

        JSONObject result = userService.getUserById("userB");

        String expectedJson = "{\"modules\":[{\"moduleOrder\":\"1\",\"moduleName\":\"PromoCard\"},{\"moduleOrder\":\"2\",\"moduleName\":\"NewsCard\"},{\"moduleOrder\":\"3\",\"moduleName\":\"FlashSaleCard\"},{\"moduleOrder\":\"4\",\"moduleName\":\"CategoryCard\"},{\"moduleOrder\":\"5\",\"moduleName\":\"NewsCard\"}]}";
        assertEquals(expectedJson, result.toString());

    }
    @Test
    public void getUserC() throws JSONException {
        List<User> users = new ArrayList<>();
        User user = new User("UserC", "1", "Promo");
        users.add(user);
        user = new User("UserC", "2", "FlashSale");
        users.add(user);
        user = new User("UserC", "3", "Category");
        users.add(user);
        user = new User("UserC", "4", "News");
        users.add(user);
        user = new User("UserC", "5", "History");
        users.add(user);

        Mockito.when(userRepositories.getUserById("userC")).thenReturn(users);

        JSONObject result = userService.getUserById("userC");

        String expectedJson = "{\"modules\":[{\"moduleOrder\":\"1\",\"moduleName\":\"PromoCard\"},{\"moduleOrder\":\"2\",\"moduleName\":\"FlashSaleCard\"},{\"moduleOrder\":\"3\",\"moduleName\":\"CategoryCard\"},{\"moduleOrder\":\"4\",\"moduleName\":\"NewsCard\"},{\"moduleOrder\":\"5\",\"moduleName\":\"HistoryCard\"}]}";
        assertEquals(expectedJson, result.toString());

    }

}
