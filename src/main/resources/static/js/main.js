
fetch("http://localhost:8080/api/contador/usuario")
    .then(response => response.json())
    .then(data => console.log(data))

$(document).ready(function(){
	$('.nav-btn-submenu').on('click', function(e){
		e.preventDefault();
		var SubMenu=$(this).next('ul');
		var iconBtn=$(this).children('.fa-chevron-down');
		if(SubMenu.hasClass('show-nav-lateral-submenu')){
			$(this).removeClass('active');
			iconBtn.removeClass('fa-rotate-180');
			SubMenu.removeClass('show-nav-lateral-submenu');
		}else{
			$(this).addClass('active');
			iconBtn.addClass('fa-rotate-180');
			SubMenu.addClass('show-nav-lateral-submenu');
		}
	});

	$('.show-nav-lateral').on('click', function(e){
		e.preventDefault();
		var NavLateral=$('.nav-lateral');
		var PageConten=$('.page-content');
		if(NavLateral.hasClass('active')){
			NavLateral.removeClass('active');
			PageConten.removeClass('active');
		}else{
			NavLateral.addClass('active');
			PageConten.addClass('active');
		}
	});

	$('.btn-exit-system').on('click', function(e){
		e.preventDefault();
		Swal.fire({
			title: 'Seguro(a) que deseas cerrar la sesion?',
			type: 'question',
			showCancelButton: true,
			confirmButtonColor: '#3085d6',
			cancelButtonColor: '#d33',
			confirmButtonText: 'Si',
			cancelButtonText: 'No'
		}).then((result) => {

		});
	});
});
(function($){
    $(window).on("load",function(){
        $(".nav-lateral-content").mCustomScrollbar({
        	theme:"light-thin",
        	scrollbarPosition: "inside",
        	autoHideScrollbar: true,
        	scrollButtons: {enable: true}
        });
        $(".page-content").mCustomScrollbar({
        	theme:"dark-thin",
        	scrollbarPosition: "inside",
        	autoHideScrollbar: true,
        	scrollButtons: {enable: true}
        });
    });
})(jQuery);
$(document).ready(function() {
	$('.form-neon').submit(function(event) {
		event.preventDefault(); // Evitar el envío por defecto del formulario

		// Obtener los valores de los campos del formulario
		var producto = {
			id_producto:$('#id_codigo').val(),
			nombre: $('#item_nombre').val(),
			url_imagen: $('#item_url').val(),
			descripcion: $('#item_descripcion').val(),
			precio: parseFloat($('#item_precio').val()),
			stock: parseInt($('#item_stock').val()),
			categoriaProducto: {
				id_categoria: parseInt($('#item_categoria').val())
			}
		};

		// Enviar los datos al backend
		$.ajax({
			type: 'POST',
			url: 'http://localhost:8080/api/producto', // Reemplaza con tu URL de backend
			contentType: 'application/json',
			data: JSON.stringify(producto),
			success: function(response) {
				// Manejar éxito
				console.log('Producto registrado exitosamente:', response);
				// Aquí podrías mostrar una alerta o redirigir a otra página
				swal.fire('¡Éxito!', 'Producto registrado correctamente', 'success');
			},
			error: function(error) {
				// Manejar error
				console.error('Error al registrar el producto:', error);
				swal.fire('¡Error!', 'Hubo un problema al registrar el producto', 'error');
			}
		});
	});
});



