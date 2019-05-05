package com.hua.graduation.mapper;


import com.hua.graduation.entity.Game;
import com.hua.graduation.provider.GameManageProvider;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;
import java.util.Map;

/**
 * 操作t_games mapper接口
 * @author Daneil
 */
public interface GameMapper {

    @SelectProvider(type= GameManageProvider.class, method = "query")
    public List<Map<String, Object>> query();

    @Insert("INSERT INTO t_games (gameCode, gameName, createTime, modifyTime) VALUES (#{gameCode}, #{gameName}, #{createTime}, #{modifyTime});")
    public void insert(Game game);

    @Delete("DELETE FROM t_games WHERE gameCode in (#{gameCodes})")
    public void delete(String gameCodes);
}
