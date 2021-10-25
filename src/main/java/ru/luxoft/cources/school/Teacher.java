package main.java.ru.luxoft.cources.school;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter

public class Teacher {
    private String directorFirstName;
    private String directorLastName;
    private String directorMiddleName;
    private EProfession profession;
}
