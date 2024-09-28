package pe.edu.cibertec.T1_ALVARADO_VEHICULOS_BACK.service;

import pe.edu.cibertec.T1_ALVARADO_VEHICULOS_BACK.dto.BusquedaRequestDTO;

import java.io.IOException;

public interface BusquedaService {
    String[] buscarVehiculo(BusquedaRequestDTO busquedaRequestDTO) throws IOException;
}
