package Buses;

import GUI.Interface;
import javax.swing.ImageIcon;

public class BusUno extends Thread {

    public boolean activo = true;
    public int posicion = 0;
    public int tiempo = 1000;
    String nombreBus = "Bus 1 (Amarillo): ";
    String P1 = "Ciudad Deportiva Rafael Angel Perez", P2 = "Super Lian, Hatillo", P3 = "Plasticos Tosso", P4 = "Parqueo De Yamuni, San Francisco", P5 = "Colegio Maria Auxiliadora";
    String P6 = "Escuela Juan Rafael Mora", P7 = "Hotel Caribbean. Amon", P8 = "Parque San Fransisco", P9 = "Liceo Nocturno Jose Joaquin Jimenez Nunez", P10 = "Acueductos y Alcantarillados Guadalupe";
    String P11 = "Rotonda de Betania", P12 = "Colegio Salesiano Don Bosco", P13 = "Escuela Republica Dominicana", P14 = "Abastecedor Los Sauces", P15 = "Parque de Monte Azul";
    String P16 = "Cevicheria Costa Azul", P17 = "Taller Gernon", P18 = "Plaza America", P19 = "Restaurante La Fortuna, Hatillo 4", P20 = "Terminal Hatillo";

    @Override
    public void run() {
        posicion = 1;
        while (activo == true) {
            if (posicion == 1) {
                Interface.Parada70.setIcon(new ImageIcon(Interface.imgnull));
                Interface.Parada1.setIcon(new ImageIcon(Interface.BusUno));

                Interface.paradasBus1.add(nombreBus + P1);
                for (int i = 0; i < 1; i++) {
                    Interface.modelo.addElement(Interface.paradasBus1.get(i));
                }
                posicion++;

                try {
                    sleep(tiempo);
                } catch (InterruptedException e) {
                }
            }
            if (posicion == 2) {
                Interface.Parada1.setIcon(new ImageIcon(Interface.imgnull));
                Interface.Parada2.setIcon(new ImageIcon(Interface.BusUno));

                posicion++;
                try {
                    sleep(tiempo);
                } catch (InterruptedException e) {
                }
            }
            if (posicion == 3) {
                Interface.Parada2.setIcon(new ImageIcon(Interface.imgnull));
                Interface.Parada3.setIcon(new ImageIcon(Interface.BusUno));

                posicion++;
                try {
                    sleep(tiempo);
                } catch (InterruptedException e) {
                }
                if (posicion == 4) {
                    Interface.Parada3.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada4.setIcon(new ImageIcon(Interface.BusUno));

                    Interface.paradasBus1.add(nombreBus + P2);
                    for (int i = 1; i < 2; i++) {
                        Interface.modelo.addElement(Interface.paradasBus1.get(i));
                    }

                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 5) {
                    Interface.Parada4.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada5.setIcon(new ImageIcon(Interface.BusUno));
                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 6) {
                    Interface.Parada5.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada6.setIcon(new ImageIcon(Interface.BusUno));
                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 7) {
                    Interface.Parada6.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada7.setIcon(new ImageIcon(Interface.BusUno));

                    Interface.paradasBus1.add(nombreBus + P3);
                    for (int i = 2; i < 3; i++) {
                        Interface.modelo.addElement(Interface.paradasBus1.get(i));
                    }

                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 8) {
                    Interface.Parada7.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada8.setIcon(new ImageIcon(Interface.BusUno));
                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 9) {
                    Interface.Parada8.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada9.setIcon(new ImageIcon(Interface.BusUno));
                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 10) {
                    Interface.Parada9.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada10.setIcon(new ImageIcon(Interface.BusUno));
                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 11) {
                    Interface.Parada10.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada11.setIcon(new ImageIcon(Interface.BusUno));
                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 12) {
                    Interface.Parada11.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada12.setIcon(new ImageIcon(Interface.BusUno));

                    Interface.paradasBus1.add(nombreBus + P4);
                    for (int i = 3; i < 4; i++) {
                        Interface.modelo.addElement(Interface.paradasBus1.get(i));
                    }

                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 13) {
                    Interface.Parada12.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada13.setIcon(new ImageIcon(Interface.BusUno));
                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 14) {
                    Interface.Parada13.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada14.setIcon(new ImageIcon(Interface.BusUno));

                    Interface.paradasBus1.add(nombreBus + P5);
                    for (int i = 4; i < 5; i++) {
                        Interface.modelo.addElement(Interface.paradasBus1.get(i));
                    }

                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 15) {
                    Interface.Parada14.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada15.setIcon(new ImageIcon(Interface.BusUno));

                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 16) {
                    Interface.Parada15.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada16.setIcon(new ImageIcon(Interface.BusUno));
                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 17) {
                    Interface.Parada16.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada17.setIcon(new ImageIcon(Interface.BusUno));

                    Interface.paradasBus1.add(nombreBus + P6);
                    for (int i = 5; i < 6; i++) {
                        Interface.modelo.addElement(Interface.paradasBus1.get(i));
                    }

                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 18) {
                    Interface.Parada17.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada18.setIcon(new ImageIcon(Interface.BusUno));
                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 19) {
                    Interface.Parada18.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada19.setIcon(new ImageIcon(Interface.BusUno));
                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 20) {
                    Interface.Parada19.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada20.setIcon(new ImageIcon(Interface.BusUno));
                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 21) {
                    Interface.Parada20.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada21.setIcon(new ImageIcon(Interface.BusUno));
                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 22) {
                    Interface.Parada21.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada22.setIcon(new ImageIcon(Interface.BusUno));
                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 23) {
                    Interface.Parada22.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada23.setIcon(new ImageIcon(Interface.BusUno));

                    Interface.paradasBus1.add(nombreBus + P7);
                    for (int i = 6; i < 7; i++) {
                        Interface.modelo.addElement(Interface.paradasBus1.get(i));
                    }

                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 24) {
                    Interface.Parada23.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada24.setIcon(new ImageIcon(Interface.BusUno));
                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 25) {
                    Interface.Parada24.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada25.setIcon(new ImageIcon(Interface.BusUno));
                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 26) {
                    Interface.Parada25.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada26.setIcon(new ImageIcon(Interface.BusUno));
                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 27) {
                    Interface.Parada26.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada27.setIcon(new ImageIcon(Interface.BusUno));

                    Interface.paradasBus1.add(nombreBus + P8);
                    for (int i = 7; i < 8; i++) {
                        Interface.modelo.addElement(Interface.paradasBus1.get(i));
                    }

                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 28) {
                    Interface.Parada27.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada28.setIcon(new ImageIcon(Interface.BusUno));
                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 29) {
                    Interface.Parada28.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada29.setIcon(new ImageIcon(Interface.BusUno));
                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 30) {
                    Interface.Parada29.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada30.setIcon(new ImageIcon(Interface.BusUno));

                    Interface.paradasBus1.add(nombreBus + P9);
                    for (int i = 8; i < 9; i++) {
                        Interface.modelo.addElement(Interface.paradasBus1.get(i));
                    }

                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 31) {
                    Interface.Parada30.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada31.setIcon(new ImageIcon(Interface.BusUno));
                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 32) {
                    Interface.Parada31.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada32.setIcon(new ImageIcon(Interface.BusUno));
                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 33) {
                    Interface.Parada32.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada33.setIcon(new ImageIcon(Interface.BusUno));
                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 34) {
                    Interface.Parada33.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada34.setIcon(new ImageIcon(Interface.BusUno));

                    Interface.paradasBus1.add(nombreBus + P10);
                    for (int i = 9; i < 10; i++) {
                        Interface.modelo.addElement(Interface.paradasBus1.get(i));
                    }

                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 35) {
                    Interface.Parada34.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada35.setIcon(new ImageIcon(Interface.BusUno));
                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 36) {
                    Interface.Parada35.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada36.setIcon(new ImageIcon(Interface.BusUno));
                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 37) {
                    Interface.Parada36.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada37.setIcon(new ImageIcon(Interface.BusUno));

                    Interface.paradasBus1.add(nombreBus + P11);
                    for (int i = 10; i < 11; i++) {
                        Interface.modelo.addElement(Interface.paradasBus1.get(i));
                    }

                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 38) {
                    Interface.Parada37.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada38.setIcon(new ImageIcon(Interface.BusUno));
                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 39) {
                    Interface.Parada38.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada39.setIcon(new ImageIcon(Interface.BusUno));
                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 40) {
                    Interface.Parada39.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada40.setIcon(new ImageIcon(Interface.BusUno));
                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 41) {
                    Interface.Parada40.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada41.setIcon(new ImageIcon(Interface.BusUno));
                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 42) {
                    Interface.Parada41.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada42.setIcon(new ImageIcon(Interface.BusUno));
                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 43) {
                    Interface.Parada42.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada43.setIcon(new ImageIcon(Interface.BusUno));
                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 44) {
                    Interface.Parada43.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada44.setIcon(new ImageIcon(Interface.BusUno));
                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 45) {
                    Interface.Parada44.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada45.setIcon(new ImageIcon(Interface.BusUno));
                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 46) {
                    Interface.Parada45.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada46.setIcon(new ImageIcon(Interface.BusUno));

                    Interface.paradasBus1.add(nombreBus + P12);
                    for (int i = 11; i < 12; i++) {
                        Interface.modelo.addElement(Interface.paradasBus1.get(i));
                    }

                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 47) {
                    Interface.Parada46.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada47.setIcon(new ImageIcon(Interface.BusUno));
                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 48) {
                    Interface.Parada47.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada48.setIcon(new ImageIcon(Interface.BusUno));
                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 49) {
                    Interface.Parada48.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada49.setIcon(new ImageIcon(Interface.BusUno));
                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 50) {
                    Interface.Parada49.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada50.setIcon(new ImageIcon(Interface.BusUno));

                    Interface.paradasBus1.add(nombreBus + P13);
                    for (int i = 12; i < 13; i++) {
                        Interface.modelo.addElement(Interface.paradasBus1.get(i));
                    }

                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 51) {
                    Interface.Parada50.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada51.setIcon(new ImageIcon(Interface.BusUno));
                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 52) {
                    Interface.Parada51.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada52.setIcon(new ImageIcon(Interface.BusUno));
                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 53) {
                    Interface.Parada52.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada53.setIcon(new ImageIcon(Interface.BusUno));

                    Interface.paradasBus1.add(nombreBus + P14);
                    for (int i = 13; i < 14; i++) {
                        Interface.modelo.addElement(Interface.paradasBus1.get(i));
                    }

                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 54) {
                    Interface.Parada53.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada54.setIcon(new ImageIcon(Interface.BusUno));
                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 55) {
                    Interface.Parada54.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada55.setIcon(new ImageIcon(Interface.BusUno));
                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 56) {
                    Interface.Parada55.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada56.setIcon(new ImageIcon(Interface.BusUno));
                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 57) {
                    Interface.Parada56.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada57.setIcon(new ImageIcon(Interface.BusUno));
                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 58) {
                    Interface.Parada57.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada58.setIcon(new ImageIcon(Interface.BusUno));

                    Interface.paradasBus1.add(nombreBus + P15);
                    for (int i = 14; i < 15; i++) {
                        Interface.modelo.addElement(Interface.paradasBus1.get(i));
                    }

                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 59) {
                    Interface.Parada58.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada59.setIcon(new ImageIcon(Interface.BusUno));

                    Interface.paradasBus1.add(nombreBus + P16);
                    for (int i = 15; i < 16; i++) {
                        Interface.modelo.addElement(Interface.paradasBus1.get(i));
                    }

                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 60) {
                    Interface.Parada59.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada60.setIcon(new ImageIcon(Interface.BusUno));
                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 61) {
                    Interface.Parada60.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada61.setIcon(new ImageIcon(Interface.BusUno));
                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 62) {
                    Interface.Parada61.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada62.setIcon(new ImageIcon(Interface.BusUno));

                    Interface.paradasBus1.add(nombreBus + P17);
                    for (int i = 16; i < 17; i++) {
                        Interface.modelo.addElement(Interface.paradasBus1.get(i));
                    }

                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 63) {
                    Interface.Parada62.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada63.setIcon(new ImageIcon(Interface.BusUno));
                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 64) {
                    Interface.Parada63.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada64.setIcon(new ImageIcon(Interface.BusUno));
                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 65) {
                    Interface.Parada64.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada65.setIcon(new ImageIcon(Interface.BusUno));

                    Interface.paradasBus1.add(nombreBus + P18);
                    for (int i = 17; i < 18; i++) {
                        Interface.modelo.addElement(Interface.paradasBus1.get(i));
                    }

                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 66) {
                    Interface.Parada65.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada66.setIcon(new ImageIcon(Interface.BusUno));

                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 67) {
                    Interface.Parada66.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada67.setIcon(new ImageIcon(Interface.BusUno));

                    Interface.paradasBus1.add(nombreBus + P19);
                    for (int i = 18; i < 19; i++) {
                        Interface.modelo.addElement(Interface.paradasBus1.get(i));
                    }

                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 68) {
                    Interface.Parada67.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada68.setIcon(new ImageIcon(Interface.BusUno));
                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 69) {
                    Interface.Parada68.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada69.setIcon(new ImageIcon(Interface.BusUno));
                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 70) {
                    Interface.Parada69.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada70.setIcon(new ImageIcon(Interface.BusUno));

                    Interface.paradasBus1.add(nombreBus + P20);
                    for (int i = 19; i < 20; i++) {
                        Interface.modelo.addElement(Interface.paradasBus1.get(i));
                    }

                    posicion = 1;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
            }
        }
    }
}
