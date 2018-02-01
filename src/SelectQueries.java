/**
 * Created by bma on 12/28/17.


import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.math.BigDecimal;
import java.sql.ResultSet;

public class SelectQueries {
    public static void main(String[] args) {
        new SelectQueries().demo();

    }

    private void demo() {
        try{
            Connection conn = openConnection();
            runQueries(conn);
            conn.close();
        }
        catch(SQLException e) {
            reportAndExit(e);
        }
    }

    private void runQueries(Connection conn) {
        try {
            Statement stmt = conn.createStatement();

            simpleSelect(stmt);
            filteredSelect(stmt);
            projectSelect(stmt);
            miscFunctionsAndModifiers(stmt);
            miscJoins(stmt);
            subquerySelect(stmt);

            stmt.close();
        } catch (SQLException e) {
            reportAndExit(e);
        }
    }
private void simpleSelect (Statement stmt) {
    try
}

}*/
