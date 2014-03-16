<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Spring mvc sample</title>
</head>
<body>
    <c:choose>
        <c:when test="${name == 'kitten'}">
            Kittens purr
        </c:when>
        <c:otherwise>
            <h1> hello ${name} </h1>
        </c:otherwise>
    </c:choose>
</body>
</html>
