package org.urop;

import com.opensymphony.xwork2.ActionSupport;

import java.sql.Connection;
import java.sql.DriverManager;


public class LoginService {

        public Connection conn;
        public Connection Login() {
            conn = null;
            try {
                String URL = "jdbc:postgresql://url";
                String pwd = "";
                Class.forName("org.postgresql.Driver");
                conn = DriverManager.getConnection(URL, "root", pwd);
                System.out.println("sucess");


            } catch (Exception e) {
                e.printStackTrace();

            }
            return conn;
        }
}
