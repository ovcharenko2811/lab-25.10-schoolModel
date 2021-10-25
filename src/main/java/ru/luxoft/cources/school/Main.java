package main.java.ru.luxoft.cources.school;

public class Main {
    private static void main(String[] args){
        Director director = Director.builder().directorFirstName("Ivan").directorLastName("Ivanov").directorMiddleName("Ivanych").build();
        School school = School.builder().schoolName("Super").schoolNumber(1).director(director).build();
    }
}
