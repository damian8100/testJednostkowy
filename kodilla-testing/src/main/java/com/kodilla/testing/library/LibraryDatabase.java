package com.kodilla.testing.library;

import java.util.List;

public interface LibraryDatabase
{
    List<Book>listBooksWithCondition(String titleFragment);

    List<Book>listBooksInHandsOf(LibraryUser libraryUser);

    boolean rentABook (LibraryUser libraryUser, Book book); //jesli ksiazka wypozyczona zwróci false przy probie wypozyczenia

    int returnBooks (LibraryUser libraryUser); // zwraca numer ksiązki która wrociłą z powrotem
}
