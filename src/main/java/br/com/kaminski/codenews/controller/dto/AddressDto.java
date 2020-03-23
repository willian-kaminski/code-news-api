package br.com.kaminski.codenews.controller.dto;

import br.com.kaminski.codenews.domain.Address;

import java.util.List;
import java.util.stream.Collectors;

public class AddressDto {

    private Long id;
    private Long user_id;
    private String address;

    public AddressDto(Address address) {
        this.id = address.getId();
        this.user_id = address.getUser().getId();
        this.address = address.getStreet() + ", " + address.getNumber() + " " + address.getCity() + " " + address.getState();
    }

    public Long getId() {
        return id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public String getAddress() {
        return address;
    }

    public static List<AddressDto> convertAddress(List<Address> addresses) {
        return addresses.stream().map(AddressDto::new).collect(Collectors.toList());
    }

}
