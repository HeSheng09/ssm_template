package com.project.controller;

import com.project.entity.User;
import com.project.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * java class UserController-
 *
 * @author HS
 * @CreateDate 2020/8/16
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private IUserService iUserService;

    @RequestMapping("/selectById")
    public void selectById(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("utf-8");

        response.setHeader("Content-type","textml;charset=UTF-8");
        response.setCharacterEncoding("utf-8");
        response.setHeader("Access-Control-Allow-Origin","*");

        int id=Integer.parseInt(request.getParameter("id"));
        User user=iUserService.selectById(id);
        try{
            System.out.println("id:"+user.getId()+"\tname:"+user.getName());
            response.getWriter().write(user.toString());
        }catch (NullPointerException e) {
            System.out.println("查无此人！");
            response.getWriter().write("查无此人！");
        }
    }

    @RequestMapping("/selectByName")
    public void selectByName(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("utf-8");

        response.setHeader("Content-type","textml;charset=UTF-8");
        response.setCharacterEncoding("utf-8");
        response.setHeader("Access-Control-Allow-Origin","*");

        String name=request.getParameter("name");
        User user=iUserService.selectByName(name);
        try{
            System.out.println("id:"+user.getId()+"\tname:"+user.getName());
            response.getWriter().write(user.toString());
        }catch (NullPointerException e) {
            System.out.println("查无此人！");
            response.getWriter().write("查无此人！");
        }
    }

    @RequestMapping("/index")
    public String gotoIndex(){
        return "index";
    }
}
