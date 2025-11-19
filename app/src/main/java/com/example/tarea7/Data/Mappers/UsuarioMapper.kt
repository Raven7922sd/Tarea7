package com.example.tarea7.Data.Mappers

import com.example.tarea7.Data.Remote.Dto.UsuariosDto
import com.example.tarea7.dominio.model.Usuarios

fun Usuarios.toDto() : UsuariosDto = UsuariosDto(
    usuarioId =  usuarioId,
    userName = userName,
    password = password
)

fun UsuariosDto.toDomain(): Usuarios = Usuarios(
    usuarioId = usuarioId,
    userName = userName,
    password = password
)