package com.aktanyusuf.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "author")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(max = 50)
    @Column(name = "name", nullable = false)
    private String name;

    @NotBlank
    @Size(max = 50)
    @Column(name = "surname", nullable = false)
    private String surname;

    @Column(name = "birth_date")
    private Date birthDate;

    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
    private List<Book> books;

}
