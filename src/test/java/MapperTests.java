import com.example.demo.domain.BoardVO;
import com.example.demo.mapper.Mapper;
import com.example.demo.mapper.TimeMapper;
import com.example.demo.mapper.TimeMapper2;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDate;

@Log4j2
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/root-context.xml")
public class MapperTests {

    @Autowired(required = false)
    private TimeMapper timeMapper;

    @Autowired(required = false)
    private TimeMapper2 timeMapper2;

    @Autowired(required = false)
    private Mapper mapper;

    @Test
    public void testGetTime(){
        log.info(timeMapper.getTime());
    }

    @Test
    public void testGetNow(){
        log.info(timeMapper2.getNow());}

    @Test
    public void testGetTime2(){
        log.info(mapper.getTime());
    }

    @Test
    public void testInsert(){
        BoardVO vo = BoardVO.builder()
                .title("테스트")
                .content("테스트 내용")
                .date(LocalDate.now())
                .build();

        mapper.insert(vo);

    }
}