package com.hua.graduation.provider;


import com.hua.graduation.entity.Search.UserSearch;
import org.apache.commons.lang3.StringUtils;

/**
 * 为UserMapper提供sql;
 * @author Daneil
 */
public class UserProvider {


    public String query(UserSearch search) {
        StringBuffer sql = new StringBuffer("SELECT t1.*,t2.* FROM t_users_account t1 LEFT JOIN t_users_info t2 ON" +
                "t1.userId = t2.usersId WHERE t1.isDeleted = 0");
        return sql.append(where(search)).toString();
    }

    public String getTotal(UserSearch search) {
        StringBuffer sql = new StringBuffer("SELECT COUNT(1) FROM t_users_account t1 LEFT JOIN t_users_info t2 ON" +
                "t1.userId = t2.usersId WHERE t1.isDeleted = 0");
        return sql.append(where(search)).toString();
    }

    private String where(UserSearch search) {
        StringBuffer appendSql = new StringBuffer();
        if(StringUtils.isNotEmpty(search.getUserId())) {
            appendSql.append(" AND t1.userId = " + search.getUserId());
        }
        if(StringUtils.isNotEmpty(search.getStartAge().toString())) {
            appendSql.append(" AND t2.age > " + search.getStartAge());
        }
        if(StringUtils.isNotEmpty(search.getEndAge().toString())) {
            appendSql.append(" AND t2.age < " + search.getEndAge());
        }
        if(StringUtils.isNotEmpty(search.getSex())) {
            appendSql.append(" AND t2.sex = " + search.getSex());
        }
        if(StringUtils.isNotEmpty(search.getTimeType().toString())) {
            if(("0").equals(search.getTimeType())) {
                if(StringUtils.isNotEmpty(search.getStratTime())) {
                    appendSql.append(" AND t1.createTime > " + search.getStratTime());
                }
                if(StringUtils.isNotEmpty(search.getEndTime())) {
                    appendSql.append(" AND t1.createTime > " + search.getEndTime());
                }
            }
        } else {
            if(StringUtils.isNotEmpty(search.getStratTime())) {
                appendSql.append(" AND t1.modifyTime > " + search.getStratTime());
            }
            if(StringUtils.isNotEmpty(search.getEndTime())) {
                appendSql.append(" AND t1.modifyTime > " + search.getEndTime());
            }
        }

        if(StringUtils.isNotBlank(search.getMode())) {
            if(("phone").equals(search.getMode())) {
                appendSql.append(" AND t1.phone = " + search.getPhone());
            } else {
                appendSql.append(" AND t1.email = " + search.getEmail());
            }
        }
        return appendSql.toString();
    }
}
