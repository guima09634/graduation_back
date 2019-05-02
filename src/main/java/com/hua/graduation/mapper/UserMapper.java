package com.hua.graduation.mapper;

import com.hua.graduation.entity.Search.UserLoginSearch;
import com.hua.graduation.entity.Search.UserSearch;
import com.hua.graduation.provider.UserManageProvider;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;
import java.util.Map;

/**
 * User表Mapper类
 * @author Daniel
 */
public interface UserMapper {

    @SelectProvider(type= UserManageProvider.class, method = "query")
    public List<Map<String, Object>> query(UserSearch search);

    @SelectProvider(type= UserManageProvider.class, method = "getTotal")
    public Long getTotal(UserSearch search);

    public List<Map<String, Object>> queryUserLogin(UserLoginSearch search);
}
