package introduce.member.service;

import org.springframework.stereotype.Service;

import introduce.member.dto.MemberDTO;
import introduce.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberService {
	
	private final MemberRepository memberRepository;

	public void save(MemberDTO memberDTO) {
		
	}

}
