function loadProfil(){
	var nom,prenom,region,age;
	$.ajax({
	    type: "GET",
        url: "http://localhost:9876/v1/user/getInfoperso",			
	    contentType: "application/json; charset=utf-8",				   
		data: '{"nom": "'+nom+'","prenom":"'+prenom+'","region":"'+region+'","age":"'+age+'"}',
	    dataType: "json",
		success:function(){
        	$('inforperso').replaceWith(nom+' '+prenom+' '+age+'</br>'+region);
        },
        error:function(){
	    	alert("Error");
		}
	});
	
}

function addFormation(){
	$('#myFormation').append("<input type='text' id='inputFormation' value='' placeholder='Ajouter une formation'><input type='month' id='dateformation' placeholder='MM/AAAA'><input type='button' id='valideformation' value='Valider'>");
	$('#valideformation').click(function(){
		if($('#inputFormation').val()!==undefined && $('#dateformation').val()!==undefined){
			var text = $('#inputFormation').val();
			var date = $('#dateformation').val();
			$('#inputFormation').detach();
			$('#dateformation').detach();
			$('#valideformation').detach();
			if(text!=='' && date!==''){
				$('#myFormation').prepend('<b>'+text+'  '+date+'</b></br>');
			}
		}
	});
}
function addExperience(){
	$('#myExperience').append("<input type='text' id='inputExperience' value='' placeholder='Ajouter une experience'><input type='month' id='dateexperience' placeholder='MM/AAAA'><input type='button' id='valideexperience' value='Valider'>");
	$('#valideexperience').click(function(){
		if($('#inputExperience').val()!==undefined && $('#dateexperience').val()!==undefined ){
			var text = $('#inputExperience').val();
			var date = $('#dateexperience').val();
			$('#inputExperience').detach();
			$('#dateexperience').detach();
			$('#valideexperience').detach();
			if(text!=='' && date!==''){
				$('#myExperience').prepend('<b>'+text+'  '+date+'</b></br>');
			}
		}
	});
}
function addLoisirs(){
	$('#myLoisirs').append("<textarea rows='3' cols='50' id='arealoisirs' placeholder='Loisirs...''></textarea><input type='button' id='valideloisirs' value='Valider'>");
	$('#valideloisirs').click(function(){
		if($('#arealoisirs').val()!==undefined ){
			var text = $('#arealoisirs').val();
			$('#arealoisirs').detach();
			$('#valideloisirs').detach();
			if(text!=='' ){
				$('#myLoisirs').prepend('<b>'+text+'</b></br>');
			}
		}
	});
}
function addInformation(){
	$('#myInformation').append("<textarea rows='3' cols='50' id='areainformation' placeholder='Informations complémentaires...''></textarea><input type='button' id='valideinformation' value='Valider'>");
	$('#valideinformation').click(function(){
		if($('#areainformation').val()!==undefined ){
			var text = $('#areainformation').val();
			$('#areainformation').detach();
			$('#valideinformation').detach();
			if(text!=='' ){
				$('#myInformation').prepend('<b>'+text+'</b></br>');
			}
		} 	
	});
}
