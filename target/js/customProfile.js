function loadProfil(){
	var nom,prenom,region,age;

	var invocation = new XMLHttpRequest();
	var url = "http://localhost:9876/v1/user/boid@gmail.com/getInfoperso";
   
	function callOtherDomain() {
  	if(invocation) {    
   	 invocation.open('GET', url, true);
   	 invocation.onreadystatechange = handler;
     invocation.send(); 

 	 }
	}
	 function handler(evtXHR) {
    if (invocation.readyState == 4)
    {
      if (invocation.status == 200) {
          alert('gg');
      }
      else {
        alert("Invocation Errors Occured");
      }
    }
  }

	/*$.ajax({
	    type: "GET",
        url: "http://localhost:9876/v1/user/boid@gmail.com/getInfoperso",			
	    contentType: "application/json; charset=utf-8",				   
		data: '{"nom": "'+nom+'","prenom":"'+prenom+'","region":"'+region+'","age":"'+age+'"}',
	    dataType: "jsonp",
		success:function(){
        	$('infoperso').replaceWith(nom+' '+prenom+' '+age+'</br>'+region);
        },
        error:function(){
	    	alert("Error");
		}
	});*/
	
}

function addFormation(){
	$('#myFormation').append("<input type='text' id='inputFormation' value='' placeholder='Ajouter une formation'><input type='month' id='dateformation' placeholder='MM/AAAA'><input type='button' id='valideformation' value='Valider'>");
	$('#buttonformation').prop('disabled',true);
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
			$('#buttonformation').prop('disabled',false);
		}
	});
}
function addExperience(){
		$('#myExperience').append("<input type='text' id='inputExperience' value='' placeholder='Ajouter une experience'><input type='month' id='dateexperience' placeholder='MM/AAAA'><input type='button' id='valideexperience' value='Valider'>");
	$('#buttonexperience').prop('disabled',true);
	
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
			$('#buttonexperience').prop('disabled',false);
		}
	});
}
function addLoisirs(){

		$('#myLoisirs').append("<textarea rows='3' cols='50' id='arealoisirs' placeholder='Loisirs...''></textarea><input type='button' id='valideloisirs' value='Valider'>");
		$('#buttonloisirs').prop('disabled',true);
	$('#valideloisirs').click(function(){
		if($('#arealoisirs').val()!==undefined ){
			var text = $('#arealoisirs').val();
			$('#arealoisirs').detach();
			$('#valideloisirs').detach();
			if(text!=='' ){
				$('#myLoisirs').prepend('<b>'+text+'</b></br>');
			}
			$('#buttonloisirs').prop('disabled',false);
		}
	});
}
function addInformation(){
		$('#myInformation').append("<textarea rows='3' cols='50' id='areainformation' placeholder='Informations complémentaires...''></textarea><input type='button' id='valideinformation' value='Valider'>");
	$('#buttoninformation').prop('disabled',true);
	$('#valideinformation').click(function(){
		if($('#areainformation').val()!==undefined ){
			var text = $('#areainformation').val();
			$('#areainformation').detach();
			$('#valideinformation').detach();
			if(text!=='' ){
				$('#myInformation').prepend('<b>'+text+'</b></br>');
			}
			$('#buttoninformation').prop('disabled',false);
		} 	
	});
}
