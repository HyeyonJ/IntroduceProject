package introduce.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class googleController {
	// 기본 메서드 말고 소셜로 생성하기
	// 기본 페이지 요청 메서드
	@GetMapping("/")
	public String index() {
		return "index";
	}
}
