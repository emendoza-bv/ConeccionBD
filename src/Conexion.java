import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	
	private static final String CONTROLADOR="com.mysql.jdbc.Driver";
	private static final String URL="jdbc:mysql://localhost:3306/world";
	private static final String USUARIO="root";
	private static final String CONTRASE�A="root";
	
	
	static {
		try {
			Class.forName(CONTROLADOR);
		}
		catch(ClassNotFoundException e) 
		{
			System.out.println("Error al cargar la conexi�n");
			e.printStackTrace();
		}
	}
	public Connection conectar() {
		Connection conexion =null;
		
		try {
			
			conexion=	DriverManager.getConnection(URL,USUARIO,CONTRASE�A);
			System.out.println("Conexion exitosa");
			}catch(SQLException e) 
			{
				System.out.println("Error en conexi�n");
				e.printStackTrace();
			}
		return conexion;
			
	}

	
}
