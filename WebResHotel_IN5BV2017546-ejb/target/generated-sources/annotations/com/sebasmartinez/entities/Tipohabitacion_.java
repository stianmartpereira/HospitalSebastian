package com.sebasmartinez.entities;

import com.sebasmartinez.entities.Reserva;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-16T11:54:21")
@StaticMetamodel(Tipohabitacion.class)
public class Tipohabitacion_ { 

    public static volatile SingularAttribute<Tipohabitacion, String> descripcion;
    public static volatile SingularAttribute<Tipohabitacion, Double> precio;
    public static volatile SingularAttribute<Tipohabitacion, Integer> numeropiso;
    public static volatile SingularAttribute<Tipohabitacion, Integer> idtipohabitacion;
    public static volatile ListAttribute<Tipohabitacion, Reserva> reservaList;
    public static volatile SingularAttribute<Tipohabitacion, Integer> nohabitacion;
    public static volatile SingularAttribute<Tipohabitacion, Integer> nopersonas;

}