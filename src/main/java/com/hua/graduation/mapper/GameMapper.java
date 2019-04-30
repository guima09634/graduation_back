package com.hua.graduation.mapper;


import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * 操作t_games mapper接口
 * @author Daneil
 */
public interface GameMapper {
    @Select("SELECT * FROM t_games;")
    public List<Map<String, Object>> query();
}
