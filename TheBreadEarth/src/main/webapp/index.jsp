<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- <script type="text/javascript" src="js/jquery-3.6.1.min.js"></script> -->
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
    <link rel="stylesheet" href="css/style.css">
    <!-- js -->
    <script type="text/javascript" src="js/jquery-3.6.1.min.js"></script>
    <script src="js/javascript.js"></script>   
    <script src="js/jquery.js"></script>
</head>
<body>
    <!-- header -->
    <header>
        <div class="subBg"></div>
        <div class="innerBox">
            <h1 class="logo"><a href="#void"><img src="images/logo.png" alt="TheBreadEarth logo"></a></h1>
            <%
               	//로그인이 안되었을 경우에는 로그인, 회원가입 버튼을 보여준다.
              	//로그인이 되었을 경우에는 로그아웃 버튼을 보여준다.
              	if(session.getAttribute("sessionID")==null){//로그인x
            %>
            <ul class="rightGnb">
                <li><a href="login.jsp">로그인</li>
              <%
                 }else{
              %>
               <ul class="rightGnb">
              	<li style="color:white;">
              	<%=session.getAttribute("sessionID") %>님이 로그인 되었습니다.
                </li>
                <li><a href="pro/logoutPro.jsp">로그아웃</a></li>
                <%
                       }
		%>
                <li><a href="#void">회원가입</a></li>
                <li><a href="#void">주문조회</a></li>
                <li><a href="#void">장바구니</a></li>
            </ul>
            
            <form class="leftGnb">
                <input type="search">
                <a href="#void"><img src="images/icon_serch.png" alt="돋보기 아이콘"></a>
            </form>
            <nav>
                <div class="mobileNav">
                    <div class="navLogo"><a href="#void"><img src="images/logo.png" alt="TheBreadEarth logo"></a></div>
                    <div class="xBtn"><a href="#void"><img src="images/cancel.svg" alt="cancel button"></a></div>
                    <div class="mloginBtn"><a href="login.html"><img src="images/loginBtn.svg" alt=""></a></div>
                </div>
                <ul id="nav">
                    <li>
                        <a href="brand_story.html">브랜드 스토리</a>
                        <ul class="sub">
                            <li><a href="#void">브랜드소개</a></li>
                            <li><a href="#void">연혁</a></li>
                            <li><a href="#void">매장소개</a></li>
                        </ul>
                    </li>
                    <li>
                        <a href="product_list.html">MENU</a>
                        <ul class="sub">
                            <li><a href="#void">전체메뉴</a></li>
                            <li><a href="#void">베스트메뉴</a></li>
                            <li><a href="#void">베이커리</a></li>
                            <li><a href="#void">디저트</a></li>
                            <li><a href="#void">케이크</a></li>
                            <li><a href="#void">쿠키</a></li>
                        </ul>
                    </li>
                    <li>
                        <a href="product_md_list.html">이벤트 상품</a>
                        <ul class="sub">
                            <li><a href="#void">특가상품</a></li>
                            <li><a href="#void">MD상품</a></li>
                        </ul>
                    </li>
                    <li>
                        <a href="#void">리뷰</a>
                        <ul class="sub">
                            <li><a href="#void">베스트 리뷰</a></li>
                        </ul>
                    </li>
                    <li>
                        <a href="#void">공지사항</a>
                        <ul class="sub">
                            <li><a href="#void">공지사항</a></li>
                        </ul>
                    </li>
                    <li>
                        <a href="#void">고객센터</a>
                        <ul class="sub">
                            <li><a href="#void">온라인상담</a></li>
                            <li><a href="#void">제품문의</a></li>
                            <li><a href="#void">QnA</a></li>
                        </ul>
                    </li>
                    <li class="mobileNavBanner">
                        <a href="#void"><img src="images/mobile_banner.jpg" alt="모바일광고 배너"></a>
                    </li>
                </ul>
            </nav>
        </div>
        <div class="hamBtn" onclick="ham()"><a href="#void"><img src="images/hamBtn.svg" alt="ham button"></a></div>
    </header>
    <!-- div#mainBanner 마우스휠이벤트 적용하려고 div#container속에 넣었음.-->
    <!-- #container -->
    <div id="container">
        <!-- #mainBanner -->
        <div id="mainBanner" class="wheelEvent">
            <ul class="banner">
                <li class="active">
                    <a href="#void">
                        <img src="images/mainbanner_1.jpg" alt="/mainbanner_1">
                        <div class="innerBox">
                            <div class="textBox">
                                <p><span>100% 식물성 재료</span>로 맛있는 빵을 만드는</p>
                                <p><span>비건베이커리</span>입니다.</p>
                                <p>건강하고 맛있는 빵은 좋은 재료에서부터 시작됩니다.</p>
                                <div class="bannerMore"><a href="#void">더보기</a></div>
                            </div>
                        </div>
                    </a>
                </li>
                <li>
                    <a href="#void">
                        <img src="images/mainbanner_2.jpg" alt="mainbanner_2">
                        <div class="innerBox">
                            <div class="textBox">
                                <p><span>200% 식물성 재료</span>로 맛있는 빵을 만드는</p>
                                <p><span>비건베이커리</span>입니다.</p>
                                <p>건강하고 맛있는 빵은 좋은 재료에서부터 시작됩니다.</p>
                                <div class="bannerMore"><a href="#void">더보기</a></div>
                            </div>
                        </div>
                    </a>
                </li>
                <li>
                    <a href="#void">
                        <img src="images/mainbanner_3.jpg" alt="mainbanner_3">
                        <div class="innerBox">
                            <div class="textBox">
                                <p><span>300% 식물성 재료</span>로 맛있는 빵을 만드는</p>
                                <p><span>비건베이커리</span>입니다.</p>
                                <p>건강하고 맛있는 빵은 좋은 재료에서부터 시작됩니다.</p>
                                <div class="bannerMore"><a href="#void">더보기</a></div>
                            </div>
                        </div>
                    </a>
                </li>
                <li>
                    <a href="#void">
                        <img src="images/mainbanner_44.jpg" alt="mainbanner_4">
                        <div class="innerBox">
                            <div class="textBox">
                                <p><span>400% 식물성 재료</span>로 맛있는 빵을 만드는</p>
                                <p><span>비건베이커리</span>입니다.</p>
                                <p>건강하고 맛있는 빵은 좋은 재료에서부터 시작됩니다.</p>
                                <div class="bannerMore"><a href="#void">더보기</a></div>
                            </div>
                        </div>
                    </a>
                </li>
            </ul>
            <div class="innerBox">
                <div class="pager">
                    <span class="active"><a href="#void">1</a></span>
                    <span><a href="#void">2</a></span>
                    <span><a href="#void">3</a></span>
                    <span><a href="#void">4</a></span>
                </div>
            </div>
            <div class="scrollDown">
                <a href="#voidcontainer">
                    <span><img src="images/scrollarrowtodown.png" alt="scrollarrowtodown3"></span>
                    <span><img src="images/scrollarrowtodown.png" alt="scrollarrowtodown2"></span>
                    <span><img src="images/scrollarrowtodown.png" alt="scrollarrowtodown1"></span>
                </a>
            </div>
        </div>
        <!-- 본문 -->
        <div class="menuWrap wheelEvent">
            <section class="menu"> 
                <!-- setInterval용 버튼 마크업 추가해서 숨겨놓기. -->
                <h2 class="menuTitle">대표 메뉴</h2>
                <div class="subTitle">
                    <p class="subT01"><a href="#void" class="on">인기랭킹</a></p>
                    <p class="subT02"><a href="#void">선물추천</a></p>
                    <p class="subT03"><a href="#void">추천상품</a></p>
                </div>
                <div class="menuListWrap innerBox">
                    <ul class="menuList">
                        <li>
                            <a href="#void">
                                <div class="menuImg">
                                    <img src="images/menu_con_img_1.png" alt="1">
                                    <div class="menuText">
                                        <p>제품이름</p>
                                        <p>7,200원</p>
                                    </div>
                                </div>
                            </a>
                        </li>
                        <li>
                            <a href="#void">
                                <div class="menuImg">
                                    <img src="images/menu_con_img_2.png" alt="2">
                                    <div class="menuText">
                                        <p>제품이름</p>
                                        <p>7,200원</p>
                                    </div>
                                </div>
                            </a>
                        </li>
                        <li>
                            <a href="#void">
                                <div class="menuImg">
                                    <img src="images/menu_con_img_3.png" alt="3">
                                    <div class="menuText">
                                        <p>제품이름</p>
                                        <p>7,200원</p>
                                    </div>
                                </div>
                            </a>
                        </li>
                        <li>
                            <a href="#void">
                                <div class="menuImg">
                                    <img src="images/menu_con_img_4.png" alt="4">
                                    <div class="menuText">
                                        <p>제품이름</p>
                                        <p>7,200원</p>
                                    </div>
                                </div>
                            </a>
                        </li>
                        <li>
                            <a href="#void">
                                <div class="menuImg">
                                    <img src="images/menu_con_img_5.png" alt="5">
                                    <div class="menuText">
                                        <p>제품이름</p>
                                        <p>7,200원</p>
                                    </div>
                                </div>
                            </a>
                        </li>   
                        <li>
                            <a href="#void">
                                <div class="menuImg">
                                    <img src="images/menu_con_img_6.png" alt="6">
                                    <div class="menuText">
                                        <p>제품이름</p>
                                        <p>7,200원</p>
                                    </div>
                                </div>
                            </a>
                        </li>      
                        <li>
                            <a href="#void">
                                <div class="menuImg">
                                    <img src="images/menu_con_img_7.png" alt="7">
                                    <div class="menuText">
                                        <p>제품이름</p>
                                        <p>7,200원</p>
                                    </div>
                                </div>
                            </a>
                        </li>      
                        <li>
                            <a href="#void">
                                <div class="menuImg">
                                    <img src="images/menu_con_img_4.png" alt="8">
                                    <div class="menuText">
                                        <p>제품이름</p>
                                        <p>7,200원</p>
                                    </div>
                                </div>
                            </a>
                        </li>                  
                    </ul>
                    <div class="menu_btn innerBox">
                        <p class="prev">이전</p>
                        <p class="next">다음</p>
                    </div>
                </section>
                <div class="menuMore"><a href="product_list.html">전체 메뉴 더보기</a></div>
        </div>
        <div class="eventWrap wheelEvent">
            <div class="innerBox">
                <section class="event">
                    <h2 class="eventTitle">EVENT<span>기획전</span></h2>
                    <ul class="eventList">
                        <li><a href="#voidvoid"><img src="images/event_banner_1.jpg" alt="event_banner_1"></a></li>
                        <li><a href="#voidvoid"><img src="images/event_banner_22.jpg" alt="event_banner_2"></a></li>
                        <li><a href="#voidvoid"><img src="images/event_banner_333.jpg" alt="event_banner_3"></a></li>
                    </ul>
                    <div class="eventMore"><a href="#void">기획전 더보기</a></div>
                </section>
            </div>
        </div>
        <div class="conWrap wheelEvent">
            <div class="innerBox">
                <section>
                    <h2 class="conTitle">건강하고 맛있는 빵</h2>
                    <p>건강하고 맛있는 빵은 좋은 재료에서부터 시작됩니다.</p>
                    <ul class="conImg">
                        <li>
                            <div>
                                <div class="conImgBg"><img src="images/con_img_1.jpg" alt="/con_img_1"></div>
                                <div class="conImgText">
                                    <p>100% 식물성 재료</p>
                                </div>
                                <p class="ment">
                                    곡물가루, 코코넛 슈가 등을 활용한 식물성 재료
                                </p>
                            </div>
                        </li>
                        <li>
                            <div>
                                <div class="conImgBg"><img src="images/con_img_2.jpg" alt="con_img_2"></div>
                                <div class="conImgText">
                                    <p>No계란</p>
                                    <p>No버터</p>
                                    <p>No우유</p>
                                </div>
                                <p class="ment">버터, 설탕, 우유, 계란, 제빵개량제, 활성글루텐 No! 첨가물이 없는 빵</p>
                            </div>
                        </li>
                        <li>
                            <div>
                                <div class="conImgBg"><img src="images/con_img_3.jpg" alt="con_img_3"></div>
                                <div class="conImgText">
                                    <p>천연발효종</p>
                                </div>
                                <p class="ment">‘자연재배’ 방법으로 직접키운 우리통밀로 만든 ‘비건 빵’</p>
                            </div>
                        </li>
                    </ul>
                </section>
            </div>
        </div>
        <div class="infoWrap wheelEvent">
            <div class="innerBox">
                <section>
                    <div class="customer">
                        <h2 class="infoTitle">CUSTOMER CENTER</h2>
                        <div class="infoText">
                            <p class="num">010-000-0000</p>
                            <div>
                                <p>-업무시간 : 9:00 ~ 18:00 (점심시간 13:00 ~ 14:00)</p>
                                <p>-토요일, 일요일, 공휴일 휴무</p>
                                <p>-영업시간 이외에는 문의게시판 을 이용해 주시면<br>
                                    담당자 확인 후 빠른 답변 드리겠습니다.</p>
                            </div>
                        </div>
                    </div>
                    <div class="bank">
                        <h2 class="infoTitle">BANK INFO</h2>
                        <div class="infoText">
                            <p class="num">0000-000-000000 <span>우리은행</span></p>
                            <p>예금주:(주)더브레드얼쓰</p>
                        </div>
                        <ul class="snsInfo">
                            <li>
                                <a href="#void">
                                    <div><img src="images/icon_sns_facebook.png" alt="페이스북"></div>
                                    <span>페이스북</span>
                                </a>
                            </li>
                            <li>
                                <a href="#void">
                                    <div><img src="images/icon_sns_youtube.png" alt="유튜브"></div>
                                    <span>유튜브</span>
                                </a>
                            </li>
                            <li>
                                <a href="#void">
                                    <div><img src="images/icon_sns_insta.png" alt="인스타"></div>
                                    <span>인스타그램</span>
                                </a>
                            </li>
                        </ul>
                    </div>
                    <div class="delivery">
                        <h2 class="infoTitle">DELIVERY</h2>
                        <div class="infoText">
                            <p class="num">CJ대한통운</p>
                            <div>
                                <p>-택배마감시간 : 15시 (입금완료기준)</p>
                                <p>-배송준비중으로 변경시,</p>
                                <p> 냉동식품 취소/환불/교환 불가</p>
                            </div>
                        </div>
                        <div class="deliveryBtn"><a href="#void">배송조회하기</a></div>
                    </div>
                </section>
            </div>
        </div>
        <div class="phonNum">
            <div class="phonIcon"><img src="images/icon-phon.png" alt="icon-phon"></div>
            <h2>CUSTOMER CENTER</h2>
            <p>02-000-0000</p>
        </div>
    </div>
    <!-- footer -->
    <footer>
        <div class="footTop">
            <div class="innerBox">
                <ul class="util">
                    <li><a href="#void"><strong>개인정보처리방침</strong></a></li>
                    <li><a href="#void">이용약관</a></li>
                    <li><a href="#void">이용안내</a></li>
                    <li><a href="#void">이메일무단수집거부</a></li>
                    <li><a href="#void">법적고지</a></li>
                </ul>
            </div>
            <div class="arrowUp">
                <a herf="#void"><img src="images/scroll_arrow_up.png" alt="scroll-top"></a>
            </div>
        </div>
        <div class="innerBox">
            <h1 class="footLogo"><a href="#void"><img src="images/foot_logo.png" alt="foot logo"></a></h1>
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
                            <a href="#void">
                                <div><img src="images/icon_sns_facebook.png" alt="페이스북"></div>
                                <span>페이스북</span>
                            </a>
                        </li>
                        <li>
                            <a href="#void">
                                <div><img src="images/icon_sns_youtube.png" alt="유튜브"></div>
                                <span>유튜브</span>
                            </a>
                        </li>
                        <li>
                            <a href="#void">
                                <div><img src="images/icon_sns_insta.png" alt="인스타"></div>
                                <span>인스타그램</span>
                            </a>
                        </li>
                </div>
                <p class="copy">copyrightⓒ 2022 All rights reserved by Kim Jung Hyun</p>
            </div>
        </div>
    </footer>

</body>

</html>
