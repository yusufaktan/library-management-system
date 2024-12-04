package com.aktanyusuf.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DtoCategoryIU {

    private Long id;
    private String name;
    private List<DtoBook> books;

}
