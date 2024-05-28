package com.hutech.ngay3c5.Services;

import com.hutech.ngay3c5.Entities.User;
import com.hutech.ngay3c5.Repositories.UserRepository;
import com.hutech.ngay3c5.RequestEntities.RequestCreateUser;
import com.hutech.ngay3c5.RequestEntities.RequestUpdateUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User CreateUser(RequestCreateUser requestCreateUser){
        try {
            User user = new User();
            user.setId(requestCreateUser.getId());
            user.setUsername(requestCreateUser.getUsername());
            user.setFirstName(requestCreateUser.getFirstName());
            user.setLastName(requestCreateUser.getLastName());
            user.setEmail(requestCreateUser.getEmail());
            user.setPassword(requestCreateUser.getPassword());
            user.setDeleted(false);
            userRepository.save(user);
            return user;
        }catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }
    public User updateUser(String id, RequestUpdateUser requestUpdateUser){
        try {
            User user = new User();
            user.setId(requestUpdateUser.getId());
            user.setUsername(requestUpdateUser.getUsername());
            user.setFirstName(requestUpdateUser.getFirstName());
            user.setLastName(requestUpdateUser.getLastName());
            user.setEmail(requestUpdateUser.getEmail());
            user.setPassword(requestUpdateUser.getPassword());
            user.setDeleted(false);
            userRepository.save(user);
            return user;
        }catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public User getUserById(String id) {
        return userRepository.findById(id).orElse(null);
    }

    public void deleteUser(String id) {
        userRepository.deleteById(id);
    }
}

