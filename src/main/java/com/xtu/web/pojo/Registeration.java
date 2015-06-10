package com.xtu.web.pojo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
/**
 * 
 * @author vincent
 *挂号单
 */
@Entity
@Table(name="registration_form_info")
public class Registeration implements Serializable{

	private static final long serialVersionUID = 1L;
	/**
	 * 挂号单号，主键
	 */
	private int r_id;
	/**
	 * 学生的id号，外键
	 */
//	private int s_id;
	private Student student;
	
	/**
	 * 科别：内科，外科
	 */
	private int type;
	/**
	 * 挂号日期
	 */
	private Date r_date;
	/**
	 * 挂号单状态：待诊，就诊
	 */
	private int status;
	/**
	 * 受伤地点，外键
	 */
//	private int place_id;
	private Place place;
	
	/**
	 * 受伤部位，外键
	 */
//	private int part_id;
	private Part part;
	
	/**
	 * 伤病种类，外键
	 */
//	private int kind_id;
	private Injure injure;
	
	/**
	 * 到达时间
	 */
	private Date arrive_time;
	/**
	 * 离开时间
	 */
	private Date leave_time;
	/**
	 * 受伤发生时间
	 */
	private Date happen_time;
	/**
	 * 受伤原因分析
	 */
	private String analysis;
	/**
	 * 备注
	 */
	private String remark;
	/**
	 * 病情处理方式
	 */
	private String disease_handle;
	/**
	 * 挂号单状态处理人员
	 */
	private String r_sta_dea_peo;
	/**
	 * 体温
	 */
	private String temperature;
	/**
	 * 症状
	 */
	private String symptom;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getR_id() {
		return r_id;
	}
	public void setR_id(int r_id) {
		this.r_id = r_id;
	}
	
	@OneToOne
	@JoinColumn(name="s_id")
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	@Column(length=2)
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	@Temporal(TemporalType.DATE)
	public Date getR_date() {
		return r_date;
	}
	public void setR_date(Date r_date) {
		this.r_date = r_date;
	}
	
	@Column(length=2)
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	@OneToOne
	@JoinColumn(name="place_id")
	public Place getPlace() {
		return place;
	}
	public void setPlace(Place place) {
		this.place = place;
	}
	
	@OneToOne
	@JoinColumn(name="part_id")
	public Part getPart() {
		return part;
	}
	public void setPart(Part part) {
		this.part = part;
	}
	
	@OneToOne
	@JoinColumn(name="kind_id")
	public Injure getInjure() {
		return injure;
	}
	public void setInjure(Injure injure) {
		this.injure = injure;
	}
	
	@Temporal(TemporalType.TIME)
	public Date getArrive_time() {
		return arrive_time;
	}
	public void setArrive_time(Date arrive_time) {
		this.arrive_time = arrive_time;
	}
	
	@Temporal(TemporalType.TIME)
	public Date getLeave_time() {
		return leave_time;
	}
	public void setLeave_time(Date leave_time) {
		this.leave_time = leave_time;
	}
	
	@Temporal(TemporalType.TIME)
	public Date getHappen_time() {
		return happen_time;
	}
	public void setHappen_time(Date happen_time) {
		this.happen_time = happen_time;
	}
	
	@Column(length=128)
	public String getAnalysis() {
		return analysis;
	}
	
	public void setAnalysis(String analysis) {
		this.analysis = analysis;
	}
	
	@Column(length=128)
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	@Column(length=128)
	public String getDisease_handle() {
		return disease_handle;
	}
	public void setDisease_handle(String disease_handle) {
		this.disease_handle = disease_handle;
	}
	
	@Column(length=12)
	public String getR_sta_dea_peo() {
		return r_sta_dea_peo;
	}
	public void setR_sta_dea_peo(String r_sta_dea_peo) {
		this.r_sta_dea_peo = r_sta_dea_peo;
	}
	
	@Column(length=12)
	public String getTemperature() {
		return temperature;
	}
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}
	
	@Column(length=32)
	public String getSymptom() {
		return symptom;
	}
	public void setSymptom(String symptom) {
		this.symptom = symptom;
	}

}
