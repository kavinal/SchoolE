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
 * 伤病种类
 *
 */

@Entity
@Table(name="injured_kind")
public class Injure implements Serializable{

	private static final long serialVersionUID = 859572849444822311L;
	/**
	 * 伤病种类id，主键
	 */
	private int kind_id;
	/**
	 * 科别：内科，外科
	 */
	private String type;
	/**
	 * 伤病种类
	 */
	private String kind;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getKind_id() {
		return kind_id;
	}
	public void setKind_id(int kind_id) {
		this.kind_id = kind_id;
	}
	@Column(length=10)
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Column(length=32)
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}

}
