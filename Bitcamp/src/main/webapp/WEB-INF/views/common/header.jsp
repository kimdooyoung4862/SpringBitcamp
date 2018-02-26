<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<style>
    .navbar-brand {
        padding-top: 0px;
    }
	</style>
<nav class="navbar navbar-default">
      <div class="container container-fluid">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">
          	<img style="height: 130%" src="${path.img}/common/logo.jpg" alt="" />
          </a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
            <li class="active"><a href="#">
            	<span class="glyphicon glyphicon-home" aria-hidden="true"></span>
            </a></li>
            <li><a id="a-about" href="#about">
            	<span class="glyphicon glyphicon-map-marker" aria-hidden="true"> about</span>
            </a></li>
            <li><a id="a-login" href="#">
            	<span class="glyphicon glyphicon-user" aria-hidden="true"> login</span>
            </a></li>
            <li><a id="a-burgerking" href="#">
            	<span class="glyphicon glyphicon-hand-right" aria-hidden="true"> 버거킹</span>
            </a></li>
            <li><a id="a-kakao" href="#">
            	<span class="glyphicon glyphicon-hand-right" aria-hidden="true"> 카카오뱅크</span>
            </a></li>
            <li><a id="a-bitcamp" href="#">
            	<span class="glyphicon glyphicon-hand-right" aria-hidden="true"> 비트캠프</span>
            </a></li>
            <li><a id="a-mobile" href="#">
            	<span class="glyphicon glyphicon-hand-right" aria-hidden="true"> 모바일</span>
            </a></li>
            <li><a id="a-lotto" href="#">
            	<span class="glyphicon glyphicon-hand-right" aria-hidden="true"> 로또</span>
            </a></li>
            <li><a id="a-logout" href="#">
            	<span class="glyphicon glyphicon-log-out" aria-hidden="true"> logout</span>
            </a></li>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>
<script>
	$('#a-login').on('click',function(){	
		location.href = '${path.context}/login';
	});
	$('#a-burgerking').on('click',function(){	
		location.href = '${path.context}/burgerking';
	});
	$('#a-bitcamp').on('click',function(){	
		location.href = '${path.context}/bitcamp';
	});
	$('#a-lotto').on('click',function(){	
		location.href = '${path.context}/lotto';
	});
	$('#a-kakao').on('click',function(){	
		location.href = '${path.context}/kakao';
	});
	$('#a-mobile').on('click',function(){	
		location.href = '${path.context}/mobile';
	});
	$('#a-logout').on('click',function(){	
		location.href = '${path.context}/login';
	});
</script>
		
		
		
		