<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Tasks</title>
</head>
<body>

<h3>Zadania</h3>

<table>
    <c:forEach var="task" items="${allTasks}">
        ${task.taskName}
    </c:forEach>
</table>

</body>
</html>
