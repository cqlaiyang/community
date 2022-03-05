package com.nowcoder.community.dao;

import org.springframework.stereotype.Repository;

/**
 * @Author laiyang
 * @Description:
 * @Date: Create in 15:30 2022/2/27
 * @Path: com.nowcoder.community.dao
 */
@Repository("alphaHibernate")
public class AlphaDaoHibernateImpl implements AlphaDao{
    @Override
    public String select() {
        return "Hibernate";
    }
}
