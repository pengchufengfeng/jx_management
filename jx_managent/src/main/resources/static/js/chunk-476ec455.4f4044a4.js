(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-476ec455"],{"0f2d":function(t,e,n){},"2c66":function(t,e,n){"use strict";var a=n("0f2d"),o=n.n(a);o.a},c163:function(t,e,n){"use strict";n.r(e);var a=function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",[n("Card",[n("p",{attrs:{slot:"title"},slot:"title"},[t._v("\n      销售详情\n    ")]),n("Form",[n("FormItem",{attrs:{label:"商品编号"}},[n("span",[t._v(t._s(t.content.commodityNum))])]),n("FormItem",{attrs:{label:"商品名称"}},[n("span",[t._v(t._s(t.content.commodityName))])]),n("FormItem",{attrs:{label:"销售平台"}},[n("span",[t._v(t._s(t.content.wayName))])]),n("FormItem",{attrs:{label:"销售类型"}},[n("span",[t._v(t._s(t.content.saleStyle))])]),n("FormItem",{attrs:{label:"商品单价"}},[n("span",[t._v(t._s(t.content.prePrice))])]),n("FormItem",{attrs:{label:"商品销售量"}},[n("span",[t._v(t._s(t.content.commodityAmount))])]),n("FormItem",{attrs:{label:"商品销售额"}},[n("span",[t._v(t._s(t.content.salePrice))])]),n("FormItem",{attrs:{label:"商品结算额"}},[n("span",[t._v(t._s(t.content.finalPrice))])]),n("FormItem",{attrs:{label:"销售日期"}},[n("span",[t._v(t._s(t.content.saleDate))])])],1)],1)],1)},o=[],s=(n("cadf"),n("551c"),n("097d"),{data:function(){return{content:"",id:""}},created:function(){this.id=this.$route.query.id,this.init()},methods:{init:function(){var t=this,e={id:this.id};this.$axios({method:"post",url:"/sale/getOneByJx",data:this.$qs.stringify(e),headers:{Authorization:window.localStorage.getItem("token")}}).then(function(e){console.log(e);var n=e.data;1==n.code?t.content=n.data:t.$Notice.warning({title:n.msg})})}}}),i=s,r=(n("2c66"),n("2877")),l=Object(r["a"])(i,a,o,!1,null,null,null);l.options.__file="SalesDetail.vue";e["default"]=l.exports}}]);