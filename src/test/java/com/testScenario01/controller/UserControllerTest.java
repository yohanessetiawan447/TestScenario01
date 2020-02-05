package com.testScenario01.controller;

import com.testScenario01.service.UserService;
import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@AutoConfigureTestDatabase(replace= AutoConfigureTestDatabase.Replace.NONE)
@WebMvcTest(UserController.class)
public class UserControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private UserService userService;

    @Test
    public void getUserA() throws Exception {

        String jsonStr = "{\"modules\":[{\"moduleOrder\":\"1\",\"moduleName\":\"PromoCard\"},{\"moduleOrder\":\"2\",\"moduleName\":\"CategoryCard\"},{\"moduleOrder\":\"3\",\"moduleName\":\"FlashSaleCard\"},{\"moduleOrder\":\"4\",\"moduleName\":\"HistoryCard\"},{\"moduleOrder\":\"5\",\"moduleName\":\"NewsCard\"}]}";
        JSONObject jsonMock = new JSONObject(jsonStr);

        given(userService.getUserById("userA")).willReturn(jsonMock);

        mvc.perform(get("/v1/test/user?userId=userA")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    public void getUserB() throws Exception {

        String jsonStr = "{\"modules\":[{\"moduleOrder\":\"1\",\"moduleName\":\"PromoCard\"},{\"moduleOrder\":\"2\",\"moduleName\":\"NewsCard\"},{\"moduleOrder\":\"3\",\"moduleName\":\"FlashSaleCard\"},{\"moduleOrder\":\"4\",\"moduleName\":\"CategoryCard\"},{\"moduleOrder\":\"5\",\"moduleName\":\"NewsCard\"}]}";
        JSONObject jsonMock = new JSONObject(jsonStr);

        given(userService.getUserById("userB")).willReturn(jsonMock);

        mvc.perform(get("/v1/test/user?userId=userB")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    public void getUserC() throws Exception {

        String jsonStr = "{\"modules\":[{\"moduleOrder\":\"1\",\"moduleName\":\"PromoCard\"},{\"moduleOrder\":\"2\",\"moduleName\":\"FlashSaleCard\"},{\"moduleOrder\":\"3\",\"moduleName\":\"CategoryCard\"},{\"moduleOrder\":\"4\",\"moduleName\":\"NewsCard\"},{\"moduleOrder\":\"5\",\"moduleName\":\"HistoryCard\"}]}";
        JSONObject jsonMock = new JSONObject(jsonStr);

        given(userService.getUserById("userC")).willReturn(jsonMock);

        mvc.perform(get("/v1/test/user?userId=userC")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

}
