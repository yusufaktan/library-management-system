package com.aktanyusuf.dto;

import com.aktanyusuf.model.RentalStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DtoRental {

    private Long id;
    private DtoUser user;
    private DtoBook book;
    private Date rentalDate;
    private Date returnDate;
    private RentalStatus rentalStatus;

}
