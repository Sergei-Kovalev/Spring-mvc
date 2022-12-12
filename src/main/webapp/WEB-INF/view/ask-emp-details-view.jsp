<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>

<h2>Dear employee, please enter your details.</h2>

<br>
<br>

<form:form action="showDetails" modelAttribute = "employee">

    Name <form:input path="name" placeholder="min 2 character"/>
    <form:errors path="name"/>
    <br><br>
    Surname <form:input path="surName" placeholder="not empty"/>
    <form:errors path="surName"/>
    <br><br>
    Salary <form:input path="salary"/>
    <form:errors path="salary"/>
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
    Phone Number <form:input path="phoneNumber" placeholder="XXX-XX-XX"/>
    <form:errors path="phoneNumber"/>
    <br><br>
    Email <form:input path="email"/>
    <form:errors path="email"/>
    <br><br>
<input type = "submit" value = "OK">

</form:form>

</body>

</html>