<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>
<h1>Forgot Password</h1><hr></hr>
            <form action="./forgot.jsp">
                <div class="form-group col-md-3">
                    <label  class="form-label">User Name</label>
                    <input type="text" class="form-control" id="exampleInputUserName" name="uname" placeholder="Enter UserName"/>

                </div>
                 
                 <label  class="form-label">Type</label>
                <div class="form-group col-md-3">
               
                <div class="form-control">
                
						<select name="type" >
							<option selected>Open this select menu</option>
							<option value="admin">Admin</option>
							<option value="user">User</option>
						</select>
						</div>
					</div>
             
                <button type="submit" class="btn btn-primary" >LogIn</button>
                
            </form>

</body>
</html>