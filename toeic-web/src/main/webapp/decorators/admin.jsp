<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title><dec:title default="Admin Page"/></title>
    <script src="<c:url value='/template/admin/assets/js/jquery.min.js' />"></script>
    <link rel="stylesheet" href="<c:url value='/template/admin/assets/css/bootstrap.min.css' />" />
    <link rel="stylesheet" href="<c:url value='/template/admin/font-awesome/4.5.0/css/font-awesome.min.css' />" />
    <link rel="stylesheet" href="<c:url value='/template/admin/assets/css/ace.min.css' />" class="ace-main-stylesheet" id="main-ace-style" />
    <script src="<c:url value='/template/admin/assets/js/ace-extra.min.js' />"></script>
    <link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/themes/smoothness/jquery-ui.css">
    <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script type='text/javascript' src='<c:url value="/template/admin/js/jquery-2.2.3.min.js" />'></script>
    <script src="<c:url value='/template/admin/assets/js/jquery.2.1.1.min.js' />"></script>
    <link rel="stylesheet" href="<c:url value="/template/admin/css/global_admin_style.css"/>">
    <script type="text/javascript" src="<c:url value="/template/admin/js/global_admin_script.js"/>"></script>
    <script src="<c:url value='/template/admin/assets/js/jquery.validate.min.js' />"></script>

    <%--ckeditor plugin--%>
    <%--<script type="text/javascript" src="<c:url value="/ckeditor/ckeditor.js"/>"></script>--%>

    <%--sweetalert--%>
    <script type='text/javascript' src='<c:url value="/template/admin/sweetalert/sweetalert2.min.js"/>'></script>
    <link rel="stylesheet" href="<c:url value="/template/admin/sweetalert/sweetalert2.min.css"/>">

    <%--datatable--%>
    <%--<link href="<c:url value="/template/data-table/media/css/dataTables.bootstrap4_v4.6.1.min.css"/>" rel="stylesheet">
    <script type="text/javascript" src="<c:url value="/template/data-table/data_table-1.0.0.js"/>"></script>
    <script type="text/javascript" src="<c:url value="/template/data-table/data-table-bootstrap4-1.0.0.js"/>"></script>--%>
    <%--ckfinder--%>
    <%--<script type="text/javascript" src="<c:url value="/ckfinder/ckfinder.js"/>"></script>--%>
    <dec:head/>
</head>
<body class="no-skin">
<!-- Begin header -->
<%@ include file="/common/admin/header.jsp" %>
<!-- End header -->
<!-- Begin body -->
<div class="main-container" id="main-container">
    <script type="text/javascript">
        try{ace.settings.check('main-container' , 'fixed')}catch(e){}
    </script>
    <%@ include file="/common/admin/menu.jsp" %>
</div>
<dec:body/>
<!-- End body -->

<!-- Begin footer -->
<%@ include file="/common/admin/footer.jsp" %>
<a href="#" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse">
    <i class="ace-icon fa fa-angle-double-up icon-only bigger-110"></i>
</a>
<!-- End footer -->
<script src="<c:url value="/template/admin/assets/js/bootstrap.min.js"/>"></script>

<!-- page specific plugin scripts -->

<!--[if lte IE 8]>

<script src="<c:url value='/template/admin/assets/js/excanvas.min.js'/>"></script>
<![endif]-->
<script src="<c:url value="/template/admin/assets/js/jquery-ui.custom.min.js"/>"></script>
<script src="<c:url value="/template/admin/assets/js/jquery.ui.touch-punch.min.js"/>"></script>
<script src="<c:url value="/template/admin/assets/js/jquery.easypiechart.min.js"/>"></script>
<script src="<c:url value="/template/admin/assets/js/jquery.sparkline.min.js"/>"></script>
<script src="<c:url value="/template/admin/assets/js/jquery.flot.min.js"/>"></script>
<script src="<c:url value="/template/admin/assets/js/jquery.flot.pie.min.js"/>"></script>
<script src="<c:url value="/template/admin/assets/js/jquery.flot.resize.min.js"/>"></script>

<!-- ace scripts -->
<script src="<c:url value="/template/admin/assets/js/ace-elements.min.js"/>"></script>
<script src="<c:url value="/template/admin/assets/js/ace.min.js"/>"></script>
</body>
</html>
