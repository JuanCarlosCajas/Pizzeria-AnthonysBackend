package com.Pizzeria.AnthonyBackend.Controller;

import com.Pizzeria.AnthonyBackend.Modals.Empleados;
import com.Pizzeria.AnthonyBackend.Services.EmpleadoService;
import com.github.cliftonlabs.json_simple.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class EmpleadoController {

    @Autowired
    private EmpleadoService empleadoService;

    @RequestMapping(value = "api/empleados", method = RequestMethod.GET)
    public List<Empleados> obtenerEmpleados() {
        return empleadoService.listarEmpleados();
    }

    @GetMapping(value = "/{id}")
    public Empleados obtenerEmpleado(@PathVariable int id) {
        return empleadoService.obtenerEmpleado(id);
    }

    @PostMapping
    public JsonObject guardarEmpleado(@RequestBody Empleados empleado) {
        return empleadoService.guardarEmpleado(empleado);
    }

    @PatchMapping(value = "/{id}")
    public void actualizarEmpleado(@RequestBody Empleados empleado, @PathVariable int id) {
        empleado.setId_empleado(id);
        empleadoService.actualizarEmpleado(empleado);
    }

    @DeleteMapping(value = "/{id}")
    public void borrarEmpleado(@PathVariable int id) {
        empleadoService.borrarEmpleado(id);
    }
}
