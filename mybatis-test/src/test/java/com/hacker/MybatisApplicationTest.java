package com.hacker;

import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @Author: Zero
 * @Date: 2022/7/4 19:08
 * @Description:
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class MybatisApplicationTest {

    @Resource
    private SqlSessionFactory sqlSessionFactory;

    @Test
    public void test1() {
        SqlSession sqlSession = sqlSessionFactory.openSession(ExecutorType.BATCH,true);
        System.out.println(sqlSession);
    }

}
