package com.controller;

import com.entity.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userService;
    private int i;

    @RequestMapping("/selUser")
    public String selUser(Model model){
        List<User> users = userService.selectAll();
        model.addAttribute("users",users);
        return "user";
    }

    @RequestMapping("/add")
    public String addUser(User user){
        i = userService.addUser(user);
        if(i!=1){
            System.out.println(">>>>系统故障<<<<");
        }else {
            System.out.println("添加成功！");
        }
        return "redirect:/selUser";
    }


    @RequestMapping("/del")
    public String delUser(Integer id){
        i = userService.delete(id);
        if(i!=1){
            System.out.println(">>>>系统故障<<<<");
        }else {
            System.out.println("删除成功！");
        }
        return "redirect:/selUser";
    }


    @RequestMapping("/selOne")
    public String selOne(Integer id,Model model){
        User user = userService.selectById(id);
        model.addAttribute("user",user);
        return "update";
    }



    @RequestMapping("/update")
    public String upUser(User user){
        System.out.println("user = " + user);
        int i = userService.update(user);
        if(i!=1){
            System.out.println(">>>>系统故障<<<<");
        }else {
            System.out.println("修改成功！");
        }
        return "redirect:/selUser";
    }

}
