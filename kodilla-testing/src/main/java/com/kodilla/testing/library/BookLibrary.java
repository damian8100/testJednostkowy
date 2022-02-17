package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
    LibraryDatabase libraryDatabase;
    LibraryUser libraryUser;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }
    public BookLibrary(LibraryUser libraryUser){
        this.libraryUser = libraryUser;
    }

    public List<Book> listBooksWithCondition(String titleFragment) {
        List<Book> bookList = new ArrayList<Book>();
        if (titleFragment.length() < 3) return bookList;
        List<Book> resultList = libraryDatabase
                .listBooksWithCondition(titleFragment);
        if (resultList.size() > 20) return bookList;
        bookList = resultList;
        return bookList;
    }

    @Override
    public String toString() {
        return "BookLibrary{" +
                "libraryDatabase=" + libraryDatabase +
                ", libraryUser=" + libraryUser +
                '}';
    }

    public List<Book>listBooksInHandsOf(LibraryUser libraryUser) {
        List<Book> borrowBookList = libraryDatabase.listBooksInHandsOf(libraryUser); //Przydzielona metoda z interfejsu LiblaryDatebase

            return borrowBookList;

    }
}