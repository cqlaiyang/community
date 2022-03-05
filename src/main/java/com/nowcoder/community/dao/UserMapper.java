package com.nowcoder.community.dao;

import com.nowcoder.community.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @Author laiyang
 * @Description:
 * @Date: Create in 18:53 2022/2/28
 * @Path: com.nowcoder.community.dao
 */
@Mapper
@Repository
public interface UserMapper {
    User selectById(int id);
    User selectByName(String username);
    User selectByEmail(String email);
    int insertUser(User user);
    int updateStatus(int id,int status);
    int updateHeader(int id,String HeaderUrl);
    int updatePassword(int id,String Password);
}
