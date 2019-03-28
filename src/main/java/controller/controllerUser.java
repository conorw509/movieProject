package controller;

import DB.databaseConnection;
import hash.PasswordEncrypt;
import model.PersonForm;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;


public class controllerUser {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }





//    public boolean checkLogin(User u) {
//
//        String sql = "";
//        ResultSet rs = null;
//
//        try {
//            sql = "SELECT * FROM users WHERE email = ? and password = ?";
//            pst = con.prepareStatement(sql);
//
//            pst.setString(1, u.getEmail());
//            pst.setString(2, PasswordEncrypt.encryptPassword(u.getPassword()));
//
//            rs = pst.executeQuery();
//
//            if (rs.next()) {
//                return true;
//            } else {
//                return false;
//            }
//
//
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
//
//
//        return false;
//    }
//
//
//    public boolean checkEmail(User u) {
//
//        String sql = "";
//        ResultSet rs = null;
//
//        try {
//            sql = "SELECT * FROM users WHERE email = ?";
//            pst = con.prepareStatement(sql);
//
//            pst.setString(1, u.getEmail());
//
//            rs = pst.executeQuery();
//
//            if (rs.next()) {
//                return true;
//            } else {
//
//                return false;
//            }
//
//
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
//
//
//        return false;
//    }


}
