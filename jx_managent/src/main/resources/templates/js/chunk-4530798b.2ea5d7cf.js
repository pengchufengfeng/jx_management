(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-4530798b"],{"504c":function(t,e,o){var a=o("0d58"),n=o("6821"),i=o("52a7").f;t.exports=function(t){return function(e){var o,r=n(e),l=a(r),c=l.length,s=0,d=[];while(c>s)i.call(r,o=l[s++])&&d.push(t?[o,r[o]]:r[o]);return d}}},8615:function(t,e,o){var a=o("5ca1"),n=o("504c")(!1);a(a.S,"Object",{values:function(t){return n(t)}})},c20a:function(t,e,o){},cfe6:function(t,e,o){"use strict";var a=o("c20a"),n=o.n(a);n.a},def7:function(t,e,o){"use strict";o.r(e);var a=function(){var t=this,e=t.$createElement,o=t._self._c||e;return o("Card",[o("p",{attrs:{slot:"title"},slot:"title"},[t._v("\n      "+t._s(t.id?"编辑匠人":"添加匠人")+"\n  ")]),o("Form",{attrs:{model:t.content,"label-width":120}},[o("FormItem",{attrs:{label:"姓名"}},[o("Input",{staticStyle:{width:"400px"},attrs:{placeholder:"请输入匠人姓名"},model:{value:t.content.artistName,callback:function(e){t.$set(t.content,"artistName",e)},expression:"content.artistName"}})],1),o("FormItem",{attrs:{label:"头衔"}},[o("Input",{staticStyle:{width:"400px"},attrs:{placeholder:"请输入匠人头衔"},model:{value:t.content.title,callback:function(e){t.$set(t.content,"title",e)},expression:"content.title"}})],1),o("FormItem",{attrs:{label:"领域"}},[o("Input",{staticStyle:{width:"400px"},attrs:{placeholder:"请输入匠人领域"},model:{value:t.content.area,callback:function(e){t.$set(t.content,"area",e)},expression:"content.area"}})],1),o("FormItem",{attrs:{label:"简介"}},[o("Input",{staticStyle:{width:"400px"},attrs:{placeholder:"请输入匠人简介"},model:{value:t.content.info,callback:function(e){t.$set(t.content,"info",e)},expression:"content.info"}})],1),o("FormItem",{attrs:{label:"合作时间"}},[o("DatePicker",{staticStyle:{width:"400px"},attrs:{format:"yyyy-MM-dd HH:mm",placeholder:"选择合作时间"},on:{"on-change":t.getColDate},model:{value:t.content.colDate,callback:function(e){t.$set(t.content,"colDate",e)},expression:"content.colDate"}})],1),o("FormItem",{attrs:{label:"合作内容"}},[o("Input",{staticStyle:{width:"400px"},attrs:{placeholder:"请输入合作内容"},model:{value:t.content.colContent,callback:function(e){t.$set(t.content,"colContent",e)},expression:"content.colContent"}})],1),o("FormItem",{attrs:{label:"相关证书"}},[t.content.relCetri?o("img",{attrs:{src:t.content.relCetri,alt:""}}):t._e(),o("Upload",{ref:"uploadPicture",attrs:{action:"/file/uploadArtImage","on-success":t.uploadRelCetriSucc,format:["jpg","jpeg","png","gif","bmp"],"max-size":20480,"on-format-error":t.uploadPictureFormatError,"on-exceeded-size":t.uploadMaxSize,"with-credentials":!0,"on-error":t.uploadError,"on-remove":t.removeUploadedPictureFile,"before-upload":t.pictureBeforeUpload,"show-upload-list":!0}},[o("Button",{attrs:{icon:"ios-cloud-upload-outline"}},[t._v("上传相关证书")])],1)],1),o("FormItem",{attrs:{label:"授权书"}},[t.content.authPhoto?o("img",{attrs:{src:t.content.authPhoto,alt:""}}):t._e(),o("Upload",{ref:"uploadPicture",attrs:{action:"/file/uploadArtImage","on-success":t.uploadPhotoSuccess,format:["jpg","jpeg","png","gif","bmp"],"max-size":20480,"on-format-error":t.uploadPictureFormatError,"on-exceeded-size":t.uploadMaxSize,"with-credentials":!0,"on-error":t.uploadError,"on-remove":t.removeUploadedPictureFile,"before-upload":t.pictureBeforeUpload,"show-upload-list":!0}},[o("Button",{attrs:{icon:"ios-cloud-upload-outline"}},[t._v("上传授权书")])],1)],1),o("FormItem",{attrs:{label:"身份证信息"}},[t.content.idz?o("img",{attrs:{src:t.content.idz,alt:""}}):t._e(),t.content.idf?o("img",{attrs:{src:t.content.idf,alt:""}}):t._e(),o("Upload",{ref:"uploadPicture",attrs:{action:"/file/uploadArtImage","on-success":t.uploadIdzSuccess,format:["jpg","jpeg","png","gif","bmp"],"max-size":20480,"on-format-error":t.uploadPictureFormatError,"on-exceeded-size":t.uploadMaxSize,"with-credentials":!0,"on-error":t.uploadError,"on-remove":t.removeUploadedPictureFile,"before-upload":t.pictureBeforeUpload,"show-upload-list":!0}},[o("Button",{attrs:{icon:"ios-cloud-upload-outline"}},[t._v("上传身份证正面")])],1),o("Upload",{ref:"uploadPicture",attrs:{action:"/file/uploadArtImage","on-success":t.uploadIdfSuccess,format:["jpg","jpeg","png","gif","bmp"],"max-size":20480,"on-format-error":t.uploadPictureFormatError,"on-exceeded-size":t.uploadMaxSize,"with-credentials":!0,"on-error":t.uploadError,"on-remove":t.removeUploadedPictureFile,"before-upload":t.pictureBeforeUpload,"show-upload-list":!0}},[o("Button",{attrs:{icon:"ios-cloud-upload-outline"}},[t._v("上传身份证反面")])],1)],1),o("FormItem",{attrs:{label:"联系方式"}},[o("Input",{staticStyle:{width:"400px"},attrs:{placeholder:"请输入匠人联系方式"},model:{value:t.content.phone,callback:function(e){t.$set(t.content,"phone",e)},expression:"content.phone"}})],1),o("FormItem",{attrs:{label:"密码"}},[o("Input",{staticStyle:{width:"400px"},attrs:{placeholder:"请输入匠人密码"},model:{value:t.content.password,callback:function(e){t.$set(t.content,"password",e)},expression:"content.password"}})],1),o("div",{staticClass:"btn"},[o("Button",{staticStyle:{width:"120px"},attrs:{type:"primary",loading:t.loading,size:"large"},on:{click:t.submit}},[t.loading?o("span",[t._v("Loading...")]):o("span",[t._v("提交")])])],1)],1)],1)},n=[],i=(o("7f7f"),o("ac6a"),o("8615"),o("a481"),{data:function(){return{content:{artistName:"",info:"",col_date:"",idz:"",idf:"",photo:""},id:"",loading:!1,uploadList:[]}},created:function(){this.id=this.$route.query.id,this.id&&this.init()},methods:{init:function(){var t=this,e={id:this.id};this.$axios({method:"post",url:"/artist/getOne",data:this.$qs.stringify(e),headers:{Authorization:window.localStorage.getItem("token")}}).then(function(e){console.log(e);var o=e.data;1==o.code?t.content=o.data:t.$Notice.warning({title:o.msg})})},getColDate:function(t){this.content.colDate=t},add:function(){var t=this;this.$axios({method:"post",url:"/artist/addOne",data:this.content,headers:{"content-type":"application/json; charset=UTF-8",Authorization:window.localStorage.getItem("token")}}).then(function(e){t.loading=!1;var o=e.data;1==o.code?t.$router.push({name:"artist-list"}):t.$Notice.warning({title:o.msg})}).then(function(e){t.loading=!1})},edit:function(){var t=this;this.content.id=this.id,this.content.colDate=new Date(+new Date(new Date(this.content.colDate).toJSON())+288e5).toISOString().replace(/T/g," ").replace(/\.[\d]{3}Z/,""),this.$axios({method:"post",url:"/artist/updateOne",data:this.content,headers:{Authorization:window.localStorage.getItem("token")}}).then(function(e){t.loading=!1;var o=e.data;1==o.code?t.$router.push({name:"artist-list"}):t.$Notice.warning({title:o.msg})}).then(function(e){t.loading=!1})},submit:function(){0!=Object.values(this.content).length?(this.loading=!0,this.id?this.edit():this.add()):this.$Notice.warning({title:"请输入数据"})},uploadRelCetriSucc:function(t,e){var o=t;console.log(e),1==o.code?this.content.relCetri=o.data:this.$Message.error(t.msg)},uploadPhotoSuccess:function(t,e){var o=t;console.log(e),1==o.code?this.content.authPhoto=o.data:this.$Message.error(t.msg)},uploadIdzSuccess:function(t,e){var o=t;console.log(e),1==o.code?this.content.idz=o.data:this.$Message.error(t.msg)},uploadIdfSuccess:function(t,e){var o=t;console.log(e),1==o.code?this.content.idf=o.data:this.$Message.error(t.msg)},uploadPictureFormatError:function(t){this.$Notice.warning({title:"文件格式不正确",desc:"文件格式错误 "+t.name+" 不正确, 请选择 jpg， jpeg， png， gif or bmp."})},removeUploadedPictureFile:function(t){},uploadMaxSize:function(t){this.$Notice.warning({title:"文件太大",desc:"文件  "+t.name+" 太大， 请不要超过 20M."})},uploadError:function(t,e){console.log(t),console.log(e),this.$Message.error(t)},pictureBeforeUpload:function(){}}}),r=i,l=(o("cfe6"),o("2877")),c=Object(l["a"])(r,a,n,!1,null,null,null);c.options.__file="Edit.vue";e["default"]=c.exports}}]);