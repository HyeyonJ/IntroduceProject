package introduce.member.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import introduce.member.entity.MemberEntity;

public interface MemberRepository extends JpaRepository<MemberEntity, Long>{

	Optional<MemberEntity> findByMemberEmail(String memberEmail);
}
