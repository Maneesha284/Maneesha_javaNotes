package com.all.methods;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "studenttab")
public class Student {
	@Id
	@Column(name = "sno")
	private int sno;
	@Column(name = "sname")
	private String sname;
	@Column(name = "sadd")
	private String sadd;
	@Column(name = "smarks")
	private int smarks;
}
