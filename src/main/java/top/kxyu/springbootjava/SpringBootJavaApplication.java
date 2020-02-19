package top.kxyu.springbootjava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import top.kxyu.springbootjava.service.VideoService;

@SpringBootApplication
public class SpringBootJavaApplication {


	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootJavaApplication.class, args);
		//拿bean
		VideoService videoService = (VideoService) context.getBean("videoServiceImpl");
		System.out.println(videoService.Say("ABCD"));

	}

}
