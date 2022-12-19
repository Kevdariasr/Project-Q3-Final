package Buses;

import GUI.Interface;
import static java.lang.Thread.sleep;
import javax.swing.ImageIcon;

public class BusTres extends Thread {

    public boolean activo = true;
    public int Posicion = 0;
    public int tiempo = 2000;
    String nombreBus = "Bus 3 (Blanco): ";
    String P1 = "Ciudad Deportiva Rafael Angel Perez", P2 = "Super Lian, Hatillo", P3 = "Plasticos Tosso", P4 = "Parqueo De Yamuni, San Francisco", P5 = "Colegio Maria Auxiliadora";
    String P6 = "Escuela Juan Rafael Mora", P7 = "Hotel Caribbean. Amon", P8 = "Parque San Fransisco", P9 = "Liceo Nocturno Jose Joaquin Jimenez Nunez", P10 = "Acueductos y Alcantarillados Guadalupe";
    String P11 = "Rotonda de Betania", P12 = "Colegio Salesiano Don Bosco", P13 = "Escuela Republica Dominicana", P14 = "Abastecedor Los Sauces", P15 = "Parque de Monte Azul";
    String P16 = "Cevicheria Costa Azul", P17 = "Taller Gernon", P18 = "Plaza America", P19 = "Restaurante La Fortuna, Hatillo 4", P20 = "Terminal Hatillo";

