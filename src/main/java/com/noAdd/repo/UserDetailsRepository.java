package com.noAdd.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.noAdd.cdo.UserDetailsDO;

@Repository
public interface UserDetailsRepository extends MongoRepository<UserDetailsDO, String>{
}
