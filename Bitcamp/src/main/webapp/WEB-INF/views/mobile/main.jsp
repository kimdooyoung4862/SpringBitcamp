<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<style>
    .container {
        margin-top: 50px;
    }
    .thumbnail img {
        width: 200px;
        height: 200px;
    }
    .thumbnail{
        background-color: #f2f2f2;
        text-align: center;
        padding: 10px;
    }
    .modal-body {
        text-align: center;
    }
    .input-group {
        width: 200px;
        text-align: center;
    }
    .panel-primary > .panel-heading {
          padding: 5px
    }
    .caption {
        margin-top: 10px;
    }
</style>
<div class="container">
<div class="panel panel-primary">
<div class="panel panel-heading">
    <h4>주문하기</h4>
</div>
<form id="form-open-phone">
<div class="panel-body">
<div class = "row">
	<c:forEach begin="0" end="5" items="${phones}" step="1" var="phone">
		<div class = "col-sm-2">
	     <div class = "thumbnail">
	        <img src = "${path.img}/phone/${phone.thumbnail}.jpg" alt = "">
	        <hr />
	        <input type="hidden" name="phoneSeq" value="${phone.seq}"/>
	        <input id="radio" type="radio" name="model" value="${phone.model}"/>
	        
	     </div>
        </div>
	</c:forEach>
<div class="thumbnail">
          <div class="form-group">
            <label for="sel1">통신사를 선택하세요.</label> <select
              class="form-control" name="telecom" id="sel1">
              <option value="SKT">SKT</option>
              <option value="KT">KT</option>
              <option value="LGU+">LGU+</option>
            </select><br>
          </div>
        </div>
      </div>
   </div>
</form>  
</div>
<div class="panel-footer" style="text-align: center;">
    <button type="button" class="btn btn-danger" data-dismiss="modal">
    <span class="glyphicon glyphicon-remove"></span>&nbsp; 취소</button>&nbsp;&nbsp;&nbsp;
    <button id="phone-open-btn" type="button" class="btn btn-primary" data-dismiss="modal">
    <span class="glyphicon glyphicon-ok"></span>&nbsp; 개통</button>
</div>
</div>
<script>
$('#phone-open-btn').on('click',function(){
	var $openForm = $('#form-open-phone');
	$openForm.attr('action','${path.context}/mobile/openphone');
	$openForm.attr('method','post');
	var selectedVal = $('#radio').prop("checked", true);
	alert('선택한 폰 '+selectedVal);
	//$openForm.submit();
});
</script>
