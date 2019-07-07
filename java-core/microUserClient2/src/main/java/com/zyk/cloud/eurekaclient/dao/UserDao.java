package com.zyk.cloud.eurekaclient.dao;

import com.zyk.cloud.eurekaclient.model.UserDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserDao {

    @Select("select * from user where id = #{id}")
    UserDO getById(@Param("id") Integer id);

}
