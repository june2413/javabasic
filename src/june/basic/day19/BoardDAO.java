package june.basic.day19;

import java.util.List;

public interface BoardDAO {

    int insertBoard(BoardVO bvo);
    List<BoardVO> selectBoard();
    BoardVO selectOneBoard(int bdno);
    int updateBoard(BoardVO bvo);
    int deleteBoard(int bvo);


    void thumbupBoard(int bdno);
}
