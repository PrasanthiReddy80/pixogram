package com.cts.training.actionservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.training.actionservice.entity.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer>{

}
