package com.zn.springbootdemo.web.servlet;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by ning on 15/8/18.
 * 异步Servlet
 */
@WebServlet(urlPatterns = "/async/demo", asyncSupported = true)
public class AsynvServletDemo extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        AsyncContext asyncContext = req.startAsync();   //异步上下文
        asyncContext.start(() -> {

            try {
                //异步操作
                resp.getWriter().print("Hello Async");
                //触发完成，断开web连接
                asyncContext.complete();

            } catch (Exception e) {
                e.printStackTrace();
            }
        });

    }
}
