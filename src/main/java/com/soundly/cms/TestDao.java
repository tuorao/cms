package com.soundly.cms;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2015-09-07.
 */
@Repository
public class TestDao{

    @Autowired
    SqlSession sqlSession;

    public TestDTO sel(){
        return sqlSession.selectOne("test.sel");
    }
}
