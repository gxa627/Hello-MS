package com.springdemo.helloms.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "sw_blend_workbench_hdr_tbl")
public class WorkOrderHdr {
    @Id
    private String batchrequestid;
    private Integer seqnum;
    private String aurorabatchid;
    private String demandtype;
    private String itemtype;
    private String customer;
    private String facilitynum;
    private String productgrouping;
    private double scheduledqty;
    private String scheduledqtyuom;
    private Date orderdate;
    private Date shoporderduedate;
    private Date plannedstartdate;
    private Date plannedenddate;
    private Date mfgstartdate;
    private String sequencedflag;
    private String formulanum;
    private String sourcestatus;
    private String resourcename;
    private String assigneddate;
    private String batchstatus;
    private String wostatus;
    private String rushorder;
    private String specialinstructions;
    private Integer batchadjustments;
    private String errormessage;
    private String deletemark;
    private String linktobatchreqid;
    private String mergebatchreqid;
    private String origbatchreqid;
    private Date creationdate;
    private String createdby;
    private Date lastupdatedate;
    private String lastupdatedby;
}
