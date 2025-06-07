package Model;

public class Login {

	private String password, username;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	
	
	
	public Login(String userN, String pass) {
		userN = userN;
		password = pass;
	}
	
	
}
