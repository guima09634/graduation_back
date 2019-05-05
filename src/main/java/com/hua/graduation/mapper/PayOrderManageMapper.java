package com.hua.graduation.mapper;

import com.hua.graduation.entity.PayStored;
import com.hua.graduation.entity.Search.PayOrderSearch;
import com.hua.graduation.provider.PayOrderManageProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;
import java.util.Map;

/**
 * PayOrderManageMapper接口
 * @table t_pay_stored
 * @author Daniel
 */
public interface PayOrderManageMapper {

    /**
     *查找数据
     * @param search 条件
     * @return
     */
    @SelectProvider(type = PayOrderManageProvider.class, method = "query")
    public List<Map<String, Object>> query(PayOrderSearch search);

    @Insert("INSERT INTO t_pay_stored (usersId, creditId, gameCode, platform, amount, createTime, modifyTime) VALUES (" +
            ");")
    public void insert(PayStored payStored);

}
