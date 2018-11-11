package net.adambarney.cypressDemo.controller;

import net.adambarney.cypressDemo.model.Address;
import net.adambarney.cypressDemo.repository.AddressRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;


@Controller
public class AddressController {

    private AddressRepository addressRepository;

    public AddressController(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @GetMapping("address")
    public String getAddressPage(Model model) {
        model.addAttribute("address", new Address());
        return "address";
    }

    @PostMapping("address")
    public String saveAddress(@ModelAttribute Address address, Model model) {
        addressRepository.save(address);
        return "redirect:address-book";
    }

    @GetMapping("address-book")
    public String getAddressBook(Model model) {
        List<Address> allAddresses = addressRepository.findAll();
        model.addAttribute("addresses", allAddresses);
        return "address-book";
    }

    @PostMapping("address/delete")
    public ResponseEntity deleteAddress(@RequestBody String id) {
        addressRepository.deleteAll();
        return ResponseEntity.ok("success");
    }
}