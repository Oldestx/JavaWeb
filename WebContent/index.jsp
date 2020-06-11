<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>网上花店后台管理系统</title>
</head>
<body>
	<div
		style="background-color: #A4D0D3; display: flex; align-items: center; padding-left: 20px; text-shadow: 4px 0px #FFF;">

		<img alt="head_title" src="images/head_flower.png"
			style="width: 60px; height: 60px;">
		<h1 style="font-family: 微软雅黑; color: #787878">&nbsp;&nbsp;祥瑞礼品商务网</h1>
	</div>

	<div
		style="background-color: #20b1aa; height: 30px; color: white; padding-top: 10px;">首页
		鲜花 果篮 婚庆系列 在线留言</div>

	<div style="padding-top: 10px;">
		<div
			style="border: 2px dashed #537b73; height: 30px; padding-top: 10px;">首页
			注册新用户</div>
	</div>
	<div style="padding-top: 10px;">
		<div
			style="border: 2px dashed #537b73; height: 400px; padding-top: 10px;">
			<h1 align="center">签写留言 | 查看回复</h1>

			<form action="UserServlet" method="get">

				<table align="center";>

					<table align="center";>
						<tr>
							<td align="right">*留言者：</td>
							<td><input type="text" name="name">
							<td>（*为必填项）</td>
							<td>
						</tr>

						<tr>
							<td align="right">联系电话：</td>
							<td><input type="text" name="telephone">
							<td>（如留手机号，我们将短信回复您）</td>
							</td>
						</tr>

					</table>

					<table align="center";>
						<tr>
							<td>*内容：</td>
							<td><textarea rows="10" cols="49" name="text"></textarea></td>
						</tr>

						<tr>
							<td align="left"><input type="submit" value="马上提交"></td>
							<td><input type="submit" value="取消"></td>
						</tr>
					</table>
			</form>
		</div>
	</div>
</body>
</html>