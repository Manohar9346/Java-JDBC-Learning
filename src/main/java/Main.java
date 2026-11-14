
import java.sql.*;

public class Main {
    public static void main(String[] args) {

            String url = "jdbc:mysql://localhost:3306/lost_found_db";
                    String username = "jdbc_user";
                            String password = "JDBC@123";

                                    try {
                                                Connection con = DriverManager.getConnection(
                                                                url, username, password
                                                                            );

                                                                                        String sql = "UPDATE students SET course = ? WHERE id = ?";

                                                                                                    PreparedStatement ps = con.prepareStatement(sql);

                                                                                                                ps.setString(1, "Computer Science");
                                                                                                                            ps.setInt(2, 1);

                                                                                                                                        int rows = ps.executeUpdate();

                                                                                                                                                    System.out.println(rows + " student record updated!");

                                                                                                                                                                ps.close();
                                                                                                                                                                            con.close();

                                                                                                                                                                                    } catch (SQLException e) {
                                                                                                                                                                                                e.printStackTrace();
                                                                                                                                                                                                        }
                                                                                                                                                                                                            }
                                                                                                                                                                                                            }
                                                                                                                                                                                                            