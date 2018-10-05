
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import vn.hieuhoang.core.dao.ListenGuideLineDao;
import vn.hieuhoang.core.daoimpl.ListenGuideLineDaoImpl;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Hieu Hoang on 25/09/2018.
 */

public class listenguidelineTest {
    ListenGuideLineDao guideLineDao;
    @BeforeTest
    public void initData () {
        guideLineDao = new ListenGuideLineDaoImpl();
    }
    @Test
    public void testFindByProperties () {
        //ListenGuideLineDao listenGuideLineDao = new ListenGuideLineDaoImpl();
       // Object[] result = listenGuideLineDao.findByProperty(null,null,null,null,0,2);
    }
    @Test
    public void checkFindbyproperty () {
        Map<String,Object> property = new HashMap<String, Object>() ;
        property.put("title" ,"bai hd 6");
        property.put("content" ,"noi dung bai hd 6");
        Object [] objects = guideLineDao.findByProperty(property,null,null,null,null);
    }

}
