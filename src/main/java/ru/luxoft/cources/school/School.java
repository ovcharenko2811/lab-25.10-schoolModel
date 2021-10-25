package main.java.ru.luxoft.cources.school;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.Builder;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@Builder

public class School {
    private String schoolName;
    private int schoolNumber;
    private Director director;
    private List<Manager> subDirector;
    private List<Teacher> teacherList;
    private List<SchoolClass> classList;
    private List<Worker> workerList;
}
