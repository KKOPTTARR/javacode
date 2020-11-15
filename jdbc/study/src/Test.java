import java.math.BigDecimal;
import java.sql.*;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // 加载JDBC驱动程序:反射，这样调用初始化com.mysql.jdbc.Driver类，即将该类加载到JVM方法 区，并执行该类的静态方法块、静态属性。
        Class.forName("com.mysql.jdbc.Driver");

        // 创建数据库连接
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useSSL=false&user=root&password=666666&useUnicode=true&characterEncoding=UTF-8");


        //创建操作命令对象Statement
        Statement statement = connection.createStatement();


        //执行sql语句
        //ResultSet resultSet= statement.executeQuery("select id, name, chinese, math, english from exam_result");

        String sql = "select id, name, chinese, math, english from exam_result";
        ResultSet resultSet= statement.executeQuery(sql);

        //处理结果
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            BigDecimal chinese = resultSet.getBigDecimal("chinese");
            int math = resultSet.getInt("math");
            int english = resultSet.getInt("english");

            System.out.printf("id=%s,name=%s,chinese=%s,math=%s,english=%s%n",id,name,chinese,math,english);



        }





    }
}
