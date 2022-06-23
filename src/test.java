import java.sql.Connection;
import java.sql.DriverManager;

public class test {
    public static void main(String[] args) {
        //구구단 출력하는 프로그램
        int i, j;
        for (i = 1; i <= 9; i++) {
            for (j = 1; j <= 9; j++) {
                System.out.printf("%d * %d = %d\n", i, j, i * j);
            }
        }

        //별찍기 프로그램
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //별찍기 프로그램 15단
        for (i = 1; i <= 15; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //피보나치 수열
        int a = 0, b = 1, c;
        for (i = 1; i <= 10; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }

        //삼각형 출력
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //Database 연결 프로그램
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "scott";
        String password = "tiger";
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("연결 성공");
        } catch (Exception e) {
            System.out.println("연결 실패");
        }

    }
}
