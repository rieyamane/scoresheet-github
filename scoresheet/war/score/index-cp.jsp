<%@page pageEncoding="UTF-8" isELIgnored="false" session="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="f" uri="http://www.slim3.org/functions"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>ScoreSheet ver1.0</title>
<!-- General css/js -->
<link type="text/css" href="/css/score/jquery-ui-1.8.14.custom.css" rel="Stylesheet" />	
<script type="text/javascript" src="/js/jquery-1.5.1.min.js"></script>
<script type="text/javascript" src="/js/jquery-ui-1.8.14.custom.min.js"></script>
<!-- For ScheduleView -->
<link type="text/css" href="/css/score/fullcalendar.css" rel="Stylesheet" />	
<script type="text/javascript" src="/js/fullcalendar.js"></script>

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
