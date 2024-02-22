package org.zerock.w1;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;

@WebServlet(name = "myServlet", urlPatterns = "/my")
public class MyServlet extends HttpServlet { // 톰캣에서 작성하는 자바 코드는 HttpServlet 을 상속

    // doGet -> 브라우저 주소를 직접 변경해서 접근하는 경우 호출되는 메서드
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServerException, IOException {
        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h1>MyServlet</h1>");
        out.println("</body></html>");
    }
}
