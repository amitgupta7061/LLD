package oops;

class Person{

    private String name;
    private int age;

    Person(String name, int age){
        this.name = name;
        this.age  = age;
    }

    boolean canwalk(){
        if(this.age > 1) return true;
        else return false;
    }

    void details() {
        System.out.println("Name: " + this.name + "and Age: " + this.age);
    }
}

public class basicclass {
    public static void main(String[] args) {
        Person p = new Person("Amit", 20);
        System.out.println(p.canwalk());
    }
    
}