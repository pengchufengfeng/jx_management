(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-7362b54a"],{6047:function(t,a,e){"use strict";var i=e("ed7b"),n=e.n(i);n.a},ed7b:function(t,a,e){},f860:function(t,a,e){"use strict";e.r(a);var i=function(){var t=this,a=t.$createElement,e=t._self._c||a;return e("div",[e("Row",{staticClass:"search-wrapper"},[e("Col",{attrs:{span:"12"}},[e("Row",{staticClass:"search-bar"},[e("Input",{staticStyle:{width:"200px"},attrs:{placeholder:"平台名称",autofocus:"",maxlength:50,clearable:"",clearable:!0},model:{value:t.searchObj.wayName,callback:function(a){t.$set(t.searchObj,"wayName",a)},expression:"searchObj.wayName"}}),e("Button",{attrs:{type:"primary",loading:t.searchloading},on:{click:t.search}},[t.searchloading?e("span",[t._v("Loading...")]):e("span",[t._v("查询")])])],1),e("Row",{staticClass:"search-bar"})],1),e("Col",{attrs:{span:"2",offset:"10"}},[e("Button",{attrs:{type:"primary"},on:{click:t.addGoods}},[t._v("新增平台")])],1)],1),e("Table",{attrs:{columns:t.columns,data:t.list}}),e("div",{staticStyle:{margin:"10px",overflow:"hidden"}},[e("div",{staticStyle:{float:"right"}},[e("Page",{attrs:{total:t.dataCountTotal,current:t.currentPage,pageSize:t.pageSize,"show-elevator":"","show-sizer":""},on:{"on-change":t.changePage,"on-page-size-change":t.onpagesizechange}})],1)])],1)},n=[],o={data:function(){var t=this;return{columns:[{title:"平台名称",key:"wayName"},{title:"操作",key:"action",width:300,align:"center",render:function(a,e){return a("div",[a("Button",{props:{type:"info",size:"small",to:"platform-edit?id="+e.row.id},style:{"margin-left":"7px"}},"编辑"),a("Button",{props:{type:"error",size:"small"},style:{"margin-left":"7px"},on:{click:function(){t.deleteRow(e.row.id)}}},"删除")])}}],list:[],pageSize:10,dataCountTotal:0,currentPage:1,searchloading:!1,searchObj:{wayName:""}}},created:function(){this.init(1,this.pageSize)},methods:{init:function(t,a){var e=this,i={pageNum:t,pageSize:a};this.$axios({method:"post",url:"/plat/findPage",data:i,headers:{"content-type":"application/json; charset=UTF-8",Authorization:window.localStorage.getItem("token")}}).then(function(t){console.log(t);var a=t.data;1==a.code?(e.list=a.data.list,e.dataCountTotal=a.data.total):e.$Notice.warning({title:a.msg})})},addGoods:function(){this.$router.push({name:"platform-edit"})},search:function(){var t=this;this.searchloading=!0,this.$axios({method:"post",url:"/plat/findList",data:this.searchObj,headers:{"content-type":"application/json; charset=UTF-8",Authorization:window.localStorage.getItem("token")}}).then(function(a){t.searchloading=!1;var e=a.data;if(1==e.code){if(0==e.data.length)return void t.$Notice.warning({title:"没有搜索到结果"});t.list=e.data}else t.$Notice.warning({title:e.msg})}).then(function(a){t.searchloading=!1})},deleteRow:function(t){var a=this,e={id:t};this.$axios({method:"post",url:"/plat/deleteOne",data:this.$qs.stringify(e),headers:{Authorization:window.localStorage.getItem("token")}}).then(function(t){a.searchloading=!1;var e=t.data;1==e.code?(a.init(a.currentPage,a.pageSize),a.$Notice.success({title:"删除成功"})):a.$Notice.warning({title:e.msg})}).then(function(t){a.searchloading=!1})},changePage:function(t){this.currentPage=t,this.init(t,this.pageSize)},onpagesizechange:function(t){this.pageSize=t,this.init(1,this.pageSize)}}},s=o,r=(e("6047"),e("2877")),c=Object(r["a"])(s,i,n,!1,null,null,null);c.options.__file="List.vue";a["default"]=c.exports}}]);