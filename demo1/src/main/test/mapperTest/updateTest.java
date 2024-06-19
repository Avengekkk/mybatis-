package mapperTest;

import com.example.entity.provider;
import com.example.mapper.selectMapper;
import com.example.mapper.updateMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.concurrent.Phaser;

public class updateTest {


    @Test
    void test2() throws Exception{
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = factory.openSession();
        updateMapper mapper = session.getMapper(updateMapper.class);
        int row = mapper.updateAll("北京", "武汉");
        System.out.println("row=="+row);
        session.commit();
        session.close();

    }
    @Test
    void updateByNameTest() throws Exception {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = factory.openSession();
        updateMapper mapper = session.getMapper(updateMapper.class);
        String name="%厂%";
        String address="wherever";
        String phone="123";
        String human="管维佳";
        int row=mapper.updateByName(name,address,phone,human);
        session.commit();
        System.out.println(row);
        session.close();
    }

}
