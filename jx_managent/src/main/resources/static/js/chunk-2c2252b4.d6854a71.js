(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-2c2252b4"],{"504c":function(t,e,a){var n=a("0d58"),i=a("6821"),o=a("52a7").f;t.exports=function(t){return function(e){var a,l=i(e),s=n(l),c=s.length,r=0,d=[];while(c>r)o.call(l,a=s[r++])&&d.push(t?[a,l[a]]:l[a]);return d}}},7679:function(t,e,a){"use strict";var n=a("e859"),i=a.n(n);i.a},8615:function(t,e,a){var n=a("5ca1"),i=a("504c")(!1);n(n.S,"Object",{values:function(t){return i(t)}})},e859:function(t,e,a){},efb4:function(t,e,a){"use strict";a.r(e);var n=function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("Card",[t.id?a("p",{attrs:{slot:"title"},slot:"title"},[t._v("平台活动编辑")]):a("p",{attrs:{slot:"title"},slot:"title"},[t._v("平台活动添加")]),a("Form",{attrs:{model:t.content,"label-width":120}},[a("FormItem",{attrs:{label:"平台名称"}},[a("Select",{staticStyle:{width:"400px"},attrs:{placeholder:"请选择平台","label-in-value":!0},on:{"on-change":t.choosePlatform},model:{value:t.content.platId,callback:function(e){t.$set(t.content,"platId",e)},expression:"content.platId"}},t._l(t.platformList,function(e,n){return a("Option",{key:n,attrs:{ids:e.id,value:e.id}},[t._v(t._s(e.name))])}))],1),a("FormItem",{attrs:{label:"平台活动"}},[a("Input",{staticStyle:{width:"400px"},attrs:{placeholder:"请输入平台活动"},model:{value:t.content.activityName,callback:function(e){t.$set(t.content,"activityName",e)},expression:"content.activityName"}})],1),a("FormItem",{attrs:{label:"平台服务费率"}},[a("Input",{staticStyle:{width:"400px"},attrs:{placeholder:"请输入平台服务费率"},model:{value:t.content.platRate,callback:function(e){t.$set(t.content,"platRate",e)},expression:"content.platRate"}})],1),a("div",{staticClass:"btn"},[a("Button",{staticStyle:{width:"120px"},attrs:{type:"primary",loading:t.loading,size:"large"},on:{click:t.submit}},[t.loading?a("span",[t._v("Loading...")]):a("span",[t._v("提交")])])],1)],1)],1)},i=[],o=(a("ac6a"),a("8615"),a("cadf"),a("551c"),a("097d"),{data:function(){return{content:{id:"",platId:"",platName:"",activityName:"",platRate:""},id:"",loading:!1,platformList:[]}},created:function(){this.id=this.$route.query.id,this.getPlatfromList(),this.id&&this.init()},methods:{init:function(){var t=this,e={id:this.id};this.$axios({method:"post",url:"/platDetail/getOne/",data:this.$qs.stringify(e),headers:{Authorization:window.localStorage.getItem("token")}}).then(function(e){console.log(a);var a=e.data;1==a.code?t.content=a.data:t.$Notice.warning({title:a.msg})})},add:function(){var t=this;this.$axios({method:"post",url:"/platDetail/addOne",data:this.content,headers:{"content-type":"application/json; charset=UTF-8",Authorization:window.localStorage.getItem("token")}}).then(function(e){t.loading=!1;var a=e.data;1==a.code?t.$router.push({name:"platformDetail-list"}):t.$Notice.warning({title:a.msg})}).then(function(e){t.loading=!1})},edit:function(){var t=this;this.content.id=this.id,this.$axios({method:"post",url:"/platDetail/updateOne",data:this.content,headers:{"content-type":"application/json; charset=UTF-8",Authorization:window.localStorage.getItem("token")}}).then(function(e){t.loading=!1;var a=e.data;1==a.code?t.$router.push({name:"platformDetail-list"}):t.$Notice.warning({title:a.msg})}).then(function(e){t.loading=!1})},submit:function(){0!=Object.values(this.content).length?(this.loading=!0,this.id?this.edit():this.add()):this.$Notice.warning({title:"请输入数据"})},getPlatfromList:function(){var t=this;this.$axios({method:"post",url:"/plat/findAllList",headers:{"content-type":"application/json; charset=UTF-8",Authorization:window.localStorage.getItem("token")}}).then(function(e){var a=e.data;1==a.code?a.data.forEach(function(e,a){var n={id:e.id,name:e.wayName};t.platformList.push(n)}):t.$Notice.warning({title:a.msg})})},choosePlatform:function(t){this.content.platName=t.label,this.content.platId=t.value,console.log("t"+t.label)}}}),l=o,s=(a("7679"),a("2877")),c=Object(s["a"])(l,n,i,!1,null,null,null);c.options.__file="EditPlatDetail.vue";e["default"]=c.exports}}]);