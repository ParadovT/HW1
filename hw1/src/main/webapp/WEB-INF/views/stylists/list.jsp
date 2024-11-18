<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Stylists</title>
</head>
<body>
<h2>List of Stylists</h2>
<ul>
    <c:forEach items="${stylists}" var="stylist">
        <li>
            Name: ${stylist.name}, Skills: ${stylist.skills}, Expertise: ${stylist.expertise}, Price: ${stylist.price}
        </li>
    </c:forEach>
</ul>
<p>
    <a href="/newStylist?hairdresser=${hairdresserId}">Add a new Stylist</a>
</p>
</body>
</html>
