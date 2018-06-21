<%--
  Created by IntelliJ IDEA.
  User: GengXiaohu
  Date: 2018/6/20
  Time: 8:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<style>
    #logindiv {

        text-align: center;

        border: 2px solid #FF0000;
        width: 300px;
        height: 300px;
        margin: auto;
        position: absolute;
        top: 0;
        left: 0;
        right: 0;
        bottom: 0;
    }
</style>
<body>
<div id="logindiv">
    <form action="/login/url" method="post">
        <label>用户名:</label> <input type="text" name="name"/></br>
        <label>密 码：</label><input type="text" name="password"/> </br>
        <label>登 陆：</label><select name="logintype">
        <option value="student" name="user">学生</option>
        <option value="assistant" name="user">辅导员</option>
        <option value="faculty" name="user">书记</option>
    </select></br>
        <input type="submit" name="提交"/>
    </form>
</div>
</body>
</html>


</body>
</html>
