<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>TheBreadEarth &#124; 비건베이커리</title>
    <link rel="shortcut icon" href="images/icon_logo_shortcut.png">
    <!-- Noto Sans -->
    <link href="https://fonts.googleapis.com/css2?family=Noto+Sans:wght@100;300;400;700&display=swap" rel="stylesheet">
    <!-- Noto Serif Korean  -->
    <link href="https://fonts.googleapis.com/css2?family=Noto+Serif+KR:wght@300;400;500;600;700&display=swap"
        rel="stylesheet">
    <!-- Noto Sans Korean -->
    <link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@300;400;500;700&display=swap"
        rel="stylesheet">
    <!-- css -->
    <link rel="stylesheet" href="css/common.css">
    <link rel="stylesheet" href="css/style_common.css">
    <link rel="stylesheet" href="css/login.css">
    <!-- js -->
    <script src="js/javascript.js"></script>
     
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
<!-- header -->
<header>
    <div class="subBg"></div>
    <div class="innerBox">
        <h1 class="logo"><a href="index.html"><img src="images/logo.png" alt="TheBreadEarth logo"></a></h1>
        <ul class="rightGnb">
            <li><a href="login.html">로그인</a></li>
            <li><a href="#">회원가입</a></li>
            <li><a href="#">주문조회</a></li>
            <li><a href="#">장바구니</a></li>
        </ul>
        <form class="leftGnb">
            <input type="search">
            <a href="#"><img src="images/icon_serch.png" alt="돋보기 아이콘"></a>
        </form>
        <nav>
            <div class="mobileNav">
                <div class="navLogo"><a href="#"><img src="images/logo.png" alt="TheBreadEarth logo"></a></div>
                <div class="xBtn"><a href="#"><img src="images/cancel.svg" alt="cancel button"></a></div>
                <div class="mloginBtn"><a href="login.html"><img src="images/loginBtn.svg" alt=""></a></div>
            </div>
            <ul id="nav">
                <li>
                    <a href="brand_story.html">브랜드 스토리</a>
                    <ul class="sub">
                        <li><a href="#">브랜드소개</a></li>
                        <li><a href="#">연혁</a></li>
                        <li><a href="#">매장소개</a></li>
                    </ul>
                </li>
                <li>
                    <a href="product_list.html">MENU</a>
                    <ul class="sub">
                        <li><a href="#">전체메뉴</a></li>
                        <li><a href="#">베스트메뉴</a></li>
                        <li><a href="#">베이커리</a></li>
                        <li><a href="#">디저트</a></li>
                        <li><a href="#">케이크</a></li>
                        <li><a href="#">쿠키</a></li>
                    </ul>
                </li>
                <li>
                    <a href="product_md_list.html">이벤트 상품</a>
                    <ul class="sub">
                        <li><a href="#">특가상품</a></li>
                        <li><a href="product_md_list.html">MD상품</a></li>
                    </ul>
                </li>
                <li>
                    <a href="#">리뷰</a>
                    <ul class="sub">
                        <li><a href="#">베스트 리뷰</a></li>
                    </ul>
                </li>
                <li>
                    <a href="#">공지사항</a>
                    <ul class="sub">
                        <li><a href="#">공지사항</a></li>
                    </ul>
                </li>
                <li>
                    <a href="#">고객센터</a>
                    <ul class="sub">
                        <li><a href="#">온라인상담</a></li>
                        <li><a href="#">제품문의</a></li>
                        <li><a href="#">QnA</a></li>
                    </ul>
                </li>
                <li class="mobileNavBanner">
                    <a href="#"><img src="images/mobile_banner.jpg" alt="모바일광고 배너"></a>
                </li>
            </ul>
        </nav>
    </div>
    <div class="hamBtn"><a href="#"><img src="images/hamBtn.svg" alt="ham button"></a></div>
</header>
<!-- #mainBanner -->
<!-- container -->
<div id="container">
    <div class="loginWrap">
        <h2 class="loginTitle">LOGIN</h2>
        <form id="loginForm"  action="pro/loginPro.jsp" method="post" name="loginInfo" onsubmit="return checkValue();">
            <div class="idBox">
                <label for="userName"></label>
                <input id="userName" type="text" name="id" placeholder=" ID를 입력해주세요">
            </div>
            <div class="pwBox">
                <label for="password"></label>
                <input id="password" type="password" name="password" placeholder=" PW를 입력해주세요">
            </div>            
            <ul>              
                <li class="saveId">
                    <a href="#">
                        <img src="images/icon_checkbox.png" alt="checkbox">
                    </a>
                    <p>아이디저장</p>                    
                </li>  
                <li><a href="#">아이디찾기 / </a></li>
                <li><a href="#">비밀번호찾기</a></li>
            </ul>
            <input class="loginBtn" type="submit" value="로그인"/>
            
              <div class="snsLogin">
                <ul>
                    <li>
                        <a href="#none" class="btnNaver" onclick="">
                            <span>네이버 로그인</span>
                        </a>
                    </li>
                    <li>
                        <a href="#none" class="btnGoogle" onclick="">
                            <span>구글 로그인</span>
                        </a>
                    </li>
                    <li>
                        <a href="#none" class="btnKakao" onclick="">
                            <span>카카오계정 로그인</span>
                        </a>
                    </li>
                </ul>
            </div>
            <p class="signLink">
                아직 회원이 아니신가요?<br>
                고객님을 위한 다양한 혜택이 준비되어 있습니다.<br>
                <a href="#" class="signBtn">회원가입</a>
            </p>
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
<!-- footer -->
<footer>
    <div class="footTop">
        <div class="innerBox">
            <ul class="util">
                <li><a href="#"><strong>개인정보처리방침</strong></a></li>
                <li><a href="#">이용약관</a></li>
                <li><a href="#">이용안내</a></li>
                <li><a href="#">이메일무단수집거부</a></li>
                <li><a href="#">법적고지</a></li>
            </ul>
        </div>
        <div class="arrowUp">
            <a href="#"><img src="images/scroll_arrow_up.png" alt="scroll-up"></a>
        </div>
    </div>
    <div class="innerBox">
        <h1 class="footLogo"><a href="#"><img src="images/foot_logo.png" alt="foot logo"></a></h1>
        <div class="footMiddle">
            <div class="addressWrap">
                <address>
                    <p><strong>사업자명 : </strong><span>(주)더브레드얼쓰</span><strong>대표이사 : </strong><span>김OO</span></p>
                    <p><strong>사업자등록번호 : </strong><span>000-00-00000</span><strong>주소 : </strong><span>서울특별시 00구 00동
                            00로 00 00타워 A동</span></p>
                    <p><strong>메일 : </strong><span>TheBreadEarth@naver.com</span></p>
                </address>
            </div>
            <div class="snsMobile">
                <ul class="snsInfo">
                    <li>
                        <a href="#">
                            <div><img src="images/icon_sns_facebook.png" alt="페이스북"></div>
                            <span>페이스북</span>
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <div><img src="images/icon_sns_youtube.png" alt="유튜브"></div>
                            <span>유튜브</span>
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <div><img src="images/icon_sns_insta.png" alt="인스타"></div>
                            <span>인스타그램</span>
                        </a>
                    </li>
                </ul>
            </div>
            <p class="copy">copyrightⓒ 2022 All rights reserved by Kim Jung Hyun</p>
        </div>
    </div>
</footer>
</body>

</html>