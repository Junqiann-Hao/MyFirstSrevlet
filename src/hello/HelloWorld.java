package hello;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by 16359 on 2016/12/4.
 *
 */
@WebServlet("/HelloWorld")
public class HelloWorld extends javax.servlet.http.HttpServlet {
    private String message;
    @Override
    public void init() throws ServletException {
        message = "Hello world, this message is from servlet!";
    }
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setContentType("text/html");

        //设置逻辑实现
        PrintWriter out = response.getWriter();
        out.println("<h1>" + message + "</h1>");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String requestURI = req.getRequestURI();
        StringBuffer requestURL = req.getRequestURL();
        String method = req.getMethod();
        String protocol = req.getProtocol();
        System.out.println("请求方式:" +method+
                "请求URL:" +requestURL+
                "请求URI:" +requestURI+
                "请求版本"+protocol);

        resp.setContentType("text/html");

            //设置逻辑实现
            PrintWriter out = resp.getWriter();
            out.println("<h1>" + message + "</h1>");
    }
}
