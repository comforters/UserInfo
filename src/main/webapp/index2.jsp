<%@ page isELIgnored="false" language="java" import="java.util.*" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<body>
<form action="edit2.do" method="post">
	<table>
			<tr>
				<td>Id</td>
				<td><input type="text" name="id" value="${requestScope.userinfo.id}"></td>
			</tr>
			<tr>
				<td>Name</td>
				<td><input type="text" name="name" value="${requestScope.userinfo.userName}"></td>
			</tr>
			<tr>
				<td>Age</td>
				<td><input type="text" name="age" value="${requestScope.userinfo.age}"></td>
			</tr>
			<tr>
				<td>Sex</td>
				<td><input type="radio" name="sex" value="men"
				<c:if test="${requestScope.userinfo.sex eq 'men'}">
				checked="checked"
				</c:if>
				>men
				<input type="radio" name="sex" value="women"
				<c:if test="${requestScope.userinfo.sex eq 'women'}">
				checked="checked"
				</c:if>
				>women
				</td>
			</tr>
			<tr>
				<td>Loves</td>
				<td>
				 <c:set var="bl" value="${requestScope.userinfo.loves}" scope="request"></c:set>
				 <% String[] string=(String[])request.getAttribute("bl"); %>
				 <input type="checkbox" name="loves" value="ball"
					 <%  
						 for(int i=0;i<string.length;i++){
			    				if(string[i].equals("ball")){
			    					%> checked="checked" <%
			    				}
			    			}
			   		 %>
			   		 >ball &nbsp;
					 <input type="checkbox" name="loves" value="swim"
					 <%  
						 for(int i=0;i<string.length;i++){
			    				if(string[i].equals("swim")){
			    					%> checked="checked" <%
			    				}
			    			}
			   		 %>
			   		 >swim &nbsp;
			   		 <input type="checkbox" name="loves" value="eat"
					 <%  
						 for(int i=0;i<string.length;i++){
			    				if(string[i].equals("eat")){
			    					%> checked="checked" <%
			    				}
			    			}
			   		 %>
			   		 >eat &nbsp;
				</td>
			</tr>
			<tr>
				<td><input type="submit" value="Save">
					<input type="reset" value="Reset">
				</td>
			</tr>
	</table>
</form>
</body>
</html>
