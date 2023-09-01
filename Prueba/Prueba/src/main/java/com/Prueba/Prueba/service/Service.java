package com.Prueba.Prueba.service;

import com.Prueba.Prueba.Repository.RepositoryLineaRegistroProducto;

public class Service{
    private RepositoryLineaRegistroProducto repositoryLineaRegistroProducto;

    public Service(RepositoryLineaRegistroProducto repositoryLineaRegistroProducto) {
        this.repositoryLineaRegistroProducto = repositoryLineaRegistroProducto;
    }
}
