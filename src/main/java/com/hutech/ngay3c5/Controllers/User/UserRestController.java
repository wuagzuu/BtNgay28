package com.hutech.ngay3c5.Controllers.User;

import com.hutech.ngay3c5.Entities.User;
import com.hutech.ngay3c5.RequestEntities.RequestCreateUser;
import com.hutech.ngay3c5.RequestEntities.RequestUpdateUser;
import com.hutech.ngay3c5.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/users")
public class UserRestController {
    @Autowired
    private UserService userService;

    @PostMapping("")
    public User CreateUser(@RequestBody RequestCreateUser requestCreateStudent) {
        return userService.CreateUser(requestCreateStudent);
    }
    @GetMapping("")
    public List<User> findAllUsers() {
        return userService.findAllUsers();
    }
    @GetMapping("/{id}")
    public User getStudentById(@PathVariable String id) {
        return userService.getUserById(id);
    }
    @PutMapping("/{id}")
    public User updateStudent(@PathVariable String id, @RequestBody RequestUpdateUser requestUpdateStudent) {
        return userService.updateUser(id, requestUpdateStudent);
    }
}
