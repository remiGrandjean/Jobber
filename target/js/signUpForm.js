function valid_form(){
	if(document.myform.name.value == ""){
		alert("Veuillez entrer votre nom"); 
		document.myform.name.focus();
		return false;
	}
	if(document.myform.surname.value == ""){
		alert("Veuillez entrer votre prénom");
		document.myform.surname.focus();
		return false;
	} 
	if(document.myform.age.value < 0){
		alert("Veuillez entrer un âge valide");
		document.myform.surname.focus();
		return false;
	}
	if(document.myform.mail.value !== document.myform.confirm_mail.value){
		alert("Erreur dans la répétition du mail");
		document.myform.mail.focus();
		return false;
	}
	if(document.myform.passwd.value !== document.myform.confirm_passwd.value){
		alert("Erreur dans la répétition du mot de passe");
		document.myform.passwd.focus();
		return false;
	}
}
$('connectionform').on('submit',function(e){
	e.preventDefault();
	var email=$('login').val();
	var mdp =$('password').val();	
	$.ajax({
		type: "GET",
		url: "http://localhost:9876/v1/user/"+email,			
		contentType: "application/json; charset=utf-8",				   
		data: '{"email": "' + email + '", "mdp" : "' + mdp + '"}',
		dataType: "json", 
		success:function(){
			a = new authen(email,mdp);
			console.log(a);
			$('formulaire').append("Connection réussi");
		},
		error:function(){
			$('formulaire').append("Identifiants incorrects");
		}
	});
	
});

$('myform').on('submit',function(e){
	console.log("boid");
	e.preventDefault();
	var $this=$(this);
	var nom =$('nom').val();
	var prenom =$('prenom').val();
	var mail =$('mail').val();
	var role =$('role').val();
	var mdp =$('passwd').val();
	var region =$('region').val();

	var data= {
		'email': mail,
		'mdp': mdp,
		'nom': nom,
		'prenom': prenom,
		'age': age,
		'region': region,
		'role': role,
	}
	console.log(email+mdp+nom+prenom+age+region+role);

	$.ajax({
		type: "POST",
		url: "http://localhost:9876/v1/jobber/addUser",			
		contentType: "application/json; charset=utf-8",				   
		data: JSON.stringify(data),
		dataType: "json",
		success:function(){
			alert("gg");
		},
		error:function(){
		   	alert("pas gg");
		}
	});
});

function soumettre(id) {
	doucment.getElementById(id).target = 'formulaire';
	window.open('','formulaire',width='800', height='600');
}
