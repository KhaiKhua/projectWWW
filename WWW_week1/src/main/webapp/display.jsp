<%@ page import="java.util.List" %>
<%@ page import="com.example.week.models.Role" %>
<%@ page import="com.example.week.models.Account" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <%
        Account a= (Account) request.getAttribute("acc");
        List<Role> l= (List<Role>) request.getAttribute("listRole");
    %>
</head>
<body>
<div class="container">
    <div class="row">
        <h2>Hiển Thị Thông Tin Tài Khoản</h2>
    </div>
    <div class="row">
        <div class="col-md-3">
            <label >Tên Đăng Nhập:</label>
        </div>
        <div class="col-md-3">
            <label ><%=a.getAccount_id()%></label>
        </div>
    </div>
    <div class="row">
        <div class="col-md-3">
            <label >Email:</label>
        </div>
        <div class="col-md-3">
            <label ><%=a.getEmail()%></label>
        </div>
    </div>
    <div class="row">
        <div class="col-md-3">
            <label >Phone:</label>
        </div>
        <div class="col-md-3">
            <label ><%=a.getPhone()%></label>
        </div>
    </div>
    <div class="row">
        <div class="col-md-3">
            <label >Full Name:</label>
        </div>
        <div class="col-md-3">
            <label ><%=a.getFull_name()%></label>
        </div>
    </div>
    <div class="row">
        <div class="col-md-3">
            <label >Tên Đăng Nhập:</label>
        </div>
        <div class="col-md-3">
            <label ><%=a.getStatus()%></label>
        </div>
    </div>
    <div class="row">
        <h3>Roles</h3>
    </div>
    <%
    for (Role r:l){
    %>
    <div class="row">
        <div class="col-md-3">
            <label ><%=r.getRole_name()%></label>
        </div>
        <div class="col-md-3">
            <label ><%=r.getStatus()%></label>
        </div>
        <div class="col-md-3">
            <label ><%=r.getDescription()%></label>
        </div>
    </div>
    <%}%>
</div>




</body>
</html>
