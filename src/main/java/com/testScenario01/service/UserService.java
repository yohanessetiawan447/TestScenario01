package com.testScenario01.service;

import com.testScenario01.model.User;
import com.testScenario01.repository.UserRepositories;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepositories userRepositories;

    public JSONObject getUserById(String id) throws JSONException {
        List<User> user = userRepositories.getUserById(id);
        JSONArray jsonArray = new JSONArray();
        JSONObject mainObj = new JSONObject();

        for (User u: user) {
            JSONObject jsonObj = new JSONObject();
            jsonObj.put("moduleName",u.getModuleName()+"Card");
            jsonObj.put("moduleOrder",u.getModuleOrder());
            jsonArray.put(jsonObj);
        }

        mainObj.put("modules",jsonArray);
        return mainObj;
    }

}
