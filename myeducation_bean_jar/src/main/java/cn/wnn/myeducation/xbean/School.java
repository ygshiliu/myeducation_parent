package cn.wnn.myeducation.xbean;

import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;

@Table ( name ="edu_school" )
public class School  implements Serializable {




   	@Column(name = "sch_id" )
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Id
	private Integer id;

   	@Column(name = "sch_No_id" )
	private String noId;

   	@Column(name = "sch_address" )
	private String address;

   	@Column(name = "sch_create_date" )
	private String createDate;

   	@Column(name = "sch_end_date" )
	private String endDate;

   	@Column(name = "sch_rector" )
	private String rector;

   	@Column(name = "sch_telephone" )
	private String telephone;

   	@Column(name = "sch_email" )
	private String email;

   	@Column(name = "sch_status" )
	private Double status;

   	@Column(name = "sch_remarks" )
	private String remarks;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNoId() {
		return this.noId;
	}

	public void setNoId(String noId) {
		this.noId = noId;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getEndDate() {
		return this.endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getRector() {
		return this.rector;
	}

	public void setRector(String rector) {
		this.rector = rector;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getStatus() {
		return this.status;
	}

	public void setStatus(Double status) {
		this.status = status;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
