$( function() {
	
	switch (menu) {
	case 'About Us':
		$('#about').addClass('active');
		break;
	case 'Contact Us':
		$('#contact').addClass('active');
		break;
	
	case 'All Products':
		$('#listProducts').addClass('active');
		break;
	
	case '#a_'+menu :
		$('#a_'+menu).addClass('active');
		break;
		
	default:
		$('#home').addClass('active');
		break;
	}
	
	
});