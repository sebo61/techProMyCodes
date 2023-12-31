import java.sql.*;

public class ExecuteUpdate01 {
    public static void main(String[] args) throws SQLException {
        // 2. adım : database bağlanma
        Connection con= DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbc_db","dev_user","password");
        // 3. adım: Statement oluşturma
        Statement st=con.createStatement();
        System.out.println("Connection succes");
        System.out.println("*********************************************");

        //ÖRNEK1:developers tablosunda maaşı ortalama maaştan az olanların maaşını ortalama maaş ile güncelleyiniz,

        // String sql="update developers set salary=(select avg(salary) from developers) where salary<(select avg(salary) from developers)";
        //int updated=st.executeUpdate(sql); //update edilen sayıyı gösterir.
        //System.out.println("güncellenen kayıt sayısı "+updated);
        ResultSet rs=st.executeQuery("select id,name,salary from developers");
        while (rs.next()){
            System.out.println(rs.getInt("id")+"--"+rs.getString("name")+"--"+rs.getInt("salary"));

        }

      //  String sql2="insert into developers (name,salary,prog_lang) values ('süleyman',5500,'Backend')";
       // int inserted=st.executeUpdate(sql2);
       // System.out.println("eklenen kayıt sayısı: "+inserted);

        //ÖRNEK3:developers tablosundan id'si 11 olanı siliniz.
        String sql3="delete from developers where id=11";
        int deleted=st.executeUpdate(sql3);
        System.out.println("silinen developer sayısı: "+deleted);
        System.out.println("*************************************************");

        //ÖRNEK4:developers tablosundan prog_lang css olanları siliniz.

        String sql4="delete from developers where prog_lang ilike 'css'";
        int delproglang=st.executeUpdate(sql4);

        System.out.println("silinen CSS'ci sayısı: "+delproglang);

        st.close();
        con.close();


    }
}
