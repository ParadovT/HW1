<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<h2>List of Hairdressers</h2>
<ul>
    <c:forEach var="hairdresser" items="${hairdressers}">
        <li>
            City: ${hairdresser.city}, Speciality: ${hairdresser.speciality}
            <a href="/stylists?hairdresser=${hairdresser.id}">View Stylists</a>
        </li>
    </c:forEach>
</ul>
</body>
</html>
