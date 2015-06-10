package com.xtu.web.pojo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 
 * @author vincent
 *受伤地点
 */
@Entity
@Table(name="injured_place")
public class Place implements Serializable {

	private static final long serialVersionUID = 5489345945689587217L;
	/**
	 * 受伤地点id，主键
	 */
	private int place_id;
 	/**
	 * 受伤地点（第一级）
	 */
	private String f_place;
	/**
	 * 受伤地点（第二级）
	 */
	private String p_place;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getPlace_id() {
		return place_id;
	}
	public void setPlace_id(int place_id) {
		this.place_id = place_id;
	}
	@Column(length=20)
	public String getF_place() {
		return f_place;
	}
	public void setF_place(String f_place) {
		this.f_place = f_place;
	}
	@Column(length=20)
	public String getP_place() {
		return p_place;
	}
	public void setP_place(String p_place) {
		this.p_place = p_place;
	}
}
