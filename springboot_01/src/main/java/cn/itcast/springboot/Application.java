package cn.itcast.springboot;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  //设置为springboot应用的运行朱磊
public class Application {
	//此处第一次修改
	
	//第二次修改
	public static void main(String[] args) {
		
		/*启动springboot应用*/
//		SpringApplication.run(Application.class, args);
		
		
		/*去广告启动*/
		SpringApplication springApplication = new SpringApplication(Application.class);
		
		springApplication.setBannerMode(Mode.OFF);
		
		springApplication.run(args);
		
	}
}
