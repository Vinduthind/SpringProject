<%@  taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>registration</title>
<style>

.error{color:RED}
</style>

</head>
<body >
<form:form action="../processForm" modelAttribute="student">
First Name: 
<form:input path="firstname"/>
<form:errors path="firstname" cssClass="error"/>
<br>
<br>
Last Name :
<form:input path="lastname"/>
<br>
<br>
phone number :
<form:input path="phonenumber"/>
<form:errors path="phonenumber" cssClass="error"/>

<br>
<br>
Course Code:
<br>
<form:input path="coursecode" />
<form:errors path="coursecode" cssClass="error"/>

<br>
<br>

freepasses:

br>
<form:input path="freepasses" />
<form:errors path="freepasses" cssClass="error"/>

<br>
<br>
<input type="submit"  value="Submit">

</form:form>

</body>
</html>