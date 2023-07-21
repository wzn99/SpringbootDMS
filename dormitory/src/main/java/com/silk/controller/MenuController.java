package com.silk.controller;

import com.silk.entity.Menu;
import com.silk.entity.User;
import com.silk.service.MenuService;
import com.silk.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @GetMapping("/query")
    public Result query(HttpServletRequest request){
        User user = (User) request.getAttribute("user");
        return Result.ok(menuService.query(user.getId()));
    }
}
