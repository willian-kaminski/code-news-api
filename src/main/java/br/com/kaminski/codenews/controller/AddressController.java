package br.com.kaminski.codenews.controller;

import br.com.kaminski.codenews.controller.dto.AddressDto;
import br.com.kaminski.codenews.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AddressController {

    @Autowired
    private AddressRepository addressRepository;

    @RequestMapping("/addresses")
    public List<AddressDto> listAll(){
        return AddressDto.convertAddress(addressRepository.findAll());
    }
}