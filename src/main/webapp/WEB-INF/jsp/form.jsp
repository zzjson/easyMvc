<%--
  Created by IntelliJ IDEA.
  User: zzy
  Date: 2018/2/10
  Time: 11:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<fieldset>
    <legend>
        BaseForm
    </legend>
    <form action="/dog/list" method="post">
        <fieldset>
            <legend>
                dog
            </legend>
            <input type="text" name="dog.name"/>
            <input type="text" name="dog.age"/>
        </fieldset>
        <fieldset>
            <legend>
                cat
            </legend>
            <input type="text" name="cat.name">
            <input type="text" name="cat.age">
        </fieldset>
        <button>提交咯</button>

    </form>
</fieldset>

</body>
</html>
