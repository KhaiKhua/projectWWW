package com.example.www_week04.controller;

import com.example.www_week04.entities.Diachi;
import com.example.www_week04.services.AddressService;
import com.neovisionaries.i18n.CountryCode;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/address")
public class AddressController {
    @Autowired
    private AddressService addressService;

    @GetMapping
    public String getAll(Model model){
        List<Diachi> l = addressService.getAll();
        model.addAttribute("addresses",l);
        return "address";
    }
    @GetMapping("/new")
    public String formAddress(Model model){
        Diachi a= new Diachi();
        model.addAttribute("address",a);
        return "newAddress";
    }

    @PostMapping("/newAddress")
    public String saveAddress(@ModelAttribute("address") Diachi address) {

//            address.setCountryCode(CountryCode.getByCode("840")); // Ví dụ: Mỹ
//
//        String c = addressService.getCountryCode(address.getId());
//        CountryCode cc = CountryCode.getByCode(c);
//        address.setCountryCode(cc);address.setCountryCode(CountryCode.getByCode("840")); // Ví dụ: Mỹ
//
        addressService.Create(address);
            return "redirect:/address";
    }
    @GetMapping("/update/{id}")
    public String formUpdateAddress(Model model,@PathVariable Long id){
        Optional<Diachi> a= addressService.find(id);
        Diachi b = null;
        if(a.isPresent())
            b=a.get();
        model.addAttribute("address",b);
        return "updateAddress";
    }

    @PostMapping("/updateAddress/{id}")
    public String updateAddress(@ModelAttribute("address") Diachi address,@PathVariable Long id) {
        Optional<Diachi> a= addressService.find(id);
        Diachi b = null;
        if(a.isPresent())
            b=a.get();
        b.setCity(address.getCity());
        b.setCountryCode(address.getCountryCode());
        b.setZipcode(address.getZipcode());
        b.setStreet(address.getStreet());
        b.setNumber(address.getNumber());
        addressService.Create(b);
        return "redirect:/address";
    }
    @GetMapping("/delete/{id}")
    public String deleteAddress(@PathVariable Long id){
       // addressService.delete(id);
        return "redirect:/address";
    }

}
