package sprinjpatest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("userService")
public class UserService {

	@Autowired
	UserRepo repo;
	
	public void storeData()
	{
		
		User user=new User();
		
		user.setName("Test");
		user.setAddress("Noida");
		System.out.println("called");
		repo.save(user);// insert data
		System.out.println("called Repo");
	}
	
	public void displaData()
	{
		List<User> list=repo.findAll();
		System.out.println(list);
	}
}
