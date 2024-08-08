package customer.insert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
@Qualifier("personDao")
public class CustomerDaoImpl implements CustomerInterface {
	@Autowired
	JdbcTemplate jdbcTemplate;
	public void addCustomer(Customer cst) {
		jdbcTemplate.update("insert into customer1(cid,cname,address,age) values(?,?,?,?)",cst.getCid(),cst.getCname(),cst.getAddress(),cst.getAge());
		System.out.println("customer added");
		
	}
	public void deleteCustomer(int cid) {
		jdbcTemplate.update("delete from customer1 where cid=?",cid);
		System.out.println("customer deleted");
		
	}
	public void updateCustomer(Customer cst) {
		jdbcTemplate.update("update customer1 set cname=?,address=?,age=? where cid=?",cst.getCname(),cst.getAddress(),cst.getAge(),cst.getCid());
		System.out.println("customer updated");
		
	}
		
	}

