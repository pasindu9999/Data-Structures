package org.example;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class WorkWithQueues {
    public static void main(String[] args) {
        LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.add(new Person("James", 22));
        linkedList.add(new Person("John", 18));
        ListIterator<Person> personListIterator = linkedList.listIterator();

        while (personListIterator.hasNext())
        {
            System.out.println(personListIterator.next());
        }
        System.out.println();
        while (personListIterator.hasPrevious())
        {
            System.out.println(personListIterator.previous());
        }
    }
    private static void queues()
        {
            Queue<Person> supermarket = new LinkedList<>();

            supermarket.add(new Person("John",21));
            supermarket.add(new Person("James",24));
            supermarket.add(new Person("Alex",17));

            System.out.println(supermarket.size());
            System.out.println(supermarket.peek());
            System.out.println(supermarket.poll());
            System.out.println(supermarket.size());
            System.out.println(supermarket.peek());
        }
    static record Person(String name,int age){}
}
