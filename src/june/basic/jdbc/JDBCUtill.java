package june.basic.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ResourceBundle;

public class JDBCUtill {

        private ResourceBundle rb = null;
        private String DRV;
        private String URL;
        private String USR;
        private String PWD;

        public JDBCUtill() {
            String pkpath = "june.basic.jdbc.jdbc";
            // june.basic.jdbc 패키지경로
            // jdbc : prperties 파일명
            rb = ResourceBundle.getBundle(pkpath);
            DRV = rb.getString("mdrv");
            URL = rb.getString("murl");
            USR = rb.getString("musr");
            PWD = rb.getString("mpwd");
        }

        public Connection openConn(){
            Connection conn = null;
            try {
                Class.forName(DRV);
                conn = DriverManager.getConnection(URL,USR,PWD);
            }catch (Exception ex){
                ex.printStackTrace();
            }
            return conn;
        }
    }


