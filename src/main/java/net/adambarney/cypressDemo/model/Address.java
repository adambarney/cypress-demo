package net.adambarney.cypressDemo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    @Id
    public String id;

    public String name;
    public String addressLine1;
    public String city;
    public String state;
    public String zip;
}
