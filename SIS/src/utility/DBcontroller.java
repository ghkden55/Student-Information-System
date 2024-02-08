package utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBcontroller {

    static DBcontroller instance = new DBcontroller();

    String url = "jdbc:mysql://127.0.0.1:3306/SIS";
    String user = "root";
    String password = "1234";

    Connection conn = null;


    public static DBcontroller getInstance() {

        if (instance == null) {
            instance = new DBcontroller();
        }

        return instance;
    }


    public Connection getConn() {

        try {
            conn = DriverManager.getConnection(url, user, password);

        } catch (SQLException e) {
            System.out.println("연결 실패");
        }

        return conn;
    }
}
