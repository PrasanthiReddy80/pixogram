package com.cts.training.userservices.repository;

import org.springframework.web.bind.annotation.RestController;

@RestController
public interface AuthorityResponse extends JpaRepository<Authorities,Integer>{

}
