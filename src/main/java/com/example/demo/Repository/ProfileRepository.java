package com.example.demo.Repository;

import com.example.demo.Model.UserProfile;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends MongoRepository<UserProfile, String>  {

    UserProfile findBypId(String pId);
}
