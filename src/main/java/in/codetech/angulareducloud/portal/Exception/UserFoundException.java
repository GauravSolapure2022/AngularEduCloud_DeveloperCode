package in.codetech.angulareducloud.portal.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.FOUND)
public class UserFoundException extends RuntimeException {
	String messge;

	public UserFoundException(String messge) {
		super(messge);
	}
	
}
