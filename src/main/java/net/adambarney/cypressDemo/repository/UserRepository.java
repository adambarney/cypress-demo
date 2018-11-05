package net.adambarney.cypressDemo.repository;

import net.adambarney.cypressDemo.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}