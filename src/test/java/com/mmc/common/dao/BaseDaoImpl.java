package com.mmc.common.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManagerFactory;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
@Transactional
@Repository("baseDaoImpl")
public class BaseDaoImpl implements BaseDao {

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    @Override
    public Session getSession() {
        return entityManagerFactory.unwrap(SessionFactory.class).openSession();
    }

    @Override
    public HibernateTemplate getTemplate() {
        return null;
    }

    @Override
    public<T> List<T> findBySql(String sql) throws Exception {
        try {
            return getSession().createSQLQuery(sql).list();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
