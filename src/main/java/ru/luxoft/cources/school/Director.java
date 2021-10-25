package main.java.ru.luxoft.cources.school;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder

public class Director {
    private String directorFirstName;
    private String directorLastName;
    private String directorMiddleName;

}
