package com.library.dtos;

import com.library.models.Author;
import com.library.models.Book;
import com.library.models.Genre;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateBookRequest {
    @NotBlank
    private String name;
    @NotNull
    private Genre genre;
    @NotBlank
    private String authorName;
    @NotBlank
    private String authorEmail;
    public Book to(){
        return Book.builder()
                .name(this.name)
                .genre(this.genre)
                .my_author(
                        Author.builder()
                                .name(this.name)
                                .email(this.authorEmail)
                                .build()
                )
                .build();
    }
}

