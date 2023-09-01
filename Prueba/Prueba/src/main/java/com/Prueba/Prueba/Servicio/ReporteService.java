package com.Prueba.Prueba.Servicio;

import com.Prueba.Prueba.Repository.RepositoryLineaRegistroProducto;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

public class ReporteService {
    private RepositoryLineaRegistroProducto repositoryLineaRegistroProducto;

    private String exportReport(String reporFormat) throws FileNotFoundException {
        List<Object[]> listLineaRegistroProducto = repositoryLineaRegistroProducto.findAllLineaRegistroTransaccion();
        File file = ResourceUtils.getFile("classpath:ReposteAuxiliar.jrxml");

        return null;
    }
}
