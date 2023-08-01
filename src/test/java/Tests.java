import com.example.demo.domain.BoardVO;
import com.example.demo.mapper.Mapper;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.sql.DataSource;
import java.sql.Connection;
import java.time.LocalDate;
import java.util.List;

@Log4j2
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/root-context.xml")
public class Tests {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private Mapper mapper;

    @Test
    public void testConnection() throws Exception{

        Connection connection = dataSource.getConnection();
        log.info(connection);
        Assertions.assertNotNull(connection);
        connection.close();
    }

    @Test
    public void testSelectAll() {
        List<BoardVO> list = mapper.selectAll();

        list.forEach(boardVO -> log.info(boardVO));
    }

    @Test
    public void testSelectOne(){
        BoardVO vo = mapper.selectOne(1L);
        log.info(vo);
    }

    @Test
    public void testDelete(){
        mapper.remove(3L);
    }

    @Test
    public void testUpdate(){
        BoardVO vo = BoardVO.builder()
                .title("업뎃")
                .date(LocalDate.now())
                .content("업콘텐츠")
                .build();
        mapper.update(vo);
    }

}
