package sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
스프링부트의 핵심 어노테이션으로 3가지 어노테이션의 기능을 모두 가지고 있음.

@EnableAutoConfiguration : 자동구성, 스프링의 다양한 설정을 자동으로 처리

@ComponentScan : 기존 스프링 및 JSP에서는 자바빈을 사용하기 위해 
xml 파일에 일일히 자바빈을 선언해야 사용가능했음. @ComponentScan을 사용시
컴포넌트 검색 기능이 활성화되어 자동으로 필요한 컴포넌트를 검색하고 등록하여 사용가능.

@Configuration : 해당 클래스가 자바 기반의 파일임을 알려줌.
스프링 3버전에서는 필요한 자바관련 클래스를 모두 xml에 등록하여 사용해야 했지만
스프링 4에서 @Configuration 어노테이션이 등장하여 해당 어노테이션이 사용된 클래스는
설정파일임을 스프링프레임워크에 알려줌
 */
@SpringBootApplication
public class SpringbootTest1Application {

	public static void main(String[] args) {
		/*
		스프링부트의 장점 중 하나인 내장톰캣을 실행하는 명령
		내장 톰캣을 사용하기 때문에 외부의 서버가 필요없음.
		web.xml 파일도 필요없음.
		 */
		SpringApplication.run(SpringbootTest1Application.class, args);
	}

}
