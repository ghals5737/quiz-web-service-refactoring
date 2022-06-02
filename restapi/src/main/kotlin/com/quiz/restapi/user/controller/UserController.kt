package com.quiz.restapi.user.controller

import com.quiz.restapi.user.entity.User
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestAttribute
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/users")
class UserController {

    @GetMapping()
    fun getUser(@RequestAttribute userId:Long): User {
        return User(userId,"aa","aa")
    }



}