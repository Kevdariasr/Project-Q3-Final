package Buses;

import GUI.Interface;
import static java.lang.Thread.sleep;
import javax.swing.ImageIcon;

public class BusDiez extends Thread {

    public boolean activo = true;
    public int posicion = 0;
    public int tiempo = 2000;
    String nombreBus = "Bus 10 (Verde): ";
    String P1 = "Ciudad Deportiva Rafael Angel Perez", P2 = "Super Lian, Hatillo", P3 = "Plasticos Tosso", P4 = "Parqueo De Yamuni, San Francisco", P5 = "Colegio Maria Auxiliadora";
    String P6 = "Escuela Juan Rafael Mora", P7 = "Hotel Caribbean. Amon", P8 = "Parque San Fransisco", P9 = "Liceo Nocturno Jose Joaquin Jimenez Nunez", P10 = "Acueductos y Alcantarillados Guadalupe";
    String P11 = "Rotonda de Betania", P12 = "Colegio Salesiano Don Bosco", P13 = "Escuela Republica Dominicana", P14 = "Abastecedor Los Sauces", P15 = "Parque de Monte Azul";
    String P16 = "Cevicheria Costa Azul", P17 = "Taller Gernon", P18 = "Plaza America", P19 = "Restaurante La Fortuna, Hatillo 4", P20 = "Terminal Hatillo";

