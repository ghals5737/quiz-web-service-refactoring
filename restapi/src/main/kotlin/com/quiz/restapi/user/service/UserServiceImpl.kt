package com.quiz.restapi.user.service

import com.quiz.restapi.user.entity.User
import com.quiz.restapi.user.repository.UserRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class UserServiceImpl (
    val userRepository: UserRepository
):UserService{
    override fun getUserById(id: Long): Optional<User> {
        return userRepository.findById(id)
    }

}