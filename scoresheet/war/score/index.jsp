<%@page pageEncoding="UTF-8" isELIgnored="false" session="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="f" uri="http://www.slim3.org/functions"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />

<script type="text/javascript">

	$(function() {
		$('#ui-tab').tabs();
	});
	
</script>
</head>
<body>
<div id="ui-tab">
	<ul>
		<li><a href="ScheduleView"><span>スケジュール</span></a>
		<li><a href="QuestionView"><span>問題リスト</span></a>
	</ul>
</div>
</body>
</html>
