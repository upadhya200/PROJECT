/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.22
 * Generated at: 2019-12-27 15:45:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class college_0020library_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <div style=\"border: 1px solid black;font-style:italic;background-color: yellow\">\r\n");
      out.write("    <img src=\"C:\\Users\\Lenovo\\eclipse-workspace\\PROJECT\\WebContent\\vid img.png\" style= \"width: 190px\" \"height:182px\" \"float: left;\"> \r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <script src=\"https://kit.fontawesome.com/a076d05399.js\"></script>\r\n");
      out.write("     <center><i class=\"fas fa-home\"style=\"font-size:20px;color:black;\"></i>\r\n");
      out.write("      <font size=\"5\" margin=\"2px\">VIDYARTHI UNIVERSITY</font>\r\n");
      out.write("      <br>\r\n");
      out.write("      <br>\r\n");
      out.write("     <center><font size=\"4\">\"Education is the most powerful weapon which you can use to change the world.\"</font></center>\r\n");
      out.write("     <br>\r\n");
      out.write("    <u><center><font size=\"4\">College Library</font></center></u>\r\n");
      out.write("    <br>\r\n");
      out.write("      </center>\r\n");
      out.write("  </div>\r\n");
      out.write("</head>\r\n");
      out.write("<head>\r\n");
      out.write("<style>\r\n");
      out.write("* {\r\n");
      out.write("  box-sizing: border-box;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("body {\r\n");
      out.write("  font-family: arial;\r\n");
      out.write("  font-size:16px;\r\n");
      out.write("}\r\n");
      out.write(".container {\r\n");
      out.write("  position: relative;\r\n");
      out.write("  width: 100%\r\n");
      out.write("  margin: 0 auto;\r\n");
      out.write("}\r\n");
      out.write(".container img {vertical-align: middle;}\r\n");
      out.write("\r\n");
      out.write(".container .content {\r\n");
      out.write("  position: absolute;\r\n");
      out.write("  top: 0;\r\n");
      out.write("  background: rgba(0, 0, 0,0.3); /* Fallback color */\r\n");
      out.write("  /*background: rgba(0, 0, 0, 0.5);  Black background with 0.5 opacity */\r\n");
      out.write("  color: white;\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  padding:0px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("  <img src=\"C:\\Users\\Lenovo\\eclipse-workspace\\PROJECT\\WebContent\\p12.jfif\" alt=\"About us\" style=\"width:100%\" \"height: 100%\">\r\n");
      out.write("  <div class=\"content\">\r\n");
      out.write("  <h1>\r\n");
      out.write("<center>\r\n");
      out.write("  <font color=\"#ded830\">\r\n");
      out.write("  <style>\r\n");
      out.write("img {\r\n");
      out.write("  float: left;\r\n");
      out.write("}\r\n");
      out.write("</style> \r\n");
      out.write("  \r\n");
      out.write("  </font>\r\n");
      out.write("</center>\r\n");
      out.write("</h1>\r\n");
      out.write("<body>\r\n");
      out.write("  The Vidyarthi University was established in 1998.Later the library was named as \"Vivekananda Library\".As per rules laid down in the statutes of the university the Library Committee was constituted to deal with general administration of the library and frame relevant rules subject to approval of the authorities of the university. However, the day-to-day administration and management of the library is to be looked after by the Chief Librarian under the overall supervision\r\n");
      out.write("  of Professor-in-Charge as stipulated by the Academic Council.\r\n");
      out.write("  <br>*Professor-in-charge of Parija Library:-Prof.(Mrs.) Puspanjali Jena.\r\n");
      out.write(" <br><u> A. Other Staff of Parija Library</u>\r\n");
      out.write("<br>Assistant Librarians - Smt. Indira Panda\r\n");
      out.write("<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;- Smt. Pranati Garnaik\r\n");
      out.write("<br><u>Supporting Staff</u> - 23 others\r\n");
      out.write("<br><u>B. Administration</u>-\r\n");
      out.write("<br>The Library has following sections.\r\n");
      out.write("<br>1. Acquisition Section\r\n");
      out.write("<br>2. Technical Section\r\n");
      out.write("<br>3. Periodical Section:\r\n");
      out.write("<br><u>(a) Current Periodicals -</u><br> (8 A.M. to 9.30 P.M.)\r\n");
      out.write("<br><u>(b) Back Volumes -</u><br>  (10.00 A.M. to 5 P.M. with Lunch Hour 1.30 P.M. to 2 P.M.)\r\n");
      out.write("<br><u>4. Circulation Section:</u><br> (10.00 A.M. to 5 P.M. with Lunch Hour 1.30 P.M. to 2 P.M.)\r\n");
      out.write("<br><u>5. Reference Section:</u><br> (10.00 A.M. to 5 P.M. with Lunch Hour 1.30 P.M. to 2 P.M.)\r\n");
      out.write("<br>(Functions on all days of the year except Sundays and holidays)\r\n");
      out.write("<br>6. Documentation Section\r\n");
      out.write("<br>7. Administrative Section\r\n");
      out.write("<br>8. Manuscript Section\r\n");
      out.write("<br>9. Text Book Section (Function from 8 A.M. to 9.30 P.M.) on all days of week and from 10 A.M. to\r\n");
      out.write("4.30 P.M. on Holidays)\r\n");
      out.write("<br>10. General Reading Room\r\n");
      out.write("<br>11. E-Resources ( 8 A.M. to 9.30 P.M.)\r\n");
      out.write("<br>12. Visually Challenged Reading Room\r\n");
      out.write("<br>13. Research Scholar Room\r\n");
      out.write("<br><u>C. Facilities</u>-\r\n");
      out.write("<br>*The Library is housed in its own building inside the campus.<br>* The Library also serves all types of\r\n");
      out.write("readers.<br>* They can borrow books/journals and get photocopies of non-loanable articles and journals\r\n");
      out.write("from national and other libraries on Inter-Library loan basis.<br>\r\n");
      out.write("*It has a private photo copying machine.<br>* It functions on every working day from 1P.M. to 4 P.M. The\r\n");
      out.write("charge of each photocopy is Re.0.50p.<br>* Steps have been taken for computerization of the library.\r\n");
      out.write("<br>* Vivekananda Library Fund has been created by the Syndicate on 18-05-98 in accordance with Rules\r\n");
      out.write("framed by the Academic Council under Section 10(3) (m) of the University Act, 1989 and Statute\r\n");
      out.write("21 (5) of the Orissa University First Statutes, 1990.<br>* The Library Development Fee collected from\r\n");
      out.write("each student at the time of admission is to be deposited in this fund.\r\n");
      out.write("<br>* The possible sources of receipt of âVivekananda Library Development Fundâ are as follows:\r\n");
      out.write("<br>a) Library Development fees of Rs.100/- from each regular student collected at the time of\r\n");
      out.write("admission.\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("  <img src=\"C:\\Users\\SCS 3\\Downloads\\p12.jfif\" alt=\"About us\" style=\"width:100%\" \"height: 100%\">\r\n");
      out.write("  <div class=\"content\">\r\n");
      out.write("<br>b) For students of Sponsored Courses the library development fee is\r\n");
      out.write("<br>i.) Rs.100/- for 1 year course\r\n");
      out.write("<br>ii) Rs.500/- for 2/3 years programme\r\n");
      out.write("<br>iii) Rs.750/- for 5 years programme\r\n");
      out.write("<br>c) Overdue charges collected from borrowers.\r\n");
      out.write("<br>d) Donations (if any).\r\n");
      out.write("<br>e) Consultation card fees of Rs.750/- for Utkal University Research Scholar and Rs.1000/- from\r\n");
      out.write("other Universities students.\r\n");
      out.write("<br><u>E. Working Hours</u><br>\r\n");
      out.write("*The library remains open from 8 A.M. to 9.30 P.M. on all working days, except second Saturdays\r\n");
      out.write("and Sundays.<br>* On all Saturdays, Sundays and other holidays (excluding three national holidays, On\r\n");
      out.write("all Saturdays, Sundays the library kept opened from 10 A.M. to 5 P.M.\r\n");
      out.write("<br><u>F. Rules for use of the Library</u>\r\n");
      out.write("<br>1. (a) Books may be taken out on loan by :\r\n");
      out.write("<br>i) Teachers, students, officers and other employees of the university and members of authorities\r\n");
      out.write("of the university.\r\n");
      out.write("<br>ii) Any member of the public on the recommendation of the Vice-Chancellor with a guarantor from\r\n");
      out.write("among the confirmed employees of the University and on deposit, of Rs.500/- as nonrefundable caution money. But books can not be issued to his/her favour.\r\n");
      out.write("<br>iii) Other universities, learned societies, and public libraries on term of reciprocity and with the\r\n");
      out.write("approval of the Library Committee.\r\n");
      out.write("<br>b) Research scholars may be allowed on payment of a non- refundable caution money of Rs.500/-(annually),to refer to books/journals in Library but they cannot be issued books/journals.\r\n");
      out.write("</body>\r\n");
      out.write("<body>\r\n");
      out.write("<table border=\"1\" align=\"center\" cellpadding=\"3\" width=\"100%\">  \r\n");
      out.write("<tr><td colspan=\"3\" bgcolor=\"#ffcdd2\"><em><center><h4>Physics</h4></center></em></td></tr>\r\n");
      out.write("<tr><td bgcolor=\"red\">Paper Name</td><td bgcolor=\"red\">Book Name</td><td bgcolor=\"red\">Author Name</td></tr>\r\n");
      out.write("<tr><td>MATHEMATICAL PHYSICS-I</td><td>Mathematical Methods for Physicists</td><td>G.B.Arfken,H.J. Weber,F.E. Harris,2013,7/e.Elsevier.</td></tr>\r\n");
      out.write("<tr><td>MATHEMATICAL PHYSICS-I</td><td>An introduction to ordinary differential equations</td><td> E.A. Coddington, 2009, PHI learning</td></tr>\r\n");
      out.write("<tr><td>MECHANICS</td><td>An introduction to mechanics</td><td>D. Kleppner, R.J. Kolenkow, 1973, McGraw-Hill.</td></tr>\r\n");
      out.write("<tr><td>ELECTRICITY AND MAGNETISM</td><td>Electricity, Magnetism & Electromagnetic Theory</td><td>S. Mahajan and Choudhury, 2012, Tata McGraw</td></tr>\r\n");
      out.write("<tr><td>WAVES AND OPTICS</td><td>Fundamentals of Optics</td><td>F.A. Jenkins and H.E. White, 1981, McGraw-Hill</td></tr>\r\n");
      out.write("<tr><td>MATHEMATICAL PHYSICSâII</td><td>Mathematical Methods for Physicists</td><td>Arfken, Weber, 2005, Harris, Elsevier</td></tr>\r\n");
      out.write("<tr><td>MATHEMATICAL PHYSICSâII</td><td>Mathematical Physics</td><td>C. Harper, (Prentice Hall India) 2006.</td></tr>\r\n");
      out.write("<tr><td>THERMAL PHYSICS</td><td>Heat and Thermodynamics</td><td>M.W. Zemansky, Richard Dittman, 1981, McGraw-Hill</td></tr>\r\n");
      out.write("<tr><td>THERMAL PHYSICS</td><td>Thermal Physics</td><td>C. Kittel and H. Kroemer (McMillan Education India) 2010</td></tr>\r\n");
      out.write("<tr><td>DIGITAL SYSTEMS AND APPLICATIONS</td><td>Digital Principles and Applications</td><td>A.P. Malvino, D. P. Leach and Saha, 7th Ed., 2011,Tata McGraw</td></tr>\r\n");
      out.write("<tr><td>MATHEMATICAL PHYSICSâIII</td><td>Mathematical Physics</td><td>C. Harper, (Prentice Hall India) 2006</td></tr>\r\n");
      out.write("<tr><td>MATHEMATICAL PHYSICSâIII</td><td>Mathematical Methods for Physicists</td><td>Arfken, Weber, 2005, Harris, Elsevier</td></tr>\r\n");
      out.write("<tr><td>ELEMENTS OF MODERN PHYSICS</td><td>Concepts of Modern Physics</td><td>Arthur Beiser, 2002, McGraw-Hill</td></tr>\r\n");
      out.write("<tr><td>ANALOG SYSTEMS AND APPLICATIONS</td><td>Integrated Electronics</td><td>J. Millman and C. C. Halkias, 1991, Tata Mc-Graw Hill</td></tr>\r\n");
      out.write("<tr><td>QUANTUM MECHANICS AND APPLICATIONS</td><td>A Text book of Quantum Mechanics</td><td>P. M.Mathews and K.Venkatesan, 2nd Ed., 2010,\r\n");
      out.write("McGraw Hill</td></tr>\r\n");
      out.write("<tr><td>SOLID STATE PHYSICS</td><td>Introduction to Solid State Physics</td><td>Charles Kittel, 8th Edition, 2004, Wiley India Pvt. Ltd</td></tr>\r\n");
      out.write("</table>\r\n");
      out.write("</body>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("  <img src=\"C:\\Users\\SCS 3\\Downloads\\p12.jfif\" alt=\"About us\" style=\"width:100%\" \"height: 100%\">\r\n");
      out.write("  <div class=\"content\">\r\n");
      out.write("<body>\r\n");
      out.write("<table border=\"1\" align=\"center\" cellpadding=\"3\" width=\"100%\">\r\n");
      out.write("<tr><td colspan=\"3\" bgcolor=\"#ffcdd2\"><em><center><h4>Chemistry</h4></center></em></td></tr>\r\n");
      out.write("<tr><td bgcolor=\"red\">Paper Name</td><td bgcolor=\"red\">Book Name</td><td bgcolor=\"red\">Author Name</td></tr>\r\n");
      out.write("<tr><td>INORGANIC CHEMISTRY-I</td><td>Physical Chemistry</td><td>Atkins,P.W.& Paula,Oxford press</td></tr>\r\n");
      out.write("<tr><td>PHYSICAL CHEMISTRY-I</td><td>Physical Chemistry</td><td>Ball,D.W Themson</td></tr>\r\n");
      out.write("<tr><td>ORGANIC CHEMISTRY-I</td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("</table>\r\n");
      out.write("</body>\r\n");
      out.write("<body>\r\n");
      out.write("<table border=\"1\" align=\"center\" cellpadding=\"3\" width=\"100%\">\r\n");
      out.write("<tr><td colspan=\"3\" bgcolor=\"#ffcdd2\"><em><center><h4>Mathematics</h4></center></em></td></tr>\r\n");
      out.write("<tr><td bgcolor=\"red\">Paper Name</td><td bgcolor=\"red\">Book Name</td><td bgcolor=\"red\">Author Name</td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("</table>\r\n");
      out.write("</body>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("  <img src=\"C:\\Users\\SCS 3\\Downloads\\p12.jfif\" alt=\"About us\" style=\"width:100%\" \"height: 100%\">\r\n");
      out.write("  <div class=\"content\">\r\n");
      out.write("<body>\r\n");
      out.write("<body>\r\n");
      out.write("<table border=\"1\" align=\"center\" cellpadding=\"3\">\r\n");
      out.write("<tr><td colspan=\"3\" bgcolor=\"#ffcdd2\"><em><center><h4>Computer Science</h4></center></em></td></tr>\r\n");
      out.write("<tr><td bgcolor=\"red\">Paper Name</td><td bgcolor=\"red\">Book Name</td><td bgcolor=\"red\">Author Name</td></tr>\r\n");
      out.write("<tr><td>PROGRAMMING USING C</td><td>Programming in ANSI C</td><td> E. Balguruswamy4/e (TMH)</tr>\r\n");
      out.write("<tr><td>PROGRAMMING USING C</td><td>Programming in ANSI & Turbo C</td><td> A. Kamthane</td></tr>\r\n");
      out.write("<tr><td>COMPUTER ORGANIZATION</td><td>Computer Organization, 5/e (TMH)</td><td>Carl Hamacher, Z. Vranesic, S. Zaky</td><tr>\r\n");
      out.write("<tr><td>COMPUTER ORGANIZATION</td><td>Computer Organization and Architecture (Design for Performance),9/e</td><td>William Stallings</td></tr>\r\n");
      out.write("<tr><td>PROGRAMMING USING C++</td><td>Object Oriented Programming with C++</td><td> E. Balgurusamy, 4/e (TMH)</td></tr>\r\n");
      out.write("<tr><td>DATA STRUCTURE</td><td>Data Structure through C</td><td>A. Rath & Jagdev</td></tr>\r\n");
      out.write("<tr><td>DATA STRUCTURE</td><td>Classic Data Structures</td><td>D. SAMANTA (PHI)</td></tr>\r\n");
      out.write("<tr><td>OPERATING SYSTEMS</td><td>Operating System Concepts</td><td> Silberschatz, Galvin, Gagne, 8/e (Wiley-India) </td></tr>\r\n");
      out.write("<tr><td>DATABASE MANAGEMENT SYSTEM</td><td>Fundamentals of Database Systems</td><td>Ramez Elmasri & Shamkant B. Navathe, Pearson (5/e)</td></tr>\r\n");
      out.write("<tr><td>DISCRETE STRUCTURES</td><td> Discrete Mathematics & Its Applications, McGraw-Hill. 7/e </td><td>Kenneth H Rosen</td></tr>\r\n");
      out.write("<tr><td>JAVA PROGRAMMING</td><td>JAVA: How to Program </td><td>Deitel & Deitel </td></tr>\r\n");
      out.write("<tr><td>JAVA PROGRAMMING</td><td>Java Complete reference</td><td>H. Schildt</td></tr>\r\n");
      out.write("<tr><td>COMPUTER NETWORK</td><td> Data Communications and Networking, 4/e</td><td>Forouzan, B. (TMH)</td></tr>\r\n");
      out.write("<tr><td>COMPUTER GRAPHICS</td><td>Computer Graphics with OpenGL</td><td>Donald Hearn & M. Pauline Baker,Education, Inc. New Delhi.</td></tr>\r\n");
      out.write("<tr><td>INTERNET TECHNOLOGY</td><td>Web Enabled Commercial Application Development Using Html,DHTML, Javascript</td><td>Ivan Bayross</td></tr>\r\n");
      out.write("<tr><td>INTERNET TECHNOLOGY</td><td> The Complete Reference</td><td>Herbert Schildt,8/e</td></tr>\r\n");
      out.write("<tr><td>INFORMATION SECURITY</td><td>Security in Computing</td><td>C. P. Pfleeger, S. L. Pfleeger</td></tr>\r\n");
      out.write("<tr><td>MICROPROCESSOR</td><td>ARM System-On-Chip Architecture</td><td>Steve Furber</td></tr>\r\n");
      out.write("<tr><td>ARTIFICIAL INTELLIGENCE</td><td>ARTIFICIAL INTELLIGENCE A MODERN\r\n");
      out.write("APPROACH,2/e</td><td>Stuart Russell and Peter Norvig</td></tr>\r\n");
      out.write("<tr><td>CLOUD COMPUTING</td><td>Cloud Computing</td><td> Bible, Barrie Sosinsky, Wiley-India, 2010 </td></tr>\r\n");
      out.write("<tr><td>CLOUD COMPUTING</td><td>Cloud Computing</td><td>Principles and Paradigms, Editors: Rajkumar Buyya, James\r\n");
      out.write("Broberg, Andrzej M. Goscinski, Wile, 2011 </td></tr>\r\n");
      out.write("<tr><td>CLOUD COMPUTING</td><td>Cloud Computing</td><td> Principles, Systems and Applications, Editors: Nikos </td></tr>\r\n");
      out.write("</table>\r\n");
      out.write("</body>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("  <img src=\"C:\\Users\\SCS 3\\Downloads\\p12.jfif\" alt=\"About us\" style=\"width:100%\" \"height: 100%\">\r\n");
      out.write("  <div class=\"content\">\r\n");
      out.write("<body>\r\n");
      out.write("<table border=\"1\" align=\"center\" cellpadding=\"3\" width=\"100%\">\r\n");
      out.write("<tr><td colspan=\"3\" bgcolor=\"#ffcdd2\"><em><center><h4>Botany</h4></center></em></td></tr>\r\n");
      out.write("<tr><td bgcolor=\"red\">Paper Name</td><td bgcolor=\"red\">Book Name</td><td bgcolor=\"red\">Author Name</td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("</table>\r\n");
      out.write("</body>\r\n");
      out.write("<body>\r\n");
      out.write("<table border=\"1\" align=\"center\" cellpadding=\"3\" width=\"100%\">\r\n");
      out.write("<tr><td colspan=\"3\" bgcolor=\"#ffcdd2\"><em><center><h4>Zoology</h4></center></em></td></tr>\r\n");
      out.write("<tr><td bgcolor=\"red\">Paper Name</td><td bgcolor=\"red\">Book Name</td><td bgcolor=\"red\">Author Name</td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("<tr><td></td><td></td><td></td></tr>\r\n");
      out.write("</table>\r\n");
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
