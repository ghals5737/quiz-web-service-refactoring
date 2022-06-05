package com.quiz.restapi.user.repository

import com.quiz.restapi.user.entity.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository: JpaRepository<User,Long>{
}