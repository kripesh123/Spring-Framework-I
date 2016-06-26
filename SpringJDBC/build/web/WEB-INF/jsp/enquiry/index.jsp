<%-- 
    Document   : index
    Created on : Jun 26, 2016, 9:48:58 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Enquiry</h1>
        <form method="post">
            <div>
                <label>First Name</label>
                <input type="text" name="first_name" required="required"/>
            </div>
            <div>
                <label>Last Name</label>
                <input type="text" name="last_name" required="required"/>
                
            </div>
            <div>
                <label>Email</label>
                <input type="email" name="email" required="required"/>
            </div>
            <div>
                <label>Contact No</label>
                <input type="text" name="contact_no" required="required"/>
            </div>
            <input type="hidden" id="id" value=""/>
            <button type="submit">Send</button>
        </form>
    </body>
</html>
