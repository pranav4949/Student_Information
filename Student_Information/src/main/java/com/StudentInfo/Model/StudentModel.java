package com.StudentInfo.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class StudentModel {
	
	@Id
	private int id;
	private int fee;
	private String name;
	private String loc;

}
