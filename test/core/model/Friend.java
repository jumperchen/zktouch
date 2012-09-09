package model;

public class Friend {
	
	private Integer id;
	private String name;
	private String avatar_url;
	
	private String birthday;
	private String phone;
	private String email;
	private int gender;
	
	public Friend(Integer id, String name, String avatar_url) {
		this.id = id;
		this.name = name;
		this.avatar_url = avatar_url;
	}
	
	public Friend(Integer id, String name, String avatar_url, 
			String birthday, String phone, String email, int gender) {
		
		this.id = id;
		this.name = name;
		this.avatar_url = avatar_url;
		this.phone = phone;
		this.birthday = birthday;
		this.email = email;
		this.gender = gender;
	}

	public Friend() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAvatar_url() {
		return avatar_url;
	}

	public void setAvatar_url(String avatar_url) {
		this.avatar_url = avatar_url;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

}
