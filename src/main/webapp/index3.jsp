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

<table border="1" width="100%">
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Age</th>
				<th>Sex</th>
				<th>Loves</th>
				<th>Op</th>
			</tr>
			<c:forEach items="${sessionScope.list}" var="uim">
			<tr>
				<td>${uim.id}</td>
				<td>${uim.userName}</td>
				<td>${uim.age}</td>
				<td>${uim.sex}</td>
				<td>
					 <c:set var="bl" value="${uim.loves}" scope="request"></c:set>
					 <% String[] string=(String[])request.getAttribute("bl");
						for(int i=0;i<string.length;i++){
							if(i==string.length-1){
							out.print(string[i]);
							}else{
								out.print(string[i]+",");
							}
						}
					 %>
				</td>
				<td><a href="del.do?id=${uim.id}">删除</a>&nbsp;<a href="edit1.do?id=${uim.id}">编辑</a></td>
			</tr>
			</c:forEach>
</table>
</body>
</html>
