package deliveryDemo;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sean.delivery.kernel.entity.Department;
import com.sean.delivery.kernel.entity.User;
import com.sean.delivery.kernel.service.IDepartmentService;
import com.sean.delivery.kernel.service.IUserService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-mybatis.xml"})
public class UserTest {

	@Resource
	private IUserService userService;
	
	@Test
	public void test() {
		User u = new User();
		u.setUserCode("chyong17");
	    User department1 = userService.getModel(u);
	    System.out.println("*************"+department1.getCompanyCode()+"***"+department1.getUserName());
	    
	}
	

}
