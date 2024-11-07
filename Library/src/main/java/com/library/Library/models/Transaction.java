package com.library.Library.models;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String txnId;
    @Enumerated(value = EnumType.STRING)
    private TransctionType transctionType;
    @Enumerated(value = EnumType.STRING)
    private TranscationStatus transcationStatus;
    @CreationTimestamp
    private Date createOn;
    @UpdateTimestamp
    private Date updateOn;
    private Double fine;
    @JoinColumn
    @ManyToOne
    private Book bookT;
    @JoinColumn
    @ManyToOne
    private Student studentT;
    @JoinColumn
    @ManyToOne
    private Admin admin;



}
