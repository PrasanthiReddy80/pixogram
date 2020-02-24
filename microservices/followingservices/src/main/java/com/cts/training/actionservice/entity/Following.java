package com.cts.training.actionservice.entity;

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
@Table(name = "following")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Following {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)


	private Integer userId;
	@Column
	private Integer followerId;
	
}
