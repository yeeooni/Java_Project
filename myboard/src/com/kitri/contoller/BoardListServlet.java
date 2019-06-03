package com.kitri.contoller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kitri.dto.JavaBean;
import com.kitri.dto.RepBoard;
import com.kitri.service.RepBoardService;


@WebServlet("/boardlist")
public class BoardListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	private RepBoardService repBoardService;
	
		public BoardListServlet() {
			repBoardService = new RepBoardService();
		}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//	요청방식을 구분하지 않을 경우 service라고 메소드를 만들어주면 된다.

		String cp = request.getParameter("currentPage");
		
		int currentPage = 1; // 보여줄 현재 페이지 
		
			if (cp != null) {
				currentPage = Integer.parseInt(cp);
			}
		
			int cntPerPage = 10; // 총 페이지
			int totalCnt = repBoardService.getTotalCnt(); // 총 게시글 수 
			int cntPerPageGroup = 3; // 페이지 그룹에 보여줄 페이지 수
			
			String url = "boardlist";
			JavaBean javaBean = new JavaBean(currentPage, 
															cntPerPage, 
															cntPerPageGroup,
															totalCnt,
															url);
			
		 // startRow = 1 endRow = 10
		// 1 페이지일 경우 			1				   10
		// 2 페이지일 경우  		11 			   20
			
		//	startRow = 1 endRow = 5
		//	int startRow =  (currentPage - 1) * cntPerPage + 1;
		//	int endRow = currentPage * cntPerPage;
		
		List<RepBoard> list = repBoardService.findByRows(javaBean.getStartRow(), javaBean.getEndRow());
		
		javaBean.setList(list);
		
		request.setAttribute("javaBean", javaBean);
		
		//	request.setAttribute("boardlist", list);
		
		//  총 페이지 계산 
		//	int totalPage = 1; // 총 페이지 수  
		

		// 올림 함수 
		//	totalPage = (int) Math.ceil((float)(totalCnt / cntPerPage));
			
		//	request.setAttribute("totalPage", totalPage);
		//------------------------------------------------------------------//
		
		//int startPage = (currentPage - 1) * cntPerPageGroup + 1;
		//int endPage = startPage * cntPerPageGroup;
		
		//	if(endPage > totalPage) {
		//		endPage = totalPage;
		//	}
			
		//	request.setAttribute("startPage", startPage);
		//	request.setAttribute("endPage", endPage);
		
		String path = "/boardlistresult.jsp";
		RequestDispatcher rd = request.getRequestDispatcher(path);
		rd.forward(request, response);
		
	}
}
