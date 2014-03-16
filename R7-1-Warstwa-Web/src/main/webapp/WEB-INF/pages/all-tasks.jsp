<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Tasks</title>
</head>
<body>

<h3>
    <spring:message code="welcome" />
</h3>

<table>
    <c:forEach var="task" items="${allTasks}">
        <tr>
            <td> ${task.taskName} </td>
        </tr>
    </c:forEach>
</table>

<form:form commandName="task">
    <table>
        <tr>
            <td>Temat zadania</td>
            <td>
                <form:input path="taskName" />
                <form:errors path="taskName" />
            </td>
        </tr>
        <tr>
            <td>Data rozpoczecia</td>
            <td>
                <form:input path="start" />
                <form:errors path="start" />
            </td>
        </tr>
        <tr>
            <td>Data zakonczenia</td>
            <td>
                <form:input path="finish" />
                <form:errors path="finish" />
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Zatwierdz" />
            </td>
        </tr>
    </table>
</form:form>

</body>
</html>
