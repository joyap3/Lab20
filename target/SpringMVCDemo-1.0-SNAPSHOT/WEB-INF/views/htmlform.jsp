<%--
  Created by IntelliJ IDEA.
  User: joyapuryear
  Date: 7/21/17
  Time: 3:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration Form</title>
</head>
<body>
<h1>Please fill the form to register!</h1>

<form method="post" action="/addUser">
    First Name:<input type="text" name="f_name">
    <br>
    Last Name:<input type="text" name="l_name">
    <br>
    E-mail:<input type="text" name="e_mail">
    <br>
    Phone Number:<input type="text" name="p_num">
    <br>
    Password:<input type="password" name="p_word">
    <br>
    <input type="submit"value="Register">

</form>

</body>
</html>
