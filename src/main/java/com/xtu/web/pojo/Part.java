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
 *受伤部位
 */
@Entity
@Table(name="injured_part")
public class Part implements Serializable {
 
	private static final long serialVersionUID = 846030845418569596L;
	/**
	 * 部位id，主键
	 */
	private int part_id;
	
	/**
	 * 科别：内科，外科
	 */
	private String type;
	
	/**
	 * 受伤部位（第一级）
	 */
	private String f_part;
	/**
	 * 受伤部位（第二级）
	 */
	private String p_part;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getPart_id() {
		return part_id;
	}
	public void setPart_id(int part_id) {
		this.part_id = part_id;
	}
	@Column(length=10)
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Column(length=20)
	public String getF_part() {
		return f_part;
	}
	public void setF_part(String f_part) {
		this.f_part = f_part;
	}
	@Column(length=20)
	public String getP_part() {
		return p_part;
	}
	public void setP_part(String p_part) {
		this.p_part = p_part;
	}
	
}
