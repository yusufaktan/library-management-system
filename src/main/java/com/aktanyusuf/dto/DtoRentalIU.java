package com.aktanyusuf.dto;

import com.aktanyusuf.model.RentalStatus;

import java.util.Date;

public class DtoRentalIU {

    private Long id;
    private DtoUser user;
    private DtoBook book;
    private Date rentalDate;
    private Date returnDate;
    private RentalStatus rentalStatus;

}
