package kr.ac.ks.app.controller;

import kr.ac.ks.app.domain.Lesson;
import kr.ac.ks.app.domain.Student;
import lombok.Getter;
import lombok.Setter;


import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class CourseForm {
    @NotNull(message = "notnull")
    private Student student;

    @NotNull(message = "notnull")
    private Lesson lesson;
}
