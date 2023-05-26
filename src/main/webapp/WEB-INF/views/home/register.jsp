<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<!-- Breadcrumb Section Begin -->
<div class="breacrumb-section">
	<div class="container">
		<div class="row">
			<div class="col-lg-12">
				<div class="breadcrumb-text">
					<a href="#"><i class="fa fa-home"></i> Home</a> <span>Register</span>
				</div>
			</div>
		</div>
	</div>
</div>
<!-- Breadcrumb Form Section Begin -->

<!-- Register Section Begin -->
<div class="register-login-section spad">
	<div class="container">
		<div class="row">
			<div class="col-lg-6 offset-lg-3">
				<div class="register-form">
					<h2>Register</h2>
					<h4>${message }</h4>
					<form:form method="get" action="/home/register" modelAttribute="item">
						<div class="group-input">
							<label for="username">Username or email address *:</label> 
							<form:input path="username" type="text" id="username"/>
						</div>
						<div class="group-input">
							<label for="pass">Password *:</label>
							<form:input type="text" id="password" path="password"/>
						</div>
						<div class="group-input">
							<label for="con-pass">Fullname *:</label> 
							<form:input type="text" id="fullname" path="fullname"/>
						</div>
						<div class="group-input">
							<label for="con-pass">Email *:</label> 
							<form:input type="email"	id="email" path="email"/>
						</div>
						

						<div class="file-upload">
							<div class="image-upload-wrap">
								<form:input class="file-upload-input" type='file' path="photo" id="photo" 
									onchange="readURL(this);" accept="image/*" />
								<div class="drag-text">
									<h3>Drag and drop a file or select add Image</h3>
								</div>
							</div>
							<div class="file-upload-content">
								<img class="file-upload-image" src="#" alt="your image" />
								<div class="image-title-wrap">
									<button type="button" onclick="removeUpload()"
										class="remove-image">
										Remove <span class="image-title">Uploaded Image</span>
									</button>
								</div>
							</div>
						</div>
						<button type="submit" class="site-btn register-btn" formaction="/home/register/create">REGISTER</button>
					</form:form>
					<div class="switch-login">
						<a href="login" class="or-login">Or Login</a>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<!-- Register Form Section End -->