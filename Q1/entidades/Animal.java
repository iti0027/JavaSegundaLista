package entidades;

import excecoes.NVazioException;

public class Animal{
    private String name;
    private int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public void setName(String name){
        if(name == null || name.trim().isEmpty()){
            throw new NVazioException("O nome não pode ser vazio");
        }
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }

    public void som(){
        System.out.println("Som genêrico do animal.");
    }
}