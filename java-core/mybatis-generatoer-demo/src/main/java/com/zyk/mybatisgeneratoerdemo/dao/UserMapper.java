package com.zyk.mybatisgeneratoerdemo.dao;

import com.zyk.mybatisgeneratoerdemo.model.UserDO;
import com.zyk.mybatisgeneratoerdemo.model.UserDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    long countByExample(UserDOExample example);

    int deleteByExample(UserDOExample example);

    int insert(UserDO record);

    int insertSelective(UserDO record);

    List<UserDO> selectByExample(UserDOExample example);

    int updateByExampleSelective(@Param("record") UserDO record, @Param("example") UserDOExample example);

    int updateByExample(@Param("record") UserDO record, @Param("example") UserDOExample example);
}