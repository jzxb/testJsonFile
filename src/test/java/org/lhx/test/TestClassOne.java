package org.lhx.test;

import com.google.gson.Gson;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.lhx.bean.ClassOne;
import org.lhx.mapper.ClassOneMapper;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author lhx
 * @date 2019/5/9 - 21:06
 */
public class TestClassOne {

    public SqlSessionFactory getSqlSessionFactory() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        return new SqlSessionFactoryBuilder().build(inputStream);
    }
    
    @Test
    public void testClassOne() throws IOException {
        SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        ClassOneMapper mapper = sqlSession.getMapper(ClassOneMapper.class);
        List<ClassOne> classOnes = mapper.selectList();
        System.out.println(classOnes.size());
        Gson gson = new Gson();
        String json = gson.toJson(classOnes);
        FileOutputStream fileOutputStream = new FileOutputStream("d:/class_1.js");
        fileOutputStream.write(json.getBytes());
        fileOutputStream.close();
    }
    
}
