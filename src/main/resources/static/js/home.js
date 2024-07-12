fetch("http://localhost:8080/api/contador/usuario")
    .then(response => response.json())
    .then(data => $(".contadorUsuarios").html(data.usuarios + " Registrados"))

fetch("http://localhost:8080/api/contador/producto")
    .then(response => response.json())
    .then(data => $(".contadorProducto").html(data.productos + " Registrados"))