package in.codetech.angulareducloud.portal.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class UserFoundException extends RuntimeException {
	public UserFoundException() {
		super("User with this Username is already there in DB !! try with another username");
		
	}
	
	public UserFoundException(String msg) {
		super(msg);
	}
}
