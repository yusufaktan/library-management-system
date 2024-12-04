package com.aktanyusuf.dto;

import com.aktanyusuf.model.BookStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DtoBook {

    private Long id;
    private String title;
    private String publishDate;
    private DtoAuthor author;
    private DtoCategory category;
    private BookStatus bookStatus;

}
