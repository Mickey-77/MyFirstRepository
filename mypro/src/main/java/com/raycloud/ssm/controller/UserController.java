package com.raycloud.ssm.controller;
//#--------------------------------git
import com.raycloud.ssm.pojo.User;
import com.raycloud.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//-------------44444444444444444444444
//------------------------git
import java.util.List;

/**
 * Created by tyerwetrw on 2016/3/31.
 */
@Controller
@RequestMapping("/user")
public class UserController {
@Autowired
   private UserService userService;


    @RequestMapping(value = "/findUser",produces = {"application/text;charset=UTF-8"})
    public ModelAndView findUser()throws Exception{
        ModelAndView modelAndView = new ModelAndView();

        //调用service方法得到用户列表
        List<User> users = userService.findusers();
//        for(User u:users)
//        System.out.println(u.getUname()+"    "+users.size());
        //将得到的用户列表内容添加到ModelAndView中
        modelAndView.addObject("users",users);
        //设置响应的jsp视图
        modelAndView.setViewName("findUser");

        return modelAndView;
    }
    @RequestMapping("/test")
    public void saytest()throws Exception{
        System.out.print("test-----------");
    }
    @RequestMapping("/add")
    public ModelAndView  addUser(User user){
        ModelAndView   modelAndView=new ModelAndView();
//        user=new User();
//        user.setUid(4);
//        user.setUname("insert from controll");
   if(user!=null) {
       System.out.println(user.getUname()+user.getUid());
      userService.adduser(user);
   }
        List<User> users= userService.findusers();
//        for(User u:users)
//            System.out.println(u.getUname()+"    "+users.size());

        modelAndView.addObject("users", users);
        modelAndView.setViewName("findUser");

        return modelAndView;
    }


}
