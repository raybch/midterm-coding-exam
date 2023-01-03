package src.databases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import static org.junit.Assert.assertTrue;


public class UnitTestConnectDB {
    Connection connection;
    ConnectToSqlDB connectToSqlDatabase;
    @Before
    public void before() throws SQLException, IOException, ClassNotFoundException {
        connection = connectToSqlDatabase.connectToSqlDatabase();
    }

    @After
    public void after() {
        connectToSqlDatabase.close();
    }

    @Test
    public void closeStatementShouldCloseStatement() throws SQLException {
        Statement statement = connection.createStatement();
        connectToSqlDatabase.closeStatement(statement);
        assertTrue(statement.isClosed());
    }

    @Test
    public void closeStatementWithNullShouldNotThrow() {
        connectToSqlDatabase.closeStatement(null);
    }
}


