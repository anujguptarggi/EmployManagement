package com.employ.ragistration;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "emp")
@SequenceGenerator(name = "USER_SEQUENCE", sequenceName = "USER_ID", initialValue = 1001)
@Getter @Setter @ToString
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "USER_SEQUENCE")
	private long id;

	@Column(name = "FIRST_NAME", nullable = false, length = 50)
	private String fName;

	@Column(name = "LAST_NAME", nullable = false, length = 50)
	private String lName;
}
