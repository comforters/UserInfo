<%@ page isELIgnored="false" language="java" import="java.util.*" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<html>
<head>
	<link rel="stylesheet" type="text/css" href="themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="themes/icon.css">
    <script type="text/javascript" src="js/jquery.min.js"></script>
    <script type="text/javascript" src="js/jquery.easyui.min.js"></script>
</head>
<body>
<form action="user.do" method="post">
	<table>
			<tr>
				<td>Id</td>
				<td><input type="text" name="id"></td>
			</tr>
			<tr>
				<td>Name</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>Age</td>
				<td><input type="text" name="age"></td>
			</tr>
			<tr>
				<td>Sex</td>
				<td><input type="radio" name="sex" value="men">men &nbsp;&nbsp;&nbsp;&nbsp;
					<input type="radio" name="sex" value="women">women 
				</td>
			</tr>
			<tr>
				<td>Loves</td>
				<td><input type="checkbox" name="loves" value="ball">ball &nbsp;
					<input type="checkbox" name="loves" value="swim">swim &nbsp;
					<input type="checkbox" name="loves" value="eat">eat
				</td>
			</tr>
			<tr>
				<td><input type="submit" value="Insert">
					<input type="reset" value="Reset">
				</td>
			</tr>
	</table>
</form>

<div id="pp" style="background:#efefef;border:1px solid #ccc;"></div>
<div id="content" class="easyui-panel" style="height:auto"
    data-options="href:'page.do?page=1'">
</div>
<div class="easyui-pagination" style="border:1px solid #ccc;"
    data-options="
    total: 2000,
    pageSize: 10,
    onSelectPage: function(pageNumber, pageSize){
    $('#content').panel('refresh', 'page.do?pageNumber='+pageNumber);
    }">
</div>
</body>
</html>
