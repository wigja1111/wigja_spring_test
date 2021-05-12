package Service;

import java.util.List;

import Dao.BoardDAO;
import Domain.BoardVO;


public interface BoardService {
	
	public static final BoardDAO boardDAO = new BoardDAO();
	
	// 글 목록 조회
	List<BoardVO> getBoardList();
	
	// 글 상세 조회
	BoardVO getContent(BoardVO vo);
	
	// 글 등록
	void insertBoard(BoardVO vo);

	// 글 수정
	void updateBoard(BoardVO vo);

	// 글 삭제
	void deleteBoard(BoardVO vo);
	
}