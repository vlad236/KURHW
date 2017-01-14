<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Пациент</title>
</head>
<body>
	<form action="patient" method="post">
        <fieldset>
            <div>
                <label for="idPatient">Пациент ID</label> <input type="text"
                    name="idPatient" value="<c:out value="${patient.idPatient}" />"
                    readonly="readonly" placeholder="Пациент ID" />
            </div>
            <div>
                <label for="FIO">First Name</label> <input type="text"
                    name="FIO" value="<c:out value="${patient.FIO}" />"
                    placeholder="ФИО" />
            </div>
            <div>
                <label for="diagnosis">Диагноз</label> <input type="text"
                    name="diagnosis" value="<c:out value="${patient.diagnosis}" />"
                    placeholder="Диагноз" />
            </div>
            <div>
                <input type="submit" value="Принять" />
            </div>
        </fieldset>
    </form>
</body>
</html>