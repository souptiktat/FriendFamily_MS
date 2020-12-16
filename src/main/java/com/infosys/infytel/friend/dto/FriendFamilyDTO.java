package com.infosys.infytel.friend.dto;

import com.infosys.infytel.friend.entity.FriendFamily;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class FriendFamilyDTO {

	Integer id;
	Long phoneNo;
	Long friendAndFamily;
	
	public static FriendFamilyDTO valueOf(FriendFamily friend) {
		FriendFamilyDTO friendDTO = new FriendFamilyDTO();
		friendDTO.setId(friend.getId());
		friendDTO.setPhoneNo(friend.getPhoneNo());
		friendDTO.setFriendAndFamily(friend.getFriendAndFamily());
		return friendDTO;
	}
	
	public FriendFamily createFriend() {
		FriendFamily friend = new FriendFamily();
		friend.setId(this.id);
		friend.setPhoneNo(this.phoneNo);
		friend.setFriendAndFamily(this.friendAndFamily);
		return friend;
	}
}
