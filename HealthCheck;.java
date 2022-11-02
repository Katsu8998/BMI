package servlet;

import jakarta.servlet.RequestDispatcher;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import model.Human;
import model.HealthCheckLogic;

/**
 * Servlet implementation class HealthCheck 
 * @WebServlet("/HealthCheck")
 */
public class HealthCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	//public HealthCheck() {
		//super();
		// TODO Auto-generated constructor stub
//	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		// フォワード
		RequestDispatcher dispatcher = request.getRequestDispatcher("HealthCheck.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		// リクエストパラメータを取得
		String weight = request.getParameter("weight");
		String height = request.getParameter("height");

		// 入力値をプロパティに設定
		Human health = new Human();
		health.setHeight(Double.parseDouble(height));
		health.setWeight(Double.parseDouble(weight));

		// 健康診断を実行した結果を設定
		HealthCheckLogic healthCheckLogic = new HealthCheckLogic();
		healthCheckLogic.execute(health);

		// リクエストスコープに保存
		request.setAttribute("health", health);

		// フォワード
		RequestDispatcher dispatcher = request.getRequestDispatcher("healthCheckResult.jsp");
		dispatcher.forward(request, response);
	}
}
