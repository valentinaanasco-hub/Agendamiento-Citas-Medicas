/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.unicauca.piedrazul.infrastructure.microkernel.core;

import co.unicauca.piedrazul.domain.entities.Appointment;
import java.util.List;

/**
 *
 * @author santi
 */
public interface IReportPlugin {
    String generateReport(List<Appointment> data);
}
