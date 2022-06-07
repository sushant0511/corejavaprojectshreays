package sprinjpatest;



import org.springframework.data.jpa.repository.JpaRepository;

//import org.springframework.data.repository.CrudRepository;
//break
public interface UserRepo extends JpaRepository<User, Long> 
{
//List<User> findByAddress(String address);
	
}
