package sprinjpatest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"sprinjpatest"})
public class MyMain {

	public static void main(String[] args) {
		System.out.println("Main up");
		AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext();
		applicationContext.scan("sprinjpatest");//all classes will scan
		applicationContext.refresh();
				
		UserService service=(UserService) applicationContext.getBean("userService");
		//service.storeData();
		service.displaData();
		applicationContext.close();
	}

}
