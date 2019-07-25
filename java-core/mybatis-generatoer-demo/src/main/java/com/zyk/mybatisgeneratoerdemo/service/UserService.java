package com.zyk.mybatisgeneratoerdemo.service;

import com.zyk.mybatisgeneratoerdemo.dao.UserMapper;
import com.zyk.mybatisgeneratoerdemo.model.UserDO;
import com.zyk.mybatisgeneratoerdemo.model.UserDOExample;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author zhangyongkang@artspring.com.cn
 * @desc
 * @time 2019-07-10 17:38
 */
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public UserDO getById(Integer id, String nickname, String phone) {

        UserDOExample example = new UserDOExample();

        example.or().andIdEqualTo(id);
        example.or().andNicknameEqualTo(nickname);
        example.or().andPhoneEqualTo(phone);
        List<UserDO> userDOS = userMapper.selectByExample(example);

        return null;
    }
}
