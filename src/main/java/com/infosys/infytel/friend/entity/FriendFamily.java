package com.infosys.infytel.friend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "friendfamily")
@Data
public class FriendFamily {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id")
	Integer id;
	
	@Column(name = "phone_no", nullable = false)
	Long phoneNo;
	
	@Column(name = "friend_and_family", nullable = false)
	Long friendAndFamily;
}
