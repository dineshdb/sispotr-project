package edu.uiowa.icts.safeseed.domain;

import java.util.Set;
import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Table;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import org.springframework.format.annotation.DateTimeFormat;
import org.hibernate.annotations.*;
import javax.persistence.CascadeType;
import edu.uiowa.icts.*;

/* Generated by Protogen - www.icts.uiowa.edu/protogen
 * @date 2011/03/03 16:15:53
*/ 

@Entity(name="edu_uiowa_icts_safeseed_domain_audit")
@Table(name = "audit", schema="safeseed")
public class Audit
{
        private Integer auditId;
        private String eventType;
        private String description;
        @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date timeRecorded;

    public Audit()    {
        this.auditId = null;
        this.eventType = "";
        this.description = "";
        this.timeRecorded = null;
    }

    public Audit(Integer auditId, String eventType, String description, Date timeRecorded)
    {
        this.auditId = auditId;
        this.eventType = eventType;
        this.description = description;
        this.timeRecorded = timeRecorded;
    }

    /*****auditId*****/
    @javax.persistence.SequenceGenerator(  name="gen",  sequenceName="safeseed.seqnum",allocationSize=1)
    @Id
    @GeneratedValue( strategy=GenerationType.AUTO,generator="gen")
    @Column(name = "audit_id", unique = true, nullable = false)
    public Integer getAuditId()
    {
        return auditId;
    }

    public void setAuditId(Integer auditId)
    {
        this.auditId = auditId;
    }

    /*****eventType*****/
    @Column(name = "event_type")
    public String getEventType()
    {
        return eventType;
    }

    public void setEventType(String eventType)
    {
        this.eventType = eventType;
    }

    /*****description*****/
    @Column(name = "description")
    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    /*****timeRecorded*****/
    @Column(name = "time_recorded")
    public Date getTimeRecorded()
    {
        return timeRecorded;
    }

    public void setTimeRecorded(Date timeRecorded)
    {
        this.timeRecorded = timeRecorded;
    }

    public void setTimeRecorded(String timeRecorded)
    {
        try{
        DateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        formatter.setLenient(true);        this.timeRecorded = formatter.parse(timeRecorded);
        } catch (ParseException e) {e.printStackTrace();}
    }


}
