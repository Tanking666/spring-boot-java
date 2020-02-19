package top.kxyu.springbootjava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import top.kxyu.springbootjava.service.VideoService;

//方法二implements CommandLineRunner
@SpringBootApplication
public class SpringBootJavaApplication  {


	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootJavaApplication.class, args);
		//拿bean
		VideoService videoService = (VideoService) context.getBean("videoServiceImpl");
		System.out.println(videoService.Say("ABCD"));

	}

	/*//方法二实现CommandLineRunner
	@Autowired
	private VideoService videoService;
	public static void main(String[] args) {
	//启动spring容器
		SpringApplication.run(SpringBootJavaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(videoService.Say("ABCD"));
	}*/
}
