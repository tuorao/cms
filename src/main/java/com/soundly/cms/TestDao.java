package com.soundly.cms;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2015-09-07.
 */
@Repository
public class TestDao extends SqlSessionDaoSupport {

    public TestDTO sel(){
        return (TestDTO) getSqlSession().selectOne("test.sel");
    }
}
