console.log("Hola categoria")

$.ajax({
        url: 'http://localhost:8080/api/categoria',
        type: 'GET',
        success: function(categorias) {
            categorias.map((item, index) => {
                document.getElementById("categoria").innerHMTL += "
                <tr class='text-center' >
                                                                                                            <td> "  "</td>
                                                                                                           <td>{item.id_categoria}</td>
                                                                                                           <td>{item.nombre_categoria}</td>
                                                                                                           <td>
                                                                                                               <a href='categoria-update.html' class='btn btn-success'>
                                                                                                                   <i class="fas fa-sync-alt"></i>
                                                                                                               </a>
                                                                                                           </td>
                                                                                                           <td>
                                                                                                               <form action=' '>
                                                                                                                   <button type='button' class='btn btn-warning'>
                                                                                                                       <i class='far fa-trash-alt'></i>
                                                                                                                   </button>
                                                                                                               </form>
                                                                                                           </td>
                                                                                                       </tr>
                "
            })
        },
        error: function(error) {
            console.error('Error al obtener usuarios:', error);
        }
    });


