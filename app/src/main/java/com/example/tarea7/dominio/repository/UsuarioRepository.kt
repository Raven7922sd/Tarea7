package com.example.tarea7.dominio.repository

import com.example.tarea7.Data.Remote.Resource
import com.example.tarea7.dominio.model.Usuarios
import kotlinx.coroutines.flow.Flow

interface UsuarioRepository {
    suspend fun getUsuarios(): Flow<List<Usuarios>>
    suspend fun getUsuario(id: Int): Resource<Usuarios?>
    suspend fun putUsuario(id: Int, usuario: Usuarios): Resource<Unit>
    suspend fun postUsuario(usuario: Usuarios): Resource<Usuarios?>
}