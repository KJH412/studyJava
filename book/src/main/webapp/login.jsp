<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>로그인</title>
    <link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@100;300;400;500;700;900&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.14.0/css/all.min.css">
    <link rel="shortcut icon" href="icon/BookSaTong.svg">
    <link rel="stylesheet" href="css/link.css">
    <link rel="stylesheet" href="css/login.css">
    <script src="js/jquery-3.6.0.min.js"></script>
    <script src="js/loading.js"></script>
    <script>
    	function checkValue(){
    		if(!document.loginInfo.id.value){
    			alert("아이디를 입력하세요");
    			document.loginInfo.id.focus();
    			return false;
    		}
    		if(!document.loginInfo.password.value){
    			alert("비밀번호를 입력하세요");
    			document.loginInfo.password.focus();
    			return false;
    		}
    		return true;
    	}
    </script>
</head>
<body>
    <ul class="skipMenu">
        <li><a href="#nav">메인메뉴 바로가기</a></li>
        <li><a href="#container">본문 바로가기</a></li>
    </ul>
    <div id="Mobile"></div>
    <header id="header" class="clearFix"></header>
    <section id="container">
        <h1>로그인페이지</h1>
        <div class="innerBox">
            <div class="loginBox">
                <form action="pro/loginPro.jsp" method="post" name="loginInfo" onsubmit="return checkValue();">
                    <input name="id" class="box1" type="text" placeholder="아이디">
                    <input name="password" class="box2" type="password" placeholder="비밀번호">
                    <div class="box3">
                        <input class="checkBox" type="checkbox">
                        <label>로그인 상태 유지</label>
                        <p class="box3_text1"><a href="#void">비밀번호 재설정</a></p>
                        <p class="box3_text2"><a href="#void">아이디 찾기</a></p>
                    </div>
                    <h3 class="text2">아래 계정으로 로그인</h3>
                    <ul class="box4">
                        <li><a href="https://www.naver.com/"><img src="icon/naver.svg" alt="naver"></a></li>
                        <li><a href="https://www.kakaocorp.com/page/"><img src="icon/kakao.svg" alt="kakao"></a></li>
                        <li><a href="https://www.google.co.kr/"><img src="icon/google.svg" alt="google"></a></li>
                        <li><a href="https://www.facebook.com/"><img src="icon/facebook.svg" alt="facebook"></a></li>
                    </ul>
                    <div class="loginButton"><input type='submit' value="로그인"></div>
                    <div class="signUpButton"><a href="SignUP-before.html">회원가입</a></div>
                </form>
                <%
                	String msg = request.getParameter("msg");
                	if(msg!=null && msg.equals("0")){
                		out.println("<script>alert('비밀번호가 맞지 않습니다.')</script>");
                	}else if(msg!=null && msg.equals("-1")){
                		out.println("<script>alert('아이디가 존재하지 않습니다.')</script>");
                	}
                %>
            </div>
        </div>
    </section>
    <footer id="footer" class="clearFix"></footer>
</body>
</html>