<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="/resources/css/style.css">
<script type="text/javascript" src="/resources/js/app.js"></script>
<script type="text/javascript">
var room = 1;
function add_fields() {
    room++;
    var objTo = document.getElementById('room_fileds')
    var divtest = document.createElement("div");
    divtest.innerHTML = '<div class="label">Room ' + room +':</div><div class="content"><span>Width: <input type="text" style="width:48px;" name="width[]" value="" /></span></br><span>Length: <input type="text" style="width:48px;" namae="length[]" value="" /></span><input type="button" id="more_fields" onclick="add_fields();" value="Add More" /></div>';
    objTo.appendChild(divtest)
}
</script>
<title>Spring Boot MVC Application</title>
</head>
<body>
	<h1>Spring Boot JSP Example</h1>
	<hr>
	<div class="form">
		<form action="hello" method="post" onsubmit="return validate()">
			<table>
				<tr>
					<td>Add Identification :</td>
					<td><input id="name" name="name"><a href="next">Add Id</a></td>					
				</tr>
			</table>
		</form>
	</div>
	<div>
		<div id="room_fileds">
           <div>
            <div class='label'>Room 1:</div>
            <div class="content">
                <span>Width: <input type="text" style="width:48px;" name="width[]" value="" /></span><br/>
                <span>Length: <input type="text" style="width:48px;" name="length[]" value="" /></span>
        		<input type="button" id="more_fields" onclick="add_fields();" value="Add More" />
            </div>
           </div>
        </div>
	</div>
	Click on this
	<strong><a href="next">link</a></strong> to visit another page.
</body>
</html>

<!-- <td><input type="submit" value="Submit"></td> -->