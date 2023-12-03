package phonebook;

//import agenda.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//import java.awt.Component;
import javax.swing.JOptionPane;

public class ConnectionDB {
    public ConnectionDB() {
    }

    public static Connection getConnectionBD() {
        Connection connection = null;
        String db = "general_contacts";
        String url = "jdbc:mysql://localhost:3306/" + db;
        String user = "root";
        String password = "1234";

        try {
            // Cargar el controlador de MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establecer la conexión a la base de datos
            connection = DriverManager.getConnection(url, user, password);
            
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e, "Error in the conection to DataBase " + e.getMessage(), JOptionPane.ERROR_MESSAGE);
            connection = null;
        }

        return connection;
    }

}
