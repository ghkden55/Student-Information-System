package utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBcontroller {

    private String url = "jdbc:mysql://127.0.0.1:3306/SIS";
    private String user = "root";
    private String password = "1234";

    private Connection conn = null;

    public Connection getConn() {

        try {
            conn = DriverManager.getConnection(url, user, password);

        } catch (SQLException e) {
            System.out.println("연결 실패");
        }

        return conn;
    }
}
