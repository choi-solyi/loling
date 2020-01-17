package com.jw.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jw.comm.JWAction;
import com.jw.comm.JWForwardAction;

public class JWInsertAction implements JWAction {

	@Override
	public JWForwardAction execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		JWForwardAction f = new JWForwardAction();
		f.setUrl("main.jsp?page=adboard/adinsert.jsp");
		f.setForward(false);
		return f;
	}
}
