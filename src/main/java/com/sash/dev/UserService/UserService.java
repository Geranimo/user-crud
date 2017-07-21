package com.sash.dev.UserService;

import com.sash.dev.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserService extends MongoRepository<User, String> {

    User findByFirstName(String firstName);
    List<User> findByLastName(String lastName);
    User findById(String id);
}
