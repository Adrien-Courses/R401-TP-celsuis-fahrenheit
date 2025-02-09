package fr.adriencaubel.controller;

import java.io.IOException;

import fr.adriencaubel.model.TemperatureConverter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class TemperatureConverterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String celsiusStr = request.getParameter("celsius");

		if (celsiusStr != null && !celsiusStr.isEmpty()) {
			try {
				double celsius = Double.parseDouble(celsiusStr);
				double fahrenheit = TemperatureConverter.convertCelsiusToFahrenheit(celsius);
				request.setAttribute("result", celsius + "°C = " + fahrenheit + "°F");
			} catch (NumberFormatException e) {
				request.setAttribute("result", "Erreur : Veuillez entrer un nombre valide.");
			}
		}

		// Redirige vers la page JSP pour afficher le résultat
		request.getRequestDispatcher("result.jsp").forward(request, response);
	}
}
