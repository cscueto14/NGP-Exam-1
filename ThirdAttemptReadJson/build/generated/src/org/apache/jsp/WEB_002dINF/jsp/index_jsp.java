package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.json.JSONObject;
import org.json.JSONArray;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.net.URL;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <script language = \"JavaScript\" type = \"text/javascript\"></script>\r\n");
      out.write("        <script src=\"http://code.jquery.com/jquery-latest.min.js\"></script>\r\n");
      out.write("        <title>UACS Table</title>\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    <body> \r\n");
      out.write("         \r\n");
      out.write("        <script> \r\n");
      out.write("            importPackage(ReadJsonUrl);\r\n");
      out.write("            function createTable(){ \r\n");
      out.write("                \r\n");
      out.write("                var body = document.getElementsByTagName(\"body\")[0];\r\n");
      out.write("                \r\n");
      out.write("                var tbl = document.createElement(\"table\");\r\n");
      out.write("                var tblBody = document.createElement(\"tbody\");\r\n");
      out.write("                \r\n");
      out.write("                for(var i = 1; i <= myresponse.length; i++){ \r\n");
      out.write("                    \r\n");
      out.write("                    for (var j = 1; j <= 2; j++) {\r\n");
      out.write("                        \r\n");
      out.write("                        var cell = document.createElement(\"td\");    \r\n");
      out.write("                  var cellText = document.createTextNode(\"cell is row \"+i+\", column \"+j); \r\n");
      out.write("\r\n");
      out.write("                    \r\n");
      out.write("                    ");

                    
                         JSONObject jsonObject = myresponse.getJSONObject(i);
                            
                         String uacs = jsonObject.getString("uacs"); 
                         String department = jsonObject.getString("department");
                         String agency = jsonObject.getString("agency"); 
                        
                    
      out.write("\r\n");
      out.write("                    \r\n");
      out.write("                    cell.appendChild(cellText);\r\n");
      out.write("                    row.appendChild(cell);\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            \r\n");
      out.write("                    tblBody.appendChild(row);\r\n");
      out.write("            }\r\n");
      out.write("                    \r\n");
      out.write("                    tbl.appendChild(tblBody);\r\n");
      out.write("        \r\n");
      out.write("                    body.appendChild(tbl);\r\n");
      out.write("        \r\n");
      out.write("                    tbl.setAttribute(\"border\", \"2\");\r\n");
      out.write("                }\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        \r\n");
      out.write("        </script>\r\n");
      out.write("        \r\n");
      out.write("    </body>   \r\n");
      out.write("    \r\n");
      out.write("</html>\r\n");
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
