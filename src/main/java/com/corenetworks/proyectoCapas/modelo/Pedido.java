package com.corenetworks.proyectoCapas.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity @Table (name = "pedidos")

public class Pedido {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int idPedido;
    
    private LocalDate fPedido;
    private String fPago;
    private double importe;

}
