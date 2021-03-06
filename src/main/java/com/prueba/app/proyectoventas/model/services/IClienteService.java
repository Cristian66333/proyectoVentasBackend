package com.prueba.app.proyectoventas.model.services;

import com.prueba.app.proyectoventas.model.entities.Cliente;

import java.util.List;

public interface IClienteService {
    public List<Cliente> findAll();

    public void save(Cliente cliente);

    public Cliente findById(Long id);

    public void delete(Cliente cliente);

}
