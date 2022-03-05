package com.nowcoder.community.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

/**
 * @Author laiyang
 * @Description:
 * @Date: Create in 15:41 2022/2/27
 * @Path: com.nowcoder.community.dao
 */
@Repository
@Primary
public class AlphaDaoMyBatisImpl implements AlphaDao{

    @Override
    public String select() {
        return "MyBatis";
    }
}
