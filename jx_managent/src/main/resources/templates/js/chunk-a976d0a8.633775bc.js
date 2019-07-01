(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-a976d0a8"],{"95a9":function(t,a,e){"use strict";e.r(a);var i=function(){var t=this,a=t.$createElement,e=t._self._c||a;return e("div",[e("Row",{staticClass:"search-wrapper"},[e("Col",{attrs:{span:"12"}},[e("Row",{staticClass:"search-bar"},[e("Input",{staticStyle:{width:"200px"},attrs:{placeholder:"商品编号",autofocus:"",maxlength:50},model:{value:t.searchObj.commodityNum,callback:function(a){t.$set(t.searchObj,"commodityNum",a)},expression:"searchObj.commodityNum"}}),e("Select",{staticStyle:{width:"200px"},attrs:{placeholder:"请选择平台","label-in-value":!0},on:{"on-change":t.choosePlatform},model:{value:t.searchObj.platid,callback:function(a){t.$set(t.searchObj,"platid",a)},expression:"searchObj.platid"}},t._l(t.platformList,function(a,i){return e("Option",{key:i,attrs:{value:a.id}},[t._v(t._s(a.name))])}))],1),e("Row",{staticClass:"search-bar"},[e("DatePicker",{staticStyle:{width:"200px"},attrs:{value:t.searchObj.time,type:"daterange",format:"yyyy/MM/dd",placement:"bottom-start",placeholder:"选择销售时间"}}),e("Select",{staticStyle:{width:"200px"},attrs:{placeholder:"请选择匠人","label-in-value":!0},on:{"on-change":t.chooseArtist},model:{value:t.searchObj.artistid,callback:function(a){t.$set(t.searchObj,"artistid",a)},expression:"searchObj.artistid"}},t._l(t.artistList,function(a,i){return e("Option",{key:i,attrs:{value:a.id}},[t._v(t._s(a.name))])}))],1),e("Row",{staticClass:"search-bar"},[e("Button",{staticStyle:{"margin-left":"10px"},attrs:{type:"primary",loading:t.searchloading},on:{click:t.search}},[t.searchloading?e("span",[t._v("Loading...")]):e("span",[t._v("查询")])])],1)],1),e("Col",{attrs:{span:"2",offset:"10"}},[e("Button",{attrs:{type:"primary"},on:{click:t.addGoods}},[t._v("新增销售")])],1)],1),e("Table",{attrs:{columns:t.columns,data:t.list}}),e("div",{staticStyle:{margin:"10px",overflow:"hidden"}},[e("div",{staticStyle:{float:"right"}},[e("Page",{attrs:{current:t.currentPage,pageSize:t.pageSize,"show-elevator":"","show-sizer":""},on:{"on-change":t.changePage}})],1)])],1)},s=[],n=(e("ac6a"),e("cadf"),e("551c"),e("097d"),{data:function(){var t=this;return{columns:[{title:"商品编号",key:"commodityNum"},{title:"商品名称",key:"commodityName"},{title:"匠人",key:"artistName"},{title:"销售平台",key:"wayName"},{title:"销售类型",key:"saleStyle"},{title:"销售数量",key:"commodityAmount"},{title:"销售时间",key:"saleDate"},{title:"操作",key:"action",width:300,align:"center",render:function(a,e){return a("div",[a("Button",{props:{type:"info",size:"small",to:"sales-detail?id="+e.row.id},style:{"margin-left":"7px"}},"详情"),a("Button",{props:{type:"info",size:"small",to:"sales-edit?id="+e.row.id},style:{"margin-left":"7px"}},"编辑"),a("Button",{props:{type:"error",size:"small"},style:{"margin-left":"7px"},on:{click:function(){t.deleteRow(e.row.id)}}},"删除")])}}],list:[],pageSize:20,dataCountTotal:0,currentPage:1,searchloading:!1,searchObj:{commodityNum:"",platName:"",artistName:"",time:"",artistid:"",platid:""},artistList:[],platformList:[]}},created:function(){this.init(1),this.getArtistList(),this.getPlatfromList()},methods:{init:function(t){var a=this,e={pageNum:t,pageSize:this.pageSize};this.$axios({method:"post",url:"/sale/findPageByJx",data:e,headers:{"content-type":"application/json; charset=UTF-8"}}).then(function(t){console.log(t);var e=t.data;1==e.code?(a.list=e.data.list,a.dataCountTotal=e.data.data):a.$Notice.warning({title:e.msg})})},addGoods:function(){this.$router.push({name:"sales-edit"})},search:function(){var t=this;this.searchloading=!0,this.$axios({method:"post",url:"/sale/findListByJx",data:this.searchObj,headers:{"content-type":"application/json; charset=UTF-8"}}).then(function(a){t.searchloading=!1;var e=a.data;if(1==e.code){if(0==e.data.length)return void t.$Notice.warning({title:"没有搜索到结果"});t.list=e.data}else t.$Notice.warning({title:e.msg})}).then(function(a){t.searchloading=!1})},deleteRow:function(t){var a=this,e={id:t};this.$axios.post("/sale/deleteOne",this.$qs.stringify(e)).then(function(t){a.searchloading=!1;var e=t.data;1==e.code?(a.init(a.currentPage),a.$Notice.success({title:"删除成功"})):a.$Notice.warning({title:e.msg})}).then(function(t){a.searchloading=!1})},changePage:function(t){this.init(t)},getArtistList:function(){var t=this;this.$axios.post("/artist/findAllList").then(function(a){console.log(a);var e=a.data;1==e.code?e.data.forEach(function(a,e){var i={id:a.id,name:a.artistName};t.artistList.push(i)}):t.$Notice.warning({title:e.msg})})},chooseArtist:function(t){this.searchObj.artistName=t.label,this.searchObj.artistid=t.value},getPlatfromList:function(){var t=this;this.$axios.post("/plat/findAllList").then(function(a){var e=a.data;1==e.code?e.data.forEach(function(a,e){var i={id:a.id,name:a.wayName};t.platformList.push(i)}):t.$Notice.warning({title:e.msg})})},choosePlatform:function(t){this.searchObj.platName=t.label,this.searchObj.platid=t.value}}}),o=n,r=(e("ae20"),e("2877")),l=Object(r["a"])(o,i,s,!1,null,null,null);l.options.__file="Sales.vue";a["default"]=l.exports},a219:function(t,a,e){},ae20:function(t,a,e){"use strict";var i=e("a219"),s=e.n(i);s.a}}]);