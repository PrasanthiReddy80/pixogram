package com.cts.training.bootapphibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.training.bootapphibernate.entity.NewsFeed;
import com.cts.training.bootapphibernate.entity.Users;

@Repository
public interface NewsFeedRepository extends JpaRepository<NewsFeed, Integer>{

}
