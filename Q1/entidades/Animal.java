package Q1.entidades;

import Q1.excecoes.NameEmpty;
import Q1.excecoes.AgeLessThanZero;

public abstract class Animal {
    private String name;
    private Short age;

    public Animal(String name, short age){
        if(age < 0){
            throw new excecoes.AgeLessThanZero();
        }
        this.name = name;
        this.age = age;
    }
    public void som(){
        System.out.println("Som de animal!");
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public short getAge(){
        return age;
    }
    public void setAge(short age){
        this.age = age;
    }

}