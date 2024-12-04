package com.aktanyusuf.model;

import com.aktanyusuf.dto.DtoBook;
import com.aktanyusuf.dto.DtoUser;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "rental")
public class Rental {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private DtoUser user;

    @ManyToOne
    @JoinColumn(name = "book_id", nullable = false)
    private DtoBook book;

    @Column(name = "rental_date", nullable = false)
    private Date rentalDate;

    @Column(name = "return_date")
    private Date returnDate;

    @Enumerated(EnumType.STRING)
    private RentalStatus rentalStatus;

}
