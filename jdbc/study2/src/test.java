import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.*;


/*
通过DataSource(数据源)对象获取。实际应用中会使用DataSource对象。
 */

public class test {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // 创建数据库连接


        //法一
        // 加载JDBC驱动程序:反射，这样调用初始化com.mysql.jdbc.Driver类，即将该类加载到JVM方法 区，并执行该类的静态方法块、静态属性。
        //Class.forName("com.mysql.jdbc.Driver");
        //Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useSSL=false&user=root&password=666666&useUnicode=true&characterEncoding=UTF-8");


        //法二
        MysqlDataSource ds = new MysqlDataSource();

        //格式一
        //ds.setUrl("jdbc:mysql://localhost:3306/test?useSSL=false&user=root&password=666666&useUnicode=true&characterEncoding=UTF-8");;

        //格式二
        ((MysqlDataSource) ds).setUrl("jdbc:mysql://localhost:3306/test?useSSL=false");
        ((MysqlDataSource) ds).setUser("root");
        ((MysqlDataSource) ds).setPassword("666666");

        Connection connection = ds.getConnection();

    }
}
/*
以上两种方式的区别是:
1. DriverManager类来获取的Connection连接，是无法重复利用的，每次使用完以后释放资源 时，通过connection.close()都是关闭物理连接。
2. DataSource提供连接池的支持。连接池在初始化时将创建一定数量的数据库连接，这些连接 是可以复用的，每次使用完数据库连接，释放资源调用connection.close()都是将 Conncetion连接对象回收。
*/

