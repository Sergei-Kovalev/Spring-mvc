<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>

<h2>Dear employee, please enter your details.</h2>

<br>
<br>

<form:form action="showDetails" modelAttribute = "employee">

    Name <form:input path="name"/>
    <form:errors path="name"/>
    <br><br>
    Surname <form:input path="surName"/>
    <form:errors path="surName"/>
    <br><br>
    Salary <form:input path="salary"/>
    <br><br>
    Department <form:select path="department">
    <form:options items="${employee.departments}"/>
    </form:select>
    <br><br>
    <h2>Which car do you want?</h2>
    <br><br>
    <form:radiobuttons path="carBrand" items="${employee.carBrands}"/>
    <br><br>
    <h2>Foreign language(s)?</h2>
    <form:checkboxes path="languages" items="${employee.languageList}"/>

    <br><br>
<input type = "submit" value = "OK">

</form:form>

</body>

</html>