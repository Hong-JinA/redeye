<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">
  <title>SB Admin - Start Bootstrap Template</title>
  <!-- Bootstrap core CSS-->
  <link href="/resources/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <!-- Custom fonts for this template-->
  <link href="/resources/vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
  <!-- Custom styles for this template-->
  <link href="/resources/css/sb-admin.css" rel="stylesheet">
</head>

<body class="bg-dark">
  <div class="container">
    <div class="card card-register mx-auto mt-5">
      <div class="card-header">회원가입</div>
      <div class="card-body">
        <form method="POST" action="/user/signup">
          <div class="form-group">
            <div class="form-row">
              <div class="col-md-6">
                <label for="exampleInputName">Name</label>
                <input class="form-control" id="exampleInputName" type="text" aria-describedby="nameHelp" placeholder="Enter name" name="uname">
              </div>
            </div>
          </div>
          <div class="form-group">
            <label for="exampleInputEmail1">ID</label>
            <input class="form-control" id="exampleInputEmail1" type="text" aria-describedby="emailHelp" placeholder="Enter email" name="uid">
          </div>
          <div class="form-group">
            <div class="form-row">
              <div class="col-md-6">
                <label for="exampleInputPassword1">Password</label>
                <input class="form-control" id="exampleInputPassword1" type="password" placeholder="Password" name="upw">
              </div>
            </div>
          </div>
          <div class="text-center">
          <button class="btn btn-primary" >가입하기</button>
          </div>
        </form>
        <div class="text-center">
          <a class="d-block small mt-3" href="/user/login">로그인</a>
          <a class="d-block small" href="forgot-password.html">Forgot Password?</a>
        </div>
      </div>
    </div>
  </div>
  <!-- Bootstrap core JavaScript-->
  <script src="/resources/vendor/jquery/jquery.min.js"></script>
  <script src="/resources/vendor/popper/popper.min.js"></script>
  <script src="/resources/vendor/bootstrap/js/bootstrap.min.js"></script>
  <!-- Core plugin JavaScript-->
  <script src="/resources/vendor/jquery-easing/jquery.easing.min.js"></script>
</body>

</html>
