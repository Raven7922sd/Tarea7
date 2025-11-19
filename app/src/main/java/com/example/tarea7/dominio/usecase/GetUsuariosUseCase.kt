package com.example.tarea7.dominio.usecase

import com.example.tarea7.dominio.repository.UsuarioRepository
import javax.inject.Inject

class GetUsuariosUseCase @Inject constructor(
    private val repository: UsuarioRepository
) {
    suspend operator fun invoke() = repository.getUsuarios()
}