package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class SaveDAO {
	
	protected Connection connection() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
    	String JDBCAjuri = "com.mysql.jdbc.Driver";
       	Class.forName(JDBCAjuri).newInstance();
       	String url = "jdbc:mysql://localhost:3306/db";
       	Connection connection = DriverManager.getConnection(url, "eclipse","pswd");
       	return connection;
    }
	
	public void saveNewForm(String formName, boolean published) {
		
		String preparedStatement = "INSERT INTO kysely(name, published) VALUES(?,?)";
		PreparedStatement saveForm = connection.prepareStatement(preparedStatement);
		
		saveForm.setString(1, formName);
        saveForm.setBoolean(2, published);
        saveForm.executeUpdate();
	}
	
	public void saveTextQuestion(String str) {
		
	}
	
	public void saveScaleQuestion(String str) {
		
	}

	public void saveMultipleChoiceQuestion(String str) {
		
	}

	public void saveCheckBoxQuestion(String str) {
		
	}

}
