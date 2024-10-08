package pe.edu.cibertec.T1_ALVARADO_VEHICULOS_BACK.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.T1_ALVARADO_VEHICULOS_BACK.dto.BusquedaRequestDTO;
import pe.edu.cibertec.T1_ALVARADO_VEHICULOS_BACK.dto.BusquedaResponseDTO;
import pe.edu.cibertec.T1_ALVARADO_VEHICULOS_BACK.service.BusquedaService;

import java.io.IOException;

@RestController
@RequestMapping("/inicio")
public class BusquedaController {

    @Autowired
    BusquedaService busquedaService;

    @PostMapping("/buscar")
    public BusquedaResponseDTO buscar(@RequestBody BusquedaRequestDTO busquedaRequestDTO) {
       //try catch

        try {
            String[] datosBusqueda = busquedaService.buscarVehiculo(busquedaRequestDTO);
            if (datosBusqueda == null) {
                return new BusquedaResponseDTO("01", "Error: Ocurrió un problema", "", ""
                        , "", "","");

            }
            return new BusquedaResponseDTO("00", "Exito: Vehiculo encontrado", datosBusqueda[0], datosBusqueda[1]
                    , datosBusqueda[2], datosBusqueda[3],datosBusqueda[4]);

        }catch (IOException e) {
            return new BusquedaResponseDTO("99", "Error: Ocurrió un problema", "", ""
                    , "", "","");
        }


    }

}
