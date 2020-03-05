package ocp_self_test;

import java.io.IOException;
import java.sql.SQLException;

public class AllGoesWrong {
public static void main(String[] args) {
AllGoesWrong a = new AllGoesWrong();
try {
a.blowUp();
System.out.print("a");

} catch (IOException | SQLException e) {
System.out.print("c");
} finally {
System.out.print("d");
}
}
void blowUp() throws IOException, SQLException {
throw new SQLException();
}
}