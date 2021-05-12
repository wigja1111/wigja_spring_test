package Service;

import java.util.List;

import Dao.BoardDAO;
import Domain.BoardVO;


public interface BoardService {
	
	public static final BoardDAO boardDAO = new BoardDAO();
	
	// �� ��� ��ȸ
	List<BoardVO> getBoardList();
	
	// �� �� ��ȸ
	BoardVO getContent(BoardVO vo);
	
	// �� ���
	void insertBoard(BoardVO vo);

	// �� ����
	void updateBoard(BoardVO vo);

	// �� ����
	void deleteBoard(BoardVO vo);
	
}