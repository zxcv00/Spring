<%@page import="com.mirim.biz.impl.BoardDAO"%>
<%@page import="com.mirim.biz.board.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">

<title>글 등록</title>
</head>
<body>
<center>
	<h1>글 등록</h1>
	<a href="logout_proc.jsp">Log-out</a>
	<hr>
	<form action="insertBoard.do" method="post">
	<table border="1" cellpadding="0" cellspaceing="0">
		<tr>
			<td bgcolor="orange" width="70">제목</td>   
			<td align="left"> <input name="title" type="text"> </td>
		</tr>
		<tr>
			<td bgcolor="orange">작성자</td>  
			<td align="left"> <input type="text" name="writer" size="10"> </td>
		</tr> 
		<tr>
			<td bgcolor="orange">내용</td>
			<td align="left"> <textarea name="content" rows="10" cols="40"></textarea> </td>
		</tr>
		<tr>
			<td colspan="2" align="center"> <input type="submit" value="새 글 등록"> </td>
		</tr>
	</table>
	</form>
	<hr>
	<a href="getBoardList.jsp">글 목록 가기</a>
</center>
</body>
</html>