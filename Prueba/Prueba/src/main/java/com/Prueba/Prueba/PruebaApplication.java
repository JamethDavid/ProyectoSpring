package com.Prueba.Prueba;

import com.Prueba.Prueba.Repository.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@SpringBootApplication
@Slf4j
public class PruebaApplication implements CommandLineRunner {

	private final RepositoryRegistroTransacion repositoryRegistroTransacion;

	private final RepositoryLineaRegistroProducto repositoryLineaRegistroProducto;

	public PruebaApplication(RepositoryRegistroTransacion repositoryRegistroTransacion, RepositoryLineaRegistroProducto repositoryLineaRegistroProducto) {
		this.repositoryRegistroTransacion = repositoryRegistroTransacion;
		this.repositoryLineaRegistroProducto = repositoryLineaRegistroProducto;
	}


	@Override
	public void run(String... args) throws Exception {


		//var imprimer = repositoryRegistroTransacion.findByConsecutivoGravado("CCR-1");
		//System.out.println(imprimer);
		//repositoryRegistroTransacion.findAll().forEach(System.out::println);

		// repositoryLineaRegistroProducto.findAll().forEach(System.out::println);
		//repositoryRegistroTransaccionDineroInventario.findAll().forEach(System.out::println);
		//repositoryLineaRegistroProducto.findAllByIdLineaRegistroTransaccionProducto(2L).forEach(System.out::println);
		// pruebas revisar

		//repositoryRegistroTransacion.findAll().forEach(System.out::println);
		/*repositoryRegistroTransacion.fecha().forEach(System.out::println);
		List<Object[]> lista = repositoryRegistroTransacion.fecha();
		for(Object[] resultado : lista){
			Date fecha =(Date)resultado[0];
			String persona = (String)resultado[1];
			System.out.println("fecha = " + fecha + "persona = " + persona);
		}

		 */

		List<Object[]> listaLinea = repositoryLineaRegistroProducto.findAllLineaRegistroTransaccion();
		listaLinea.forEach(resultado -> {
			Date fecha = (Date) resultado[0];


			Byte idTransacion = (Byte) resultado[1];
			String descripcion = (String) resultado[2];
			String consecutivoGravado = (String) resultado[3];
			String nombre = (String) resultado[4];
			BigDecimal cantidad = (BigDecimal) resultado[5];
			BigDecimal valorBruto = (BigDecimal) resultado[6];

			System.out.println("fecha = " + fecha + "transaccion = " + idTransacion + "descripcion = "
					+ descripcion + "consecutivoGravado" + consecutivoGravado + "terceros = " + nombre + "cantidad = " + cantidad + "valorBruto = " + valorBruto
			);

		}
	}
}