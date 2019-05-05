package com.hua.graduation.provider;


import com.hua.graduation.entity.Search.GameSearch;
import org.apache.commons.lang3.StringUtils;

/**
 *为GameManageMapper提供sql
 * @author Daniel
 */
public class GameManageProvider {

    /**
     * 查找
     * @param search
     * @return
     */
    public String query(GameSearch search){
        StringBuffer sql = new StringBuffer("SELECT * FROM t_games WHERE 1 = 1");
        return sql.append(where(search)).toString();
    }

    /**
     * 条件
     * @return
     */
    private String where(GameSearch search) {
        StringBuffer appendSql = new StringBuffer();
        if(("createTime").equals(search.getMode())) {
            if(StringUtils.isNoneEmpty(search.getStartTime())) {
                appendSql.append(" AND createTiem >" + search.getStartTime());
            } else {
                appendSql.append(" AND createTime < " + search.getEndTime());
            }
        } else {
            if(StringUtils.isNoneEmpty(search.getStartTime())) {
                appendSql.append(" AND modifyTime >" + search.getStartTime());
            } else {
                appendSql.append(" AND modifyTime < " + search.getEndTime());
            }
        }
        return appendSql.toString();
    }
}
