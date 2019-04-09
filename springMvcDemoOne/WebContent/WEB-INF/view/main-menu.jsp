<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
	<link rel="stylesheet" type="text/css" 
		  href="${pageContext.request.contextPath}/resources/css/my-test.css">

    <script src="${pageContext.request.contextPath}/resources/js/simple-test.js"></script>
    <title>MySpringDemo</title>
</head>
<body>
    <img src="${pageContext.request.contextPath}/resources/images/spring-image.png"> 
    <h2>Spring MVC Demo - Home Page</h2>
    
    <br>
    
    <a href="hello/showForm">Hello World form</a>
    
    <br><br>
    
    <input type="button" onclick="doSomeWork()" value="Click Me"/>
</body>
</html>