package edu.uiowa.icts.safeseed.domain;

/* Generated by Protogen - www.icts.uiowa.edu/protogen
 * @date 2011/03/03 16:15:53
*/ 

import java.util.Set;
import java.util.*;
import edu.uiowa.icts.*;
import javax.persistence.*;
import java.io.Serializable;
import org.springframework.format.annotation.DateTimeFormat;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;


@Embeddable
public class CollectionId implements Serializable
{


    //Table attribute definitions
    private Integer personId;
    private Integer seqId;




    //Table attribute definitions
    @Column(name = "person_id", nullable = false)
    public Integer getPersonId()
    {
        return personId;
    }

    public void setPersonId(Integer personId)
    {
        this.personId = personId;
    }

    @Column(name = "seq_id", nullable = false)
    public Integer getSeqId()
    {
        return seqId;
    }

    public void setSeqId(Integer seqId)
    {
        this.seqId = seqId;
    }

}