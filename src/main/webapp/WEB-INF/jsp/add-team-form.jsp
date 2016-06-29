<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<?xml version="1.0" encoding="ISO-8859-1" ?>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<h1>Add team page</h1>
<p>Here you can add a new team.</p>
<%@ page isELIgnored="false" %>
<html>
<form:form method="POST" modelAttribute="team" action="../team/add/process">
<table>
<tbody>
	<tr>
		<td>Name:</td>
		
		<td><form:input path="name" /></td>
		
		
	</tr>
	<tr>
		<td>Rating:</td>
	<td><form:input path="rating" /></td>
		</tr>
	<tr>
		<td><input value="Add" type="submit"/></td>
		<td></td>
	</tr>
</tbody>
</table>
</form:form>

<p><a href="${pageContext.request.contextPath}/index.html">Home page</a></p>
</html>