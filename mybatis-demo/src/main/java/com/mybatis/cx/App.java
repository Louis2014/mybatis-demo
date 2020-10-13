package com.mybatis.cx;

import com.mybatis.cx.entity.TUser;
import com.mybatis.cx.mapper.TUserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {


        // 读取mybatis-config.xml文件
        InputStream inputStream;
        try {
            inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            // 初始化mybatis，创建SqlSessionFactory类的实例
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            inputStream.close();
            // 创建Session实例
            SqlSession session = sqlSessionFactory.openSession();
            TUserMapper mapper=session.getMapper(TUserMapper.class);
            TUser tUser=mapper.getOne("100");
            System.out.println(tUser);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
