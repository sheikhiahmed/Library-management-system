package com.library.dtos;

import com.library.models.TransactionType;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class InitiateTransactionRequest {

    @NotNull
    private Integer studentId;

    @NotNull
    private Integer bookId;

    @NotNull
    private Integer adminId;

    @NotNull
    private TransactionType transactionType;

}
