<%--
  Created by IntelliJ IDEA.
  User: maple
  Date: 20-3-18
  Time: 下午1:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Test</title>
    <script>
        $(function() {
            $("input.pvValue").keyup(function(){
                var value = $(this).val();
                var page = "admin_propertyValue_update";
                var pvid = $(this).attr("pvid");
                var parentSpan = $(this).parent("span");
                parentSpan.css("border","1px solid yellow");
                $.post(
                    page,
                    {"value":value,"id":pvid},
                    function(result){
                        if("success"==result)
                            parentSpan.css("border","1px solid green");
                        else
                            parentSpan.css("border","1px solid red");
                    }
                );
            });
        });
    </script>
</head>
<body>
<span class="pvValue"><input class="pvValue" pvid="1" type="text" value="2"></span>

</body>
</html>
