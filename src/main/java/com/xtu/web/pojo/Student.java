package com.xtu.web.pojo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity()
@Table(name="stu_info")
public class Student implements Serializable{

	private static final long serialVersionUID = 1L;
	/**
	 * 学生的学号
	 */
	private int s_id;
	/**
	 * 学生姓名
	 */
	private String name;
	/**
	 * 学生性别
	 */
	private String sex;
	/**
	 * 学生生日
	 */
	private Date birthday;
	/**
	 * 学生电话号码
	 */
	private String telephone;
	/**
	 * 学生所在年级
	 */
	private String grade;
	/**
	 * 学生所在班级
	 */
	private String classes;
	/**
	 * 学生编号
	 */
	private int number;
	/**
	 * 学生父亲姓名
	 */
	private String father_name;
	/**
	 * 学生母亲姓名
	 */
	private String mother_name;
	/**
	 * 学生个人疾病史
	 */
	private String diseases_history;
	
	@Id
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	@Column(length=32)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(length=2)
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	@Temporal(TemporalType.DATE)
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	@Column(length=12)
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	@Column(length=32)
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Column(length=32)
	public String getClasses() {
		return classes;
	}
	public void setClasses(String classes) {
		this.classes = classes;
	}
	@Column(length=32)
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	@Column(length=32)
	public String getFather_name() {
		return father_name;
	}
	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}
	@Column(length=32)
	public String getMother_name() {
		return mother_name;
	}
	public void setMother_name(String mother_name) {
		this.mother_name = mother_name;
	}
	@Column(length=32)
	public String getDiseases_history() {
		return diseases_history;
	}
	public void setDiseases_history(String diseases_history) {
		this.diseases_history = diseases_history;
	}	
}
