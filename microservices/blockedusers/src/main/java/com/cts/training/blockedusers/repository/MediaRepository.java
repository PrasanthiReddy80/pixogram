package com.cts.training.blockedusers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.training.blockedusersservice.entity.BlockedUsers;

@Repository
public interface MediaRepository extends JpaRepository<BlockedUsers, Integer>{

}
