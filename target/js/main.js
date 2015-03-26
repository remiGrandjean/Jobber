
$("#slide").jslide({
	// dislike callback
    onDislike: function (item) {
        $('#status').html('Dislike image ' + (item.index()+1));
    },
	// like callback
    onLike: function (item) {
        $('#status').html('Like image ' + (item.index()+1));
    },
	animationRevertSpeed: 200,
	animationSpeed: 400,
	threshold: 1,
	likeSelector: '.like',
	dislikeSelector: '.dislike'
});


$('.actions .like, .actions .dislike').click(function(e){
	e.preventDefault();
	$("#slide").jslide($(this).attr('class'));
});
