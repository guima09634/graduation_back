package com.hua.graduation.mapper;

import com.hua.graduation.entity.Search.UserLoginSearch;
import com.hua.graduation.entity.Search.UserSearch;
import com.hua.graduation.provider.UserLoginRecordProvider;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;
import java.util.Map;

/**
 * 用户登录记录Mapper
 * @author Daneil
 */
public interface UserLoginRecordMapper {

    /**
     * 查找;
     * @param search 条件
     * @return
     */
    @SelectProvider(type = UserLoginRecordProvider.class, method = "query")
    public List<Map<String, Object>> query(UserLoginSearch search);

    /**
     * 获取需要导出的数据;
     * @param search 条件
     * @return
     */
    @SelectProvider(type = UserLoginRecordProvider.class, method = "query")
    public List<Object[]> getAllRecord(UserLoginSearch search);

    /**
     * 获取数据总量;
     * @param search 条件
     * @return
     */
    @SelectProvider(type= UserLoginRecordProvider.class, method = "getTotal")
    public Long getTotal(UserSearch search);

}
