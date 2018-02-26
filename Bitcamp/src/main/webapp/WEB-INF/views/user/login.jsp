<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<section>
		<script src="${js}/jquery-3.3.1.min.js"></script>
<article>
<table id="login-outer-table">
	<tr>
		<td colspan="5">
			<form id="login-form" action="mypage">
				<table id="login-inner-table">
					<tr>
						<td><input id="login-userid-input" name="userid"
							type="text" value="kim" placeholder="ID" tabindex="1" />
						</td>
						<td rowspan="2">
							<button id="login-btn">LOGIN</button>
						</td>
					</tr>
					<tr>
						<td><input id="login-password-input" name="password"
							type="password" value="1" placeholder="PASSWORD" tabindex="2" />
							<input type="hidden" name="cmd" value="login" />
							<input type="hidden" name="page" value="mypage" />
						</td>
					</tr>
				</table>
			</form> <a id="login-admin-link" href="#"> 관리자 </a>
					 | <a id="login-join-link" href="#">회원가입 </a>
		</td>
	</tr>
</table>
</article>
</section>
<script>
$('#login-btn').on('click',function(){	
	location.href = '${path.context}/mypage';
});
</script>











