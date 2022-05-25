package io.github.springsongs;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class TeacherEntity {
    private String name;
    private StudentEntity studentEntity;
    private ClassEntity classEntity;

    public TeacherEntity(StudentEntity studentEntity, ClassEntity classEntity) {
        this.studentEntity = studentEntity;
        this.classEntity = classEntity;
    }
}
