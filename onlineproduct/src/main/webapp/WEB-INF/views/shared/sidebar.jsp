<p class="lead">Shop Name</p>
 <div class="list-group">
 
	 <c:forEach items="${categories}" var= "category">
	 	<a href="${pageContext.request.contextPath}/show/category/${category.id}/product" class="list-group-item" id="a_${category.name}">${category.name }</a>
	 </c:forEach>
     
 </div>