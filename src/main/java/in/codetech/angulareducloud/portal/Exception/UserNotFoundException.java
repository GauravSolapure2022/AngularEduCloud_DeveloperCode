package in.codetech.angulareducloud.portal.Exception;

public class UserNotFoundException extends Exception{ 
	
	public UserNotFoundException() {
		super("User with this username not found in DB !!");
		
	}
	
	public UserNotFoundException(String msg) {
		super(msg);
	}

}