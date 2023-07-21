package com.silk.controller;

import com.github.pagehelper.PageInfo;
import com.silk.entity.Room;
import com.silk.entity.User;
import com.silk.service.RoomService;
import com.silk.service.UserService;
import com.silk.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/room")
public class RoomController {

    @Autowired
    private RoomService roomService;
    @Autowired
    private UserService userService;

    @PostMapping("create")
    public Result create(@RequestBody Room room){
        int flag = roomService.create(room);
        if(flag>0){
            return Result.ok();
        }else{
            return Result.fail();
        }
    }

    @GetMapping("delete")
    public Result delete(String ids){
        int flag = roomService.delete(ids);
        if(flag>0){
            return Result.ok();
        }else{
            return Result.fail();
        }
    }

    @PostMapping("update")
    public Result update(@RequestBody Room room){
        int flag = roomService.update(room);
        if(flag>0){
            return Result.ok();
        }else{
            return Result.fail();
        }
    }

    @GetMapping("detail")
    public Room detail(Integer id){
        return roomService.detail(id);
    }

    @PostMapping("query")
    public Map<String,Object> query(@RequestBody  Room room){
        PageInfo<Room> pageInfo = roomService.query(room);
        return Result.ok(pageInfo);
    }

    // 住在当前房间的人数
    @GetMapping("query_liver_amount")
    public Result queryLiverAmount(Integer id){
        int liverAmount = userService.queryLiverAmount(id);
        return Result.ok(liverAmount);
    }

}
