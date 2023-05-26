<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<div class="nav-item">
			<div class="container">
				<div class="nav-depart">
					<div class="depart-btn">
						<i class="ti-menu"></i> <span>All departments</span>
						<ul class="depart-hover" th:each="category : ${categories}">
							<li class="active"><a href="/home/brand?field1=0000">Women’s Clothing</a></li>
							<li><a href="/home/brand?field1=1111">Men’s Clothing</a></li>
							<li><a href="/home/brand?field1=2222">Kid's Clothing</a></li>
							<li><a href="/home/brand?field1=1111">Accessories/Shoes</a></li>
						</ul>
					</div>
				</div>
				<nav class="nav-menu mobile-menu">
					<ul>
						<li class="active"><a href="index">Home</a></li>
						<li><a href="shop">Shop</a></li>
						<li><a href="shop">Collection</a>
                            <ul class="dropdown">
                                <li><a href="/home/brand?field1=1111">Men's</a></li>
                                <li><a href="/home/brand?field1=0000">Women's</a></li>
                                <li><a href="/home/brand?field1=2222">Kid's</a></li>
                            </ul>
                        </li>
						<li><a href="blog">Blog</a></li>
						<li><a href="contact">Contact</a></li>
						<li><a href="#">Acc</a>
							<ul class="dropdown">
							<c:if test="${!isLogin}">
								<li><a href="login">Login</a></li>
								<li><a href="register">Register</a></li>
							</c:if>
							<c:if test="${isLogin}">
								<li><a href="change-password">Change Password</a></li>
								<li><a href="profile">My Profile</a></li>
							</c:if>
							</ul>
						</li>
					</ul>
				</nav>
				<div id="mobile-menu-wrap"></div>
			</div>
		</div>