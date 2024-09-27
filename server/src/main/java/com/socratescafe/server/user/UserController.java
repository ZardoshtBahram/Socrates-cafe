package com.socratescafe.server.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/api/users")
    public ResponseEntity<Iterable<Users>> findAll() {
        Iterable<Users> users = userRepository.findAll();
        return new ResponseEntity<Iterable<Users>>(users, HttpStatus.OK);
    }

    @PutMapping("/api/users")
    public ResponseEntity<Users> updateOne(@RequestBody Users user) {
        Users updatedUser = userRepository.save(user);
        return new ResponseEntity<Users>(updatedUser, HttpStatus.OK);
    }

    @PostMapping("/api/users")
    public ResponseEntity<Users> addOne(@RequestBody Users user) {
        Users newUser = userRepository.save(user);
        return new ResponseEntity<Users>(newUser, HttpStatus.OK);
    }

    @DeleteMapping("/api/users/{id}")
    public ResponseEntity<Integer> deleteOne(@PathVariable long id) {
        return new ResponseEntity<Integer>(userRepository.deleteOne(id), HttpStatus.OK);
    }
}
