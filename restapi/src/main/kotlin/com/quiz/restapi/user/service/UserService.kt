package com.quiz.restapi.user.service

import com.quiz.restapi.user.entity.User
import java.util.*

interface UserService {
    fun getUserById(id:Long): Optional<User>
}