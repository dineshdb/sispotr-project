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

@Entity(name="edu_uiowa_icts_safeseed_domain_person")
@Table(name = "person", schema="safeseed")
public class Person
{
        private Integer personId;
        private String username;
        private String guid;
        private String email;
        private String password;
        private String organization;
        private String industry;
        private Integer accessLevel;
        private String domain;   
        private Date creationDate = new Date();
        private Set<Seq> seqs = new HashSet<Seq>(0);
        private Set<GlobalHistory> globalHistorys = new HashSet<GlobalHistory>(0);
        private Set<PersonGroup> personGroups = new HashSet<PersonGroup>(0);
        private Set<Submission> submissions = new HashSet<Submission>(0);
        private Set<Collection> collections = new HashSet<Collection>(0);
        private Set<GlobalCollection> globalCollections = new HashSet<GlobalCollection>(0);
        private Set<History> historys = new HashSet<History>(0);

    public Person()    {
        this.personId = null;
        this.username = "";
        this.guid = "";
        this.domain = "";
        this.email = "";
        this.seqs = new HashSet<Seq>(0);
        this.globalHistorys = new HashSet<GlobalHistory>(0);
        this.personGroups = new HashSet<PersonGroup>(0);
        this.submissions = new HashSet<Submission>(0);
        this.collections = new HashSet<Collection>(0);
        this.globalCollections = new HashSet<GlobalCollection>(0);
        this.historys = new HashSet<History>(0);
    }

    public Person(Integer personId, String username, String guid, String domain, String email, Set<Seq> seqs, Set<GlobalHistory> globalHistorys, Set<PersonGroup> personGroups, Set<Submission> submissions, Set<Collection> collections, Set<GlobalCollection> globalCollections, Set<History> historys)
    {
        this.personId = personId;
        this.username = username;
        this.guid = guid;
        this.domain = domain;
        this.email = email;
        this.seqs = seqs;
        this.globalHistorys = globalHistorys;
        this.personGroups = personGroups;
        this.submissions = submissions;
        this.collections = collections;
        this.globalCollections = globalCollections;
        this.historys = historys;
    }

    public Person( String username, String guid, String domain, String email)
    {
        this.personId = personId;
        this.username = username;
        this.guid = guid;
        this.domain = domain;
        this.email = email;

    }
    /*****personId*****/
    @javax.persistence.SequenceGenerator(  name="gen",  sequenceName="safeseed.seqnum",allocationSize=1)
    @Id
    @GeneratedValue( strategy=GenerationType.AUTO,generator="gen")
    @Column(name = "person_id", unique = true, nullable = false)
    public Integer getPersonId()
    {
        return personId;
    }

    public void setPersonId(Integer personId)
    {
        this.personId = personId;
    }

    /*****username*****/
    @Column(name = "username")
    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    /*****guid*****/
    @Column(name = "guid")
    public String getGuid()
    {
        return guid;
    }

    public void setGuid(String guid)
    {
        this.guid = guid;
    }

    /*****domain*****/
    @Column(name = "domain")
    public String getDomain()
    {
        return domain;
    }

    public void setDomain(String domain)
    {
        this.domain = domain;
    }
    
    
    /*****access_level*****/
    @Column(name = "access_level")
    public Integer getAccessLevel() {
		return accessLevel;
	}

	public void setAccessLevel(Integer accessLevel) {
		this.accessLevel = accessLevel;
	}

	/*****email*****/
    @Column(name = "email")
    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    /*****organization*****/
    @Column(name = "organization")
    public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public String getPassword() {
		return password;
	}
	
	

	/*****password*****/
    @Column(name = "password")
	public void setPassword(String password) {
		this.password = password;
	}
    

    
	/*****creation_date*****/
    @Column(name = "creation_date")
    public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	/*****industry*****/
    @Column(name = "industry")
    public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

    

	/*****seqs*****/
    @OneToMany(fetch = FetchType.LAZY,   mappedBy = "person", targetEntity=Seq.class, cascade=CascadeType.REMOVE)
    public Set<Seq> getSeqs()
    {
        return seqs;
    }

    public void setSeqs(Set<Seq> seqs)
    {
        this.seqs = seqs;
    }

    /*****globalHistorys*****/
    @OneToMany(fetch = FetchType.LAZY,   mappedBy = "person", targetEntity=GlobalHistory.class, cascade=CascadeType.REMOVE)
    public Set<GlobalHistory> getGlobalHistorys()
    {
        return globalHistorys;
    }

    public void setGlobalHistorys(Set<GlobalHistory> globalHistorys)
    {
        this.globalHistorys = globalHistorys;
    }

    /*****personGroups*****/
    @OneToMany(fetch = FetchType.LAZY,   mappedBy = "person", targetEntity=PersonGroup.class, cascade=CascadeType.REMOVE)
    public Set<PersonGroup> getPersonGroups()
    {
        return personGroups;
    }

    public void setPersonGroups(Set<PersonGroup> personGroups)
    {
        this.personGroups = personGroups;
    }

    /*****submissions*****/
    @OneToMany(fetch = FetchType.LAZY,   mappedBy = "person", targetEntity=Submission.class, cascade=CascadeType.REMOVE)
    public Set<Submission> getSubmissions()
    {
        return submissions;
    }

    public void setSubmissions(Set<Submission> submissions)
    {
        this.submissions = submissions;
    }

    /*****collections*****/
    @OneToMany(fetch = FetchType.LAZY,   mappedBy = "person", targetEntity=Collection.class, cascade=CascadeType.REMOVE)
    public Set<Collection> getCollections()
    {
        return collections;
    }

    public void setCollections(Set<Collection> collections)
    {
        this.collections = collections;
    }

    /*****globalCollections*****/
    @OneToMany(fetch = FetchType.LAZY,   mappedBy = "person", targetEntity=GlobalCollection.class, cascade=CascadeType.REMOVE)
    public Set<GlobalCollection> getGlobalCollections()
    {
        return globalCollections;
    }

    public void setGlobalCollections(Set<GlobalCollection> globalCollections)
    {
        this.globalCollections = globalCollections;
    }

    /*****historys*****/
    @OneToMany(fetch = FetchType.LAZY,   mappedBy = "person", targetEntity=History.class, cascade=CascadeType.REMOVE)
    public Set<History> getHistorys()
    {
        return historys;
    }

    public void setHistorys(Set<History> historys)
    {
        this.historys = historys;
    }


}
