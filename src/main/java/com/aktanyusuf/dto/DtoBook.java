package com.aktanyusuf.dto;

import com.aktanyusuf.model.BookStatus;

public class DtoBook {

    private Long id;
    private String title;
    private String publishDate;
    private DtoAuthor author;
    private DtoCategory category;
    private BookStatus bookStatus;

}
