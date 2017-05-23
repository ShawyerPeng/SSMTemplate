package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import po.User;

import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping(value = "/hello")
public class UserController{

    @RequestMapping(value = "/spring")
    @ResponseBody
    public User login(HttpServletResponse response, @RequestParam("username") String username, @RequestParam("password") String password)throws Exception{
        response.getWriter().write("helloo,spring~");
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        response.getWriter().write(user.getUsername()+" <p />"+user.getPassword());
        return user;
    }

    @RequestMapping("/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, ModelMap modelMap) throws Exception{
        modelMap.addAttribute("username",username);
        modelMap.addAttribute("password",password);
        return "user";
    }
}