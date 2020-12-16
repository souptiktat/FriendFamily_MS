package com.infosys.infytel.friend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.infosys.infytel.friend.entity.FriendFamily;

@Repository
public interface FriendFamilyRepository extends JpaRepository<FriendFamily, Integer> {

	@Query("select friend from FriendFamily friend where friend.phoneNo = ?1")
	List<FriendFamily> getByPhoneNo(Long phoneNo);
}
