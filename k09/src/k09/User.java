package k09;

public class User {
	private String userId;
	private String password;

	User(String userId, String password) {
		this.userId = userId;
		this.password = password;
	}

	String getUserId() {
		return userId;
	}

	String getPassword() {
		return password;
	}
}
