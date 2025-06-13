package may19dbexample;

import java.sql.SQLException;

public class Client {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		Doctor d1 = new Doctor(3,"sita","cardiologist",10,"she is sr doc");
//		Doctor d2 = new Doctor(4,"Sam","pharmacy",11,"he is a goood man");
		DoctorDAO doctordao = new DoctorDAO();
//		doctordao.saveDoctor(d1);
//		doctordao.saveDoctor(d2);

		doctordao.updateDoctorName("GITA", 3);
	}

}
