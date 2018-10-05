import org.testng.annotations.Test;
import vn.hieuhoang.core.dao.UserDao;
import vn.hieuhoang.core.daoimpl.UserDaoImpl;
import vn.hieuhoang.core.persistance.entity.UserEntity;

import java.util.logging.Logger;

/**
 * Created by Hieu Hoang on 05/09/2018.
 */

public class LoginTest {
    private final org.testng.log4testng.Logger logger = org.testng.log4testng.Logger.getLogger(this.getClass());
    @Test
    public void checkIsUserExist() {
        UserDao userDao = new UserDaoImpl() ;
        String name = "hieu" ;
        String password = "1234";
       // UserEntity entity = userDao.isUserExist(name,password);
//        if (entity != null) {
//            logger.error("login success");
//        } else logger.error("login fail");
    }

    @Test
    public void checkFindRoleByUser() {
        UserDao userDao = new UserDaoImpl() ;
        String name = "hieu" ;
        String password = "1234";
        //UserEntity entity = userDao.isUserExist(name,password);
        //logger.error(entity.getRoleEntity().getRoleId() + "-" + entity.getRoleEntity().getName());
    }

}
