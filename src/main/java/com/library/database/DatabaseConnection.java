package com.library.database;

import com.library.config.DatabaseConfig;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {


        public static Connection getConnection() throws SQLException {

            return DriverManager.getConnection(
                    DatabaseConfig.getURL(),
                    DatabaseConfig.getUSER(),
                    DatabaseConfig.getPASSWORD()
            );
        }
}
