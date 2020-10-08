<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		
		double x = 2/0;
		/*ex1)
			try{// 이 안에 코드에서 에러가 발생할 수 있다
				double x = 2/0; //error => double 문법으로 '정수/정수' 맞게 기입했는데 ???  => 값이 무한이 나오는데 컴퓨터에서 무한을 나타낼 방법이 없어서 에러 발생
			}catch(Exception e){ //에러 발생 시
				out.print("예외발생");
				//e.printStackTrace(); //스택위에 있는 어떤 메서드가 호출 되었는지 보여주는 메서드 == 디버깅을 위해 , 최종으로 프로그램 완성 시에는 주석처리를 하여 남겨준다.
			}//요즘 트렌드는 try-catch 를 숨기는 것 == 사용 자체가 코드를 어지럽게 만들기 때문에
		*/
	%>
</body>
</html>
	