package introduce.member.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import introduce.member.dto.MemberDTO;
import introduce.member.entity.MemberEntity;

@Entity
@Setter
@Getter
@Table(name = "member_table")
public class MemberEntity {
	
	@Id	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MEMBER_Id_SEQ")
	private Long id;
	
	@Column(unique = true)
	private String memberEmail;
	
	@Column
	private String memberPassword;
	
	@Column
	private String memberName;
	
	public static MemberEntity toMemberEntity(MemberDTO memberDTO) {
		MemberEntity memberEntity = new MemberEntity();
		memberEntity.setMemberEmail(memberDTO.getMemberEmail());
		memberEntity.setMemberPassword(memberDTO.getMemberPassword());
		memberEntity.setMemberName(memberDTO.getMemberName());
		return memberEntity;
	}
}















