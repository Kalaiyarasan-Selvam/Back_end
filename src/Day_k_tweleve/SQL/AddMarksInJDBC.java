package Day_k_tweleve.SQL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class AddMarksInJDBC {
    public static void main(String[] args) {
        Connection con=null;
        Statement st=null;
        ResultSet rs=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Mani@123");
            st=con.createStatement();
            String sql = "INSERT INTO stdmark VALUES (56,\"Mani\",96)";
            int af=st.executeUpdate(sql);
            System.out.println("Rows Affected:"+af);
            sql = "INSERT INTO stdmark VALUES (57,\"Manikandan\",97)";
            af=st.executeUpdate(sql);
            System.out.println("Rows Affected:"+af);
            sql = "INSERT INTO stdmark VALUES (26,\"Prakash\",98)";
            af=st.executeUpdate(sql);
            System.out.println("Rows Affected:"+af);
            rs=st.executeQuery("SELECT * FROM stdmark");
            while (rs.next())
            {
                System.out.println("ID :"+rs.getInt(1));
                System.out.println("NAME :"+rs.getString(2));
                System.out.println("MARK :"+rs.getInt(3));
                System.out.println("-------------------------------");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        finally
        {
            try {
                if (con != null)
                    con.close();
                if (st != null)
                    st.close();
                if (rs != null)
                    rs.close();
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
