package com.hua.graduation.provider;


import com.hua.graduation.entity.Search.PayOrderSearch;
import org.apache.commons.lang3.StringUtils;

/**
 * 为PayOrderManageMapper提供sql
 * @author Daniel
 */
public class PayOrderManageProvider {

    /**
     * 为查找提供sql
     * @param search 条件
     * @return
     */
    public String query(PayOrderSearch search) {
        StringBuffer sql = new StringBuffer("SELECT * FROM t_pay_stored WHERE 1 = 1");
        return sql.append(where(search)).toString();
    }

    /**
     * 搜索 条件
     * @param search
     * @return
     */
    private String where (PayOrderSearch search) {
        StringBuffer appnedSql = new StringBuffer();
        if(StringUtils.isNoneEmpty(search.getCreditId())) {
            appnedSql.append(" AND creditId = '" + search.getCreditId() + "'");
        }
        if(StringUtils.isNoneEmpty(search.getUserId())) {
            appnedSql.append(" AND userId = '" + search.getUserId() + "'");
        }
        if(StringUtils.isNoneEmpty(search.getPlatform())) {
            appnedSql.append(" AND platform  = '" + search.getPlatform() + "'");
        }
        if(StringUtils.isNoneEmpty(search.getStartAmout().toString())) {
            appnedSql.append(" AND amount > " + search.getStartAmout());
        }
        if(StringUtils.isNoneEmpty(search.getEndAmount().toString())) {
            appnedSql.append(" AND amount < " + search.getEndAmount());
        }
        if(StringUtils.isNoneEmpty(search.getStartTime())) {
            appnedSql.append(" AND createTime >" + search.getStartTime());
        }
        if(StringUtils.isNoneEmpty(search.getEndTime())) {
            appnedSql.append(" AND createTime <" + search.getEndTime());
        }
        return appnedSql.toString();
    }
}
