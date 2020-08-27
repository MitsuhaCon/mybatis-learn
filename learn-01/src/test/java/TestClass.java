import com.mitsuha.dao.EmpDao;
import com.mitsuha.pojo.Emp;
import com.mitsuha.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import java.util.List;

/**
 * @author yangliming
 * @classname Test
 * @description //TODO
 * @data 2020/8/27 0:38
 */
public class TestClass {
    @Test
    public void test1() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        EmpDao mapper = sqlSession.getMapper(EmpDao.class);
        List<Emp> empList = mapper.getEmpList();
        for (Emp emp : empList) {
            System.out.println(emp);
        }
    }
}
