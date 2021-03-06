<%--
  Created by IntelliJ IDEA.
  User: DASHKA
  Date: 13.12.2015
  Time: 17:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <!-- CSS -->
    <link rel="stylesheet" href="../../css/style.css" type="text/css" media="screen, projection, tv"/>
    <link rel="stylesheet" href="../../css/style-print.css" type="text/css" media="print"/>

    <title>Dashka facebook | Homepage</title>
</head>
<body>
<div id="wrapper1">
    <!-- Title -->
    <div class="title">
        <div class="title-top">
        </div>
    </div>
    <!-- Title end -->
    <hr class="noscreen"/>
    <div class="content">
        <div class="column-left">
            <h3>MENU</h3>
            <a href="#skip-menu" class="hidden">Skip menu</a>
            <ul class="menu">
                <li><a href="/${id}">Home</a></li>
                <li><a href="/${id}/friend">Friends</a></li>
                <li><a href="/${id}/message">Messages ${countMess}</a></li>
                <li><a href="/${id}/search">Search</a></li>
                <li><a href="/${id}/orderGift">Order Gift</a></li>
                <li class="last"><a href="j_spring_security_logout">Log out</a></li>
            </ul>
        </div>
        <div id="skip-menu"></div>
        <div class="column-right">
            <div class="box">
                <div class="box-top"></div>
                <div class="box-in">
                    <c:forEach items="${gifts}" var="gifts">
                        <p><img src="../../${gifts.photo}" class="box-infoFriends"></p>
                        <a ><h2>${gifts.name}</h2></a>
                        <a href="/${id}/payGift/${gifts.id}">
                            <button type="button" name="button" class="myButton"> Buy this gift</button>
                        </a>
                        <ul class="main-listFriend">
                            <li><strong>Description: </strong> ${gifts.description}</li>
                        </ul>
                        <hr>
                    </c:forEach>
                </div>
            </div>
            <div class="box-bottom">
                <div class="footer-info-right"><a href="http://www.mantisatemplates.com/">Mantis-a templates</a></div>
            </div>
        </div>
    </div>
</div>
</body>
