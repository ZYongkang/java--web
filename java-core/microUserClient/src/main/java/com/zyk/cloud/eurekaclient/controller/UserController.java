package com.zyk.cloud.eurekaclient.controller;

import com.zyk.cloud.eurekaclient.model.MicroBeanObject;
import com.zyk.cloud.eurekaclient.model.UserDO;
import com.zyk.cloud.eurekaclient.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author zhangyongkang@artspring.com.cn
 * @desc
 * @time 2019-06-27 19:49
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/get_by_{id}")
    @ResponseBody
    public MicroBeanObject getUserById(@PathVariable Integer id) {
        MicroBeanObject<UserDO> microBeanObject = new MicroBeanObject<>();

        if (id == null || id <= 0) {
            microBeanObject.setStatus(2);
            microBeanObject.setMsg("param id can't is null or <= 0");
            return microBeanObject;
        }

        UserDO user = userService.getById(id);

        if (user == null) {
            microBeanObject.setStatus(3);
            microBeanObject.setMsg("no data");
            return microBeanObject;
        }
        microBeanObject.setStatus(0);
        microBeanObject.setMsg("Success");
        microBeanObject.setData(user);
        System.out.println(microBeanObject);
        return microBeanObject;

    }

    @GetMapping("/{id}")
    @ResponseBody
    public UserDO getById(@PathVariable Integer id) {
       return userService.getById(id);
    }
}
