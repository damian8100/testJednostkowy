package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {

        //given
        Library library = new Library("Biblioteka 1");
        IntStream.iterate(1,n->n+1)
                .limit(5)
                .forEach(n->library.getBooks().add(new Book("Tytuł"+n,"Autor"+n, LocalDate.of(2000,1,1).plusYears(n))));



        //making a shallow copy of object
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Biblioteka 1");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of object
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Biblioteka 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }


        //when

        library.getBooks().remove(new Book("Tytuł1","Autor1",LocalDate.of(2001,1,1)));

        //then

        System.out.println(library);
        System.out.println(deepClonedLibrary);
        assertEquals(4, library.getBooks().size());
        assertEquals(4, clonedLibrary.getBooks().size());
        assertEquals(5, deepClonedLibrary.getBooks().size());
        assertEquals(clonedLibrary.getBooks(), library.getBooks());
        assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());



    }
}
