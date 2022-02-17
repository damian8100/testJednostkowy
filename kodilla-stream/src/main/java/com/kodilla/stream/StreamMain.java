package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifer;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.person.People;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {

    public static void main (String[] args){

        PoemBeautifer poemBeautifer = new PoemBeautifer();

        System.out.println("Word beautifer with lambdas");
        poemBeautifer.beautify("tekst","tekst", (a,b)->a.toUpperCase() + " " + b.toUpperCase());
        poemBeautifer.beautify("Tekst", "Tekst", (a,b)-> a.concat("ABC")+ " " + b.concat("ABC"));
        poemBeautifer.beautify("tekst", "tekst", (a,b)->a.replace("t","T")+" "+ b.replace("t", "T"));
        poemBeautifer.beautify("TEKST", "TEKST", (a,b)->a.toLowerCase() + " "+b.toLowerCase());


        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

        System.out.println(" ");
            People.getList().stream()
                    .map(String::toUpperCase)                             // [1]
                    .filter(s -> s.length() > 11)                         // [2]
                    .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")   // [3]
                    .filter(s -> s.substring(0, 1).equals("M"))           // [4]
                    .forEach(System.out::println);

        System.out.println(" ");

        BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory.getList().stream()  // [1]
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));                    // [2]

        System.out.println(theResultStringOfBooks);

        System.out.println("");
        System.out.println("Zadanie funkcjonalny spacer po liście użytkowników forum");
        System.out.println(" ");

        Forum theForum = new Forum();
        List<ForumUser> userList = theForum.getList().stream()
                .filter(forumUser -> LocalDate.now().getYear() - forumUser.getBirthDate().getYear() >= 20)
                .filter(forumUser -> forumUser.getUserSex() == 'M')
                .filter(forumUser -> forumUser.getNumbersOfPost() >= 1)
                .collect(Collectors.toList());//forEach to wyswietla  tylko wynik lepiej uzywac Collect to
        Map<Integer,String>theForumUserList = userList.stream()
                .collect(Collectors.toMap(ForumUser::getUserID,ForumUser::getUserName));

        System.out.println(theForumUserList.size());
        theForumUserList.entrySet().stream()
                .map(entry->entry.getKey() + " " + entry.getValue())
                .forEach(System.out::println); // wyswietla tylko wynik


    }
}



