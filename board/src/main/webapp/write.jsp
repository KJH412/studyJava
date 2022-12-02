<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- submit이벤트가 발생을 하면 formCheck()함수가 실행을 하고
실행결과가 true일 경우에 action(index.jsp로 돌아가기)이 실행된다-->
<form method="post" action="insert.jsp" name="form1" onsubmit="return formCheck();">
   제목:<input type ="text" name="title"><br>
   작성자:<input type ="text" name="writer"><br>
   날짜:<input type ="date" name="regdate"><br>
   내용:<textarea rows="10" cols ="20" name ="content">
   </textarea><br>
   <input type ="submit" value="작성완료"><br>
</form>

</body>
</html>