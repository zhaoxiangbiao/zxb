package cn.zxb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringboottestApplication {
	
	@RequestMapping("/")
    String home(){
		System.out.println("zhaoxiangbiap");
		
        return "hello spring boot";
    }

	public static void main(String[] args) {
		SpringApplication.run(SpringboottestApplication.class, args);
	}
}
