package com.scott.springWebDev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scott.springWebDev.entities.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {

}
