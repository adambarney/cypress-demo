package net.adambarney.cypressDemo.repository;


import net.adambarney.cypressDemo.model.Address;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AddressRepository extends MongoRepository<Address, String> {

}
