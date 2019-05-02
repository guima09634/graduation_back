package com.hua.graduation.provider;

import com.hua.graduation.entity.Search.UserLoginSearch;
import org.apache.commons.lang3.StringUtils;

/**
 * 用户登录记录sql提供类
 * @author Daneil
 */
public class UserLoginRecordProvider {

    /**
     * 为查找提供sql
     * @param search 条件
     * @return
     */
    public String query(UserLoginSearch search) {
        StringBuffer sql = new StringBuffer("SELECT * FROM t_users_login_record WHERE 1 = 1");
        return sql.append(where(search)).toString();
    }

    /**
     * 为获取总数提供sql
     * @param search  条件
     * @return
     */
    public String getTotal(UserLoginSearch search) {
        StringBuffer sql = new StringBuffer("SELECT COUNT(*) FROM t_users_login_record WHERE 1 = 1 ");
        return sql.append(where(search)).toString();
    }

    /**
     * where 条件
     * @param search
     * @return
     */
    private String where(UserLoginSearch search) {
        StringBuffer appendSql = new StringBuffer();
        if(StringUtils.isNoneEmpty(search.getUserId())) {
            appendSql.append(" AND userId = " + search.getUserId());
        }
        if(StringUtils.isNoneEmpty(search.getPlatform())) {
            appendSql.append(" AND platform = " + search.getPlatform());
        }
        if(StringUtils.isNoneEmpty(search.getStartTime())) {
            appendSql.append(" AND loginTime >" + search.getStartTime());
        }
        if(StringUtils.isNoneEmpty(search.getEndTime())) {
            appendSql.append(" AND loginTime <" + search.getEndTime());
        }
        return appendSql.toString();
    }
}
