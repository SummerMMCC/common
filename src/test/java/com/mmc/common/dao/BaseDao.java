package com.mmc.common.dao;

import org.hibernate.Session;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("baseDao")
public interface BaseDao {
    public Session getSession();

    public HibernateTemplate getTemplate();

    public <T> List<T> findBySql(String sql) throws Exception;
}
