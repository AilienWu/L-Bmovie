package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class output_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>L-Bmovie</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div style=\"opacity:0.5;position:absolute;left:50px;width:300px;height:150px;background-color:#40B3DF\"></div>\n");
      out.write("\n");
      out.write("    <div style=\"font-family:verdana;padding:20px;border-radius:10px;border:10px solid #EE872A;\">\n");
      out.write("\n");
      out.write("    <div style=\"opacity:0.3;position:absolute;left:120px;width:100px;height:200px;background-color:#8AC007\"></div>\n");
      out.write("\n");
      out.write("    <h1>Welcome to L-Bmovie!</h1>\n");
      out.write("\n");
      out.write("    <div style=\"letter-spacing:12px;\">Search your movie Text</div>\n");
      out.write("    \n");
      out.write("    <div style=\"color:#40B3DF;\">nation\n");
      out.write("    <span style=\"background-color:#B4009E;color:#ffffff;\">Foreign</span><br>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div style=\"color:#000000;\">and more...</div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <form id=\"bdfm\" target=\"_blank\" name=\"bdfm\" method=\"get\" action=\"http://www.baidu.com/s\">\n");
      out.write("    <table>\n");
      out.write("       <tr>\n");
      out.write("            <td>\n");
      out.write("                 <a href=\"http://www.baidu.com\">                         \n");
      out.write("                 </a>\n");
      out.write("            </td>\n");
      out.write("            <td><br/><input type=\"text\" id=\"search1\" name=\"word\"/></td><br>\n");
      out.write("            \n");
      out.write("         </tr>\n");
      out.write("    </table>\n");
      out.write("</form><br><br>\n");
      out.write("<div class=\"mian\"><a href=\"http://www.iqiyi.com/\" target=\"_blank\"><span style=\"background-color:#00ffff;color:#ffffff;\">爱奇艺搜索</span></a><br>\n");
      out.write("        <a href=\"http://www.iqiyi.com/\" target=\"_blank\"><span style=\"background-color:#00ffff;color:#ffffff;\">逗比羊搜索</span></a><br>\n");
      out.write("        <a href=\"http://www.iqiyi.com/\" target=\"_blank\"><span style=\"background-color:#00ffff;color:#ffffff;\">盘多多搜索</span></a><br></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
