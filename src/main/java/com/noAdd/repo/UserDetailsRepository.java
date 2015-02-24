package com.noAdd.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.noAdd.user.UserDetails;

@Repository
public interface UserDetailsRepository extends MongoRepository<UserDetails, String>{
}
