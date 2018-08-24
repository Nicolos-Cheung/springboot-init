package com.zn.springbootdemo.controller;


import com.zn.springbootdemo.domain.JsonData;
import com.zn.springbootdemo.domain.User;
import com.zn.springbootdemo.mapper.UserMapper;
import com.zn.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;


@RestController
@RequestMapping("/mybatisuser")
public class UserController {


    @Autowired
    private UserService userService;

    @Autowired
    private UserMapper userMapper;


    /**
     * 功能描述: user 保存接口
     *
     * @return json
     */
    @GetMapping("add")
    public Object add() {

        User user = new User();
        user.setAge(11);
        user.setCreateTime(new Date());
        user.setName("zn");
        user.setPhone("13155198681");
        int id = userService.add(user);

        return JsonData.buildSuccess(id);
    }


    /**
     * 功能描述：查找全部用户
     *
     * @return
     */
    @GetMapping("findAll")
    public Object findAll() {

        return JsonData.buildSuccess(userMapper.getAll());
    }


    @GetMapping("findbyid")
    public Object findById(long id) {
        return JsonData.buildSuccess(userMapper.findById(id));
    }


    @GetMapping("delbyid")
    public Object delById(long id) {
        userMapper.delete(id);
        return JsonData.buildSuccess();
    }

    @GetMapping("update")
    public Object update(String name, int id) {
        User user = new User();
        user.setName(name);
        user.setId(id);
        userMapper.update(user);
        return JsonData.buildSuccess();
    }


    //测试事务
    @GetMapping("add_account")
    public Object addAccount() {
        int id = userService.addAccount();
        return JsonData.buildSuccess(id);
    }


}
