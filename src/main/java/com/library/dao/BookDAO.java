package com.library.dao;


import com.library.database.DatabaseConnection;
import com.library.model.Book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDAO {
    //Add new book
    public boolean save(Book book) {
        String sql = """
                INSERT INTO books
                (bookID, bookName, author, ISBN, category, publisher, publisherYear, quantity, availableQuantity,shelfLocation)
                VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)
                """;

        try (
                Connection connection =
                        DatabaseConnection.getConnection();
                PreparedStatement statement =
                        connection.prepareStatement(sql)
        ) {

            statement.setString(1,book.getBookID());
            statement.setString(2, book.getBookName());
            statement.setString(3, book.getAuthor());
            statement.setInt(4,book.getISBN());
            statement.setString(5, book.getCategory());
            statement.setString(6,book.getPublisher());
            statement.setInt(7,book.getPublisherYear());
            statement.setInt(8,book.getQuantity());
            statement.setInt(9,book.getAvailableQuantity());
            statement.setString(10,book.getShelfLocation());

            int raw = statement.executeUpdate();
            return raw > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    //Get book ID by

    public Book getBookById(String bookID) {
        String sql = """
                SELECT * FROM books
                WHERE bookID = ?
                """;

        try(Connection connection =
                    DatabaseConnection.getConnection();
            PreparedStatement statement =
                    connection.prepareStatement(sql)
        ) {
            statement.setString(1,bookID);

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                return createBoookFromResultSet(resultSet);
            }

        } catch(SQLException e) {
            e.printStackTrace();

        }
        return null;

    }

    //Get all books
    public List<Book> getAllBook() {
        List<Book> bookList = new ArrayList();

        String sql =
                "SELECT * FROM books";

        try (
                Connection connection =
                        DatabaseConnection.getConnection();
                PreparedStatement statement =
                        connection.prepareStatement(sql);
                ResultSet resultSet =
                        statement.executeQuery();
                ) {

            while (resultSet.next()) {
                Book book = createBookFromResultSet(resultSet);
                bookList.add(book);
            }

        } catch (SQLException e) {
            e.printStackTrace();

        }

        return bookList;

    }

}