    @Override
    public void run() {
        Posicion = 1;
        while (activo == true) {
            if (Posicion == 1) {
                Interface.Parada58.setIcon(new ImageIcon(Interface.imgnull));
                Interface.Parada59.setIcon(new ImageIcon(Interface.BusTres));

                Interface.paradasBus3.add(nombreBus + P16);

                Interface.modelo.addElement(Interface.paradasBus3.get(0));

                Posicion++;

                try {
                    sleep(tiempo);
                } catch (InterruptedException e) {
                }
            }
            if (Posicion == 2) {
                Interface.Parada59.setIcon(new ImageIcon(Interface.imgnull));
                Interface.Parada60.setIcon(new ImageIcon(Interface.BusTres));

                Posicion++;
                try {
                    sleep(tiempo);
                } catch (InterruptedException e) {
                }
            }
            if (Posicion == 3) {
                Interface.Parada60.setIcon(new ImageIcon(Interface.imgnull));
                Interface.Parada61.setIcon(new ImageIcon(Interface.BusTres));

                Posicion++;
                try {
                    sleep(tiempo);
                } catch (InterruptedException e) {
                }
                if (Posicion == 4) {
                    Interface.Parada61.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada62.setIcon(new ImageIcon(Interface.BusTres));

                    Interface.paradasBus3.add(nombreBus + P17);

                    Interface.modelo.addElement(Interface.paradasBus3.get(1));

                    Posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (Posicion == 5) {
                    Interface.Parada62.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada63.setIcon(new ImageIcon(Interface.BusTres));

                    Posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (Posicion == 6) {
                    Interface.Parada63.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada64.setIcon(new ImageIcon(Interface.BusTres));

                    Posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (Posicion == 7) {
                    Interface.Parada64.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada65.setIcon(new ImageIcon(Interface.BusTres));

                    Interface.paradasBus3.add(nombreBus + P18);

                    Interface.modelo.addElement(Interface.paradasBus3.get(2));

                    Posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (Posicion == 8) {
                    Interface.Parada65.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada66.setIcon(new ImageIcon(Interface.BusTres));
                    Posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (Posicion == 9) {
                    Interface.Parada66.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada67.setIcon(new ImageIcon(Interface.BusTres));

                    Interface.paradasBus3.add(nombreBus + P19);

                    Interface.modelo.addElement(Interface.paradasBus3.get(3));

                    Posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (Posicion == 10) {
                    Interface.Parada67.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada68.setIcon(new ImageIcon(Interface.BusTres));
                    
                    Posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (Posicion == 11) {
                    Interface.Parada68.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada69.setIcon(new ImageIcon(Interface.BusTres));
                    
                    Posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (Posicion == 12) {
                    Interface.Parada69.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada70.setIcon(new ImageIcon(Interface.BusTres));

                    Interface.paradasBus3.add(nombreBus + P20);

                    Interface.modelo.addElement(Interface.paradasBus3.get(4));

                    Posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (Posicion == 13) {
                    Interface.Parada70.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada1.setIcon(new ImageIcon(Interface.BusTres));

                    Interface.paradasBus3.add(nombreBus + P1);

                    Interface.modelo.addElement(Interface.paradasBus3.get(5));

                    Posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (Posicion == 14) {
                    Interface.Parada1.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada2.setIcon(new ImageIcon(Interface.BusTres));
                    
                    Posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (Posicion == 15) {
                    Interface.Parada2.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada3.setIcon(new ImageIcon(Interface.BusTres));

                    Interface.paradasBus3.add(nombreBus + P2);

                    Interface.modelo.addElement(Interface.paradasBus3.get(6));

                    Posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (Posicion == 16) {
                    Interface.Parada3.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada4.setIcon(new ImageIcon(Interface.BusTres));

                    Posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (Posicion == 17) {
                    Interface.Parada4.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada5.setIcon(new ImageIcon(Interface.BusTres));

                    Posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (Posicion == 18) {
                    Interface.Parada5.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada6.setIcon(new ImageIcon(Interface.BusTres));

                    Posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (Posicion == 19) {
                    Interface.Parada6.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada7.setIcon(new ImageIcon(Interface.BusTres));

                    Interface.paradasBus3.add(nombreBus + P3);

                    Interface.modelo.addElement(Interface.paradasBus3.get(7));

                    Posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (Posicion == 20) {
                    Interface.Parada7.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada8.setIcon(new ImageIcon(Interface.BusTres));
                    Posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (Posicion == 21) {
                    Interface.Parada8.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada9.setIcon(new ImageIcon(Interface.BusTres));

                    Posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (Posicion == 22) {
                    Interface.Parada9.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada10.setIcon(new ImageIcon(Interface.BusTres));
                    
                    Posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (Posicion == 23) {
                    Interface.Parada10.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada11.setIcon(new ImageIcon(Interface.BusTres));

                    Posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (Posicion == 24) {
                    Interface.Parada11.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada12.setIcon(new ImageIcon(Interface.BusTres));

                    Interface.paradasBus3.add(nombreBus + P4);

                    Interface.modelo.addElement(Interface.paradasBus3.get(8));

                    Posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (Posicion == 25) {
                    Interface.Parada12.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada13.setIcon(new ImageIcon(Interface.BusTres));

                    Posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (Posicion == 26) {
                    Interface.Parada13.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada14.setIcon(new ImageIcon(Interface.BusTres));

                    Interface.paradasBus3.add(nombreBus + P5);

                    Interface.modelo.addElement(Interface.paradasBus3.get(9));

                    Posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (Posicion == 27) {
                    Interface.Parada14.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada15.setIcon(new ImageIcon(Interface.BusTres));

                    Posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (Posicion == 28) {
                    Interface.Parada15.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada16.setIcon(new ImageIcon(Interface.BusTres));

                    Posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (Posicion == 29) {
                    
                    Interface.Parada16.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada17.setIcon(new ImageIcon(Interface.BusTres));
                    
                    Interface.paradasBus3.add(nombreBus + P6);

                    Interface.modelo.addElement(Interface.paradasBus3.get(10));

                    Posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (Posicion == 30) {
                    Interface.Parada17.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada18.setIcon(new ImageIcon(Interface.BusTres));

                    Posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (Posicion == 31) {
                    Interface.Parada18.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada19.setIcon(new ImageIcon(Interface.BusTres));

                    Posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (Posicion == 32) {
                    Interface.Parada19.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada20.setIcon(new ImageIcon(Interface.BusTres));

                    Posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (Posicion == 33) {
                    Interface.Parada20.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada21.setIcon(new ImageIcon(Interface.BusTres));

                    Posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (Posicion == 34) {
                    Interface.Parada21.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada22.setIcon(new ImageIcon(Interface.BusTres));

                    Posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (Posicion == 35) {
                    Interface.Parada22.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada23.setIcon(new ImageIcon(Interface.BusTres));

                    Interface.paradasBus3.add(nombreBus + P7);

                    Interface.modelo.addElement(Interface.paradasBus3.get(11));

                    Posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (Posicion == 36) {
                    Interface.Parada23.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada24.setIcon(new ImageIcon(Interface.BusTres));

                    Posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (Posicion == 37) {
                    Interface.Parada24.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada25.setIcon(new ImageIcon(Interface.BusTres));

                    Posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (Posicion == 38) {
                    Interface.Parada25.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada26.setIcon(new ImageIcon(Interface.BusTres));

                    Posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (Posicion == 39) {
                    Interface.Parada26.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada27.setIcon(new ImageIcon(Interface.BusTres));

                    Interface.paradasBus3.add(nombreBus + P8);

                    Interface.modelo.addElement(Interface.paradasBus3.get(12));

                    Posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (Posicion == 40) {
                    Interface.Parada27.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada28.setIcon(new ImageIcon(Interface.BusTres));

                    Posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (Posicion == 41) {
                    Interface.Parada28.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada29.setIcon(new ImageIcon(Interface.BusTres));

                    Posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (Posicion == 42) {
                    Interface.Parada29.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada30.setIcon(new ImageIcon(Interface.BusTres));

                    Interface.paradasBus3.add(nombreBus + P9);

                    Interface.modelo.addElement(Interface.paradasBus3.get(13));

                    Posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (Posicion == 43) {
                    Interface.Parada30.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada31.setIcon(new ImageIcon(Interface.BusTres));

                    Posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (Posicion == 44) {
                    Interface.Parada31.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada32.setIcon(new ImageIcon(Interface.BusTres));

                    Posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (Posicion == 45) {
                    Interface.Parada32.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada33.setIcon(new ImageIcon(Interface.BusTres));

                    Posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (Posicion == 46) {
                    Interface.Parada33.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada34.setIcon(new ImageIcon(Interface.BusTres));

                    Interface.paradasBus3.add(nombreBus + P10);

                    Interface.modelo.addElement(Interface.paradasBus3.get(14));

                    Posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (Posicion == 47) {
                    Interface.Parada34.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada35.setIcon(new ImageIcon(Interface.BusTres));

                    Posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (Posicion == 48) {
                    Interface.Parada35.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada36.setIcon(new ImageIcon(Interface.BusTres));

                    Posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (Posicion == 49) {
                    Interface.Parada36.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada37.setIcon(new ImageIcon(Interface.BusTres));

                    Interface.paradasBus3.add(nombreBus + P11);

                    Interface.modelo.addElement(Interface.paradasBus3.get(15));

                    Posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (Posicion == 50) {
                    Interface.Parada37.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada38.setIcon(new ImageIcon(Interface.BusTres));

                    Posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (Posicion == 51) {
                    Interface.Parada38.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada39.setIcon(new ImageIcon(Interface.BusTres));

                    Posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (Posicion == 52) {
                    Interface.Parada39.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada40.setIcon(new ImageIcon(Interface.BusTres));

                    Posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (Posicion == 53) {
                    Interface.Parada40.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada41.setIcon(new ImageIcon(Interface.BusTres));

                    Posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (Posicion == 54) {
                    Interface.Parada41.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada42.setIcon(new ImageIcon(Interface.BusTres));

                    Posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (Posicion == 55) {
                    Interface.Parada42.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada43.setIcon(new ImageIcon(Interface.BusTres));

                    Posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (Posicion == 56) {
                    Interface.Parada43.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada44.setIcon(new ImageIcon(Interface.BusTres));

                    Posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (Posicion == 57) {
                    Interface.Parada44.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada45.setIcon(new ImageIcon(Interface.BusTres));

                    Posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (Posicion == 58) {
                    Interface.Parada45.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada46.setIcon(new ImageIcon(Interface.BusTres));

                    Interface.paradasBus3.add(nombreBus + P12);

                    Interface.modelo.addElement(Interface.paradasBus3.get(16));

                    Posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (Posicion == 59) {
                    Interface.Parada46.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada47.setIcon(new ImageIcon(Interface.BusTres));

                    Posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (Posicion == 60) {
                    Interface.Parada47.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada48.setIcon(new ImageIcon(Interface.BusTres));

                    Posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (Posicion == 61) {
                    Interface.Parada48.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada49.setIcon(new ImageIcon(Interface.BusTres));

                    Posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (Posicion == 62) {
                    Interface.Parada49.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada50.setIcon(new ImageIcon(Interface.BusTres));

                    Interface.paradasBus3.add(nombreBus + P13);

                    Interface.modelo.addElement(Interface.paradasBus3.get(17));

                    Posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (Posicion == 63) {
                    Interface.Parada50.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada51.setIcon(new ImageIcon(Interface.BusTres));

                    Posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (Posicion == 64) {
                    Interface.Parada51.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada52.setIcon(new ImageIcon(Interface.BusTres));

                    Posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (Posicion == 65) {
                    Interface.Parada52.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada53.setIcon(new ImageIcon(Interface.BusTres));

                    Interface.paradasBus3.add(nombreBus + P14);

                    Interface.modelo.addElement(Interface.paradasBus3.get(18));

                    Posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (Posicion == 66) {
                    Interface.Parada53.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada54.setIcon(new ImageIcon(Interface.BusTres));

                    Posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (Posicion == 67) {
                    Interface.Parada54.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada55.setIcon(new ImageIcon(Interface.BusTres));
                    
                    Posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (Posicion == 68) {
                    Interface.Parada55.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada56.setIcon(new ImageIcon(Interface.BusTres));

                    Posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (Posicion == 69) {
                    Interface.Parada56.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada57.setIcon(new ImageIcon(Interface.BusTres));
                    
                    Posicion++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (Posicion == 70) {
                    Interface.paradasBus3.add(nombreBus + P15);

                    Interface.modelo.addElement(Interface.paradasBus3.get(19));
                    Interface.Parada57.setIcon(new ImageIcon(Interface.imgnull));
                    Interface.Parada58.setIcon(new ImageIcon(Interface.BusTres));

                    Posicion = 1;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
            }
        }
    }
}
