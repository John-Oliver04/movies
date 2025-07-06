package dev.virola.movies.repositories;

import org.springframework.stereotype.Repository;
import dev.virola.movies.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.Optional;
import org.bson.types.ObjectId;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId>  {

    Optional<Movie> findByImdbId(String imdbId);
}
