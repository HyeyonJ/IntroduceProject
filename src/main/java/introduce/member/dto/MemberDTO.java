package introduce.member.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter @Setter	
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MemberDTO {

	private Long id;
	private String memberEmail;
	private String memberPassword;
	private String memberName;
}
