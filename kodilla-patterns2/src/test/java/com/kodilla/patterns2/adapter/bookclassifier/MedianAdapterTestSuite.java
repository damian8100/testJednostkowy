package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {

    @Test
    public void medianTestSuite() {

        //given
        Book book = new Book("Autor1", "Tytuł1", 2019, "Sygnatura1");
        Book book1 = new Book("Autor2", "Tytuł2", 2020, "Sygnatura2");
        MedianAdapter medianAdapter = new MedianAdapter();
        //when
        Set<Book> liblaryABook = new HashSet<>();
        liblaryABook.add(book);
        liblaryABook.add(book1);
        int mediana = medianAdapter.publicationYearMedian(liblaryABook);
        //then
        System.out.println(liblaryABook);
        Assertions.assertEquals(2020, mediana);
    }
}
