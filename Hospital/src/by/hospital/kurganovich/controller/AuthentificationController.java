package by.hospital.kurganovich.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import by.hospital.kurganovich.dao.PersonnelDAO;
import by.hospital.kurganovich.model.Personnel;

public class AuthentificationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PersonnelDAO dao;

    public AuthentificationController() {
        super();
		dao = PersonnelDAO.getInstance();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		session.invalidate();
		String error = request.getParameter("error");
		if (error != null && !error.isEmpty()) {
			if (error.equalsIgnoreCase("failAuth"))
				request.setAttribute("error", "Ошибка авторизации!" );
			else if (error.equalsIgnoreCase("failUrl"))
				request.setAttribute("error", "Необходимо авторизоваться!" );
		}
		RequestDispatcher view = request.getRequestDispatcher("/jsp/login.jsp");
	    view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String login = request.getParameter("login");
			String pass = request.getParameter("pass");
			List<Personnel> personnels = dao.selectAll();
			boolean isSuccess = false;
			String redirectUrl;
			for(Personnel personnel : personnels) {
				if(personnel.getLogin().equals(login) && personnel.getPass().equals(pass)) {
					isSuccess = true;
					setAttrInSession(request, personnel);
				}
			}
			redirectUrl = isSuccess ? "patient?action=listPatient" : "login?error=failAuth";
			response.sendRedirect(redirectUrl);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void setAttrInSession(HttpServletRequest request, Personnel personnel) {
		HttpSession session = request.getSession(true);
		session.setAttribute("id", personnel.getIdPersonnel());
		session.setAttribute("role", personnel.getPost());
	}
}
