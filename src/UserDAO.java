import java.sql.*;

public class UserDAO {
	public User checkLogin(String email, String password) throws SQLException, ClassNotFoundException {

		User user = null;
		Connection connection = getConnection();
		if(connection != null){
			String sql = "SELECT * FROM users WHERE email = ? and password = ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, email);
			statement.setString(2, password);
			ResultSet result = statement.executeQuery();
			
			if (result.next()) {
				user = new User();
				user.setFullname(result.getString("fullname"));
				user.setEmail(email);
			}

			connection.close();
		}
		else
		{
			user = new User(1,"bharath1","bharath","Bharath");
		}

		return user;
	}

	private Connection getConnection() throws SQLException, ClassNotFoundException{
		Boolean connectToDb = false;
		String jdbcURL = "jdbc:mysql://localhost:3306/bookshop";
		String dbUser = "root";
		String dbPassword = "password";
		if(connectToDb){
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
		}
		
		return null;
	}
}
