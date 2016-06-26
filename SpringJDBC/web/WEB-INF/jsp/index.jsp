<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
        
    </head>

    <body>
        <ul>
            <c:forEach var="enq" items="${enquiries}">
                <li style="font-weight: bold">${enq.firstName} ${enq.lastName}</li>
            </c:forEach>
        </ul>
        
        <h1>${enquiry.firstName} ${enquiry.lastName} ${enquiry.email} </h1>
    </body>
</html>
