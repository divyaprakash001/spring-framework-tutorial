/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.76
 * Generated at: 2023-10-30 06:13:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class maintainance_005fpage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
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

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
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

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>home</title>\r\n");
      out.write("<link\r\n");
      out.write("	href=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css\"\r\n");
      out.write("	rel=\"stylesheet\" id=\"bootstrap-css\">\r\n");
      out.write("<script\r\n");
      out.write("	src=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>\r\n");
      out.write("<!------ Include the above in your HEAD tag ---------->\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("@import url(http://fonts.googleapis.com/css?family=Roboto);\r\n");
      out.write("\r\n");
      out.write("* {\r\n");
      out.write("	font-family: 'Roboto', sans-serif;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("body {\r\n");
      out.write("	background-image:\r\n");
      out.write("		url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABoAAAAaCAYAAACpSkzOAAAABHNCSVQICAgIfAhkiAAAAAlwSFlzAAALEgAACxIB0t1+/AAAABZ0RVh0Q3JlYXRpb24gVGltZQAxMC8yOS8xMiKqq3kAAAAcdEVYdFNvZnR3YXJlAEFkb2JlIEZpcmV3b3JrcyBDUzVxteM2AAABHklEQVRIib2Vyw6EIAxFW5idr///Qx9sfG3pLEyJ3tAwi5EmBqRo7vHawiEEERHS6x7MTMxMVv6+z3tPMUYSkfTM/R0fEaG2bbMv+Gc4nZzn+dN4HAcREa3r+hi3bcuu68jLskhVIlW073tWaYlQ9+F9IpqmSfq+fwskhdO/AwmUTJXrOuaRQNeRkOd5lq7rXmS5InmERKoER/QMvUAPlZDHcZRhGN4CSeGY+aHMqgcks5RrHv/eeh455x5KrMq2yHQdibDO6ncG/KZWL7M8xDyS1/MIO0NJqdULLS81X6/X6aR0nqBSJcPeZnlZrzN477NKURn2Nus8sjzmEII0TfMiyxUuxphVWjpJkbx0btUnshRihVv70Bv8ItXq6Asoi/ZiCbU6YgAAAABJRU5ErkJggg==);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".error-template {\r\n");
      out.write("	padding: 40px 15px;\r\n");
      out.write("	text-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".error-actions {\r\n");
      out.write("	margin-top: 15px;\r\n");
      out.write("	margin-bottom: 15px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".error-actions .btn {\r\n");
      out.write("	margin-right: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".message-box h1 {\r\n");
      out.write("	color: #252932;\r\n");
      out.write("	font-size: 98px;\r\n");
      out.write("	font-weight: 700;\r\n");
      out.write("	line-height: 98px;\r\n");
      out.write("	text-shadow: rgba(61, 61, 61, 0.3) 1px 1px, rgba(61, 61, 61, 0.2) 2px\r\n");
      out.write("		2px, rgba(61, 61, 61, 0.3) 3px 3px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("		<div class=\"row\">\r\n");
      out.write("			<div class=\"col-md-6\">\r\n");
      out.write("				<div class=\"error-template\">\r\n");
      out.write("					<h1>:) Oops!</h1>\r\n");
      out.write("					<h2>Temporarily down for maintenance</h2>\r\n");
      out.write("					<h1>Weâll be back soon!</h1>\r\n");
      out.write("					<div>\r\n");
      out.write("						<p>Sorry for the inconvenience but weâre performing some\r\n");
      out.write("							maintenance at the moment. weâll be back online shortly!</p>\r\n");
      out.write("						<p>â The Team</p>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"error-actions\">\r\n");
      out.write("						<a href=\"#\" style=\"margin-top: 10px;\" class=\"btn btn-info btn-lg\"><span\r\n");
      out.write("							class=\"glyphicon glyphicon-home\"> </span>Take Me Home </a>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"col-md-6\">\r\n");
      out.write("				<svg class=\"svg-box\" width=\"380px\" height=\"500px\"\r\n");
      out.write("					viewbox=\"0 0 837 1045\" version=\"1.1\"\r\n");
      out.write("					xmlns=\"http://www.w3.org/2000/svg\"\r\n");
      out.write("					xmlns:xlink=\"http://www.w3.org/1999/xlink\"\r\n");
      out.write("					xmlns:sketch=\"http://www.bohemiancoding.com/sketch/ns\">\r\n");
      out.write("                    <g id=\"Page-1\" stroke=\"none\" stroke-width=\"1\"\r\n");
      out.write("						fill=\"none\" fill-rule=\"evenodd\" sketch:type=\"MSPage\">\r\n");
      out.write("                        <path\r\n");
      out.write("						d=\"M353,9 L626.664028,170 L626.664028,487 L353,642 L79.3359724,487 L79.3359724,170 L353,9 Z\"\r\n");
      out.write("						id=\"Polygon-1\" stroke=\"#3bafda\" stroke-width=\"6\"\r\n");
      out.write("						sketch:type=\"MSShapeGroup\"></path>\r\n");
      out.write("                        <path\r\n");
      out.write("						d=\"M78.5,529 L147,569.186414 L147,648.311216 L78.5,687 L10,648.311216 L10,569.186414 L78.5,529 Z\"\r\n");
      out.write("						id=\"Polygon-2\" stroke=\"#7266ba\" stroke-width=\"6\"\r\n");
      out.write("						sketch:type=\"MSShapeGroup\"></path>\r\n");
      out.write("                        <path\r\n");
      out.write("						d=\"M773,186 L827,217.538705 L827,279.636651 L773,310 L719,279.636651 L719,217.538705 L773,186 Z\"\r\n");
      out.write("						id=\"Polygon-3\" stroke=\"#f76397\" stroke-width=\"6\"\r\n");
      out.write("						sketch:type=\"MSShapeGroup\"></path>\r\n");
      out.write("                        <path\r\n");
      out.write("						d=\"M639,529 L773,607.846761 L773,763.091627 L639,839 L505,763.091627 L505,607.846761 L639,529 Z\"\r\n");
      out.write("						id=\"Polygon-4\" stroke=\"#00b19d\" stroke-width=\"6\"\r\n");
      out.write("						sketch:type=\"MSShapeGroup\"></path>\r\n");
      out.write("                        <path\r\n");
      out.write("						d=\"M281,801 L383,861.025276 L383,979.21169 L281,1037 L179,979.21169 L179,861.025276 L281,801 Z\"\r\n");
      out.write("						id=\"Polygon-5\" stroke=\"#ffaa00\" stroke-width=\"6\"\r\n");
      out.write("						sketch:type=\"MSShapeGroup\"></path>\r\n");
      out.write("                    </g>\r\n");
      out.write("                </svg>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
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
