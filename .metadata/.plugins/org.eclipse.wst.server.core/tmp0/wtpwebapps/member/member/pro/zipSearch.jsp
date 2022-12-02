<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*, member.model.zipCodeBean" %>
<!-- java.util.*은 Vector때문에 import -->

<!-- 빈즈액션 정의 -->    
<%-- <jsp:useBean id="vlist" class="member.model.zipCodeBean"/> --%>
<jsp:useBean id="dao" class="member.model.memberDAO"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>우편번호검색</title>
</head>
<%
//파라미터로 search=n -> 회원가입화며네서 호출
//		  search=y -> 우편번호검색 화면에서 호출
	String search = request.getParameter("search");
	String area3 = null;
	//Arraylist, Vector : 객체를 저장하는 배열
	Vector<zipCodeBean> v = null;  ///v는 zipCodeBean객체

	if(search.equals("y")){ //검색버튼을 클릭해서 호출했을 경우
		area3 = request.getParameter("area3"); //입력받은 도로명을 area3저장.
		v = dao.zipcodeRead(area3); //dao는 memberDAO임.
		//zipCodeBean객체인 v로 받음.
	}
%>
<body bgcolor="#ffffcc">
	<div align="center">
		<br>
		<form name="zipFrm" method="post" action="zipSearch.jsp" onsubmit="return loadSearch()">
			<table>
				<tr>
					<td>
						<br>도로명 입력 :<input type="text" id="area3" name="area3">
									  <input type="submit" value="검색">
					</td>
				</tr>
				<!-- 이부분에 조회한 우편번호 목록을 출력한다. -->
				<%
					if(search.equals("y")){ //search에 y값이들어와야 실행.<검색>버튼을 눌렀을때
						if(v.isEmpty()){//조회한데이터(v)가 없다.
				%>
						<tr>
							<td align="center"><br>검색된 결과가 없습니다.</td>
						</tr>
				<%
						}else{
				%>
						<tr>
							<td align="center"><br>※검색 후, 아래 우편번호를 클릭하면 자동으로 입력됩니다.<br><br></td>
						</tr>
				<%
						for(int i=0; i<v.size(); i++){
							zipCodeBean bean = v.get(i); //객체 배열 데이터를 읽을때<=get()
							String rzipCode = bean.getZipcode(); //getter:데이터읽을때
							String rarea1 = bean.getArea1();
							String rarea2 = bean.getArea2();
							String rarea3 = bean.getArea3();
							String adds = rarea1 + " " + rarea3+ " " + rarea3; //한줄로뭉쳐놓은거임
				%>
							<tr>
								<td>
								<!-- 클릭이벤트가 발생하면 sendAdd()함수 실행 -자바스크립트함수임.
									=>파라미터로 rzipCode와 adds를 넘긴다. -->
									<a href="#" onclick="sendAdd('<%=rzipCode%>',<%=adds%>')">
									<%=rzipCode %><%=adds %> <!-- 표현식으로 화면에 출력 -->
									</a>
								</td>
							</tr>
				<%		
							}//end for
						}	//end else					
					}  //end if
				%>
				<tr>
					<td align="center"><br>
					<a href="#" onclick="self.close()">닫기</a>
					</td> 
				</tr>
			</table>
			<input type="hidden" name="search" value="y">	
		</form>
	</div>
	<script>
		function sendAdd(zipcode, adds){
			//opener()함수: 자식창의 데이터를 부모창으로 넘기는 함수.
			opener.document.userInfo.zipcode.value = zipcode;
			opener.document.userInfo.zipcode.value = adds;	
			
			//자신의 창을 닫는다.
			self.close();
		}
	</script>
</body>
</html>