package com.oasis.backend.persistence.entity;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "habitaciones")
public class Habitacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_habitaciones")
    private Integer idHabitacion;

    private String numero;
    private Integer piso;
    private String descripcion;
    private Integer capacidad;

    @Column(name = "precio_por_noche")
    private Integer precioPorNoche;

    @Column(name = "precio_por_mes")
    private Integer precioPorMes;

    @OneToMany(mappedBy = "habitacion")
    private List<Reserva> reservas;

    public Integer getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(Integer idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Integer getPiso() {
        return piso;
    }

    public void setPiso(Integer piso) {
        this.piso = piso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public Integer getPrecioPorNoche() {
        return precioPorNoche;
    }

    public void setPrecioPorNoche(Integer precioPorNoche) {
        this.precioPorNoche = precioPorNoche;
    }

    public Integer getPrecioPorMes() {
        return precioPorMes;
    }

    public void setPrecioPorMes(Integer precioPorMes) {
        this.precioPorMes = precioPorMes;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }
}
