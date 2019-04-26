package cn.wnn.myeducation.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Administrator on 2018/11/30 0030.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="edu_school")
public class School implements Serializable{

    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Id
    @Column(name="sch_id")
    private Integer id;
    @Column(name="sch_no_id")
    private String noId;
    @Column(name="sch_address")
    private String address;
    @Temporal(TemporalType.DATE)
    @Column(name="sch_create_date")
    private String createDate;
    @Temporal(TemporalType.DATE)
    @Column(name="sch_end_date")
    private String endDate;
    @Column(name="sch_rector")
    private String rector;
    @Column(name = "sch_telephone")
    private String telephone;
    @Column(name="sch_email")
    private String email;
    @Column(name="sch_status")
    private String status;
    @Column(name="sch_remarks")
    private String remarks;
    @Column(name="sch_postcode")
    private String postcode;
}
