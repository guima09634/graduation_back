package com.hua.graduation.mapper;

import com.hua.graduation.entity.Search.UserSearch;
import com.hua.graduation.entity.User;
import com.hua.graduation.provider.UserManageProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;
import java.util.Map;

/**
 * 用户管理Mapper
 * @author Daniel
 */
public interface UserManageMapper {

    /**
     *查找用户数据
     * @param search 条件
     * @return
     */
    @SelectProvider(type= UserManageProvider.class, method = "query")
    public List<Map<String, Object>> query(UserSearch search);

    /**
     * 获取总量;
     * @param search 条件
     * @return
     */
    @SelectProvider(type= UserManageProvider.class, method = "getTotal")
    public Long getTotal(UserSearch search);

    /**
     *获取导出用户数据
     * @param search 条件
     * @return
     */
    @SelectProvider(type= UserManageProvider.class, method = "query")
    public List<Map<String, Object>> getExportData(UserSearch search);

    /**
     * 冻结或者封号该用户;
     */
    @InsertProvider(type= UserManageProvider.class, method = "deleteUser")
    public void deleteUser(User user);
}
