package by.hospital.kurganovich.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.hospital.kurganovich.dao.PatientDAO;
import by.hospital.kurganovich.dao.PersonnelDAO;
import by.hospital.kurganovich.model.Patient;

public class PatientController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private PatientDAO dao;
    public static final String ACTION = "action";
    public static final String ACTION_DELETE = "delete";
    public static final String ACTION_INSERT = "insert";
    public static final String ACTION_EDIT = "edit";
    public static final String lIST_PATIENT = "/jsp/listPatient.jsp";
    public static final String INSERT_OR_EDIT = "/jsp/patient.jsp";
 
    public PatientController() {
        dao = PatientDAO.getInstance();
    }
 
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String forward = "";
        String action = request.getParameter(ACTION);
        try {
	        if(action.equalsIgnoreCase(ACTION_DELETE)) {
	            forward = lIST_PATIENT;
	            int idPatient = Integer.parseInt(request.getParameter("idPatient"));
	            dao.deletePatient(idPatient);
	            request.setAttribute("patients", dao.selectAll());
	        }
	        else if(action.equalsIgnoreCase(ACTION_EDIT)) {
	            forward = INSERT_OR_EDIT;
	            int idPatient = Integer.parseInt( request.getParameter("idPatient"));
	            Patient patient = dao.getPatient(idPatient);
	            request.setAttribute("patient", patient);
	        }
	        else if(action.equalsIgnoreCase(ACTION_INSERT)) {
	        	Patient patient = new Patient();
	            request.setAttribute("patient", patient);
	            forward = INSERT_OR_EDIT;
	        }
	        else {
	            forward = lIST_PATIENT;
	            request.setAttribute("patients", dao.selectAll());
	        }
        }
        catch(Exception ex) {
        	System.out.println(ex.getMessage());
        }
        RequestDispatcher view = request.getRequestDispatcher(forward);
        view.forward(request, response);
    }
 
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
	    	Patient patient = new Patient();
	        patient.setFIO(request.getParameter("FIO"));
	        patient.setDiagnosis(request.getParameter("diagnosis"));
	        String idPatient = request.getParameter("idPatient");
	        if( idPatient == null || idPatient.isEmpty() || Integer.parseInt(idPatient) == 0)
	            dao.addPatient(patient);
	        else {
	        	patient.setIdPatient(Integer.parseInt(idPatient));
	            dao.updatePatient(patient);
	        }
	        RequestDispatcher view = request.getRequestDispatcher(lIST_PATIENT);
	        request.setAttribute("patients", dao.selectAll());
	        view.forward(request, response);
        }
        catch(Exception ex) {
        	System.out.println(ex.getMessage());
        }
    }
}
