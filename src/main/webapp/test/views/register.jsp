<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<form method="POST"
		action="/SP22B2_SOF3011_IT16301/register">
		<div>
			<label>Họ tên</label>
			<input type="text" name="hoTen" />
		</div>
		<div>
			<label>Địa chỉ</label>
			<input type="text" name="diaChi" />
		</div>
		<div>
			<label>SĐT</label>
			<input type="text" name="sdt" />
		</div>
		<div>
			<label>Email</label>
			<input type="email" name="email" />
		</div>
		<div>
			<label>Password</label>
			<input type="password" name="password" />
		</div>
		<div>
			<label>Giới tính</label>
			<input type="radio" name="gioiTinh" value="1" />
			<label>Nam</label>
			<input type="radio" name="gioiTinh" value="0" />
			<label>Nữ</label>
		</div>
		<!-- <div>
			<label>Loại KH</label>
			<select name="loaiKH">
				<option value="0">Thường</option>
				<option value="1">VIP</option>
			</select>
		</div> -->
		<div>
			<button>Đăng ký</button>
		</div>
</form>