package com.cts.training.actionservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.training.actionservice.entity.Following;

@Repository
public interface FollowingRepository extends JpaRepository<Following, Integer>{

}
