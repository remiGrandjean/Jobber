$(document).ready(function(event) {
	
	$("div#swipe_like").on( "click", function() {
		swipeLike();
	});	

	$("div#swipe_dislike").on( "click", function() {
		swipeDislike();
	});	

	addNewProfile();

	function swipe() {
		Draggable.create("#annonce", {
		   	throwProps:true,
		   	onDragEnd:function(endX) {
	   			if(Math.round(this.endX) > 0 ) {
	   				swipeLike();			
	   			}
	   			else {
	   				swipeDislike();
	   			}
	   			
			}
		});
	}

	function swipeLike() {
		
			var $annonce = $("div.content").find('#annonce');

			var swipe = new TimelineMax({repeat:0, yoyo:false, repeatDelay:0, onComplete:remove, onCompleteParams:[$annonce]});
			swipe.staggerTo($annonce, 1, {bezier:[{left:"+=400", top:"+=300", rotation:"60"}], ease:Power1.easeInOut});

			addNewProfile();
	}

	function swipeDislike() {
		
			var $annonce = $("div.content").find('#annonce');

			var swipe = new TimelineMax({repeat:0, yoyo:false, repeatDelay:0, onComplete:remove, onCompleteParams:[$annonce]});
			swipe.staggerTo($annonce, 1, {bezier:[{left:"+=-350", top:"+=300", rotation:"-60"}], ease:Power1.easeInOut});

			addNewProfile();
	}

	function remove(annonce) {
	    $(annonce).remove();
	}

	function addNewProfile() {
		var random =Math.floor(Math.random() * 6);
		var description=['Recherche stagiaire pour le développement de notre site web.</br>Stage de 6 mois rémunéré.</br>Bac +2 minimum.','Recherche administrateur reseau expérimenté.</br>Bac +5 minimum.</br>Urgent.','Recherche administrateur de base de donnée.</br>Technologie : MySQL/Apache.','Cherche un directeur des ressources humaines.</br>Bac +3 minimum.</br>Expérience exigé.','Recherche hôte d accueil H/F.','Recherche stagiare pour la mise en rayon de produit</br>Passion pour le sport recommandée.'][random];
		var names = ['CGI', 'GFI', 'IBM', 'CAPGEMINI', 'McDonald', 'Décathlon'][random];
		var typeJob = ['Stage','CDI','CDD','CDD','Interim', 'Stage'][random];
		$("div.content").prepend('<div class="annonce" id="annonce"><span class="meta"><p>'+names+', '+typeJob+'</p></span>'
		+description
    	+ '</div>');

    	swipe();
	}

});
