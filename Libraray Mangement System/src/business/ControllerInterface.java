package business;

import java.util.HashMap;
import java.util.List;


import dataaccess.User;

public interface ControllerInterface {
	public String login(String id, String password) throws LoginException;
	public List<String> allMemberIds();
	public List<String> allBookIds();

    public List<String> allBooks();

    public HashMap<String,Book> getAllBooks();

    public HashMap<String, LibraryMember> getAllMembers();

    public HashMap<String, User> getAllUsers();

    public boolean checkRecord(String memberId, String Isbn);
    public void saveMember(LibraryMember member);
    public void saveBook(Book book);
    public void updateBook(Book book);
    public void updateLibraryMember(LibraryMember member);
    
}
