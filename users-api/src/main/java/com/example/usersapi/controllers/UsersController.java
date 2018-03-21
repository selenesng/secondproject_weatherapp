package com.example.usersapi.controllers;

import org.springframework.web.bind.annotation.*;


    @RestController
    public class UsersController {
        @Autowired
        private UserRepository userRepo;

        @GetMapping("/all")
        public Iterable<User> getAll() {
            return userRepo.findAll();
        }

        @GetMapping("/view/{id}")
        public User searchById(@PathVariable long id) {
            return userRepo.findOne(id);
        }

        @PostMapping("/create")
        public HttpStatus createUser(@RequestBody User user) {
            userRepo.save(user);
            return HttpStatus.OK;
        }

    }
