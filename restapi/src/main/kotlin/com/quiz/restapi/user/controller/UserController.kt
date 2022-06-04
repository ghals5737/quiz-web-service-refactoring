package com.quiz.restapi.user.controller

import com.quiz.restapi.user.entity.User
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/users")
class UserController {

    @GetMapping()
    fun getUser(@RequestAttribute userId:Long): User {
        return User(userId,"aa","aa")
    }

    @PostMapping("/login")
    fun login(@RequestBody user:User){

    }

    @DeleteMapping
     fun delete(userNo: Long) {
        //userService.deleteUser(userNo)
    }


}