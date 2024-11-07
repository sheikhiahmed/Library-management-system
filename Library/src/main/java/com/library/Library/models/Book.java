package com.library.Library.models;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @Enumerated(value = EnumType.STRING)
    private Genre genre;
    @CreationTimestamp
    private Date createDate;
    @UpdateTimestamp
    private Date updatedOn;

    @ManyToOne
    @JoinColumn
    private Author my_author;

    @ManyToOne
    @JoinColumn
    private Student studentB;
    @OneToMany(mappedBy = "bookT")
    private List<Transaction> transactionList;

}
