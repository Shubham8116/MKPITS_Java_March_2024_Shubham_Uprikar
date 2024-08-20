package test;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class AppConfig {
//@Bean(name="s1")
	@Bean
public Student s1()
{
	Student student=new Student();
	student.setName("shubham");
	student.setCity("chad pe hai apun");
	return student;
}
}
