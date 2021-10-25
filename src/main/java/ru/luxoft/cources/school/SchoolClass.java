package main.java.ru.luxoft.cources.school;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Builder
@Getter
@Setter

public class SchoolClass {
    private String name;
    private int size;
    private List<Student> studentList;
}
