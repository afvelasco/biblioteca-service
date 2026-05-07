package com.example.usuarios;

import com.example.usuarios.entities.Usuario;
import com.example.usuarios.repositories.UsuarioRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class UsuarioRepositoryTest {

    @Autowired
    private UsuarioRepository repository;

    @Test
    void debeGuardarYBuscarUsuario() {
        // Preparar datos
        Usuario nuevo = new Usuario();
        nuevo.setIdUsuario("T001");
        nuevo.setNombre("Prueba");
        nuevo.setContrasena("123");

        // Guardar
        repository.save(nuevo);

        // Verificar
        Usuario encontrado = repository.findById("T001").orElse(null);
        assertThat(encontrado).isNotNull();
        assertThat(encontrado.getNombre()).isEqualTo("Prueba");
    }
}