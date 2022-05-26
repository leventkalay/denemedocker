package com.example.dockerdeneme;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/users")//pre-path
public class MyController {
    @Autowired
    private MyService userService;
    @GetMapping //api/book
    public ResponseEntity<String> getAllBooks()
    {
        User user = new User();
        user.setUsername("lkalay");
        user.setName("levent");
        userService.saveUser(user);
        return new ResponseEntity<>("das", HttpStatus.OK);
    }
}
