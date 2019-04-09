<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Student Registration Form</title>
</head>
<body> 
    <h2>Student Registration Form</h2>
    
    <form:form action="processForm" modelAttribute="student">
    	First name: <form:input path="firstName" />
    	<br/><br/>
    	Last name: <form:input path="lastName" />
    	<br/><br/>
    	Country: 
    	<form:select path="country">
    	<!--  
    		<form:option value="Brazil" label="Brazil" />
    		<form:option value="France" label="France" />
    		<form:option value="Germany" label="Germany" />
    		<form:option value="India" label="India" />
    		<form:options items="${student.countryOptions }"/>
    	-->
    		<form:options items="${theCountryOptions }"/>
    	</form:select>
    	<br/><br/>
    	Favorite Language:
    	
    	Java <form:radiobutton path="favoriteLanguage" value="Java"/>
    	C# <form:radiobutton path="favoriteLanguage" value="C#"/>
    	PHP <form:radiobutton path="favoriteLanguage" value="PHP"/>
    	Ruby <form:radiobutton path="favoriteLanguage" value="Ruby"/>
    	<br/><br/>
    	Linux <form:checkbox path="operatingSystem" value="Linux" />
    	Mac OS <form:checkbox path="operatingSystem" value="Mac OS" />
    	MS Windows <form:checkbox path="operatingSystem" value="MS Windows" />
    	<br/><br/>
    	<input type="submit" value="Submit" />
    </form:form>
</body>
</html>