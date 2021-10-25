package sample;

import java.util.Calendar;
import java.util.Scanner;

public class Main {

    public static class Person{
        private String name;
        private int birthYear;

        public String information;

        public Person(){

        }

        public Person(String name,int birthYear){

        }

        public int getBirthYear() {
            return birthYear;
        }

        public String getName() {
            return name;
        }

        public void changeName(String name) {
            this.name = name;
        }

        public int age(){
            return Calendar.getInstance().get(Calendar.YEAR)-birthYear;
        }

        public void input(String name,int birthYear){
            this.name=name;
            this.birthYear=birthYear;
        }

        public void output(){
            System.out.println(name + birthYear);
        }

    }

    public static void main(String[] args) {

        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
        Person person5 = new Person();
        person1.input("fgggggggg",2001);
        person2.input("fgggggggg",2001);
        person3.input("fgggggggg",2001);
        person4.input("fgggggggg",2001);
        person5.input("fgggggggg",2001);
    }
}
