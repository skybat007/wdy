<html>
<head>
    <title>国家(地区)信息</title>
    <link href="${request.contextPath}/static/css/style.css" rel="stylesheet" type="text/css"/>
</head>
<body style="margin-top:50px;overflow: hidden;">
<form action="${request.contextPath}/questionnaires/save" method="post">
    <input type="hidden" name="id" value="<#if questionnaire.id??>${questionnaire.id}</#if>"/>
    <input type="hidden" name="spId" value="<#if questionnaire.spId??>${questionnaire.spId}<#else>111</#if>"/>
    <input type="hidden" name="resultPrompt" value="<#if questionnaire.resultPrompt??>${questionnaire.resultPrompt}<#else>111</#if>"/>
    <input type="hidden" name="questionnaireStatus" value="<#if questionnaire.questionnaireStatus??>${questionnaire.questionnaireStatus}<#else>0</#if>"/>
    <input type="hidden" name="delFlag" value="<#if questionnaire.delFlag??>${questionnaire.delFlag}<#else>0</#if>"/>
    
    <table class="gridtable" style="width:800px;">
        <tr>
            <th colspan="5">问卷信息 - [<a href="${request.contextPath}/questionnaires">返回</a>]</th>
        </tr>
        <tr>
            <th>问卷标题：</th>
            <td><input type="text" name="questionnaireTitle" value="<#if questionnaire.questionnaireTitle??>${questionnaire.questionnaireTitle}</#if>"/>
            </td>
            <th>问卷描述：</th>
            <td><input type="text" name="questionnaireDesc" value="<#if questionnaire.questionnaireDesc??>${questionnaire.questionnaireDesc}</#if>"/>
            </td>
            <td><input type="submit" value="保存"/></td>
        </tr>
    <#if msg??>
        <tr style="color:#00ba00;">
            <th colspan="5">${msg}</th>
        </tr>
    </#if>
    </table>
</form>
</body>
</html>
