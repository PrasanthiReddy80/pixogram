package com.cts.training.blockedusersservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "BlockedUsers")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BlockedUsers {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userid;
	@Column
	private String blockeduserid;
	
	
}
