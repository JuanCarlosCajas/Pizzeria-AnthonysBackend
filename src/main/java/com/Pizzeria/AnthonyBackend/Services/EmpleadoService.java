package com.Pizzeria.AnthonyBackend.Services;

import com.Pizzeria.AnthonyBackend.Modals.Empleados;
import com.Pizzeria.AnthonyBackend.Repository.EmpleadoRepository;
import com.github.cliftonlabs.json_simple.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class EmpleadoService {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    public List<Empleados> listarEmpleados() {
        return empleadoRepository.findAll();
    }

    public Empleados obtenerEmpleado(int id) {
        Optional<Empleados> empleadoEncontrado = empleadoRepository.findById(id);
        return empleadoEncontrado.orElse(null);
    }

    public JsonObject guardarEmpleado(Empleados empleado) {
        JsonObject mensaje = new JsonObject();
        mensaje.put("mensaje", true);
        empleadoRepository.save(empleado);
        return mensaje;
    }

    public void actualizarEmpleado(Empleados empleado) {
        empleadoRepository.save(empleado);
    }

    public void borrarEmpleado(int id) {
        empleadoRepository.deleteById(id);
    }
}
