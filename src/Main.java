/*
Lecture 7 program
iterators
ArrayList class
switch statements
conditional operators
do statement
for statement
 */

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args){
        // iterators
        //an iterator is a type of object that allows you to process a collection one at a time
        // The scanner class is an iterator
        // An iterator class has a method called hasNext that returns true if there is another item to process
        // The scanner object can use has next to read a file.
        // to be covered in more detail in chapter 7

        /*
        The array list object stores a list of objects
        this is useful for processing in a loop
        part of the java.util package
        the size of the array list grows and shrinks as needed
        Cannot take primitive data types inherently, must use wrapper classes if you want one

        common methods:
        boolean add(E obj);
        void add(int index, E obj);
        Object remove(int index);
        Object get(int index);
        boolean isEmpty();
        int size();

        ArrayList<"Object type"> varName = new ArrayList<"Object Type">();
         */
        // ArrayIndex example

        // creates a new array string object
        ArrayList<String> band = new ArrayList<String>();
        // populating the list one item at a time, this expands the dimension of the array
        // Strings are a special case that can be created by adding to the list
        // all other types would need to be initialized before adding to a list
        band.add("Paul");
        band.add("Pete");
        band.add("John");
        band.add("George");
        // outputs the contents of the list
        System.out.println(band);

        // searches the list for a match and returns the index of that item
        int location = band.indexOf("Pete");
        band.remove(location); // removes the item "Pete" from the list

        System.out.println(band);
        System.out.println("At index 1: " + band.get(1)); // returns the value at the specified index
        band.add(2,"Ringo"); // inserts Ringo into the list at the location and adjusts the other elements to fit
        System.out.println(band);

        System.out.println("Size of the band: " + band.size()); // returns number of array elements
        int index = 0;
        while (index < band.size()){ // prints each of the items in the list one at a time
            System.out.println(band.get(index));
            index++;
        }

        /*
        Switch statement:
        used to create a list of if statements to check a variable against

        switch (variable to check){
            case value1:
                statement;
                break;          break is used to exit at the correct statement
            case value2:
                statement
                break;
         */

        char option = 'B';

        switch (option) {
            case 'A':
                System.out.println("A");
                break;
            case 'B':
                System.out.println("B");
                // break;
                // by not having the true case "break" the execution falls through "cascading"
                // and executes all below it or until the next break
            case 'C':
                System.out.println("C");
                break;
            default:
                System.out.println("No Match");
        }


        /*
        only takes data types:
        int
        char
        byte
        String
         */

        // conditional operator
        /*
        condition ? expression1 : expression2;

        shorthand for an if else statement for two cases
        */

        int A = 1, B = 2;

        // prints lesser if A is less than B or greater if A is greater than B
        System.out.println(((A < B) ?"lesser":"Greater"));
        // equivalent statements above and below
        if (A< B){
            System.out.println("Lesser");
        }
        else{
            System.out.println("Greater");
        }

        /*
        do statement

        do{
        statement list
        }
        while(condition);

        only different between this and a standard while loop is that the condition
        is evaluated at the end of the loop
        this means the loop will always run at least once
         */

        do{
            System.out.println("Printing this");
        }
        while(false); // case is immediately false but the statement still prints at least once
        // useful for getting user checks and calculations you want to run then check against a value

        /*
        for statement

        for(initialization; condition; increment){
            statement;
            }

         equivalent to a while statement with increment but the increment counter is built in
         */

        // (create a count and initialize; set the condition; decide how the counter will move)
        for (int count = 1; count <= 5; count++){
            System.out.println(count);
        }
        // above and below statements are identical in function
        int count = 1;
        while (count<= 5){
            System.out.println(count);
            count++;
        }


        // uses nested for loops to print an increasing amount of stars per line
        final int MAXROW = 10;
        for(int row = 1; row <= MAXROW; row++){
            for (int star = 1; star <=row; star++){
                System.out.print("*");
            }
            System.out.println();
        }




        /*
        for-each loops used to quickly iterate through an iterator
        given an ArrayList<book> booklist;
        for(Book myBook : bookList)
            System.out.println(myBook);
         */

        





    }

}