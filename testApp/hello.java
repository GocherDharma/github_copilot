package testApp;

public class hello {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public static void sayHello() {
        System.out.println("Hello World!");
    }

    //fibonaci
    public static int fib(int n) {
        if (n <= 1) return n;
        return fib(n-1) + fib(n-2);
    }
    //oracle jdbc
    public static void oracleJdbc() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from emp");
            while (rs.next())
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    //intregrate

    
}
