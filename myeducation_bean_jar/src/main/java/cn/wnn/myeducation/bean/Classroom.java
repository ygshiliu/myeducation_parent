package cn.wnn.myeducation.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table ( name ="edu_classroom" )
public class Classroom  implements Serializable {

   	@Column(name = "room_id" )
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Id
	private Integer Id;

   	@Column(name = "sch_id" )
	private Integer schId;

   	@Column(name = "room_site" )
	private String site;

   	@Column(name = "room_total_people" )
	private Integer totalPeople;

   	@Column(name = "room_remarks" )
	private String remarks;



}
