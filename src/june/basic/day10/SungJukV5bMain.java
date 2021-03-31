package june.basic.day10;

import june.basic.sugjuk.SungJukService;
import june.basic.sugjuk.SungJukServiceImpl;
import june.basic.sugjuk.SungJukVO;

public class SungJukV5bMain {
    public static void main(String[] args) {
       // SungJukService sjsrv = new SungJukServiceImpl();
        SungJukService sjsrv = SungJukServiceImpl.getInstance();


        SungJukVO sj = sjsrv.readSungJuk();
        sjsrv.computeSungJuk(sj);
        sjsrv.printSungJuk(sj);
    }

}


