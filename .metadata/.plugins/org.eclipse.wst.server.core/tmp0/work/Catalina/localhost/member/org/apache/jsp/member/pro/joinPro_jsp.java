/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.0.26
 * Generated at: 2022-11-22 05:17:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.member.pro;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class joinPro_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    \r\n");
      out.write("<!-- 빈즈액션 사용 정의 -->\r\n");
      member.model.memberBean memberbean = null;
      memberbean = (member.model.memberBean) _jspx_page_context.getAttribute("memberbean", jakarta.servlet.jsp.PageContext.PAGE_SCOPE);
      if (memberbean == null){
        memberbean = new member.model.memberBean();
        _jspx_page_context.setAttribute("memberbean", memberbean, jakarta.servlet.jsp.PageContext.PAGE_SCOPE);
      }
      out.write('\r');
      out.write('\n');
      member.model.memberDAO memberdao = null;
      memberdao = (member.model.memberDAO) _jspx_page_context.getAttribute("memberdao", jakarta.servlet.jsp.PageContext.PAGE_SCOPE);
      if (memberdao == null){
        memberdao = new member.model.memberDAO();
        _jspx_page_context.setAttribute("memberdao", memberdao, jakarta.servlet.jsp.PageContext.PAGE_SCOPE);
      }
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- jsp:useBean에서 id=\"memberbean\"으로 정의 했기 때문에 name을 memberbean --> \r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("memberbean"), request);
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>회원가입처리JSP</title>\r\n");
      out.write("<link href=\"../css/style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<!-- joinForm에 입력한 데이터를 파라미터로 받아서 화면에 내역을 보여준다  -->\r\n");
      out.write("	");
	
		//회원 테이블에 데이터 insert작업
		//자바 객체의 insert하는 메소드를 호출하고 화면을 결과만 출력.		
		memberdao.insertMember(memberbean);
	
		//내장객체getParameter()를 이용해서 파라미터 값을 얻어올 수 있다.		
		//String id = request.getParameter("id");
		//String password = request.getParameter("password");
		//String name = request.getParameter("name");
		
		//성별 :gender라는 동일한 이름이 두개이므로 배열로 받아서 처리.
		//getParameterValues()
		//String[] gender = request.getParameterValues("gender");
		
		//String birthyy = request.getParameter("birthyy");
		//String birthmm = request.getParameter("birthmm");
		//String birthdd = request.getParameter("birthdd");		
		
		//String email1 = request.getParameter("email1");
		//String email2 = request.getParameter("email2");
		
		//String phone = request.getParameter("phone");
		//String address = request.getParameter("address");		
	
      out.write("\r\n");
      out.write("	<!-- 아이디가 memberbean인 memberBean에 다 저장되어있음. -->\r\n");
      out.write("	<div id=\"wrap\">\r\n");
      out.write("		<br><br>\r\n");
      out.write("		<b><font size=\"6\" color=\"gray\">회원가입 정보를 확인하세요.</font></b>\r\n");
      out.write("		<br><br><br>\r\n");
      out.write("		<font color=\"blue\">");
      out.print(memberbean.getName() );
      out.write("</font>님 가입을 축하드립니다.\r\n");
      out.write("		<br><br>\r\n");
      out.write("			<table>\r\n");
      out.write("				<tr>\r\n");
      out.write("					<td id=\"title\">아이디</td>\r\n");
      out.write("					<td>");
      out.print(memberbean.getId() );
      out.write("</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("				<tr>\r\n");
      out.write("					<td id=\"title\">비밀번호</td>\r\n");
      out.write("					<td>");
      out.print(memberbean.getPassword() );
      out.write("</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("				\r\n");
      out.write("				<tr>\r\n");
      out.write("					<td id=\"title\">이름</td>\r\n");
      out.write("					<td>");
      out.print(memberbean.getName() );
      out.write("</td> \r\n");
      out.write("				</tr>\r\n");
      out.write("				<tr>\r\n");
      out.write("					<td id=\"title\">성별</td>\r\n");
      out.write("					<td>\r\n");
      out.write("						<!-- 코딩을해야하므로 스크립트릿 안에 -->\r\n");
      out.write("						");
      out.write("\r\n");
      out.write("						");
      out.print(memberbean.getGender() );
      out.write("\r\n");
      out.write("					</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("				<tr>\r\n");
      out.write("					<td id=\"title\">생일</td>\r\n");
      out.write("					<td>\r\n");
      out.write("						");
      out.print(memberbean.getBirthyy() );
      out.write("년 \r\n");
      out.write("						");
      out.print(memberbean.getBirthmm() );
      out.write("월 \r\n");
      out.write("						");
      out.print(memberbean.getBirthdd() );
      out.write("일\r\n");
      out.write("					</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("				<tr>\r\n");
      out.write("					<td id=\"title\">이메일</td>\r\n");
      out.write("					<td>\r\n");
      out.write("						");
      out.print(memberbean.getEmail1() );
      out.write('@');
      out.print(memberbean.getEmail2() );
      out.write("\r\n");
      out.write("					</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("				<tr>\r\n");
      out.write("					<td id=\"title\">휴대전화</td>\r\n");
      out.write("					<td>");
      out.print(memberbean.getPhone() );
      out.write("</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("				<tr>\r\n");
      out.write("					<td id=\"title\">주소</td>\r\n");
      out.write("					<td>");
      out.print(memberbean.getAddress() );
      out.write("</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("			</table>\r\n");
      out.write("			<br>\r\n");
      out.write("			<input type=\"submit\" value=\"확인\" action=\"loginPro.jsp\">		\r\n");
      out.write("	</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
