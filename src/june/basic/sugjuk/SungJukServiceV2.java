package june.basic.sugjuk;


//성적 서비스 V1
//입력, 처리, 출력, 수정, 삭제 기능 구현
// 프로그램 메뉴 출력기능 추가
public interface SungJukServiceV2 {

     void displayMenu();
     void computeSungJuk(SungJukVO sj);
     void  newSungJuk();
     void showSungJuk();
     void showOneSungJuk();
     void modifySungJuk();
     void removeSungJuk();



}
