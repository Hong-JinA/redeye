<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="../include/editor_js.jspf"%>
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

  <!-- Custom fonts for this template-->
    <link href="/resources/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <link href="/resources/vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
  <!-- Custom styles for this template-->
  <link href="/resources/css/sb-admin.css" rel="stylesheet">
  
</head>

<body class="bg-dark">
  <div class="container">
    <div class="card card-register mx-auto mt-5">
      <div class="card-header">게시글 작성하기</div>
      <div class="card-body"> 
        <form class="form-horizontal" action="/sboard/register" method="POST">
        <input type="hidden" name="bno" value="${boardVO.bno}" />
          <div class="form-group">
            <div class="form-row">
              <div class="col-md-6">
                <label >제목</label>
                <input class="form-control" name="title" type="text" aria-describedby="nameHelp" placeholder="100자 이하로 작성하시오.">
              	<br>
              </div>
             
      
              <div class="col-md-6">
                <label for="InputName">작성자</label>
                <input class="form-control" name="writer" type="text" aria-describedby="nameHelp" placeholder="ex)홍길동"> <br>
              </div>
        
              <textarea id="summernote"  name="content"></textarea>
				<script type="text/javascript">
					var firstfile = true;
					$(document).ready(function() {
						$('#summernote').summernote({
							height : 200, // set editor height
							minHeight : null, // set minimum height of editor
							maxHeight : null, // set maximum height of editor
							focus : false,
						});
						$('.note-editable').css('font-size', '18px');
					});
				</script>
              
            </div>
          </div>
          <button class="btn btn-primary">등록</button>
          <button class="btn btn-primary">삭제</button>
        </form>
      </div>
    </div>
  </div>
  <!-- Bootstrap core JavaScript-->

  
  <script src="/resources/vendor/popper/popper.min.js"></script>
  


  <!-- Core plugin JavaScript-->
  
  
</body>

</html>
