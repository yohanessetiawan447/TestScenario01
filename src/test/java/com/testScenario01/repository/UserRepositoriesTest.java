package com.testScenario01.repository;

import com.testScenario01.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace= AutoConfigureTestDatabase.Replace.NONE)
public class UserRepositoriesTest {

    @Autowired
    private UserRepositories userRepositories;

    @Test
    public void getUserByIdUserA() {
        // given
        String moduleName1 = "Promo";
        String moduleName2 = "Category";
        String moduleName3 = "FlashSale";
        String moduleName4 = "History";
        String moduleName5 = "News";

        // when
        List<User> user = userRepositories.getUserById("userA");

        // then
        assertEquals(user.get(0).getModuleName(), moduleName1);
        assertEquals(user.get(0).getModuleOrder(), "1");
        assertEquals(user.get(1).getModuleName(), moduleName2);
        assertEquals(user.get(1).getModuleOrder(), "2");
        assertEquals(user.get(2).getModuleName(), moduleName3);
        assertEquals(user.get(2).getModuleOrder(), "3");
        assertEquals(user.get(3).getModuleName(), moduleName4);
        assertEquals(user.get(3).getModuleOrder(), "4");
        assertEquals(user.get(4).getModuleName(), moduleName5);
        assertEquals(user.get(4).getModuleOrder(), "5");
    }

    @Test
    public void getUserByIdUserB() {
        // given
        String moduleName1 = "Promo";
        String moduleName2 = "News";
        String moduleName3 = "FlashSale";
        String moduleName4 = "Category";
        String moduleName5 = "News";

        // when
        List<User> user = userRepositories.getUserById("userB");

        // then
        assertEquals(user.get(0).getModuleName(), moduleName1);
        assertEquals(user.get(0).getModuleOrder(), "1");
        assertEquals(user.get(1).getModuleName(), moduleName2);
        assertEquals(user.get(1).getModuleOrder(), "2");
        assertEquals(user.get(2).getModuleName(), moduleName3);
        assertEquals(user.get(2).getModuleOrder(), "3");
        assertEquals(user.get(3).getModuleName(), moduleName4);
        assertEquals(user.get(3).getModuleOrder(), "4");
        assertEquals(user.get(4).getModuleName(), moduleName5);
        assertEquals(user.get(4).getModuleOrder(), "5");
    }

    @Test
    public void getUserByIdUserC() {
        // given
        String moduleName1 = "Promo";
        String moduleName2 = "FlashSale";
        String moduleName3 = "Category";
        String moduleName4 = "News";
        String moduleName5 = "History";

        // when
        List<User> user = userRepositories.getUserById("userC");

        // then
        assertEquals(user.get(0).getModuleName(), moduleName1);
        assertEquals(user.get(0).getModuleOrder(), "1");
        assertEquals(user.get(1).getModuleName(), moduleName2);
        assertEquals(user.get(1).getModuleOrder(), "2");
        assertEquals(user.get(2).getModuleName(), moduleName3);
        assertEquals(user.get(2).getModuleOrder(), "3");
        assertEquals(user.get(3).getModuleName(), moduleName4);
        assertEquals(user.get(3).getModuleOrder(), "4");
        assertEquals(user.get(4).getModuleName(), moduleName5);
        assertEquals(user.get(4).getModuleOrder(), "5");
    }

}
