<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8"> <![endif]-->  
<!--[if IE 9]> <html lang="en" class="ie9"> <![endif]-->  
<!--[if !IE]><!--> <html lang="en"> <!--<![endif]-->  

<!-- Mirrored from themes.3rdwavemedia.com/velocity/1.7/blog.html by HTTrack Website Copier/3.x [XR&CO'2014], Thu, 07 Sep 2017 10:23:40 GMT -->
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
    <!-- Theme CSS -->
    <link id="theme-style" rel="stylesheet" href="/resources/assets/css/styles.css">
    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head> 



<body class="blog-page">

    <div class="wrapper">
        <!-- ******HEADER****** --> 
	
        <section class="section">       
       		<%@ include file="../include/login.jspf" %>
            <%@ include file="../include/blog_header.jspf" %>
            
           <div class="searchbox-container"  style="width:400px; float:right; margin-right: 5px">
						<div class="searchbox" style="float:right; margin-right: 380px; margin-top:5px">
							<div class="col-md-5">
								<select class="form-control searchbox-input" name="searchType">
									<option value="n"
										<c:out value="${cri.searchType == null?'selected':''}"/>>
							Select Search Type</option>
									<option value="t"
										<c:out value="${cri.searchType eq 't'?'selected':''}"/>>
							Title</option>
									<option value="c"
										<c:out value="${cri.searchType eq 'c'?'selected':''}"/>>
							Content</option>
									<option value="w"
										<c:out value="${cri.searchType eq 'w'?'selected':''}"/>>
							Writer</option>
									<option value="tc"
										<c:out value="${cri.searchType eq 'tc'?'selected':''}"/>>
							Title OR Content</option>
									<option value="cw"
										<c:out value="${cri.searchType eq 'cw'?'selected':''}"/>>
							Content OR Writer</option>
									<option value="tcw"
										<c:out value="${cri.searchType eq 'tcw'?'selected':''}"/>>
							Title OR Content OR Writer</option>
								</select>

							</div>
							<div class="col-md-7">
								<input id="search-form" class="form-control searchbox-input"
									placeholder="Search the blog..." type="search" value=""
									name="search-form">
							</div>

							<input class="searchbox-submit" type="submit" value="GO"
								onclick="search()"> <i class="fa fa-search searchbox-icon"></i>
						<script>
	function search() {
		self.location = "list"
				+ '${pageMaker.makeQuery(1)}'
				+ "&searchType="
				+ $("select option:selected").val()
				+ "&keyword=" + $('#search-form').val();
	}
</script>
						</div>
						
					</div> 
					<!--//searchbox-container-->
                    
        </section><!--//featured-blog-posts-->

        
        <!-- ******BLOG LIST****** --> 
        <div class="blog container">
            <div class="row">
                <div id="blog-mansonry" class="blog-list">
                
                	<c:forEach items="${list}" var="boardVO">
                		
                	   <article class="post col-md-4 col-sm-6 col-xs-12">
                        <div class="post-inner">
                            <figure class="post-thumb">
                                <a href="/sboard/readPage${pageMaker.makeSearch(pageMaker.cri.page)}&bno=${boardVO.bno}"><img src="/resources/assets/images/blog/post-1-thumb.jpg" alt="" /></a>                                
                            </figure><!--//post-thumb-->
                            <div class="content">
                                <h3 class="post-title"><a href="/sboard/readPage${pageMaker.makeSearch(pageMaker.cri.page)}&bno=${boardVO.bno}">${boardVO.title}</a></h3>
                                <div class="post-entry">
                                    <p>${boardVO.content }</p>
                                    <a class="read-more" href="/sboard/readPage${pageMaker.makeSearch(pageMaker.cri.page)}&bno=${boardVO.bno}">Read more <i class="fa fa-long-arrow-right"></i></a>
                                </div>
                                <div class="meta">
                                    <ul class="meta-list list-inline">                                       
                                    	<li class="post-time post_date date updated">${boardVO.regdate }</li>
                                    	<li class="post-author"> by ${boardVO.writer}</li>
                                    	<li class="post-comments-link">
                                	        <a href="blog-single.html#comment-area"><i class="fa fa-comments"></i>8</a>
                                	    </li>
                                	</ul><!--//meta-list-->                           	
                                </div><!--meta-->
                            </div><!--//content-->
                          
                        </div><!--//post-inner-->
                    </article><!--//post-->
               
                	  </c:forEach>
             
                
                   
                  
                    
                    
                </div><!--//blog-list-->  
            </div><!--//row-->
            <div class="pagination-container text-center">
                <ul class="pagination">
                   <c:choose>
                            	<c:when test="${pageMaker.prev }">
                            		<li><a href="/sboard/list${pageMaker.makeSearch(pageMaker.startPage - 1) }">&laquo;</a></li>
                            	</c:when>
                            	<c:otherwise>
                            		<li class="disabled"><a href="javascript:;">&laquo;</a></li>
                            	</c:otherwise>
                            </c:choose>
							<c:forEach begin="${pageMaker.startPage }" 
								end="${pageMaker.endPage }" var="idx">
								<li <c:out value="${pageMaker.cri.page == idx?'class=active':''}" />>
								<a href="/sboard/list${pageMaker.makeSearch(idx) }">${idx}</a>
								</li>
							
							</c:forEach>
							<c:choose>
                            	<c:when test="${pageMaker.next }">
                            		<li><a href="/sboard/list${pageMaker.makeSearch(pageMaker.endPage + 1) }">&raquo;</a></li>
                            	</c:when>
                            	<c:otherwise>
                            		<li class="disabled"><a href="javascript:;">&raquo;</a></li>
                            	</c:otherwise>
                            
                            </c:choose>
							
	
                   			
                   			
               		
               			

                    
               
                </ul><!--//pagination-->
                 
               	

            	 <!--<div style="float:right; margin-top:10px">
               		 <form role="form" action="/sboard/register" method="get" >
						<button type="submit" id="registerBtn" class="btn btn-inverse">로그인</button>
					</form> 
                </div> -->
            </div><!--//pagination-container-->
            
        </div><!--//blog-->        
    </div><!--//wrapper-->
    
   
    <!-- Video Modal -->
    <div class="modal modal-video" id="modal-video" tabindex="-1" role="dialog" aria-labelledby="videoModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                    <h4 id="videoModalLabel" class="modal-title sr-only">Video Tour</h4>
                </div>
                <div class="modal-body">
                    <div class="video-container">
                        <iframe src="http://player.vimeo.com/video/28872840?color=ffffff&amp;wmode=transparent" width="720" height="405" frameborder="0" webkitallowfullscreen mozallowfullscreen allowfullscreen></iframe>
                    </div><!--//video-container-->
                </div><!--//modal-body-->
            </div><!--//modal-content-->
        </div><!--//modal-dialog-->
    </div><!--//modal-->
    
    <!-- *****CONFIGURE STYLE****** -->  
    
 
    <!-- Javascript -->          
    <script type="text/javascript" src="/resources/assets/plugins/jquery-1.12.3.min.js"></script>
    <script type="text/javascript" src="/resources/assets/plugins/bootstrap/js/bootstrap.min.js"></script> 
    <script type="text/javascript" src="/resources/assets/plugins/bootstrap-hover-dropdown.min.js"></script>
    <script type="text/javascript" src="/resources/assets/plugins/back-to-top.js"></script>
    <script type="text/javascript" src="/resources/assets/plugins/jquery-placeholder/jquery.placeholder.js"></script>
    <script type="text/javascript" src="/resources/assets/plugins/FitVids/jquery.fitvids.js"></script>
    <script type="text/javascript" src="/resources/assets/plugins/flexslider/jquery.flexslider-min.js"></script> 
            
    <!-- blog page specific js starts --> 
    <script type="text/javascript" src="/resources/assets/plugins/imagesloaded/imagesloaded.pkgd.min.js"></script>     
    <script type="text/javascript" src="/resources/assets/plugins/masonry.pkgd.min.js"></script> 
    <script type="text/javascript" src="/resources/assets/js/blog.js"></script>
    <!-- blog page specific js ends -->   
     
    <script type="text/javascript" src="/resources/assets/js/main.js"></script>
    
            
</body>

<!-- Mirrored from themes.3rdwavemedia.com/velocity/1.7/blog.html by HTTrack Website Copier/3.x [XR&CO'2014], Thu, 07 Sep 2017 10:23:43 GMT -->
</html> 
