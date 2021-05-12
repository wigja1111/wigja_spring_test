package org.spring.inno;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import Domain.BoardVO;
import Service.BoardService;

@Controller
@SessionAttributes("board")
public class BoardController {

	
	private BoardService boardService;
	 
	//�� ��� �˻�
	@RequestMapping("/getBoardList.do")
	public String getBoardList(BoardVO vo, Model model) {    System.out.println("�۸�� ��Ʈ�ѷ�");
		 List<BoardVO> boardList = boardService.getBoardList();
		
		// Model ���� ����
		model.addAttribute("boardList",boardList);
		return "boardList"; // View �̸� ����
	}

	// �� �� ��ȸ
	@RequestMapping("/getContent.do")
	public String getBoard(BoardVO vo, Model model) {
		model.addAttribute("board", boardService.getContent(vo)); // Model ���� ����
		return "content"; // View �̸� ����
	}
	
	// �� ����
	@RequestMapping("/insertBoard.do") 
	public String insertBoard(BoardVO vo) throws IOException { 	System.out.println("�۾�����Ʈ�ѷ�");
			boardService.insertBoard(vo); 
			return "redirect:getBoardList.do"; 
	}
	
	// �� ���� ������ �̵�
	@RequestMapping("/moveInsertBoard.do") 
	public String moveInsertBoard()throws Exception{    System.out.println("�۾��������� ��Ʈ�ѷ�");
		return "insertBoard";
	}
	 

	// �� ����
	@RequestMapping("/updateBoard.do")
	public String updateBoard(@ModelAttribute("board") BoardVO vo) {
		boardService.updateBoard(vo);
		return "redirect:getBoardList.do";
	}

	// �� ����
	@RequestMapping("/deleteBoard.do")
	public String deleteBoard(BoardVO vo) {
		boardService.deleteBoard(vo);
		return "redirect:getBoardList.do";
	}
}
