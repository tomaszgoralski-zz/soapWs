<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<jsp:useBean id="preds" type="jaxrs.services.Predictions"
		class="jaxrs.services.Predictions">
		<%
			// return 405 (Method Not Allowed).
				String verb = request.getMethod();
				if (!verb.equalsIgnoreCase("GET")) {
					response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED,
							"Only GET requests are allowed.");
				}
				// If it's a GET request, return the predictions.
				else {
					preds.setServletContext(application);
					out.println(preds.getPredictions());
				}
		%>
	</jsp:useBean>
