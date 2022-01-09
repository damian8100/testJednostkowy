package com.kodilla.testing.library;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class BookDirectoryTestSuite
{
    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book>resultList = new ArrayList<>();
        for(int n =1; n<=booksQuantity; n++) {
          Book theBook = new Book("Title" + n, "Author" + n, 1970 + n );
          resultList.add(theBook);
        }

        return resultList;
    }

    @Mock
  private LibraryDatabase libraryDatabaseMock;
  @Test
    void testListBooksWithConditionsReturnList()
  {
      //given
      BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
      List<Book> resultListOfBooks = new ArrayList<>();
      Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
      Book book2 = new Book("Tytuł2", "Autor2", 2002);
      Book book3 = new Book("Tytuł3", "Autor3", 2012);
      Book book4 = new Book("Tytuł4", "Autor4", 2005);
      resultListOfBooks.add(book1);
      resultListOfBooks.add(book2);
      resultListOfBooks.add(book3);
      resultListOfBooks.add(book4);
      when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);

      //when
      List<Book>theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

      //Then
      assertEquals(4,theListOfBooks.size());
  }
  @Test
    void testListBooksWithConditionMoreThan20()
  {
      // Given
      BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);                  // [1]
      List<Book> resultListOf0Books = new ArrayList<Book>();                           // [2]
      List<Book> resultListOf15Books = generateListOfNBooks(15);                       // [3]
      List<Book> resultListOf40Books = generateListOfNBooks(40);                       // [4]
      when(libraryDatabaseMock.listBooksWithCondition(anyString()))                    // [5]
              .thenReturn(resultListOf15Books);                                             // [6]
      when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))                    // [7]
              .thenReturn(resultListOf0Books);                                              // [8]
      when(libraryDatabaseMock.listBooksWithCondition("FortyBooks"))                   // [9]
              .thenReturn(resultListOf40Books);                                             // [10]

      // When
      List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");    // [11]
      List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");   // [12]
      List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");  // [13]
      // Then

      assertEquals(0, theListOfBooks0.size());                                         // [14]
      assertEquals(15, theListOfBooks15.size());                                       // [15]
      assertEquals(0, theListOfBooks40.size());

  }
  @Test
    void testListBookWithConditionFragmentShorterThan3()
  {
      // Given
      LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);            // [2]
      BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
      // [3]

      // When
      List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");       // [4]

      // Then
      assertEquals(0, theListOfBooks10.size());                                     // [5]
      verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());


  }
  @Test
    void testUserDoNotHaveAnyBookInHandsOf() {
      //given
      LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
      BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
      List<Book> listAnyBookInHandsOf = new ArrayList<>();
      //when
      LibraryUser libraryUser = new LibraryUser("Andrzej", "Kowalski", "34423534535");
      when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(listAnyBookInHandsOf);

      //then
      List<Book> result =  bookLibrary.listBooksInHandsOf(libraryUser);
      assertEquals(listAnyBookInHandsOf,result);
  }

    @Test
    void testUserHaveOneBookBorrow()
  {
      LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
      BookLibrary bookLibrary1 = new BookLibrary(libraryDatabaseMock);
      List<Book> listAnyBookInHandsOf = new ArrayList<>();
      listAnyBookInHandsOf.add(new Book("Tytul1","autor1", 2000));
      //when
      LibraryUser libraryUser1 = new LibraryUser("Jerzy","Owsiak","04345345324");
      when(libraryDatabaseMock.listBooksInHandsOf(libraryUser1)).thenReturn(listAnyBookInHandsOf);

      //then
      List<Book>result1 = bookLibrary1.listBooksInHandsOf(libraryUser1);
      assertEquals(listAnyBookInHandsOf.get(0),result1.get(0));


  }
  @Test
    void testUserHaveFiveBookBorrow()
  {
      LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
      BookLibrary bookLibrary2 = new BookLibrary(libraryDatabaseMock);
      List<Book> listAnyBookInHandsOf = new ArrayList<>();
      listAnyBookInHandsOf.add(new Book("Tytul1","autor1", 2000));
      listAnyBookInHandsOf.add(new Book("Tytul2","autor2", 2001));
      listAnyBookInHandsOf.add(new Book("Tytul3","autor3", 2002));
      listAnyBookInHandsOf.add(new Book("Tytul4","autor4", 2003));
      listAnyBookInHandsOf.add(new Book("Tytul5","autor5", 2004));
      //when
      LibraryUser libraryUser2 = new LibraryUser("Jerzy","Owsiak","04345345324");
      when(libraryDatabaseMock.listBooksInHandsOf(libraryUser2)).thenReturn(listAnyBookInHandsOf);

      //then
      List<Book>result1 = bookLibrary2.listBooksInHandsOf(libraryUser2);
      assertEquals(listAnyBookInHandsOf.get(4),result1.get(4));
  }
}
