package com.hua.graduation.controller;

import com.hua.graduation.common.ResultBean;
import com.hua.graduation.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 *游戏拦截器
 * @author Daniel
 */

@RestController
@RequestMapping("/api/game")
public class GameController extends BaseController{

    @Autowired
    private GameService gameService;

    @RequestMapping(value = "/query")
    public ResultBean query() {
        return returnSuccess(gameService.query());
    }

}
