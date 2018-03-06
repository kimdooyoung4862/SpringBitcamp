<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<script src="${js}/jquery-3.3.1.min.js"></script>
<section>
<article>
	<table id="mypage-table">
		<tr>
			<td id="mypage-profile-img-td" rowspan="5">
				<img id="mypage-profile-img"/></td>
			<td class="mypage-column">ID</td>
			<td class="mypage-data">${user.id}</td>
			<td class="mypage-column">BIRTHDAY</td>
			<td class="mypage-data">${user.ssn}</td>
		</tr>
		<tr>
			<td class="mypage-column">PASSWORD</td>
			<td class="mypage-data">****</td>
			<td class="mypage-column">PHONE</td>
			<td class="mypage-data">${user.phone}</td>
		</tr>
		<tr>
			<td class="mypage-column">NAME</td>
			<td class="mypage-data">${user.name}</td>
			<td class="mypage-column">EMAIL</td>
			<td class="mypage-data">${user.email}</td>
		</tr>
		<tr>
			<td class="mypage-column">SSN</td>
			<td class="mypage-data">${user.ssn}</td>
			<td class="mypage-column">ADDRESS</td>
			<td class="mypage-data">${user.addr}</td>
		</tr>
		<tr>
			<td class="mypage-column">ACCOUNT</td>
			<td class="mypage-data"></td>
			<td class="mypage-column"></td>
			<td class="mypage-data"></td>
		</tr>
		<tr>
  			<td colspan="6" style="width: 100%">
  				<button id="mypage-leave-btn" >
  					탈 퇴
  				</button>
  				<button id="mypage-change-btn">
  					수 정
  				</button>
  				<button id="mypage-btn" >
  					네비 이동
  				</button>
  			</td>
  		</tr>
	</table>
</article>
</section>
<script>
$('#mypage-btn').on('click',function(){
	
	location.href = "${path.context}/nav";
});
</script>

