package k09;

public class LoginManager {
	private static User[] userList = {
			new User("user01", "Denshi"),
			new User("user02", "QazWsx"),
			new User("user03", "PoiUytRewq"),
			new User("user04", "ZxcVbnm")
	};

	User loginUser;

	User getLoginUser() {
		return loginUser;
	}

	void login(User user) {
		int i = 0;
		while (i < userList.length && !user.equals(userList[i])) {

		}
	}

}
