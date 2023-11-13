<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<title>Home Page</title>
</head>
<body>
	<div class="container m-5">
	<h1>Complex form</h1><br>
	<div class="alert alert-danger" role="alert">
	
	<form:errors path="student.*" />
	
	
 This is danger alert
</div>
		<form action="handleform" method="post">
			<div>
				<label for="uname">Your name</label><br /> <input type="text"
					name="name" id="uname" placeholder="" />
			</div>

			<div>
				<label for="uid">Your Id</label><br /> <input type="text" name="id"
					id="uid" placeholder="Enter ID" />
			</div>
			<div>
				<label for="udob">Your dob</label><br /> <input type="text"
					name="dob" id="udob" />
			</div>
			<div>
				<label for="ucourse">Your Course</label><br /> <select id="ucourse"
					name="courses" multiple="multiple">
					<option value="java">Java</option>
					<option value="python">Python</option>
					<option value="c++">C++</option>
					<option value="django">Django</option>
					<option value="javascript">Javascrip</option>
					<option value="ruby">Ruby</option>
				</select>
			</div>

			<div>
				Select Gender<br /> <input type="radio" name="gender" id="male"
					value="male"> <label for="male">Male</label> <input
					type="radio" name="gender" id="female" value="female"> <label
					for="female">female</label>
			</div>

			<div>
				<label for="utype">Select Type</label><br /> <select id="utype"
					name="type">
					<option value="oldStudent">Old Student</option>
					<option value="newStudent">New Student</option>
				</select>
			</div>

			<div>
				<label for="ustreet">Your street</label><br /> 
				<input type="text"	name="address.street" id="ustreet" placeholder="Your street name" />
			</div>
			
				<div>
					<label for="ucity">Your city</label><br /> 
					<input type="text" name="address.city" id="ucity" placeholder="Your city name" />
				</div>
		
			<button type="submit" class="btn btn-primary mt-4">Submit</button>

		</form>
	</div>



	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>