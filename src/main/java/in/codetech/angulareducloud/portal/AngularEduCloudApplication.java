package in.codetech.angulareducloud.portal;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import in.codetech.angulareducloud.portal.Exception.UserFoundException;
import in.codetech.angulareducloud.portal.model.Role;
import in.codetech.angulareducloud.portal.model.User;
import in.codetech.angulareducloud.portal.model.UserRole;
import in.codetech.angulareducloud.portal.repository.QuizRepository;
import in.codetech.angulareducloud.portal.service.UserService;

@SpringBootApplication
public class AngularEduCloudApplication {
	/* @Autowired
	    private UserService userService;

	    @Autowired
	    private BCryptPasswordEncoder bCryptPasswordEncoder;

	    @Autowired
	    public QuizRepository quizRepository;*/
	public static void main(String[] args) {
	   
		SpringApplication.run(AngularEduCloudApplication.class, args);
		
	}
	 /* public void run(String... args) throws Exception {
	        try {


	            System.out.println("starting code");

	            User user = new User();

	            user.setFirstName("Admin");
	            user.setLastName("User");
	            user.setUsername("admin1105");
	            user.setPassword(this.bCryptPasswordEncoder.encode("abcde"));
	            user.setEmail("user@gmail.com");
	            user.setProfile("default.png");

	            Role role1 = new Role();
	            role1.setRoleId(101L);
	            role1.setRoleName("ADMIN");

	            Set<UserRole> userRoleSet = new HashSet<>();
	            UserRole userRole = new UserRole();

	            userRole.setRole(role1);

	            userRole.setUser(user);

	            userRoleSet.add(userRole);

	            User user1 = this.userService.createUser(user, userRoleSet);
	            System.out.println(user1.getUsername());


	        } catch (UserFoundException e) {
	            e.printStackTrace();


	       }
*/

	    }


