
public class User {
	public int id;
	public String fullname;
	public String email;
	public String password;

	public User() {

	}

	public User(int id,String email,String password,String fullname) {
		this.id = id;
		this.email = email;
		this.password = password;
		this.fullname = fullname;
	}

	public void setFullname(String fullname) {
		// TODO Auto-generated method stub
		this.fullname = fullname;
	}

	public void setEmail(String email) {
		// TODO Auto-generated method stub
		this.email = email;
	}
}
