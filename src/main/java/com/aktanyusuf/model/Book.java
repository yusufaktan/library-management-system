package com.aktanyusuf.model;

import com.aktanyusuf.dto.DtoAuthor;
import com.aktanyusuf.dto.DtoCategory;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(max = 100)
    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "publish_date")
    private String publishDate;

    @ManyToOne
    @JoinColumn(name = "author_id", nullable = false)
    private DtoAuthor author;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private DtoCategory category;

    @Enumerated(EnumType.STRING)
    private BookStatus bookStatus = BookStatus.AVAILABLE;

}
