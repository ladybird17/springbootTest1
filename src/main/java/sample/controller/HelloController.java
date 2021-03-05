package sample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/*REST란 Repersentational State Transfer의 약자로 월드와이드웹과 같은
 분산 하이퍼미디어 시스템을 위한 소프트웨어 아키텍처의 한 형식임.
  REST란 웹에 존재하는 모든 자원(이미지,동영상,DB등)에 고유한 URI를 부여하여 활용하는 것.
*/
//자바의 어노테이션. 해당 클래스가 REST컨트롤러 기능을 수행하도록 지시함
@RestController
public class HelloController {
	 /* 해당 메서드를 실행할 수 있는 주소를 설정
	 "/"은 특정 주소를 입력하지 않았을 경우 실행될 경로 */
	@RequestMapping("/")
	public String hello() {
		/* Hello world!! 라는 텍스트를 화면에 전달함
		@RequestMapping("/") 어노테이션을 통해서
		지정된 주소를 입력시 아래의 텍스트를 출력 */
		return "Hello World!!";
	}
	
	//http://localhost:8080/asdf
	@RequestMapping("/asdf")
	public String asdf() {
		return "asdf 라는 글자를 화면에 출력합니다.";
	}
	
	@RequestMapping("qwerty")
	public String hi() {
		return "주소는 /를 생략한 qwerty이지만 메서드이름은 hi()를 사용함";
	}
}
