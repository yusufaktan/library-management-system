package com.aktanyusuf.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DtoAuthor {

    private Long id;
    private String name;
    private String surname;
    private Date birthDate;
    private List<DtoBook> books;

}
