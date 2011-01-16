

function getRuta(){
	var ruta = window.location.pathname.split("/");
	return ruta[1];
}

function poblarExamenes(obj) {
    
    if (obj == "0") {
        alert("entro");
        return;
    }
   
    url = '/' + getRuta()+ '/comboExamenes?var='+obj;
    url = url + '&ms=' + (new Date()).getTime();
    ajax0 = new Ajax.Request(url, {
        asynchronous : false,
        method : 'get',
        onSuccess : llenarComboExamens
    });
}


function llenarComboExamens(xmlObj) {
    forms = document.forms[0];

    var xmlDoc = xmlObj.responseXML;

	
    if(xmlDoc.getElementsByTagName('OPCION').length >= 1){
        xml_combo = xmlDoc.getElementsByTagName('OPCION')[0].getElementsByTagName('COMBO')[0];
        forms.elements('selExamen').options.length=xmlDoc.getElementsByTagName('OPCION').length;
   
        for (i = 1; i < xmlDoc.getElementsByTagName('OPCION').length; i++){
            xml_opcion = xmlDoc.getElementsByTagName('OPCION')[i];
            xml_codigo = xml_opcion.getElementsByTagName('CODIGO')[0];
            xml_nombre =  xml_opcion.getElementsByTagName('NOMBRE')[0];
        
            forms.elements('selExamen').options[i].value = xml_codigo.firstChild.data;
            forms.elements('selExamen').options[i].text =  xml_nombre.firstChild.data;

        }

    }
    return;
	
}

function SetAlternativaPregunta(obj){
	    
	    $.ajax( {
		type : "get",
		url : getRuta() + '/setearAlternativas',
		data : "var=" + obj,
		success : ''
	});
	
	
	
}