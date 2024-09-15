package com.example.common.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.example.common.models.User;

class UserServiceTest {

    @Test
    void testGetUsers() {
        UserService userService = new UserService();
        List<User> users = userService.getUsers();

        assertNotNull(users);
        assertEquals(2, users.size());

        User user1 = users.get(0);
        assertEquals("1", user1.getId());
        assertEquals("John Doe", user1.getName());
        assertEquals("john.doe@example.com", user1.getEmail());

        User user2 = users.get(1);
        assertEquals("2", user2.getId());
        assertEquals("Jane Doe", user2.getName());
        assertEquals("jane.doe@example.com", user2.getEmail());
    }
}
