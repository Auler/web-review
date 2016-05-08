<%@ page language="java" pageEncoding="UTF-8" %>
<%@include file="../header.jsp" %>
<link href="${path}/js/3rd/cityselect/css/select2.css" rel="stylesheet"/>
<link href="${path}/js/3rd/kindeditor/themes/default/default.css" rel="stylesheet"/>
<div class="top">
    <div class="place">
        <span>位置：</span>
        <ul class="placeul">
            <li><a href="#">项目管理</a></li>
            <li><a href="#">开始新项目管理</a></li>
        </ul>
    </div>
    <%@include file="../top.jsp" %>
</div>

<div class="formbody">

    <div class="formtitle"><span>发布新项目申请</span></div>

    <ul class="forminfo short validationEngineContainer">
        <input name="" type="hidden" value=""/>
        <li><label>公告标题</label><input name="title" type="text" class="long-input validate[required]"
                                                  value=""></li>
        <li class="line"><label>公告内容</label><textarea style="width:72%;height:250px" name="content"></textarea></li>

        <li class="line"><label>申报时间</label>
            <input name="timeStart" type="text" class="short-input Wdate"
                   value="" onfocus="WdatePicker({minDate:'%y-%M-%d'})"/>&emsp;~&emsp;
            <input name="timeEnd" type="text" class="short-input Wdate"
                   value="" onfocus="WdatePicker({minDate:'%y-%M-%d'})"/>
        </li>

        <li class="line"><label>项目类别</label>

            <div class="vocation">
                <select name="classOne" class="useselect validate[required]">
                    <c:forEach var="t" items="${classOnes}">
                        <option value="${t.id}">${t.name}</option>
                    </c:forEach>
                </select>
            </div>
            <div class="vocation" style="margin-left: 40px;">
                <select name="classTwo" class="useselect validate[required]">
                    <c:forEach var="t" items="${classTwos}">
                        <option value="${t.id}">${t.name}</option>
                    </c:forEach>
                </select>
            </div>
        </li>

        <li class="line"><label>评审方案选择</label>

            <div class="vocation">
                <select name="reviewProgram" class="useselect validate[required]">
                    <c:forEach var="t" items="${classTwos}">
                        <option value="${t.id}">${t.name}</option>
                    </c:forEach>
                </select>
            </div>
        </li>

        <li><label>&nbsp;</label><input type="button" class="btn saveBtn" value="确认保存"/></li>
    </ul>
</div>
<%@include file="../footer.jsp" %>

<script>
    $(function () {
        //
        $('.saveBtn').ajaxbtn('doAddProjectAnnouncement.htm', function () {
            return {
                //id: $.trim($('input[name="id"]').val()),
                title: $.trim($('input[name="title"]').val()),
                content: $.trim($('input[name="content"]').val()),
                name: $.trim($('input[name="name"]').val()),
                timeStart: $.trim($('input[name="timeStart"]').val()),
                timeEnd: $.trim($('input[name="timeEnd"]').val()),
                classOne: $.trim($('select[name="classOne"]').val()),
                classTwo: $.trim($('select[name="classTwo"]').val()),

            }
        }, function () {
            return $('.forminfo').validationEngine('validate');
        });
    });
</script>