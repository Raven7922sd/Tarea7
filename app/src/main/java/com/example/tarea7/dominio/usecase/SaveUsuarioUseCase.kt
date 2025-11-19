package com.example.tarea7.dominio.usecase

import com.example.tarea7.Data.Remote.Resource
import com.example.tarea7.dominio.model.Usuarios
import com.example.tarea7.dominio.repository.UsuarioRepository
import javax.inject.Inject

class SaveUsuarioUseCase @Inject constructor(
    private val repository: UsuarioRepository
) {
    suspend operator fun invoke(id: Int, usuario: Usuarios): Resource<Usuarios?> {
        return if(id == 0){
            repository.postUsuario(usuario)
        }else{
            when(repository.putUsuario(id, usuario)){
                is Resource.Success -> Resource.Success(usuario)
                is Resource.Error -> Resource.Error("Error al actualizar el usuario")
                else -> Resource.Error("Error desconocido")
            }
        }
    }
}
