<%--
  Created by IntelliJ IDEA.
  User: DASHKA
  Date: 13.12.2015
  Time: 16:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <!-- CSS -->
    <link rel="stylesheet" href="../../css/style.css" type="text/css" media="screen, projection, tv"/>
    <link rel="stylesheet" href="../../css/style-print.css" type="text/css" media="print"/>
    <link rel="stylesheet" href="../../css/styleRegistration.css" type="text/css"/>

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
            <form:form action="/${id}/pay/${gift.id}" method="POST" commandName="messagesForm"
                       class="register-form">
                <div class="header">
                    <p><img src="../../${gift.photo}" class="box-infoFriends"></p>
                    <br/><a><h2>${gift.name}</h2></a>
                    <br/><ul class="main-listFriend">
                        <li>Price:  <strong> ${store.price} $</strong></li>
                    </ul>
                    <br/> <br/> <br/>
                    <hr>
                    <h2>Enter data order, please.</h2>
                </div>
                <div class="content">
                    <h2>Count</h2> <input type="text" class="input" placeholder="Count" name="count"
                                          value="" required><br/>

                    <h2>Number of credit card</h2> <input type="text" class="input"
                                                          placeholder="Number of credit card" name="number"
                                                          value="" required><br/>

                    <h2>Name</h2> <input type="text" class="input" placeholder="Name" name="name"
                                         value="" required><br/>

                    <h2>Last Name</h2> <input type="text" class="input" placeholder="Last Name" name="lastName"
                                              value="" required><br/>


                    <h2>Validity</h2> <input type="text" class="input" placeholder="Month" name="month"
                                             value="" required>/<br/>
                    <input type="text" class="input" placeholder="Year" name="year" value="" required><br/>

                    <h2>CVV code</h2> <input type="text" class="input" placeholder="CVV" name="cvv"
                                             value="" required><br/>
                </div>
                <div class="footer">
                    <input type="submit" name="submit" class="button" ng-disabled="messagesForm.$invalid" value="Pay"/>
                    <a href="/${id}"><input type="button" name="submit" value="Back to profile"
                                            class="register"/></a>
                </div>
            </form:form>
        </div>
    </div>
</div>
</body>
</html>
