package servlet;

import entity.Dept;
import link.MyCon;
import service.MyService;
import service.MyServiceImp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.util.List;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            Connection conn=MyCon.getCon();
            Dept dept=new Dept();
            dept.setDeptno(Integer.valueOf(request.getParameter("deptno")));
            dept.setDname(request.getParameter("dname"));
            dept.setLoc(request.getParameter("loc"));
            MyService ms=new MyServiceImp();
            int row=ms.insert(conn,dept);
            response.getOutputStream().println(row);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            Connection conn= MyCon.getCon();
            String id=request.getParameter("id");
            MyService ms=new MyServiceImp();
            List<Dept> list=ms.query(conn,Integer.valueOf(id));
            request.setAttribute("list",list);
            conn.close();
            request.getRequestDispatcher("show.jsp").forward(request,response);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
