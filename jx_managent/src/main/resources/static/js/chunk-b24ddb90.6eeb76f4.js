(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-b24ddb90"],{"3f87":function(t,a,e){"use strict";e.r(a);var i=function(){var t=this,a=t.$createElement,e=t._self._c||a;return e("div",[e("Row",{staticClass:"search-wrapper"},[e("Col",{attrs:{span:"12"}},[e("Row",{staticClass:"search-bar"},[e("Select",{staticStyle:{width:"200px"},attrs:{placeholder:"请选择平台","label-in-value":!0},on:{"on-change":t.choosePlatform},model:{value:t.searchObj.platid,callback:function(a){t.$set(t.searchObj,"platid",a)},expression:"searchObj.platid"}},t._l(t.platformList,function(a,i){return e("Option",{key:i,attrs:{value:a.id}},[t._v(t._s(a.name))])})),e("Input",{staticStyle:{width:"200px"},attrs:{placeholder:"活动名称",autofocus:"",maxlength:50},model:{value:t.searchObj.activityName,callback:function(a){t.$set(t.searchObj,"activityName",a)},expression:"searchObj.activityName"}})],1),e("Row",{staticClass:"search-bar"},[e("Select",{staticStyle:{width:"200px"},attrs:{placeholder:"请选择匠人","label-in-value":!0},on:{"on-change":t.chooseArtist},model:{value:t.searchObj.artistid,callback:function(a){t.$set(t.searchObj,"artistid",a)},expression:"searchObj.artistid"}},t._l(t.artistList,function(a,i){return e("Option",{key:i,attrs:{value:a.id}},[t._v(t._s(a.name))])})),e("Button",{attrs:{type:"primary",loading:t.searchloading},on:{click:t.search}},[t.searchloading?e("span",[t._v("Loading...")]):e("span",[t._v("查询")])])],1)],1),e("Col",{attrs:{span:"2",offset:"10"}},[e("Button",{attrs:{type:"primary"},on:{click:t.add}},[t._v("新增运营")])],1)],1),e("Table",{attrs:{columns:t.columns,data:t.list}}),e("div",{staticStyle:{margin:"10px",overflow:"hidden"}},[e("div",{staticStyle:{float:"right"}},[e("Page",{attrs:{current:t.currentPage,pageSize:t.pageSize,"show-elevator":"","show-sizer":""},on:{"on-change":t.changePage}})],1)])],1)},s=[],n=(e("ac6a"),{data:function(){var t=this;return{columns:[{title:"平台",key:"platName"},{title:"活动名称",key:"activityName"},{title:"进度",key:"currentActivity"},{title:"匠人",key:"artistName"},{title:"预计上线时间",key:"preDate"},{title:"操作",key:"action",width:300,align:"center",render:function(a,e){return a("div",[a("Button",{props:{type:"info",size:"small",to:"operating-edit?id="+e.row.id},style:{"margin-left":"7px"}},"编辑"),a("Button",{props:{type:"error",size:"small"},style:{"margin-left":"7px"},on:{click:function(){t.deleteRow(e.row.id)}}},"删除")])}}],list:[],pageSize:20,dataCountTotal:0,currentPage:1,searchloading:!1,searchObj:{platName:"",activityName:"",artistName:"",artistid:"",platid:""},artistList:[],platformList:[]}},created:function(){this.getArtistList(),this.getPlatfromList(),this.init(1)},methods:{init:function(t){var a=this,e={pageNum:t,pageSize:this.pageSize};this.$axios({method:"post",url:"/operation/findPageByJx",data:e,headers:{"content-type":"application/json; charset=UTF-8"}}).then(function(t){console.log(t);var e=t.data;1==e.code?a.list=e.data.list:a.$Notice.warning({title:e.msg})})},add:function(){this.$router.push({name:"operating-edit"})},search:function(){var t=this;this.searchloading=!0,this.$axios({method:"post",url:"/operation/findListByJx",data:this.searchObj,headers:{"content-type":"application/json; charset=UTF-8"}}).then(function(a){t.searchloading=!1;var e=a.data;if(1==e.code){if(0==e.data.length)return void t.$Notice.warning({title:"没有搜索到结果"});t.list=e.data}else t.$Notice.warning({title:e.msg})}).then(function(a){t.searchloading=!1})},deleteRow:function(t){var a=this,e={id:t};this.$axios.post("/operation/deleteOne",this.$qs.stringify(e)).then(function(t){a.searchloading=!1;var e=t.data;1==e.code?(a.init(a.currentPage),a.$Notice.success({title:"删除成功"})):a.$Notice.warning({title:e.msg})}).then(function(t){a.searchloading=!1})},changePage:function(t){this.init(t)},getArtistList:function(){var t=this;this.$axios.post("/artist/findAllList").then(function(a){console.log(a);var e=a.data;1==e.code?e.data.forEach(function(a,e){var i={id:a.id,name:a.artistName};t.artistList.push(i)}):t.$Notice.warning({title:e.msg})})},chooseArtist:function(t){this.searchObj.artistName=t.label,this.searchObj.artistid=t.value},getPlatfromList:function(){var t=this;this.$axios.post("/plat/findAllList").then(function(a){var e=a.data;1==e.code?e.data.forEach(function(a,e){var i={id:a.id,name:a.wayName};t.platformList.push(i)}):t.$Notice.warning({title:e.msg})})},choosePlatform:function(t){this.searchObj.platName=t.label,this.searchObj.platid=t.value}}}),o=n,r=(e("9d4a"),e("2877")),c=Object(r["a"])(o,i,s,!1,null,null,null);c.options.__file="List.vue";a["default"]=c.exports},"8f9d":function(t,a,e){},"9d4a":function(t,a,e){"use strict";var i=e("8f9d"),s=e.n(i);s.a}}]);