    @Override
    public void run() {
        posicion = 1;
        while (activo == true) {
            if (posicion == 1) {
                Interface.Parada52.setIcon(new ImageIcon(Interface.imgnull));
                Interface.Parada53.setIcon(new ImageIcon(Interface.BusDiez));

                Interface.paradasBus10.add(nombreBus + P14);

                Interface.modelo.addElement(Interface.paradasBus10.get(0));

                posicion++;

                try {
                    sleep(tiempo);
                } catch (InterruptedException e) {
                }
            }
            if (posicion == 2) {
                Interface.Parada53.setIcon(new ImageIcon(Interface.imgnull));
                Interface.Parada54.setIcon(new ImageIcon(Interface.BusDiez));

                posicion++;
                try {
                    sleep(tiempo);
                } catch (InterruptedException e) {
                }
            }
            if (posicion == 3) {
                Interface.Parada54.setIcon(new ImageIcon(Interface.imgnull));
                Interface.Parada55.setIcon(new ImageIcon(Interface.BusDiez));

                posicion++;
                try {
                    sleep(tiempo);
                } catch (InterruptedException e) {
                }
                if (posicion == 4) {
                    Interface.Parada55.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada56.setIcon(new ImageIcon(Interface.BusDiez));

                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 5) {
                    Interface.Parada56.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada57.setIcon(new ImageIcon(Interface.BusDiez));

                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 6) {
                    Interface.Parada57.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada58.setIcon(new ImageIcon(Interface.BusDiez));

                    Interface.paradasBus10.add(nombreBus + P15);

                    Interface.modelo.addElement(Interface.paradasBus10.get(1));

                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 7) {
                    Interface.Parada58.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada59.setIcon(new ImageIcon(Interface.BusDiez));

                    Interface.paradasBus10.add(nombreBus + P16);

                    Interface.modelo.addElement(Interface.paradasBus10.get(2));

                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 8) {
                    Interface.Parada59.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada60.setIcon(new ImageIcon(Interface.BusDiez));
                    
                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 9) {
                    Interface.Parada60.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada61.setIcon(new ImageIcon(Interface.BusDiez));

                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 10) {
                    Interface.Parada61.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada62.setIcon(new ImageIcon(Interface.BusDiez));
                    
                    Interface.paradasBus10.add(nombreBus + P17);

                    Interface.modelo.addElement(Interface.paradasBus10.get(3));

                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 11) {
                    Interface.Parada62.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada63.setIcon(new ImageIcon(Interface.BusDiez));
                    
                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 12) {
                    Interface.Parada63.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada64.setIcon(new ImageIcon(Interface.BusDiez));

                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 13) {
                    Interface.Parada64.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada65.setIcon(new ImageIcon(Interface.BusDiez));

                    Interface.paradasBus10.add(nombreBus + P18);

                    Interface.modelo.addElement(Interface.paradasBus10.get(4));

                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 14) {
                    Interface.Parada65.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada66.setIcon(new ImageIcon(Interface.BusDiez));
                    
                    Interface.paradasBus10.add(nombreBus + P19);

                    Interface.modelo.addElement(Interface.paradasBus10.get(5));
                    
                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 15) {
                    Interface.Parada66.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada67.setIcon(new ImageIcon(Interface.BusDiez));

                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 16) {
                    Interface.Parada67.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada68.setIcon(new ImageIcon(Interface.BusDiez));
                    
                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 17) {
                    Interface.Parada68.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada69.setIcon(new ImageIcon(Interface.BusDiez));

                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 18) {
                    Interface.Parada69.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada70.setIcon(new ImageIcon(Interface.BusDiez));

                    Interface.paradasBus10.add(nombreBus + P20);

                    Interface.modelo.addElement(Interface.paradasBus10.get(6));

                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 19) {
                    Interface.Parada70.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada1.setIcon(new ImageIcon(Interface.BusDiez));
                    
                    Interface.paradasBus10.add(nombreBus + P1);

                    Interface.modelo.addElement(Interface.paradasBus10.get(7));
                    
                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 20) {
                    Interface.Parada1.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada2.setIcon(new ImageIcon(Interface.BusDiez));
                    
                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 21) {
                    Interface.Parada2.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada3.setIcon(new ImageIcon(Interface.BusDiez));

                    Interface.paradasBus10.add(nombreBus + P2);

                    Interface.modelo.addElement(Interface.paradasBus10.get(8));

                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 22) {
                    Interface.Parada3.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada4.setIcon(new ImageIcon(Interface.BusDiez));
                    
                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 23) {
                    Interface.Parada4.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada5.setIcon(new ImageIcon(Interface.BusDiez));
                    
                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 24) {
                    Interface.Parada5.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada6.setIcon(new ImageIcon(Interface.BusDiez));
                    
                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 25) {
                    Interface.Parada6.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada7.setIcon(new ImageIcon(Interface.BusDiez));
                    
                    Interface.paradasBus10.add(nombreBus + P3);

                    Interface.modelo.addElement(Interface.paradasBus10.get(9));
                    
                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 26) {
                    Interface.Parada7.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada8.setIcon(new ImageIcon(Interface.BusDiez));
                    
                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 27) {
                    Interface.Parada8.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada9.setIcon(new ImageIcon(Interface.BusDiez));

                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 28) {
                    Interface.Parada9.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada10.setIcon(new ImageIcon(Interface.BusDiez));
                    
                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 29) {
                    Interface.Parada10.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada11.setIcon(new ImageIcon(Interface.BusDiez));

                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 30) {
                    Interface.Parada11.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada12.setIcon(new ImageIcon(Interface.BusDiez));
                    
                    Interface.paradasBus10.add(nombreBus + P4);

                    Interface.modelo.addElement(Interface.paradasBus10.get(10));

                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 31) {
                    Interface.Parada12.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada13.setIcon(new ImageIcon(Interface.BusDiez));
                    
                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 32) {
                    Interface.Parada13.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada14.setIcon(new ImageIcon(Interface.BusDiez));
                    
                    Interface.paradasBus10.add(nombreBus + P5);

                    Interface.modelo.addElement(Interface.paradasBus10.get(11));
                    
                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 33) {
                    Interface.Parada14.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada15.setIcon(new ImageIcon(Interface.BusDiez));

                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 34) {
                    Interface.Parada15.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada16.setIcon(new ImageIcon(Interface.BusDiez));

                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 35) {
                    Interface.Parada16.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada17.setIcon(new ImageIcon(Interface.BusDiez));
                    
                    Interface.paradasBus10.add(nombreBus + P6);

                    Interface.modelo.addElement(Interface.paradasBus10.get(12));
                    
                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 36) {
                    Interface.Parada17.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada18.setIcon(new ImageIcon(Interface.BusDiez));

                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 37) {
                    Interface.Parada18.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada19.setIcon(new ImageIcon(Interface.BusDiez));

                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 38) {
                    Interface.Parada19.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada20.setIcon(new ImageIcon(Interface.BusDiez));
                    
                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 39) {
                    Interface.Parada20.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada21.setIcon(new ImageIcon(Interface.BusDiez));
                    
                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 40) {
                    Interface.Parada21.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada22.setIcon(new ImageIcon(Interface.BusDiez));

                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 41) {
                    Interface.Parada22.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada23.setIcon(new ImageIcon(Interface.BusDiez));
                    
                    Interface.paradasBus10.add(nombreBus + P7);

                    Interface.modelo.addElement(Interface.paradasBus10.get(13));
                    
                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 42) {
                    Interface.Parada23.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada24.setIcon(new ImageIcon(Interface.BusDiez));
                    
                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 43) {
                    Interface.Parada24.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada25.setIcon(new ImageIcon(Interface.BusDiez));

                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 44) {
                    Interface.Parada25.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada26.setIcon(new ImageIcon(Interface.BusDiez));
                    
                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 45) {
                    Interface.Parada26.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada27.setIcon(new ImageIcon(Interface.BusDiez));
                    
                    Interface.paradasBus10.add(nombreBus + P8);

                    Interface.modelo.addElement(Interface.paradasBus10.get(14));
                    
                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 46) {
                    Interface.Parada27.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada28.setIcon(new ImageIcon(Interface.BusDiez));

                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 47) {
                    Interface.Parada28.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada29.setIcon(new ImageIcon(Interface.BusDiez));
                    
                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 48) {
                    Interface.Parada29.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada30.setIcon(new ImageIcon(Interface.BusDiez));
                    
                    Interface.paradasBus10.add(nombreBus + P9);

                    Interface.modelo.addElement(Interface.paradasBus10.get(15));
                    
                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 49) {
                    Interface.Parada30.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada31.setIcon(new ImageIcon(Interface.BusDiez));
                    
                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 50) {
                    Interface.Parada31.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada32.setIcon(new ImageIcon(Interface.BusDiez));

                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 51) {
                    Interface.Parada32.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada33.setIcon(new ImageIcon(Interface.BusDiez));
                    
                    Interface.paradasBus10.add(nombreBus + P10);

                    Interface.modelo.addElement(Interface.paradasBus10.get(16));
                    
                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 52) {
                    Interface.Parada33.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada34.setIcon(new ImageIcon(Interface.BusDiez));
                    
                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 53) {
                    Interface.Parada34.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada35.setIcon(new ImageIcon(Interface.BusDiez));

                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 54) {
                    Interface.Parada35.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada36.setIcon(new ImageIcon(Interface.BusDiez));
                    
                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 55) {
                    Interface.Parada36.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada37.setIcon(new ImageIcon(Interface.BusDiez));
                    
                    Interface.paradasBus10.add(nombreBus + P11);

                    Interface.modelo.addElement(Interface.paradasBus10.get(17));
                    
                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 56) {
                    Interface.Parada37.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada38.setIcon(new ImageIcon(Interface.BusDiez));

                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 57) {
                    Interface.Parada38.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada39.setIcon(new ImageIcon(Interface.BusDiez));
                    
                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 58) {
                    Interface.Parada39.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada40.setIcon(new ImageIcon(Interface.BusDiez));

                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 59) {
                    Interface.Parada40.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada41.setIcon(new ImageIcon(Interface.BusDiez));

                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 60) {
                    Interface.Parada41.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada42.setIcon(new ImageIcon(Interface.BusDiez));
                    
                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 61) {
                    Interface.Parada42.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada43.setIcon(new ImageIcon(Interface.BusDiez));
                    
                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 62) {
                    Interface.Parada43.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada44.setIcon(new ImageIcon(Interface.BusDiez));

                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 63) {
                    Interface.Parada44.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada45.setIcon(new ImageIcon(Interface.BusDiez));
                    
                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 64) {
                    Interface.Parada45.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada46.setIcon(new ImageIcon(Interface.BusDiez));
                    
                    Interface.paradasBus10.add(nombreBus + P12);

                    Interface.modelo.addElement(Interface.paradasBus10.get(18));

                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 65) {
                    Interface.Parada46.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada47.setIcon(new ImageIcon(Interface.BusDiez));

                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 66) {
                    Interface.Parada47.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada48.setIcon(new ImageIcon(Interface.BusDiez));

                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 67) {
                    Interface.Parada48.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada49.setIcon(new ImageIcon(Interface.BusDiez));
                    
                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 68) {
                    Interface.Parada49.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada50.setIcon(new ImageIcon(Interface.BusDiez));

                    Interface.paradasBus10.add(nombreBus + P13);

                    Interface.modelo.addElement(Interface.paradasBus10.get(19));

                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 69) {
                    Interface.Parada50.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada51.setIcon(new ImageIcon(Interface.BusDiez));
                    
                    posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (posicion == 70) {
                    Interface.Parada51.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada52.setIcon(new ImageIcon(Interface.BusDiez));

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
