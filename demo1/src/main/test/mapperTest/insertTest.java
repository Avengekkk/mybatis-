package mapperTest;

import com.example.entity.provider;
import com.example.mapper.insertMapper;
import com.example.mapper.selectMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.util.ArrayList;

public class insertTest {



    @Test
    void insertRow() throws Exception {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = factory.openSession();

        insertMapper mapper = session.getMapper(insertMapper.class);
        selectMapper m = session.getMapper(selectMapper.class);
        ArrayList<provider> list=m.selectAll();
        System.out.println("before insert=="+list.size());
        String code="fuck";
        String address="四川成都";
        String name="华帝";
        String fax="whatever";
        String phone="123";
        Integer createBy=1;
        String desc="whatever";
        String date="2024-6-19 10:51:11";
        String human="汪昊";
        boolean flag= mapper.insertRow(code,address,desc,fax,date,phone,name,
                human,createBy);
        System.out.println(flag);
        session.commit();
        provider last = mapper.getLast();
        System.out.println("最后一个ID是 "+last.id);


        System.out.println("after insert=="+list.size());

        session.close();
    }


}
