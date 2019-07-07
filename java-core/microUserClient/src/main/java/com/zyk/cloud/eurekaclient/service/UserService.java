package com.zyk.cloud.eurekaclient.service;

import com.zyk.cloud.eurekaclient.dao.UserDao;
import com.zyk.cloud.eurekaclient.model.UserDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhangyongkang@artspring.com.cn
 * @desc
 * @time 2019-06-27 19:53
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public UserDO getById(Integer id) {
        return userDao.getById(id);
    }
}
