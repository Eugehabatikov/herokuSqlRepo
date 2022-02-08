<%--
  Created by IntelliJ IDEA.
  User: евгений
  Date: 05.12.2021
  Time: 18:01
  To change this template use File | Settings | File Templates.
--%>
<script src="http://code.jquery.com/jquery-1.8.3.js"></script>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script>
    function your_javascript_fun_name() {
        $.ajax({
            type : 'POST',
            url : 'show.ajax',//this is url mapping for controller
            success : function(response) {
                alert(response);
                //this response is list of object commming from server
            },
            error : function() {
                alert("opps error occured");
            }
        });
    }
</script>