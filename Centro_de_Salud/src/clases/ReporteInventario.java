/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Nahomi
 */
public class ReporteInventario 
{
    private String cant;
    private String desc;
    private String debe;
    private String haber;
    private String cod;

    public ReporteInventario(String cant, String desc, String debe, String haber, String cod) {
        this.cant = cant;
        this.desc = desc;
        this.debe = debe;
        this.haber = haber;
        this.cod = cod;
    }

    public String getCant() {
        return cant;
    }

    public void setCant(String cant) {
        this.cant = cant;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDebe() {
        return debe;
    }

    public void setDebe(String debe) {
        this.debe = debe;
    }

    public String getHaber() {
        return haber;
    }

    public void setHaber(String haber) {
        this.haber = haber;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }
    
    

    
}
