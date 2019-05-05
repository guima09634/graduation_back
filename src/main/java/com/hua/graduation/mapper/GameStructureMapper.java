package com.hua.graduation.mapper;


import com.hua.graduation.entity.GameStructure;
import com.hua.graduation.entity.Search.GameStructureSearch;
import com.hua.graduation.provider.GameStructureProvider;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;
import java.util.Map;

/**
 * 游戏配置Mapper
 * @author Daniel
 */
public interface GameStructureMapper {

    /**
     * 查找
     * @param search
     * @return
     */
    @SelectProvider(type= GameStructureProvider.class, method = "query")
    public List<Map<String, Object>> query(GameStructureSearch search);

    @Insert("insert into t_games_vip_structure (gameCode, structure, createTime, modifyTime, type) VALUES (" +
            "#{gameCode}, #{structure}, #{createTime}, #{modifyTime}, #{type})")
    public void insert(GameStructure structure);

    @Delete("DELETE FROM t_games_vip_structure WHERE id in ( #{ids} )")
    public void delete(String ids);
}
