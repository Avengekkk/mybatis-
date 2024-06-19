package mapperTest;

import com.example.entity.provider;
import com.example.mapper.selectMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import javax.annotation.processing.SupportedAnnotationTypes;
import java.io.InputStream;
import java.security.Provider;
import java.util.ArrayList;

public class selectTest {


    @Test
    void testByParam() throws Exception {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = factory.openSession();


        selectMapper mapper = session.getMapper(selectMapper.class);
        String desc="%长期%";
        String address="%北京%";
        String date="2023-01-01 00:00:00";
        /*String desc=" ";
        String address="%北京%";
        String date=" ";*/

        ArrayList<provider> list = mapper.selectByCondition(desc, address, date);

        for (provider item : list) {
            System.out.println(item);
        }
        session.close();
    }


    @Test
    void testByName() throws Exception {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = factory.openSession();

        selectMapper mapper = session.getMapper(selectMapper.class);
        String name = "%油%";
        ArrayList<provider> list = mapper.selectByGoods(name);
        for (provider item : list) {
            System.out.println(item);
        }
        session.close();
    }

    @Test
    void testAll() throws Exception {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = factory.openSession();

        selectMapper mapper = session.getMapper(selectMapper.class);

        ArrayList<provider> all = mapper.selectAll();
        for (provider item : all) {
            System.out.println(item);
        }
        session.close();
    }
}
