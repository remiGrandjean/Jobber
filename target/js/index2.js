$(document).ready(function(event) {
	
	$("div#swipe_like").on( "click", function() {
		swipeLike();
	});	

	$("div#swipe_dislike").on( "click", function() {
		swipeDislike();
	});	

	addNewProfile();

	function swipe() {
		Draggable.create("#profil", {
		   	throwProps:true,
		   	onDragEnd:function(endX) {
	   			if(Math.round(this.endX) > 0 ) {
	   				swipeLike();			
	   			}
	   			else {
	   				swipeDislike();
	   			}
	   			console.log(Math.round(this.endX));
			}
		});
	}

	function swipeLike() {
		
			var $profil = $("div.content").find('#profil');

			var swipe = new TimelineMax({repeat:0, yoyo:false, repeatDelay:0, onComplete:remove, onCompleteParams:[$profil]});
			swipe.staggerTo($profil, 0.8, {bezier:[{left:"+=400", top:"+=300", rotation:"60"}], ease:Power1.easeInOut});

			addNewProfile();
	}

	function swipeDislike() {
		
			var $profil = $("div.content").find('#profil');

			var swipe = new TimelineMax({repeat:0, yoyo:false, repeatDelay:0, onComplete:remove, onCompleteParams:[$profil]});
			swipe.staggerTo($profil, 0.8, {bezier:[{left:"+=-350", top:"+=300", rotation:"-60"}], ease:Power1.easeInOut});

			addNewProfile();
	}

	function remove(profil) {
	    $(profil).remove();
	}

	function addNewProfile() {
	var random =Math.floor(Math.random() * 3);
		var experience=['Aucune','Developpeur Java, IBM</br>Chef de projet, IBM','Administrateur réseau, ATOS'][random];
		var nom = ['David Hinds', 'Cedric Floch', 'Bob leymar'][random];
		var formation = ['Bac S ','BTS Informatique','DUT Informatique','CDD'][random];
		var age = ['20', '45', '32'][random];
		var region = ['Nord Pas de Calais','Picardie','Centre'][random];
		var loisirs = ['Musique','Sport extreme','Lutte greco-romaine'][random];
		$("div.content").prepend('<div class="profil" id="profil"><span class="meta"><center><p>'+nom+','+age+' ans</br>'+region+'</p></center></span>'
		+'</br>Formation : </br></br>'+formation+'<hr></br>'+'Experience :</br></br> '+experience
    	+'<hr>Loisirs : </br></br>'+loisirs+'</div>');

    	swipe();
	}

});
