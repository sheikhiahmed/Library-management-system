package com.library.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @Column(nullable = false,unique = true)
    private String emil;
    @CreationTimestamp
    private Date createdOn;

    @OneToMany(mappedBy ="admin")
    @JsonIgnoreProperties({"admin"})
    private List<Transaction> transaction;
}
