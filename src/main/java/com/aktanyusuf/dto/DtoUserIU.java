package com.aktanyusuf.dto;

import java.util.Date;
import java.util.List;

public class DtoUserIU {

    private Long id;
    private String name;
    private String email;
    private Date membershipDate;
    private List<DtoBook> rentedBooks;

}
