package com.azna;

public class UserTest {
    public static void main(String[] args) {
        User maria = new User("mpappa", 20);
        User unknownX = new User();
        System.out.println(maria.getName());
        System.out.println(unknownX.getAge());
        System.out.println(unknownX.getPassword());
        unknownX.setAge(21);
        System.out.println(unknownX.getAge());
        maria.setAge(maria.getAge() + 1);

        if (maria.getAge() > unknownX.getAge()) {
            System.out.println(maria.getName());
        } else if (unknownX.getAge() > maria.getAge()) {
            System.out.println(unknownX.getName());
        } else {
            System.out.println("Both objects have the same age.");
        }
    }
}
