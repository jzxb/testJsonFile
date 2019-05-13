package org.lhx.main;

import com.google.gson.Gson;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.lhx.bean.ClassOne;
import org.lhx.bean.ClassTwo;
import org.lhx.mapper.ClassOneMapper;
import org.lhx.mapper.ClassTwoMapper;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

/**
 * @author lhx
 * @date 2019/5/9 - 21:33
 */
public class Main {
    public static SqlSessionFactory getSqlSessionFactory() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        return new SqlSessionFactoryBuilder().build(inputStream);
    }

    public static void main(String[] args) throws IOException {
//        getClassOne();
//        getClassTwo();
        getTm();
    }

    public static void getClassOne() throws IOException {
        SqlSessionFactory sqlSessionFactory = (SqlSessionFactory) getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        ClassOneMapper mapper = sqlSession.getMapper(ClassOneMapper.class);
        List<ClassOne> classOnes = mapper.selectList();
        System.out.println(classOnes.size());
        Gson gson = new Gson();
        String json = gson.toJson(classOnes);
        FileOutputStream fileOutputStream = new FileOutputStream("d:/class_1.js");
        fileOutputStream.write(json.getBytes());
        fileOutputStream.close();
        sqlSession.close();
    }

    public static void getClassTwo() throws IOException {
        SqlSessionFactory sqlSessionFactory = (SqlSessionFactory) getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        ClassTwoMapper mapper = sqlSession.getMapper(ClassTwoMapper.class);
        List<ClassTwo> classTwos = mapper.selectList();
        Map<Integer,List<ClassTwo>> map = new HashMap<Integer, List<ClassTwo>>();
        for (ClassTwo classTwo : classTwos) {
            if (0 == map.size()){
                map.put(classTwo.getClassificationNumber1Id(),new ArrayList<ClassTwo>());
                map.get(classTwo.getClassificationNumber1Id()).add(classTwo);
            }else if (null == map.get(classTwo.getClassificationNumber1Id())){
                map.put(classTwo.getClassificationNumber1Id(),new ArrayList<ClassTwo>());
                map.get(classTwo.getClassificationNumber1Id()).add(classTwo);
            }else {
                map.get(classTwo.getClassificationNumber1Id()).add(classTwo);
            }
        }
        System.out.println(classTwos.size());
        Iterator iterator = map.entrySet().iterator();
        Gson gson = new Gson();
        while (iterator.hasNext()){
            Map.Entry entry = (Map.Entry) iterator.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            String json = gson.toJson(value);
            FileOutputStream fileOutputStream = new FileOutputStream("d:/class_2_" + key +".js");
            fileOutputStream.write(json.getBytes());
            fileOutputStream.close();
        }
        sqlSession.close();
    }

    public static void getTm() throws IOException {
        SqlSessionFactory sqlSessionFactory = (SqlSessionFactory) getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        ClassOneMapper mapper = sqlSession.getMapper(ClassOneMapper.class);
        Map map = mapper.getMap();
        System.out.println(map);
    }
}
