package JavaClass;

import Buses.*;
import GUI.Interface;

public class Reloj extends Thread {

    BusUno busUno = new BusUno();
    BusDos busDos = new BusDos();
    BusTres busTres = new BusTres();
    BusCuatro busCuatro = new BusCuatro();
    BusCinco busCinco = new BusCinco();
    BusSeis busSeis = new BusSeis();
    BusSiete busSiete = new BusSiete();
    BusOcho busOcho = new BusOcho();
    BusNueve busNueve = new BusNueve();
    BusDiez busDiez = new BusDiez();

    public boolean activo = true;
    public int contador = 0;
    public int tiempo = 1;

    public int HH = 4, MM = 55, SS = 0;
    public String hh = "00", mm = "00", ss = "00";

    @Override
    public void run() {
        while (activo == true) {
            Tiempo();
            Interface.Hora.setText(hh + ":" + mm + ":" + ss);
            if (HH == 5 && MM == 0 && SS == 0) {
                
                //Si solo va a ver un bus, comente los demas
                if (busUno.isAlive() == false) {
                    busUno = new BusUno();
                    busUno.activo = true;
                    busUno.start();
                    busDos.start();
                    busTres.start();
                    busCuatro.start();
                    busCinco.start();
                    busSeis.start();
                    busSiete.start();
                    busOcho.start();
                    busNueve.start();
                    busDiez.start();

                    contador = 1;
                }
            }

            if (HH == 23 && MM == 59 && SS == 59) {

                busUno.activo = false;
            }
            try {
                Thread.sleep(tiempo);
            } catch (InterruptedException e) {
            }

        }
        busUno.activo = false;
    }

    public void Tiempo() {
        SS++;
        if (SS > 59) {
            SS = 0;
            MM++;

            if (MM > 59) {
                MM = 0;
                HH++;

                if (HH > 24) {
                    HH = 0;
                    MM = 0;
                    SS = 0;

                }
            }
        }
        hh = HH > 9 ? HH + "" : "0" + HH;
        ss = SS > 9 ? SS + "" : "0" + SS;
        mm = MM > 9 ? MM + "" : "0" + MM;
    }
}
