package com.aktanyusuf.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DtoUser {

    private Long id;
    private String name;
    private String email;
    private Date membershipDate;
    private List<DtoBook> rentedBooks;

}
