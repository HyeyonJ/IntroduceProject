package introduce.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import introduce.member.dto.MemberDTO;
import introduce.member.service.MemberService;
import lombok.RequiredArgsConstructor;


@Controller
@RequiredArgsConstructor
public class MemberController {
	
	private final MemberService memberService;
	// 회원가입 페이지 출력 요청
	@GetMapping("/member/save")
	public String saveForm() {
		return "save";
	}
	
  @PostMapping("/member/save")
  public String save(@RequestParam("memberEmail") String memberEmail,
                 	  @RequestParam("memberPassword") String memberPassword,
                 	  @RequestParam("memberName") String memberName) {
     System.out.println("MemberController.save");
     System.out.println("memberEmail = " + memberEmail +
   		  				", memberPassword = " + memberPassword +
   		  				", memberName = " + memberName);
     return "index";
  }
}
