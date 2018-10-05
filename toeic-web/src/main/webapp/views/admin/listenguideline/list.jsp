
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<c:url var="requestUrl" value="/admin-guideline-listen-list.html"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title><fmt:message key="label.guideline.listen.list" bundle="${lang}" /></title>
</head>
<body>
<div class="main-content">
    <div class="main-content-inner">
        <div class="breadcrumbs" id="breadcrumbs">
            <script type="text/javascript">
                try{ace.settings.check('breadcrumbs' , 'fixed')}catch(e){}
            </script>

            <ul class="breadcrumb">
                <li>
                    <i class="ace-icon fa fa-home home-icon"></i>
                    <a href="#"><fmt:message key="label.home" bundle="${lang}"/></a>
                </li>
                <li class="active"><fmt:message key="label.guideline.listen.list" bundle="${lang}"/></li>
            </ul><!-- /.breadcrumb -->
        </div>
        <div class="page-content">
            <div class="row">
                <div class="col-xs-12">
                    <div class="table-responsive">
                        <fmt:bundle basename="ApplicationResources">
                            <display:table id="tableList" name="items.listResult" partialList="true" size="${items.totalItems}"
                                            pagesize="${items.maxPageItems}" sort="external" requestURI="${requestUrl}"
                                            class="table table-fcv-ace table-striped table-bordered table-hover dataTable no-footer"
                                            style="margin: 3em 0 1.5em;">
                                <display:column property="title" titleKey="label.guideline.listen.title" sortable="trưe"/>
                                <display:column property="content" titleKey="label.guideline.listen.content" sortable="trưe"/>
                            </display:table>
                        </fmt:bundle>
                    </div>

                </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>
