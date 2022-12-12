<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<body>

<h2>Dear employee, You are welcome!</h2>

<br>
<br>

<h2>Your name: ${employee.name} </h2>
<br>
<h2>Your surname: ${employee.surName} </h2>
<br>
<h2>Your salary: ${employee.salary} </h2>
<br>
<h2>Your department: ${employee.department} </h2>
<br>
<h2>Your car is: ${employee.carBrand} </h2>
<br>
<h2>Language(s):</h2>
<ul>

    <c:forEach var="lang" items="${employee.languages}">

    <li>    ${lang}    </li>

    </c:forEach>

</ul>
<br>
<h2>Your phone number is: ${employee.phoneNumber}</h2>
<br>
<h2>Your email is: ${employee.email}</h2>
<br>

</body>

</html>