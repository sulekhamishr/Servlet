package com.java.lib.dao;

import java.sql.SQLException;
import java.util.List;

import com.java.lib.model.AdminUsers;
import com.java.lib.model.Books;
import com.java.lib.model.LibUsers;
import com.java.lib.model.TranBook;
import com.java.lib.model.TransReturn;

public interface LibraryDao {
	
	String createUser(LibUsers libUsers) throws ClassNotFoundException, SQLException;
	int login(LibUsers libUsers) throws ClassNotFoundException, SQLException;
	List<Books> searchBooks(String searchType, String searchValue) throws ClassNotFoundException, SQLException;
	int issueOrNot(String username, int bookId) throws ClassNotFoundException, SQLException;
	String issueBook(String username, int bookId) throws ClassNotFoundException, SQLException;
	List<TranBook> accountDetails(String username) throws ClassNotFoundException, SQLException;
	String returnBook(String userName, int bookId) throws ClassNotFoundException, SQLException;
   	List<TransReturn> historyBook(String userName)throws ClassNotFoundException, SQLException;
   	int admin(AdminUsers adminUsers)throws ClassNotFoundException, SQLException;

}
