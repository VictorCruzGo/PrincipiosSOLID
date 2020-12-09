import com.vic.model.Connection;

public class App {
	public static void main(String args[]) {
		//Clave. Instancia por constructor prohibido per ser private
		Connection c=Connection.getConnection();
		c.connect();
		c.disconnect();
				
		System.out.println(c instanceof Connection);
		
		//Al intentar crear otra instancia de Connection, no se puede, por que la instancia es singleton.
		Connection d=Connection.getConnection();
		d.connect();
		d.disconnect();
				
		System.out.println(d instanceof Connection);		
	}
}
