<%@ page contentType="text/html; charset=UTF-8"%>
<div class="header">
	<div class="contact-information row">
		<div class="col-md-4 border-right">
			<div class="mail-contact">
				<span class="fa fa-envelope" aria-hidden="true"></span>
				trancongdanh@gmail.com
			</div>
		</div>

		<div class="col-md-4 border-right">
			<div class="phone-contact">
				<i class=" fa fa-phone"></i> +84.776.123.456
			</div>
			<div class="social-network">
				<ul>
					<li><a href="#"><i class="fa fa-facebook"
							aria-hidden="true" style="color: black"></i></a></li>
					<li><a href="#"><i class="fa fa-twitter"
							style="color: black"></i></a></li>
					<li><a href="#"><i class="fa fa-pinterest"
							aria-hidden="true" style="color: black"></i></a></li>
					<li><a href="#"><i class="fa fa-linkedin"
							style="color: black"></i></a></li>
				</ul>
			</div>
		</div>

		<div class="col-md-2 border1-right">
			<div class="lang">
				<button class="btn btn-secondary dropdown-toggle" type="button"
					id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false">Language</button>
				<div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
					<a class="dropdown-item" href="#">Vietnamese</a> <a
						class="dropdown-item" href="#">English</a>
				</div>
			</div>
		</div>

		<div class="col-md-1 border-right">
			<div class="login-top">
				<a href="#" class="login-top"><i class="fa fa-user"></i> Login </a>
			</div>
		</div>
	</div>
	<div class="product-search row">
		<div class="col-md-2">
			<img src="static/asset/logo.png" />
		</div>

		<div class="col-md-8 search-content">
			<ul>
				<li class="dropdown-search">
					<div class="dropdown">
						<button
							class="btn btn-secondary dropdown-toggle dropdown-menu-button"
							data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Danh
							Mục</button>
						<div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
							<a class="dropdown-item" href="#">Tiểu Thuyết</a> <a
								class="dropdown-item" href="#">Thơ Truyện</a> <a
								class="dropdown-item" href="#">Văn Học</a>
						</div>
					</div>
				</li>

				<li class="vertical"></li>

				<li class="input-search"><input type="text"
					placeholder="Tìm kiếm sản phẩm mong muốn ?" /></li>
				<li>
					<button class="button-search">
						<span class="glyphicon glyphicon-search search" />
					</button>
				</li>
			</ul>
		</div>

		<div class="col-md-2">
			<span class="glyphicon glyphicon-heart heart" /> <span
				class="glyphicon glyphicon-shopping-cart" />
		</div>
	</div>
</div>