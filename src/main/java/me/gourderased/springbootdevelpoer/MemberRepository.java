package me.gourderased.springbootdevelpoer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member ,Long> {

}
