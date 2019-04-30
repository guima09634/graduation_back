package com.hua.graduation.service;

import com.hua.graduation.mapper.GameMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("GameService")
public class GameService {

    @Autowired
    private GameMapper gameMapper;

    public List<Map<String, Object>> query() {
        return gameMapper.query();
    }
}
