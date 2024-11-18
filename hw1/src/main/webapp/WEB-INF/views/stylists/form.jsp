<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="co2123.hw1.domain.Stylist" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>New Stylist</title>
</head>
<body>
<h2>Create New Stylist</h2>
<form:form modelAttribute="stylist" action="/addStylist" method="post">
    <div>
        <label for="name">Name:</label>
        <form:input path="name" id="name" />
    </div>
    <div>
        <label for="skills">Skills:</label>
        <form:input path="skills" id="skills" />
    </div>
    <div>
        <label for="expertise">Expertise:</label>
        <form:input path="expertise" id="expertise" />
    </div>
    <div>
        <label for="price">Price:</label>
        <form:input path="price" id="price" />
    </div>
    <!-- Pass the hairdresser ID as a hidden field -->
    <input type="hidden" name="hairdresser" value="${hairdresserId}" />
    <div>
        <button type="submit">Add Stylist</button>
    </div>
</form:form>
</body>
</html>

