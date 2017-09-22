        <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored = "false"%>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
 <%--  <form:errors path="stud.*"/>  --%>
   <a href="?language=en">English</a>|<a href="?language=zh_CN">Chinese</a>
<form action="disInfo" method="post" >
${info}
<p>FirstName:<input type="text" name="name" ></p>
<p>Hobby:<input type="text" name="hobby">
 <br>
 <form:errors path="stud.hobby"/> 
 </p>

<p>Phone:<input type="text" name="phoneNumber"></p>
<p>DateOfBirth:<input type="text" name="dateBirth"></p>
<input type="submit" value="send">


</form>
</body>
</html>