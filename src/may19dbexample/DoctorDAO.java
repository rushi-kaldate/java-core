package may19dbexample;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class DoctorDAO implements IDoctorDAO{

	@Override
	public void saveDoctor(Doctor doctor) throws SQLException, ClassNotFoundException {
		Connection con = DBUtil.getInstance().getConnection();
		
		String query = "insert into  doctor(did,name,spec,exp,description)"+"values (?,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, doctor.getDid());
		ps.setString(2, doctor.getName());
		ps.setString(3, doctor.getSpec());
		ps.setInt(4, doctor.getExp());
		ps.setString(5, doctor.getDescription());
		ps.execute();
		
	}

	@Override
	public void updateDoctorName(String name,int did) throws SQLException, ClassNotFoundException {
		Connection con = DBUtil.getInstance().getConnection();
		
		String query = "update doctor set name = ? where did = ?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, "GITA");
		ps.setInt(2, 3);		
		ps.addBatch();
		
		ps.executeUpdate();
		System.out.println("Data is Updated");
		ps.close();
//		String query1 = "update doctor" + "set exp = ?" + "where id = ?";
	//	PreparedStatement ps1 = con.prepareStatement(query1);
		
	}

	@Override
	public Doctor getDoctorById(int id) throws SQLException {
		Connection con = DBUtil.getInstance().getConnection();
		PreparedStatement ps = con.prepareStatement("SELECT * FROM doctor WHERE did = ?");
		 ps.setInt(1, 2);
		 ResultSet rs = ps.executeQuery();
		 
		 if(rs.next()) {
			 System.out.println("Doctor found: " + rs.getInt("did")+ " " +rs.getString());
			 
		 }
		 else {
			 System.out.println("Doctor not found");
		 }
		
		return null;
	}

	@Override
	public List<Doctor> findAllDoctor() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	

}
