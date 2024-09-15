package com.example.common.services;

import com.example.common.models.User;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public List<User> getUsers() {
        return Arrays.asList(
            new User("1", "John Doe", "john.doe@example.com"),
            new User("2", "Jane Doe", "jane.doe@example.com"));
    }
}
