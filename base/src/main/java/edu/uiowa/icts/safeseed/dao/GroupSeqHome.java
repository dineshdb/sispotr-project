package edu.uiowa.icts.safeseed.dao;

import edu.uiowa.icts.spring.*;
import edu.uiowa.icts.safeseed.domain.*;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/* Generated by Protogen
 *
 *
*/

@Repository("edu_uiowa_icts_safeseed_dao_GroupSeqHome")
@Transactional
public class GroupSeqHome extends GenericDao<GroupSeq> implements GroupSeqService {


    private static final Log log =LogFactory.getLog(GroupSeqHome.class);

    public GroupSeqHome()
    {        setDomainName("edu.uiowa.icts.safeseed.domain.GroupSeq");

    }


    public GroupSeq  findById(GroupSeqId id)

    {
        return (GroupSeq)this.sessionFactory.getCurrentSession().get(getDomainName(), id);

    }




}
