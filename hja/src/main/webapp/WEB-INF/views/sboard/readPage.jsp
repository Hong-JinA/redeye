<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8"> <![endif]-->  
<!--[if IE 9]> <html lang="en" class="ie9"> <![endif]-->  
<!--[if !IE]><!--> <html lang="en"> <!--<![endif]-->  

<!-- Mirrored from themes.3rdwavemedia.com/velocity/1.7/blog-single.html by HTTrack Website Copier/3.x [XR&CO'2014], Thu, 07 Sep 2017 10:23:43 GMT -->
<head>
    <title>Responsive website template for products</title>
    <!-- Meta -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">    
    <link rel="shortcut icon" href="favicon.ico">  
    <link href='https://fonts.googleapis.com/css?family=Roboto:400,400italic,500,500italic,700,700italic,900,900italic,300italic,300' rel='stylesheet' type='text/css'> 
    <link href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,700,300,100' rel='stylesheet' type='text/css'>
    <!-- Global CSS -->
    <link rel="stylesheet" href="/resources/assets/plugins/bootstrap/css/bootstrap.min.css">   
    <!-- Plugins CSS -->    
    <link rel="stylesheet" href="/resources/assets/plugins/font-awesome/css/font-awesome.css">
    <link rel="stylesheet" href="/resources/assets/plugins/flexslider/flexslider.css">
    <!-- social media buttons -->
    <link rel="stylesheet" href="/resources/assets/plugins/rrssb/css/rrssb.css" />
    <!-- Theme CSS -->
    <link id="theme-style" rel="stylesheet" href="/resources/assets/css/styles.css">
    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head> 

<body class="blog-page blog-page-single">    
    <div class="wrapper">
           
        
        <!-- ******BLOG****** -->         
        <div class="blog-entry-wrapper"> 
            
            <div class="blog-entry">                 
                <article class="post">
                    <header class="blog-entry-heading">
                        <div class="container text-center">                        
                            <h2 class="title">${boardVO.title }</h2>
                            <div class="meta">
                                <ul class="meta-list list-inline">                                       
                                	<li class="post-time"></li>
                                	<li class="post-author"> by <a href="#">James Lee</a></li>
                            	</ul><!--//meta-list-->    	
                            </div><!--meta-->
                        </div><!--//container-->
                        <nav class="post-nav post-nav-top">
    						<span class="nav-previous"><a href="/sboard/read?bno=${boardVO.bno-1}" rel="prev"><i class="fa fa-long-arrow-left"></i>Previous post</a></span>
    						<span class="nav-next"><a href="/sboard/read?bno=${boardVO.bno+1}" rel="next">Next post<i class="fa fa-long-arrow-right"></i></a></span>
    				    </nav><!--//post-nav-->
                    </header><!--//blog-entry-heading-->

                    <div class="container">
                        <div class="row">
                             
                             
                             ${boardVO.content}
                             
                                                
                            </div><!--//blog-entry-content-->
                            
                           
                            
                            
                            
                            
                            <nav class="post-nav col-md-8 col-sm-10 col-xs-12 col-md-offset-2 col-sm-offset-1 col-xs-offset-0">
            						<span class="nav-previous"><a href="#" rel="prev"><i class="fa fa-long-arrow-left"></i>Previous</a></span>
            						<span class="nav-next"><a href="#" rel="next">Next<i class="fa fa-long-arrow-right"></i></a></span>
            				</nav><!--//post-nav-->
            		
                    </div><!--//container-->      
                </article><!--//post-->                                     
            </div><!--//blog-entry-->
        </div><!--//blog-entry-wrapper-->
       
        <div class="text-center">
			<form role="form" action="/sboard/modify" method="post" >
			<input type="hidden" name="bno" value="${boardVO.bno}" />
			<input type="hidden" name="page" value="${cri.page }" />
			<input type="hidden" name="perPageNum" value="${cri.perPageNum }" />
			<input type="hidden" name="searchType" value="${cri.searchType }" />
			<input type="hidden" name="keyword" value="${cri.keyword }" />
			
				<button type="submit" id="modifyBtn" class="btn btn-inverse">수정</button>
				<button type="submit" id="removeBtn" class="btn btn-inverse">삭제</button>
				<button type="submit" id="goListBtn" class="btn btn-inverse">목록 조회</button>
			</form>  
		</div>
		<script>
</script>
		
    </div><!--//wrapper-->
    
  

    
 
    <!-- Javascript -->          
    <script type="text/javascript" src="/resources/assets/plugins/jquery-1.12.3.min.js"></script>
    <script type="text/javascript" src="/resources/assets/plugins/bootstrap/js/bootstrap.min.js"></script> 
    <script type="text/javascript" src="/resources/assets/plugins/bootstrap-hover-dropdown.min.js"></script>
    <script type="text/javascript" src="/resources/assets/plugins/back-to-top.js"></script>
    <script type="text/javascript" src="/resources/assets/plugins/jquery-placeholder/jquery.placeholder.js"></script>
    <script type="text/javascript" src="/resources/assets/plugins/FitVids/jquery.fitvids.js"></script>  
    <script type="text/javascript" src="/resources/assets/plugins/flexslider/jquery.flexslider-min.js"></script>      
      
    <!-- blog specific js starts -->
    <script type="text/javascript" src="/resources/assets/plugins/rrssb/js/rrssb.min.js"></script>
    <script type="text/javascript" src="/resources/assets/plugins/imagesloaded/imagesloaded.pkgd.min.js"></script>     
    <script type="text/javascript" src="/resources/assets/plugins/masonry.pkgd.min.js"></script> 
    <script type="text/javascript" src="/resources/assets/js/blog.js"></script>
    <!-- blog specific js ends -->    
    
    <script type="text/javascript" src="/resources/assets/js/main.js"></script>
    
            
</body>

<!-- Mirrored from themes.3rdwavemedia.com/velocity/1.7/blog-single.html by HTTrack Website Copier/3.x [XR&CO'2014], Thu, 07 Sep 2017 10:23:44 GMT -->
</html> 

