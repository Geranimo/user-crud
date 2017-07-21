package com.sash.dev.endpoints;

import com.sash.dev.UserService.UserService;
import com.sash.dev.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @RequestMapping(value = "/user/name/{lastname}", method = RequestMethod.GET)
    public List<User> getUsersByLastName(@PathVariable String lastname) {
        return service.findByLastName(lastname);
    }

    @RequestMapping(value = "/user/id/{userId}", method = RequestMethod.GET)
    public User getUsersById(@PathVariable String userId) {
        return service.findById(userId);
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public List<User> getAllUsers() {
        return service.findAll();
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    ResponseEntity addUser(@RequestBody User user) {
            service.save(user);
        return ResponseEntity.ok().build();
    }

    @RequestMapping(value = "/user/update/{id}", method = RequestMethod.PATCH)
    ResponseEntity updateUser(@PathVariable String id,  @RequestBody User user) {
        if(service.findById(id) != null){
            service.save(user);
            return ResponseEntity.ok().build();
        }else
            return ResponseEntity.notFound().build();

    }
}
