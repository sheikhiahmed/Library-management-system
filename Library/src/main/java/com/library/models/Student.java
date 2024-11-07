package com.library.models;

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
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @Column(unique = true,nullable = false)
    private String emil;
    private Integer age;
    @CreationTimestamp
    private Date createOn;
    @UpdateTimestamp
    private Date updatedOn;
    @OneToMany(mappedBy = "studentB")
    private List<Book> books;
    @OneToMany(mappedBy = "studentT")
    private List<Transaction> transactionList;
}
