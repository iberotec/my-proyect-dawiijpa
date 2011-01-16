<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
    <head>
        <title></title>
        <link rel="stylesheet" type="text/css" href = "css/formulario.css"/>
        <style type="text/css">
            .menu_int {
                font-family: Verdana, Arial, Helvetica, sans-serif;
                font-size: 10px;
                color: #1e4253;
                font-weight: 500;
            }
            .menu_input {
                font-family: Verdana, Arial, Helvetica, sans-serif;
                font-size: 10px;
                color: #FFFFFF;
                background-color: #27475e;
                font-weight: 400;
            }
            .label{
                font-family: arial;
                font-size: 11px;
            }
            .labelError{
                font-family: arial;
                font-weight: bold;
                font-size: 11px;
                color: #FE2E2E;
            }

        </style>
        <script type="text/javascript">
            function fn_loguea(){
                if(fn_validaForm()){
                    var f=document.forms[0];

                    if (f.opcionRecordar.checked == true){
                        SetCookie("LOGINCOOK","1",900);
                        SetCookie("USERCOOK",f.strLogin.value,900);

                      
                    }else{
                        SetCookie("LOGINCOOK","0",900);
                        SetCookie("USERCOOK","",900);
       
                    }


                    document.forms[0].submit();
                }
            }
            function fn_validaForm(){
                var form = document.forms[0];
                if(form.strLogin.value == ''){
                    alert('Ingrese su c\xf3digo de usuario por favor.')
                    form.strLogin.focus();
                    return false;
                }
                if(form.strClave.value == ''){
                    alert('Ingrese su clave por favor.')
                    form.strClave.focus();
                    return false;
                }
                return true;
            }


            function ver(){

                var opc = GetCookie("LOGINCOOK");
                var f=document.forms[0];
                if (opc == 1){
                    f.opcionRecordar.checked = true;
                    var usi = GetCookie("USERCOOK");
                    f.strLogin.value = usi;

                }


                f.strClave.focus();
               
            }


            function SetCookie(cookieName,cookieValue,nDays) {
                var today = new Date();
                var expire = new Date();
                if (nDays==null || nDays==0) nDays=1;
                expire.setTime(today.getTime() + 3600000*24*nDays);
                document.cookie = cookieName+"="+escape(cookieValue) + ";expires="+expire.toGMTString();
            }

            function GetCookie(cookieName) {
                var theCookie=""+document.cookie;
                var ind=theCookie.indexOf(cookieName);
                if (ind==-1 || cookieName=="") return "";
                var ind1=theCookie.indexOf(';',ind);
                if (ind1==-1) ind1=theCookie.length;
                return unescape(theCookie.substring(ind+cookieName.length+1,ind1));
            }
        </script>
    </head>
    <body style="margin-top:0px;margin-left:0px;margin-right:0px;margin-bottom:0px"  onload="javascript:ver()">
        <center>
            <s:form action="login">

  

                <table width="500" border="0" cellpadding="0" cellspacing="0" align="center" style="margin-top:100px">
                    <tr>
                        <td width="500" height="120" style="background-image:url(images/login/login_top_new.png);background-repeat:no-repeat"></td>
                    </tr>
                    <tr>
                        <td>
                            <table cellpadding="0" cellspacing="0" border="0">
                                <td width="127" height="100" style="background-image:url(images/login/login_left_new.jpg);background-repeat:no-repeat">
                                </td>
                                <td width="260">
                                    <table border="0" cellpadding="0" cellspacing="0" width="90%" align="center">
                                        <tr bgcolor="#EEEEEE">
                                            <td height="10" colspan="2"></td>
                                        </tr>
                                        <tr bgcolor="#EEEEEE">
                                            <td class="label" align="right" width="40%"><s:label key="label.usuario" /> &nbsp;</td>
                                            <td>
                                            <s:textfield name="strUsuario" cssStyle="width:120px" cssClass="menu_int"/>
                                 
                                            </td>
                                        </tr>
                                        <tr bgcolor="EEEEEE">
                                            <td class="label" align="right"><s:label key="label.password" /> &nbsp;</td>
                                            <td>
                                             <s:password name="strPassword"  cssStyle="width:120px" cssClass="menu_int" onkeydown="if(event.keyCode == 13)fn_loguea();"/>
                                                
                                            </td>
                                        </tr>
                                        <tr bgcolor="#EEEEEE">
                                            <td height="5" colspan="2"></td>
                                        </tr>



                                        <tr bgcolor="EEEEEE">
                                            <td colspan="2" align="center">
                                            <s:submit cssClass="menu_input" value="Ingresar" />&nbsp;
                                                <input type="button" class="menu_input" value="Limpiar" onclick=""/>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td  bgcolor="#EDEEF0" class="label" colspan="2" align="center">


                                                <input type="checkbox" name="checkbox" value="checkbox" id="opcionRecordar"/>
                                                <label>Recordar Usuario</label>

                                            </td>

                                        </tr>
                                        
                                        <c:if test="${strMensaje != null }">
                                        <tr>
                                        <td bgcolor="#EDEEF0" class="label" colspan="2">
                                    
                                        <s:label key="strMensaje"></s:label>
                                        
                                        </td>
                                        </tr>
                                        </c:if>
                                        <tr bgcolor="#EEEEEE">
                                            <td height="10" colspan="2"></td>
                                        </tr>
                                        <tr bgcolor="#EEEEEE">
                                            <td height="10" colspan="2"></td>
                                        </tr>

                                    </table>
                                </td>
                                <td width="127" height="100" style="background-image:url(images/login/login_right_new.jpg);background-repeat:no-repeat"></td>
                            </table>
                        </td>
                    </tr>
                    <tr>
                        <td width="500" height="24" style="background-image:url(images/login/Log_In_HMPLC_14_new.jpg);background-repeat:no-repeat"></td>
                    </tr>
                </table>
                <br>

            </s:form>
        </center>
    </body>
</html>