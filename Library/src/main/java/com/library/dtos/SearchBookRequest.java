package com.library.dtos;


import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SearchBookRequest {

    @NotBlank
    private String searchKey;

    @NotBlank
    private String searchValue;
}