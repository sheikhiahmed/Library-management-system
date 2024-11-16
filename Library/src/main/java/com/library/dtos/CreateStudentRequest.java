package com.library.dtos;

import com.library.models.Student;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateStudentRequest {
    @NotBlank
    private String name;
    @NotBlank
    private String emil;
    private Integer age;
    //Function to create a student object.
    public Student to(){
        return Student.builder()
                .name(this.name)
                .emil(this.emil)
                .age(this.age)
                .build();
    }
}
