package com.example;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SomeApp {
    public static void main(String[] args) {
        SqlSessionFactory factory;
        SomeMapper mapper;

        try (Reader reader = Resources.getResourceAsReader("mybatis-config.xml")) {
            factory = new SqlSessionFactoryBuilder().build(reader);
            mapper = factory.openSession().getMapper(SomeMapper.class);
        }
        catch(IOException e) {
            e.printStackTrace();
        }

        List<SomeEntity> entities = mapper.getEntities();
        SomeEntity entity = mapper.getEntityById(1)
    }
}