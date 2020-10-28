<%@ page contentType="text/html; charset=UTF-8"%>
<div class="header">
	<div class="contact-information row">
		<div class="col-md-3 border-right">
		<span class="glyphicon glyphicon-envelope" aria-hidden="true"></span>
		email
		</div>
		<div class="col-md-5 border-right">contact</div>
		<div class="col-md-2 border-right">Language</div>
		<div class="col-md-2 border-right">profile</div>
	</div>

	<div class="product-search row">
		<div class="col-md-2">
			<img src="static/asset/logo.png" />
		</div>	

		<div class="col-md-8 search-content">
			<ul>
				<li class="dropdown-search">
					<div class="dropdown">
						<button class="btn btn-secondary dropdown-toggle dropdown-menu-button" 
							data-toggle="dropdown"
							aria-haspopup="true" aria-expanded="false">Danh Mục</button>
						<div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
							<a class="dropdown-item" href="#">Tiểu Thuyết</a> <a
								class="dropdown-item" href="#">Thơ Truyện</a> <a
								class="dropdown-item" href="#">Văn Học</a>
						</div>
					</div>
				</li>
				
				<li class="vertical"></li>
				
				<li class="input-search">
					<input type="text" placeholder="Tìm kiếm sản phẩm mong muốn ?" />
				</li>
				<li>
					<button class="button-search">
							<span class="glyphicon glyphicon-search search"/>
					</button>
				</li>
			</ul>
		</div>

		<div class="col-md-2">
			<span class="glyphicon glyphicon-heart heart"/>
			<span class="glyphicon glyphicon-shopping-cart"/>
		</div>
	</div>
</div>