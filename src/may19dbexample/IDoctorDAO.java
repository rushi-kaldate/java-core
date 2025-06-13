package may19dbexample;

import java.sql.SQLException;
import java.util.List;

public interface IDoctorDAO {
	public void saveDoctor( Doctor doctor) throws SQLException,ClassNotFoundException;
	public void updateDoctorName(String name, int did) throws SQLException, ClassNotFoundException;
	public Doctor getDoctorById(int id) throws SQLException;
	public List<Doctor> findAllDoctor() throws SQLException;
	
	

}
