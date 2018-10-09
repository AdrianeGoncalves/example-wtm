package com.wtm.examplewtmkotlinspring.repository

import com.wtm.examplewtmkotlinspring.model.Article
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ArticleRepository : JpaRepository<Article, Long> {

    fun findByTitle(title: String)
}