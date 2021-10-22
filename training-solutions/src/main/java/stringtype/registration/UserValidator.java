package stringtype.registration;

public class UserValidator {
	public boolean isValidUsername(String username) {
		boolean validName = true;
		if(username.equals("")) {
			validName = false;
		}
		return validName;
	}

	public boolean isValidPassword(String password1, String password2) {
		boolean validPw = false;
		if(password1.equals(password2) && (password1.length() >= 8)) {
			validPw = true;
		}
		return validPw;
	}

	public boolean isValidEmail(String email) {
		boolean validEmail = false;
		int atPosition = email.indexOf("@");
		if(atPosition >=1) {
			String emailEndString = email.substring(atPosition);
			int dotPosition = emailEndString.indexOf(".");
			if(dotPosition > 1 && dotPosition < (emailEndString.length()-1)) validEmail = true;
		}
		return validEmail;
	}
}
