<%@page pageEncoding="UTF-8" isELIgnored="false" session="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="f" uri="http://www.slim3.org/functions"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>問題一覧</title>
</head>
<body>
<p>問題一覧</p>
<!-- button clickでmodal form出現し問題登録できる -->
<!-- 登録画面はQuestionRegist.jsp? -->
<!-- 一覧はjQuery.flexigrid? -->
	<script type="text/javascript">
		function fireRegist(){
			$("#disp").load("QuestionRegist").dialog({modal:true});
		}

	</script>

	
	<div id='disp'></div>
	<table class="flexme3" style="display: none"></table>
	
	<script type="text/javascript">
	    //<![CDATA[
	    /* jQuery(document).ready(function($) {
		    	$(".flexme3").flexigrid({
	                url : 'QuestionView',
	                dataType : 'json',
	                colModel : [ {
	                        display : 'ISO',
	                        name : 'iso',
	                        width : 40,
	                        sortable : true,
	                        align : 'center'
	                }, {
	                        display : 'Name',
	                        name : 'name',
	                        width : 180,
	                        sortable : true,
	                        align : 'left'
	                }, {
	                        display : 'Printable Name',
	                        name : 'printable_name',
	                        width : 120,
	                        sortable : true,
	                        align : 'left'
	                }, {
	                        display : 'ISO3',
	                        name : 'iso3',
	                        width : 130,
	                        sortable : true,
	                        align : 'left',
	                        hide : true
	                }, {
	                        display : 'Number Code',
	                        name : 'numcode',
	                        width : 80,
	                        sortable : true,
	                        align : 'right'
	                } ],
	                buttons : [ {
	                        name : 'Add',
	                        bclass : 'add',
	                        onpress : fireRegist
	                }, {
	                        name : 'Delete',
	                        bclass : 'delete',
	                        onpress : test
	                }, {
	                        separator : true
	                } ],
	                searchitems : [ {
	                        display : 'ISO',
	                        name : 'iso'
	                }, {
	                        display : 'Name',
	                        name : 'name',
	                        isdefault : true
	                } ],
	                sortname : "iso",
	                sortorder : "asc",
	                usepager : true,
	                title : 'Questions',
	                useRp : true,
	                rp : 15,
	                showTableToggleBtn : true,
	                width : 700,
	                height : 200
	        }); */
		    	
	    	function test(com, grid) {
                   if (com == 'Delete') {
                           confirm('Delete ' + $('.trSelected', grid).length + ' items?')
                   } else if (com == 'Add') {
                           alert('Add New Item');
                   }
            }

	    });
	    //]]>
	</script>
</body>
</html>
