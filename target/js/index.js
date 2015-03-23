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
	   			console.log(Math.round(this.endX));
			}
		});
	}

	function swipeLike() {
		
			var $annonce = $("div.content").find('#annonce');

			var swipe = new TimelineMax({repeat:0, yoyo:false, repeatDelay:0, onComplete:remove, onCompleteParams:[$annonce]});
			swipe.staggerTo($annonce, 0.8, {bezier:[{left:"+=400", top:"+=300", rotation:"60"}], ease:Power1.easeInOut});

			addNewProfile();
	}

	function swipeDislike() {
		
			var $annonce = $("div.content").find('#annonce');

			var swipe = new TimelineMax({repeat:0, yoyo:false, repeatDelay:0, onComplete:remove, onCompleteParams:[$annonce]});
			swipe.staggerTo($annonce, 0.8, {bezier:[{left:"+=-350", top:"+=300", rotation:"-60"}], ease:Power1.easeInOut});

			addNewProfile();
	}

	function remove(annonce) {
	    $(annonce).remove();
	}

	function addNewProfile() {
		var random =Math.floor(Math.random() * 7);
		var description=['Recherche stagiaire pour un stage','cherche</br> administrateur</br> reseau</br> bac+3 </br>avec 2</br> ans d</br> experie</br>nce','cherche quelqu un de competent','on accepte tout le monde','venez comme vous êtes','cherche sportif','Organisation réservé aux membre VIP'][random];
		var names = ['CGI', 'GFI', 'IBM', 'CAPGEMINI', 'McDonald', 'Décathlon', 'Boid'][random];
		var typeJob = ['Stage','CDI','CDD','CDD','Interim', 'Stage', 'Maitre du monde'][random];
		var annonces = ['1', '2', '3', '4', '5', '6', '7'][random];
		$("div.content").prepend('<div class="annonce" id="annonce"><span class="meta"><p>'+names+', '+typeJob+'</p></span>'
		+description
    	+ '</div>');

    	swipe();
	}

});
