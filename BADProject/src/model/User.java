package model;

public class User {
	private String UserID;
	private String Username;
	private String Email;
	private String Password;
	private Integer Age;
	private String Gender;
	private String Country;
	private String PhoneNumber;
	private String Role;
	
	public User(String userID, String username, String email, String password, Integer age, String gender,
			String country, String phoneNumber, String role) {
		super();
		UserID = userID;
		Username = username;
		Email = email;
		Password = password;
		Age = age;
		Gender = gender;
		Country = country;
		PhoneNumber = phoneNumber;
		Role = role;
	}
	public String getUserID() {
		return UserID;
	}
	public void setUserID(String userID) {
		UserID = userID;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public Integer getAge() {
		return Age;
	}
	public void setAge(Integer age) {
		this.Age = age;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}
}
