package mapperTest;

import com.example.entity.provider;
import com.example.mapper.deleteMapper;
import com.example.mapper.selectMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.rmi.MarshalException;
import java.util.ArrayList;

public class deleteTest {


    @Test
    void testDeleteById() throws Exception{
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = factory.openSession();

        deleteMapper mapper = session.getMapper(deleteMapper.class);
        int row = mapper.deleteByID(15);
        System.out.println("affect row count: " + row);
        session.commit();
        session.close();
    }


    @Test
    void testDeleteAllocation()throws Exception{
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = factory.openSession();

        deleteMapper mapper = session.getMapper(deleteMapper.class);
        String[] arr={};
        int row = mapper.deleteCollection(arr);
        System.out.println("affect row count: " + row);
        session.commit();
        session.close();
    }


}
