<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Список пациентов</title>
</head>
<body>
	<table>
        <thead>
            <tr>
                <th>Пациент ID</th>
                <th>ФИО</th>
                <th>Диагноз</th>
                <th colspan="2">Действие</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${patients}" var="patient">
                <tr>
                    <td><c:out value="${patient.idPatient}" /></td>
                    <td><c:out value="${patient.FIO}" /></td>
                    <td><c:out value="${patient.diagnosis}" /></td>
                    <td><a
                        href="patient?action=edit&idPatient=<c:out value="${patient.idPatient }"/>">Обновить</a></td>
                    <td><a
                        href="patient?action=delete&idPatient=<c:out value="${patient.idPatient }"/>">Удалить</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <p>
        <a href="patient?action=insert">Добавить пациента</a>
    </p>
</body>
</html>