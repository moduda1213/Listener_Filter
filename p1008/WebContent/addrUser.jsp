<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import ="java.sql.*" %>
<%
	Connection conn = null;
	try{
		Class.forName("");
		conn = DriverManager.getConnection("","","");
		//user1 입력
		conn.setAutoCommit(false); //executeUpdate();실행시 작동하는게 아니라 따로 모아두고 커밋실행 시 작동
		PreparedStatement stmt1 = conn.prepareStatement("");
		stmt1.executeUpdate();
		//user2 입력
		PreparedStatement stmt2 = conn.prepareStatement("");
		stmt2.executeUpdate();
		conn.commit(); //어떤 에러발생하지 않았을 떄 커밋 
	}catch(Exception e){ // 에러가 발생했다면
		conn.rollback(); // 이전 성공했던 작업 취소
		e.printStackTrace(); //어느 부분의 메서드가 에러인지 확인
	}finally{ // 예외가 발생하더라도 이 코드는 실행시킨다
		conn.close();
	}
%>
