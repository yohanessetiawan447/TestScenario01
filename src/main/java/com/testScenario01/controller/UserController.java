package com.testScenario01.controller;

import com.testScenario01.service.UserService;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(path="/v1/test/user")
    public @ResponseBody
    String getUserById(@RequestParam(value="userId") String id) throws JSONException {
        return userService.getUserById(id).toString();
    }

}
