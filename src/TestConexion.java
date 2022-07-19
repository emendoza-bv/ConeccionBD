import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestConexion {

	public static void main(String[] args) {

Conexion conexion = new Conexion();
Connection cn =null;
Statement stm = null;
ResultSet rs = null;
cn=conexion.conectar();
try {
	stm=cn.createStatement();
	rs=	stm.executeQuery("SELECT * FROM world.city");
	  
	while(rs.next())
	{
	int idUsuario=rs.getInt(1);
	String usuario=rs.getString(2);
	String Clave=rs.getString(3);
	System.out.println(idUsuario+" "+usuario+" "+Clave);
	}
	
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}finally 
{
	try {
		if(rs!=null) 
		{
		rs.close();	
		}
		if(stm!=null) 
		{
		stm.close();		
		}
		if(cn!=null) 
		{
		cn.close();			
		}
		
	} catch (SQLException e2) {
		// TODO Auto-generated catch block
		e2.printStackTrace();
	}
	
}

	}

}
