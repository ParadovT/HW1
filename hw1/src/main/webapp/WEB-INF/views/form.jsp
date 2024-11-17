<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>New Hairdresser</title>
</head>
<body>
<h2>Create New Hairdresser</h2>
<form:form modelAttribute="hairdresser" action="/addHairdresser" method="post">
    <div>
        <label for="city">City:</label>
        <form:input path="city" id="city" />
    </div>
    <div>
        <label for="speciality">Speciality:</label>
        <form:input path="speciality" id="speciality" />
    </div>
    <div>
        <button type="submit">Add Hairdresser</button>
    </div>
</form:form>
</body>
</html>
