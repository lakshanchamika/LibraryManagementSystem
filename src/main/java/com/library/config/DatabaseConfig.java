package com.library.config;

public class DatabaseConfig {
    private static final String URL =
            "jdbc:postgresql://location:5432/library_management";

    private static final String USER = "lakshan_chamika";

    private static final String PASSWORD = "lakshan123";

    public static String getURL() {
        return URL;
    }

    public static String getUSER() {
        return USER;
    }

    public static String getPASSWORD() {
        return PASSWORD;
    }
}
