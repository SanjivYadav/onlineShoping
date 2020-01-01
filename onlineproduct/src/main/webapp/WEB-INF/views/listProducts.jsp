<div class = "container">

	<div class="row">
	
		<div class="col-md-3">
		
			<%@include file ="./shared/sidebar.jsp" %>
		
		</div>
		
		<div class="col-md-9">
		
			<!-- hadling breadcrumb feature -->
			<div class = "row">
			
				<div class="col-md-12">
					<c:if test ="${userClickShowAllProducts == true}">
						<ol class ="breadcrumb">
							<li><a href="${pageContext.request.contextPath}/home">Home</a></li>
							<li class="active">All Products</li>
						</ol>
					</c:if>
					
					<c:if test ="${userClickShowCategoryProduct == true}">
						<ol class ="breadcrumb">
							<li><a href="${pageContext.request.contextPath}/home">Home</a></li>
							<li class="active">Category</li>
							<li class="active">${category.name}</li>
						</div>
					</c:if>
				</div>
			
			</div>
		
		</div>
	
	
	</div>


</div>