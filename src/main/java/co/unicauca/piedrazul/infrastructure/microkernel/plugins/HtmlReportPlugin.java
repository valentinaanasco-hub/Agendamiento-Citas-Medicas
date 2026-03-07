/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.unicauca.piedrazul.infrastructure.microkernel.plugins;

import co.unicauca.piedrazul.domain.entities.Appointment;
import co.unicauca.piedrazul.infrastructure.microkernel.core.IReportPlugin;
import java.util.List;

/**
 *
 * @author santi
 */
public class HtmlReportPlugin implements IReportPlugin {

    @Override
    public String generateReport(List<Appointment> data) {
        StringBuilder html = new StringBuilder();
        html.append("<!DOCTYPE html>\n");
        html.append("<html lang=\"es\">\n");
        html.append("<head>\n");
        html.append("\t<title>Reporte de Citas</title>\n");
        html.append("</head>\n");
        html.append("<body>\n");
        html.append("\t<h1>Reporte de citas agendadas</h1>\n");
        html.append("\t<table>\n");
        html.append("\t\t<thead>\n");
        html.append("\t\t\t<tr>\n");
        html.append("\t\t\t\t<th>ID</th>\n");
        html.append("\t\t\t\t<th>Fecha de agendamiento</th>\n");
        html.append("\t\t\t\t<th>Nombre de solicitante</th>\n");
        html.append("\t\t\t\t<th>Identificacion</th>\n");
        html.append("\t\t\t\t<th>Doctor encargado</th>\n");
        html.append("\t\t\t</tr>\n");
        html.append("\t\t</head>\n");
        html.append("\t\t<tbody>\n");
        for(Appointment cita : data){
                html.append("\t\t\t<tr>\n");
                html.append("\t\t\t\t<td>\n");
                html.append("\t\t\t</tr>\n");
        }
    
    }
    
}
