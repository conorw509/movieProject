package Repository;

import DB.databaseConnection;
import hash.PasswordEncrypt;
import model.PersonForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Service;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

@Service
public class userRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public boolean createAccount(PersonForm u) {
        String query = "insert into users(firstname,lastname,email,password,repassword) values(?,?,?,?,?)";

        return jdbcTemplate.execute(query,new PreparedStatementCallback<Boolean>(){
            @Override
            public Boolean doInPreparedStatement(PreparedStatement preparedStatement)
                    throws SQLException, DataAccessException {

                preparedStatement.setString(1, u.getName());
                preparedStatement.setString(2, u.getLastname());
                preparedStatement.setString(3, u.getEmail());
                preparedStatement.setString(4, PasswordEncrypt.encryptPassword(u.getPassword()));
                preparedStatement.setString(5, PasswordEncrypt.encryptPassword(u.getRepassword()));

                return preparedStatement.execute();

            }
        });
    }

//
//       return jdbcTemplate.update(new PreparedStatementCreator() {
//            @Override
//            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
//
//                return preparedStatement;
//            }
//
//        });
//
//        int newUserId = holder.getKey().intValue();
//        u.setID(newUserId);
//        return u;
    }

