//dom加载完执行
$(document).ready(function () {
    initGrid()
});


function initGrid(){
	//创建jqGrid组件
	jQuery("#jqGrid").jqGrid(
			{
				// url : 'data/JSONData.json',//组件创建完成之后请求数据的url
				datatype : "local",//请求数据返回的类型。可选json,xml,txt
				colNames : [ 'Inv No', 'Date', 'Client',  ],//jqGrid的列显示名字
				colModel : [ //jqGrid每一列的配置信息。包括名字，索引，宽度,对齐方式.....
				             {name : 'id',index : 'id',width: 160,sortable: false},
				             {name : 'invdate',index : 'invdate',width: 160,sortable: false},
				             {name : 'name',index : 'name asc, invdate',width: 160,sortable: false},

				           ],
				rowNum : 10,//一页显示多少条
				rowList : [ 10, 20, 30 ],//可供用户选择一页显示多少条
				pager : '#jqGridPager',//表格页脚的占位符(一般是div)的id
				sortname : 'id',//初始化的时候排序的字段
				sortorder : "desc",//排序方式,可选desc,asc
				// mtype : "post",//向后台请求数据的ajax的类型。可选post,get
				viewrecords : true,
				gridComplete:function () {
				//隐藏grid底部滚动条
                    $("#jqGrid").closest(".ui-jqgrid-bdiv").css({ "overflow-x" : "hidden" }).end().setGridWidth(580);
                }
				// autowidth: true
				// caption : "JSON Example"//表格的标题名字
			});
            /*可以控制界面上增删改查的按钮是否显示*/
            // jQuery("#list2").jqGrid('navGrid', '#pager2', {edit : false,add : false,del : false});
              for ( var i = 0; i <= data.rows.length; i++){
                jQuery("#jqGrid").jqGrid('addRowData', i + 1, data.rows[i]);
              }
}
var data = {
	"page": "1",
	"total": 2,
	"records": "13",
	"rows": [{
		"id": "13",
		"name":'姓名',
		"invdate": new Date().toLocaleDateString()
	},{
      		"id": "14",
      		"name":'姓名',
      		"invdate": new Date().toLocaleDateString()
      	},{
          		"id": "15",
          		"name":'姓名',
          		"invdate": new Date().toLocaleDateString()
          	},{
              		"id": "16",
              		"name":'姓名',
              		"invdate": new Date().toLocaleDateString()
              	},{
                  		"id": "17",
                  		"name":'姓名',
                  		"invdate": new Date().toLocaleDateString()
                  	},{
                      		"id": "18",
                      		"name":'姓名',
                      		"invdate": new Date().toLocaleDateString()
                      	},{
                          		"id": "19",
                          		"name":'姓名',
                          		"invdate": new Date().toLocaleDateString()
                          	},{
                              		"id": "20",
                              		"name":'姓名',
                              		"invdate": new Date().toLocaleDateString()
                              	},{
                                  		"id": "21",
                                  		"name":'姓名',
                                  		"invdate": new Date().toLocaleDateString()
                                  	}

	],
	"userdata": {
		"amount": 3220,
		"tax": 342,
		"total": 3564,
		"name": "Totals:"
	}
}
