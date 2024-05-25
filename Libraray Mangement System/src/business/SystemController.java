package business;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dataaccess.Auth;
import dataaccess.DataAccess;
import dataaccess.DataAccessFacade;
import dataaccess.User;

public class SystemController implements ControllerInterface {
	public static Auth currentAuth = null;
	
	public String login(String id, String password) throws LoginException {
		DataAccess da = new DataAccessFacade();
		HashMap<String, User> map = da.readUserMap();
		if(!map.containsKey(id)) {
			throw new LoginException("ID " + id + " not found");
		}
		String passwordFound = map.get(id).getPassword();
		if(!passwordFound.equals(password)) {
			throw new LoginException("Password incorrect");
		}
		currentAuth = map.get(id).getAuthorization();
        return currentAuth.toString();
		
	}
	@Override
	public List<String> allMemberIds() {
		DataAccess da = new DataAccessFacade();
		List<String> retval = new ArrayList<>();
		retval.addAll(da.readMemberMap().keySet());
		return retval;
	}
	
	@Override
	public List<String> allBookIds() {
		DataAccess da = new DataAccessFacade();
		List<String> retval = new ArrayList<>();
		retval.addAll(da.readBooksMap().keySet());
		return retval;
	}

    @Override
    public List<String> allBooks() {
        DataAccess da = new DataAccessFacade();
        List<String> retval = new ArrayList<>();
        retval.addAll(da.readBooksMap().keySet());
        return retval;
    }

    @Override
    public HashMap<String,Book> getAllBooks() {
        DataAccess da = new DataAccessFacade();
        HashMap<String, Book> retval = da.readBooksMap();
        return retval;

    }

    @Override
    public HashMap<String, LibraryMember> getAllMembers() {
        DataAccess da = new DataAccessFacade();
        HashMap<String, LibraryMember> retval = da.readMemberMap();
        return retval;
    }
    
    @Override
    public void saveMember(LibraryMember member)
    {
    	DataAccess da = new DataAccessFacade();
    	da.saveNewMember(member);
    	return;
    	
    }
    
    @Override
    public void updateLibraryMember(LibraryMember member) {
    	DataAccess da = new DataAccessFacade();
    	da.saveNewMember(member);
    	return;
    	
    }
    
    @Override
    public void saveBook(Book book) {
    	DataAccess da = new DataAccessFacade();
    	da.saveNewBook(book);
    	return;
    }
    
    @Override
    public void updateBook(Book book) {
    	DataAccess da = new DataAccessFacade();
    	da.updateBook(book);
    	return;
    	
    }

    @Override
    public HashMap<String, User> getAllUsers() {
        DataAccess da = new DataAccessFacade();
        HashMap<String, User> retval = da.readUserMap();
        return retval;
    }

    @Override
    public boolean checkRecord(String memberId, String Isbn) {
        DataAccess da = new DataAccessFacade();
        boolean IsbnFound = false;
        boolean memberIdFound = false;

        for(Map.Entry<String, Book> h: da.readBooksMap().entrySet()){
            if(h.getValue().getIsbn().equals(Isbn)){
                IsbnFound = true;
                break;
            }
        }
        //48-56882 ====1004
        for(Map.Entry<String, LibraryMember> hm: da.readMemberMap().entrySet()){
            if(hm.getValue().getMemberId().equals(memberId)){
                memberIdFound = true;
                break;
            }
        }
        if(IsbnFound && memberIdFound)
            return true;

        return false;
    }


}