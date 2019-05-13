<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ include file = "/admin/templet/header.jsp" %>

<!-- 테이블 영역  -->
<div class="row">
    <div class="col-lg-12">
        <div class="panel panel-primary">
            <div class="panel-heading">
                <h3 class="panel-title"><i class="fa fa-bar-chart-o"></i> Traffic Sources One month tracking </h3>
            </div>
            <div class="panel-body">
                <div id="shieldui-grid1" role ="grid" aria-readonly="true" class ="sui-grid sui-gird-core">
                	<div class ="sui-gridheader">
                		<table class = "sui-table">
                			<colgroup>
                				<col style = "width : 170px;">
                				<col>
                				<col>
                				<col>
                		   </colgroup>
                		   <thead>
                		   	<tr role = "row" class = "sui-columnheader"> </tr>
                		   	<tbody class = "sui-hide">
                		   		<tr class = "sui-row" role = "row">
                		   			<td role = "gridcell" tabindex = "-1" class = "sui-cell">Direct</td>
                		   			<td role = "gridcell" tabindex = "-1" class = "sui-cell">323</td>
                		   			<td role = "gridcell" tabindex = "-1" class = "sui-cell">23%</td>
                		   			<td role = "gridcell" tabindex = "-1" class = "sui-cell">600</td>
                		   		</tr>
                		   	</tbody>
                		</table>
                	</div>
                </div>
            </div>
        </div>
    </div>
</div>
            
            
<%@ include file ="/admin/templet/footer.jsp" %>