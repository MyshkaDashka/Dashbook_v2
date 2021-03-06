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
                    <h2>Result search</h2>
                    <br/>
                    ${msgSearch}
                    <c:forEach items="${searchResults}" var="searchResult">
                        <p><img src="../../${searchResult.photo}" class="box-infoFriends"></p>
                        <a href="/${id}/friend/${searchResult.id}">
                            <h2>${searchResult.name} ${searchResult.lastName}</h2></a>
                        <br/>
                        <ul class="main-listFriend">
                            <li><strong>City: </strong> ${searchResult.city}</li>
                            <li><strong>Phone: </strong> ${searchResult.phone}</li>
                        </ul>
                        <br/>
                        <br/>

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
