package agenda;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.awt.Component;
import javax.swing.JOptionPane;

public class ConnectionDB {
    public ConnectionDB() {
    }

    public static Connection getConnectionBD() {
        Connection connection = null;
        String db = "contactos_generales";
        String url = "jdbc:mysql://localhost:3306/" + db;
        String user = "root";
        String password = "";

        try {
            // Cargar el controlador de MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establecer la conexión a la base de datos
            connection = DriverManager.getConnection(url, user, password);
            
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e, "Error en la conexión a la base de datos: " + e.getMessage(), JOptionPane.ERROR_MESSAGE);
            connection = null;
        }

        return connection;
    }

}
