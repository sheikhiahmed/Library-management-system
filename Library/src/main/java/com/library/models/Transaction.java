package com.library.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
    private TransactionType transactionType;
    @Enumerated(value = EnumType.STRING)
    private TranscationStatus transcationStatus;
    @CreationTimestamp
    private Date createOn;
    @UpdateTimestamp
    private Date updateOn;
    private Integer fine;
    @JoinColumn
    @ManyToOne
    @JsonIgnoreProperties({"transactionList"})
    private Book bookT;
    @JoinColumn
    @ManyToOne
    @JsonIgnoreProperties({"transactionList"})
    private Student studentT;
    @JoinColumn
    @ManyToOne
    @JsonIgnoreProperties({"transactionList"})
    private Admin admin;



}
