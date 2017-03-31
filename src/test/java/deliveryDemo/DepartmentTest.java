package deliveryDemo;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sean.delivery.kernel.entity.Department;
import com.sean.delivery.kernel.service.IDepartmentService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-mybatis.xml"})
public class DepartmentTest {

	@Resource
	private IDepartmentService departmentService;
	
	@Test
	public void test() {
	    Department d = new Department();
	    d.setCompanycode("01");
	    Department department1 = departmentService.getModel(d);
	    System.out.println("*************"+department1.getCompanycode()+"***"+department1.getAddresscname());
	    
	}
	

}
