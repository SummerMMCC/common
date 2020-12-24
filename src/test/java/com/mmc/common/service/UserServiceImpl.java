package com.mmc.common.service;


import com.mmc.common.dao.BaseDao;
import com.mmc.common.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private BaseDao baseDao;

    @Override
    public void test() throws Exception {
        List<User> ulist = baseDao.findBySql("select * from user");
        System.out.println(ulist.size());
    }
}
