package com.jw.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jw.BoardDTO.JWBoardDTO;
import com.jw.comm.JWAction;
import com.jw.comm.JWBoardService;
import com.jw.comm.JWForwardAction;

public class JWInsertResultAction implements JWAction {

	@Override
	public JWForwardAction execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		JWForwardAction f = new JWForwardAction();
		f.setForward(false);
		f.setUrl("JWlist.do");
		
		String btitle = request.getParameter("btitle");
		String bcategory = request.getParameter("bcategory");
		String bimg = request.getParameter("bimg");
		String bcontent = request.getParameter("bcontent");
		System.out.println(btitle);
		System.out.println(bcategory);
		System.out.println(bimg);
		System.out.println(bcontent);
		
		JWBoardDTO dto = new JWBoardDTO(); 
		
		dto.setBtitle(btitle);
		dto.setBcategory(bcategory);
		dto.setBimg(bimg);
		dto.setBcontent(bcontent);
		
		JWBoardService service = JWBoardService.getBoardService();
		service.Insert(dto);
		
		return f;
	}

}
