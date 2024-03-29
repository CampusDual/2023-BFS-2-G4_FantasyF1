package com.campusdual.cd2023bfs2g4.model.core.dao;

import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

@Lazy
@Repository(value ="PilotPriceDao")
@ConfigurationFile(
        configurationFile = "dao/PilotPriceDao.xml",
        configurationFilePlaceholder = "dao/placeholders.properties")
public class PilotPriceDao extends OntimizeJdbcDaoSupport {
    public static final String PIL_ID = "PP_ID";
    public static final String PP_FORMER_PRICE = "PP_FORMER_PRICE";
    public static final String PP_NEW_PRICE = "PP_NEW_PRICE";

}
