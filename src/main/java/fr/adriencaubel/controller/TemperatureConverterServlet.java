package fr.adriencaubel.controller;

import java.io.IOException;

import fr.adriencaubel.model.TemperatureConverter;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/convert")
public class TemperatureConverterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Récupérer le paramètre ?temperature=30
		String temperatureParam = request.getParameter("temperature");

		// Appeler la logique métier (ici la conversion)
		Double conversion = TemperatureConverter.convertCelsiusToFahrenheit(Double.parseDouble(temperatureParam));

		request.setAttribute("result", Double.toString(conversion));

		// redirection vers la Vue result.jsp
		// response.sendRedirect("result?result=" + conversion);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("result.jsp");
		requestDispatcher.forward(request, response);

	}
}
