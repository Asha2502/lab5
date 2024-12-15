package servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Shape;
import models.ShapeFactory;

import java.io.IOException;

@WebServlet("/calculate")
public class MainServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String shapeType = request.getParameter("shapeType");
            double parameter = Double.parseDouble(request.getParameter("parameter"));

            Shape shape = ShapeFactory.createShape(shapeType, parameter);
            double volume = shape.calculateVolume();

            request.setAttribute("shapeType", shapeType);
            request.setAttribute("volume", volume);
            request.setAttribute("parameter", parameter);

            RequestDispatcher dispatcher = request.getRequestDispatcher("result.jsp");
            dispatcher.forward(request, response);

        } catch (Exception e) {
            request.setAttribute("error", "Invalid input! Please check your parameters.");
            RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
            dispatcher.forward(request, response);
        }
    }
}
