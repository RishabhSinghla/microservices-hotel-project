package com.lcwd.user.service.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
	
	@Id
	@Column(name="id")
	private String userId;
	
	@Column(name="name", length = 20)
	private String name;
	
	@Column(name="email")
	private String email;
	
	@Column(name="about")
	private String about;
	
	@Transient
	private List<Rating> ratings = new ArrayList<>();
}
