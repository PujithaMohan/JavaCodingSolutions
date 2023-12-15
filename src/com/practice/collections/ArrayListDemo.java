package com.practice.collections;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        //creating ArrayList
        List<User> users=new ArrayList<>();
        users.add(new User("Pujitha",28));
        users.add(new User("Sai",28));
        users.add(new User("Kiran",28));
        users.add(new User("Juhi",23));
        users.add(new User("Usha",50));
        users.add(new User("Mohan",56));
        users.add(new User("Pujitha",28));
        System.out.println(users);
        //iterating over an ArrayList
        for(User user : users)
            System.out.println(user.toString());
        System.out.println("using java 8 forEach");
        users.forEach(System.out::print);
        System.out.println("using iterator");
        Iterator<User> iterator=users.iterator();
        while(iterator.hasNext())
            System.out.println(iterator.next().getName());
        System.out.println("using java 8 forEachRemaining with iterator");
        Iterator<User> uiterator=users.iterator();
        uiterator.forEachRemaining(System.out::print);
        System.out.println("using listIterator can traverse both sides");
        ListIterator<User> listIterator = users.listIterator(users.size());
        while(listIterator.hasPrevious())
            System.out.println(listIterator.previous());
        System.out.println("using index");
        for(int i=0;i< users.size();i++)
            System.out.println(users.get(i));

        System.out.println("sorting");
        users.sort(Comparator.comparing(User::getName));
        users.forEach(System.out::print);
        //creating arraylist using list of
        List<String> stringList=List.of("Apple","banana");
        List<User> userList=List.of(new User("Pinku",7),new User("Arush",3));
        userList.forEach(System.out::print);
        Iterator<User> userIterator= users.iterator();
        System.out.println("knowledge check");
        while(userIterator.hasNext()) {
            users.remove(userIterator.next());
        }

    }
}
class User{
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }
}
