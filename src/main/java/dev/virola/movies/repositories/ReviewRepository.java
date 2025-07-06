package dev.virola.movies.repositories;
 

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import dev.virola.movies.Review;

@Repository
public interface ReviewRepository extends MongoRepository<Review, ObjectId> {

  

}
