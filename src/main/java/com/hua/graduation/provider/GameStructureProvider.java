package com.hua.graduation.provider;

import com.hua.graduation.entity.Search.GameStructureSearch;
import org.apache.commons.lang3.StringUtils;

/**
 * 为GameStructureMapper提供sql
 * @author Daniel
 */
public class GameStructureProvider {

    public String query(GameStructureSearch search) {
        StringBuffer sql = new StringBuffer("SELECT * FROM t_games_vip_structure WHERE 1 =1 ");
        return sql.append(where(search)).toString();
    }

    private String where(GameStructureSearch search) {
        StringBuffer appendSql = new StringBuffer();
        if(StringUtils.isNoneEmpty(search.getGameName())) {
            appendSql.append(" AND gameName = " + search.getGameName());
        }
        if(StringUtils.isNoneEmpty(search.getType())) {
            appendSql.append(" AND type = " + search.getType());
        }
        if(StringUtils.isNoneEmpty(search.getStartTime())) {
            appendSql.append(" AND createTime > " + search.getStartTime());
        }
        if(StringUtils.isNoneEmpty(search.getEndTime())) {
            appendSql.append(" AND createTime < " + search.getEndTime());
        }
        return appendSql.toString();
    }
}
