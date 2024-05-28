package com.hutech.ngay3c5.Controllers.User;

import com.hutech.ngay3c5.Entities.User;
import com.hutech.ngay3c5.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("")
    public String ShowAllStudents(Model model){
        List<User> students = userService.findAllUsers();
        model.addAttribute("users", students);
        return "User/index";
    }
}
