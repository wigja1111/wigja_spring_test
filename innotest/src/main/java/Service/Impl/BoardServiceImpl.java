package Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Dao.BoardDAO;
import Domain.BoardVO;
import Service.BoardService;

@Service
public class BoardServiceImpl implements BoardService{

	
	private BoardDAO boardDAO;
	
	@Override
	public List<BoardVO> getBoardList() {    System.out.println("IMPL 11");
		return boardDAO.getBoardList();
	}

	@Override
	public BoardVO getContent(BoardVO vo) {  System.out.println("IMPL 22");
		return boardDAO.getContent(vo);
	}

	@Override
	public void insertBoard(BoardVO vo) {  System.out.println("IMPL 33");
		boardDAO.insertBoard(vo);
	}

	@Override
	public void updateBoard(BoardVO vo) {   System.out.println("IMPL 444");
		boardDAO.updateBoard(vo);
	}

	@Override
	public void deleteBoard(BoardVO vo) {   System.out.println("IMPL 555");
		boardDAO.deleteBoard(vo);
	}

}