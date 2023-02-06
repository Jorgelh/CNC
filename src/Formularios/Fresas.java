/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import java.awt.Desktop;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Vector;
import javafx.scene.paint.Material;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author jluis
 */
public class Fresas extends javax.swing.JFrame {

    Image foto;
    Vector imagenes;
    int index = 0;
    int mat = 0;

    /**
     * Creates new form Fresas
     */
    public Fresas() {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
        }
        initComponents();
        setLocationRelativeTo(null);
    }

    private void calculorpm() {
        double rpm;
        double avance;
        double pi = 3.82;

        DecimalFormat formatter2 = new DecimalFormat("0");
        DecimalFormat formatter3 = new DecimalFormat("0.00");
        // deep = Double.parseDouble(diametro.getSelectedItem().toString()) * cut;
        rpm = Double.parseDouble(sfm.getText().toString()) * pi / Double.parseDouble(diametro.getSelectedItem().toString());
        this.rpm.setText(formatter2.format(rpm));
        avance = rpm * Double.parseDouble(chipload.getText().toString()) * Integer.parseInt(filos.getText());
        this.avance.setText(formatter3.format(avance));
    }

    Timer timer = new Timer(100, new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            seleccionar();
            timer.stop();
        }
    });

    private void validar() {

        if (herramientas.getSelectedItem().toString().equalsIgnoreCase("ALUMA MILL WIDIA")) {

            if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.375")) {
                chipload.setText("0.0020");
                sfm.setText("490.8");
            } else if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.500")) {
                chipload.setText("0.0025");
                sfm.setText("589");
            }
        } else if (herramientas.getSelectedItem().toString().equalsIgnoreCase("ALUMA MILL FULLERTON")) {

            if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.1250")) {
                chipload.setText("0.0010");
                sfm.setText("125");
            } else if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.1875")) {
                chipload.setText("0.0015");
                sfm.setText("197");
            } else if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.2500")) {
                chipload.setText("0.0015");
                sfm.setText("328");
            } else if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.3750")) {
                chipload.setText("0.0030");
                sfm.setText("450");
            }

        } else if (herramientas.getSelectedItem().toString().equalsIgnoreCase("CARBIDE TICN") && material.getSelectedItem().toString().equalsIgnoreCase("ALUMINIO") && maquinado.getSelectedItem().toString().equalsIgnoreCase("SLOTTING / RANURADO")) {

            if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.0625")) {
                chipload.setText("0.0003");
                sfm.setText("100");
            } else if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.1250")) {
                chipload.setText("0.0005");
                sfm.setText("100");
            } else if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.1875")) {
                chipload.setText("0.0006");
                sfm.setText("200");
            } else if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.2500")) {
                chipload.setText("0.0010");
                sfm.setText("200");
            }else if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.3125")) {
                chipload.setText("0.0012");
                sfm.setText("150");
            }else if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.3750")) {
                chipload.setText("0.0015");
                sfm.setText("300");
            } else if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.5000")) {
                chipload.setText("0.0018");
                sfm.setText("300");
            }
        } else if (herramientas.getSelectedItem().toString().equalsIgnoreCase("CARBIDE TICN") && material.getSelectedItem().toString().equalsIgnoreCase("ALUMINIO") && maquinado.getSelectedItem().toString().equalsIgnoreCase("PROFILING / CONTOUR")) {

            if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.0625")) {
                chipload.setText("0.0005");
                sfm.setText("100");
            } else if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.1250")) {
                chipload.setText("0.001");
                sfm.setText("100");
            } else if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.1875")) {
                chipload.setText("0.0015");
                sfm.setText("200");
            } else if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.2500")) {
                chipload.setText("0.002");
                sfm.setText("200");
            } else if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.3750")) {
                chipload.setText("0.003");
                sfm.setText("300");
            } else if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.5000")) {
                chipload.setText("0.004");
                sfm.setText("300");
            }

        } else if (herramientas.getSelectedItem().toString().equalsIgnoreCase("CARBIDE TICN") && material.getSelectedItem().toString().equalsIgnoreCase("ACERO") && maquinado.getSelectedItem().toString().equalsIgnoreCase("SLOTTING / RANURADO")) {

            if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.0625")) {
                chipload.setText("0.0002");
                sfm.setText("100");
            } else if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.1250")) {
                chipload.setText("0.0003");
                sfm.setText("100");
            } else if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.1875")) {
                chipload.setText("0.0004");
                sfm.setText("200");
            } else if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.2500")) {
                chipload.setText("0.0005");
                sfm.setText("200");
            } else if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.3750")) {
                chipload.setText("0.0013");
                sfm.setText("300");
            } else if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.5000")) {
                chipload.setText("0.0018");
                sfm.setText("300");
            }

        } else if (herramientas.getSelectedItem().toString().equalsIgnoreCase("CARBIDE TICN") && material.getSelectedItem().toString().equalsIgnoreCase("ACERO") && maquinado.getSelectedItem().toString().equalsIgnoreCase("PROFILING / CONTOUR")) {

            if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.0625")) {
                chipload.setText("0.0005");
                sfm.setText("100");
            } else if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.1250")) {
                chipload.setText("0.001");
                sfm.setText("100");
            } else if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.1875")) {
                chipload.setText("0.0015");
                sfm.setText("200");
            } else if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.2500")) {
                chipload.setText("0.002");
                sfm.setText("200");
            } else if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.3750")) {
                chipload.setText("0.0025");
                sfm.setText("300");
            } else if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.5000")) {
                chipload.setText("0.003");
                sfm.setText("300");
            }
        } else if (herramientas.getSelectedItem().toString().equalsIgnoreCase("CARBIDE TICN") || herramientas.getSelectedItem().toString().equalsIgnoreCase("CARBIDE SIN RECUBRIMIENTO") && material.getSelectedItem().toString().equalsIgnoreCase("ALUMINIO") || material.getSelectedItem().toString().equalsIgnoreCase("ACERO") && maquinado.getSelectedItem().toString().equalsIgnoreCase("CONTOURING / BALL")) {

            if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.0625")) {
                chipload.setText("0.0004");
                sfm.setText("100");
            } else if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.1250")) {
                chipload.setText("0.0006");
                sfm.setText("100");
            } else if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.1875")) {
                chipload.setText("0.001");
                sfm.setText("200");
            } else if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.2500")) {
                chipload.setText("0.0013");
                sfm.setText("200");
            } else if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.3750")) {
                chipload.setText("0.002");
                sfm.setText("300");
            } else if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.5000")) {
                chipload.setText("0.0024");
                sfm.setText("300");
            }

        } else if (herramientas.getSelectedItem().toString().equalsIgnoreCase("CARBIDE SIN RECUBRIMIENTO") && material.getSelectedItem().toString().equalsIgnoreCase("ALUMINIO") && maquinado.getSelectedItem().toString().equalsIgnoreCase("SLOTTING / RANURADO")) {

            if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.0625")) {
                chipload.setText("0.0003");
                sfm.setText("100");
            } else if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.1250")) {
                chipload.setText("0.0005");
                sfm.setText("100");
            } else if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.1875")) {
                chipload.setText("0.0006");
                sfm.setText("200");
            } else if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.2500")) {
                chipload.setText("0.0010");
                sfm.setText("200");
            } else if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.3750")) {
                chipload.setText("0.0015");
                sfm.setText("300");
            } else if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.5000")) {
                chipload.setText("0.0018");
                sfm.setText("300");
            }
        } else if (herramientas.getSelectedItem().toString().equalsIgnoreCase("CARBIDE SIN RECUBRIMIENTO") && material.getSelectedItem().toString().equalsIgnoreCase("ALUMINIO") && maquinado.getSelectedItem().toString().equalsIgnoreCase("PROFILING / CONTOUR")) {

            if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.0625")) {
                chipload.setText("0.0005");
                sfm.setText("100");
            } else if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.1250")) {
                chipload.setText("0.001");
                sfm.setText("100");
            } else if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.1875")) {
                chipload.setText("0.0015");
                sfm.setText("200");
            } else if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.2500")) {
                chipload.setText("0.002");
                sfm.setText("200");
            } else if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.3750")) {
                chipload.setText("0.003");
                sfm.setText("300");
            } else if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.5000")) {
                chipload.setText("0.004");
                sfm.setText("300");
            }

        } else if (herramientas.getSelectedItem().toString().equalsIgnoreCase("CARBIDE SIN RECUBRIMIENTO") && material.getSelectedItem().toString().equalsIgnoreCase("ACERO") && maquinado.getSelectedItem().toString().equalsIgnoreCase("SLOTTING / RANURADO")) {

            if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.0625")) {
                chipload.setText("0.0002");
                sfm.setText("100");
            } else if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.1250")) {
                chipload.setText("0.0003");
                sfm.setText("100");
            } else if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.1875")) {
                chipload.setText("0.0004");
                sfm.setText("200");
            } else if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.2500")) {
                chipload.setText("0.0005");
                sfm.setText("200");
            } else if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.3750")) {
                chipload.setText("0.0013");
                sfm.setText("300");
            } else if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.5000")) {
                chipload.setText("0.0018");
                sfm.setText("300");
            }
        } else if (herramientas.getSelectedItem().toString().equalsIgnoreCase("CARBIDE SIN RECUBRIMIENTO") && material.getSelectedItem().toString().equalsIgnoreCase("ACERO") && maquinado.getSelectedItem().toString().equalsIgnoreCase("PROFILING / CONTOUR")) {

            if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.0625")) {
                chipload.setText("0.0005");
                sfm.setText("100");
            } else if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.1250")) {
                chipload.setText("0.001");
                sfm.setText("100");
            } else if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.1875")) {
                chipload.setText("0.0015");
                sfm.setText("200");
            } else if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.2500")) {
                chipload.setText("0.002");
                sfm.setText("200");
            } else if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.3750")) {
                chipload.setText("0.0025");
                sfm.setText("300");
            } else if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.5000")) {
                chipload.setText("0.003");
                sfm.setText("300");
            }

        } else if (herramientas.getSelectedItem().toString().equalsIgnoreCase("WIDIA TIALN")) {

            if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.0938")) {
                chipload.setText("0.00017");
                sfm.setText("75");
            } else if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.0625")) {
                chipload.setText("0.00017");
                sfm.setText("75");
            } else if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.1250")) {
                chipload.setText("0.0005");
                sfm.setText("100");
            } else if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.1875")) {
                chipload.setText("0.0007");
                sfm.setText("100");
            } else if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.2500")) {
                chipload.setText("0.0009");
                sfm.setText("125");
            } else if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.3750")) {
                chipload.setText("0.001");
                sfm.setText("250");
            }
        } else if (herramientas.getSelectedItem().toString().equalsIgnoreCase("ROUNTOOL D2")) {

            if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.0469")) {
                chipload.setText("0.0006");
                sfm.setText("50");
            } else if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.0625")) {
                chipload.setText("0.0008");
                sfm.setText("60");
            } else if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.1250")) {
                chipload.setText("0.001");
                sfm.setText("125");
            } else if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.1875")) {
                chipload.setText("0.001");
                sfm.setText("175");
            } else if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.2500")) {
                chipload.setText("0.002");
                sfm.setText("230");
            } else if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.5000")) {
                chipload.setText("0.003");
                sfm.setText("500");
            }

        } else if (herramientas.getSelectedItem().toString().equalsIgnoreCase("BURR SIN RECUBRIMIENTO")) {

            if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.0625")) {
                chipload.setText("0.001");
                sfm.setText("60");
                filos.setText("5");
            } else if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.1250")) {
                chipload.setText("0.0014");
                sfm.setText("115");
                filos.setText("7");
            } else if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.1875")) {
                chipload.setText("0.001");
                sfm.setText("175");
                filos.setText("8");
            } else if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.2500")) {
                chipload.setText("0.0016");
                sfm.setText("230");
                filos.setText("8");
            }

        } else if (herramientas.getSelectedItem().toString().equalsIgnoreCase("BURR D1")) {
            if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.0625")) {
                chipload.setText("0.001");
                sfm.setText("70");
                filos.setText("5");
            } else if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.1250")) {
                chipload.setText("0.0014");
                sfm.setText("115");
                filos.setText("7");
            } else if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.1875")) {
                chipload.setText("0.002");
                sfm.setText("175");
                filos.setText("6");
            } else if (diametro.getSelectedItem().toString().equalsIgnoreCase("0.2500")) {
                chipload.setText("0.002");
                sfm.setText("230");
                filos.setText("8");
            }
        }

    }

    private void widiaSlotting() {
        limpiarDatos();
        filos.setText("3");
        diametro.addItem("0.375");
        diametro.addItem("0.500");
        diametro.setEditable(true);
        sfm.setEditable(true);
        chipload.setEditable(false);
    }

    private void widiaProfiling() {
        limpiarDatos();
        filos.setText("3");
        diametro.addItem("0.375");
        diametro.addItem("0.500");
        diametro.setEditable(true);
        sfm.setEditable(true);
        chipload.setEditable(true);
    }

    private void fullertonSlotting() {
        limpiarDatos();
        diametro.addItem("0.1250");
        diametro.addItem("0.1875");
        diametro.addItem("0.2500");
        diametro.addItem("0.3750");
        filos.setText("3");
        diametro.setEditable(true);
        sfm.setEditable(true);
        chipload.setEditable(false);
    }

    private void fullertonProfiling() {
        limpiarDatos();
        diametro.addItem("0.1250");
        diametro.addItem("0.1875");
        diametro.addItem("0.2500");
        diametro.addItem("0.3750");
        filos.setText("3");
        diametro.setEditable(true);
        sfm.setEditable(true);
        chipload.setEditable(true);

    }

    private void TICNyCarbideAluminioSlotting() {
        limpiarDatos();
        diametro.addItem("0.0625");
        diametro.addItem("0.1250");
        diametro.addItem("0.1875");
        diametro.addItem("0.2500");
        diametro.addItem("0.3125");
        diametro.addItem("0.3750");
        diametro.addItem("0.5000");
        diametro.setEditable(true);
        sfm.setEditable(true);
        chipload.setEditable(true);
        filos.setEditable(true);
    }

    private void TICNyCarbideAluminioProfiling() {
        limpiarDatos();
        diametro.addItem("0.0625");//1/16
        diametro.addItem("0.1250");//1/8
        diametro.addItem("0.1875");//3/16
        diametro.addItem("0.2500");//1/4
        diametro.addItem("0.3125");//5/16
        diametro.addItem("0.3750");//3/8
        diametro.addItem("0.5000");//1/2
        diametro.setEditable(true);
        sfm.setEditable(true);
        chipload.setEditable(true);
        filos.setEditable(true);
    }

    private void TICNyCarbideAceroSlotting() {
        limpiarDatos();
        diametro.addItem("0.0625");//1/16
        diametro.addItem("0.1250");//1/8
        diametro.addItem("0.1875");//3/16
        diametro.addItem("0.2500");//1/4
        diametro.addItem("0.3125");//5/16
        diametro.addItem("0.3750");//3/8
        diametro.addItem("0.5000");//1/2
        diametro.setEditable(true);
        sfm.setEditable(true);
        chipload.setEditable(true);
        filos.setEditable(true);
    }

    private void TICNyCarbideAceroProfiling() {
        limpiarDatos();
        diametro.addItem("0.0625");//1/16
        diametro.addItem("0.1250");//1/8
        diametro.addItem("0.1875");//3/16
        diametro.addItem("0.2500");//1/4
        diametro.addItem("0.3750");//3/8
        diametro.addItem("0.5000");//1/2
        diametro.setEditable(true);
        sfm.setEditable(true);
        chipload.setEditable(true);
        filos.setEditable(true);
    }

    private void TICNyCarbideAceroConturin() {
        limpiarDatos();
        diametro.addItem("0.0625");//1/16
        diametro.addItem("0.1250");//1/8
        diametro.addItem("0.1875");//3/16
        diametro.addItem("0.2500");//1/4
        diametro.addItem("0.3750");//3/8
        diametro.addItem("0.5000");//1/2
        diametro.setEditable(true);
        sfm.setEditable(true);
        chipload.setEditable(true);
        filos.setEditable(true);
        jLabel1.setIcon(new ImageIcon(((new ImageIcon("\\\\SRVANATEK\\Bases de Datos\\Sistema\\CNC\\src\\Herramientas\\14.jpg").getImage()).getScaledInstance(415, 200, java.awt.Image.SCALE_SMOOTH))));

    }

    private void TIALNSlotting() {
        limpiarDatos();
        diametro.addItem("0.0938");
        diametro.addItem("0.0625");
        diametro.addItem("0.1250");
        diametro.addItem("0.1875");
        diametro.addItem("0.2500");
        diametro.addItem("0.3750");
        diametro.setEditable(true);
        sfm.setEditable(true);
        chipload.setEditable(true);
        filos.setEditable(true);
    }

    private void TIALNProfiling() {
        limpiarDatos();
        diametro.addItem("0.0938");
        diametro.addItem("0.0625");
        diametro.addItem("0.1250");
        diametro.addItem("0.1875");
        diametro.addItem("0.2500");
        diametro.addItem("0.3750");
        diametro.setEditable(true);
        sfm.setEditable(true);
        chipload.setEditable(true);
        filos.setEditable(true);
    }

    private void X50Slotting() {
        limpiarDatos();
        diametro.addItem("0.3125");
        chipload.setText("0.0008");
        sfm.setText("100");
        diametro.setEditable(true);
        sfm.setEditable(true);
        chipload.setEditable(true);
        filos.setEditable(true);
    }

    private void X50Profiling() {
        limpiarDatos();
        diametro.addItem("0.3125");
        chipload.setText("0.0008");
        sfm.setText("100");
        diametro.setEditable(true);
        sfm.setEditable(true);
        chipload.setEditable(true);
        filos.setEditable(true);
    }

    private void sandvikSlotting() {
        limpiarDatos();
        diametro.addItem("0.2500");
        chipload.setText("0.0015");
        sfm.setText("200");
        diametro.setEditable(true);
        sfm.setEditable(true);
        chipload.setEditable(true);
        filos.setEditable(true);
    }

    private void sandvikProfiling() {
        limpiarDatos();
        diametro.addItem("0.2500");
        chipload.setText("0.0015");
        sfm.setText("200");
        diametro.setEditable(true);
        sfm.setEditable(true);
        chipload.setEditable(true);
        filos.setEditable(true);
    }

    private void exopro2680Slotting() {
        limpiarDatos();
        diametro.addItem("0.2500");
        chipload.setText("0.003");
        sfm.setText("300");
        diametro.setEditable(true);
        sfm.setEditable(true);
        chipload.setEditable(true);
        filos.setEditable(true);
    }

    private void exopro2680Profiling() {
        limpiarDatos();
        diametro.addItem("0.2500");
        chipload.setText("0.003");
        sfm.setText("300");
        diametro.setEditable(true);
        sfm.setEditable(true);
        chipload.setEditable(true);
        filos.setEditable(true);
    }

    private void exopro2650Slotting() {
        limpiarDatos();
        diametro.addItem("0.2500");
        chipload.setText("0.0018");
        sfm.setText("300");
        diametro.setEditable(true);
        sfm.setEditable(true);
        chipload.setEditable(true);
        filos.setEditable(true);
    }

    private void exopro2650Profiling() {
        limpiarDatos();
        diametro.addItem("0.2500");
        diametro.setEditable(true);
        sfm.setEditable(true);
        chipload.setEditable(true);
        filos.setEditable(true);
    }

    private void roundtoolSlotting() {
        limpiarDatos();
        diametro.addItem("0.0469");
        diametro.addItem("0.0625");
        diametro.addItem("0.1250");
        diametro.addItem("0.1875");
        diametro.addItem("0.2500");
        diametro.addItem("0.5000");
        diametro.setEditable(true);
        sfm.setEditable(true);
        chipload.setEditable(true);
        filos.setEditable(true);
    }

    private void roundtoolProfiling() {
        limpiarDatos();
        diametro.addItem("0.0469");
        diametro.addItem("0.0625");
        diametro.addItem("0.1250");
        diametro.addItem("0.1875");
        diametro.addItem("0.2500");
        diametro.addItem("0.5000");
        diametro.setEditable(true);
        sfm.setEditable(true);
        chipload.setEditable(true);
        filos.setEditable(true);
    }

    private void burSlotting() {
        limpiarDatos();
        diametro.addItem("0.0625");
        diametro.addItem("0.1250");
        diametro.addItem("0.1875");
        diametro.addItem("0.2500");
        diametro.setEditable(true);
        sfm.setEditable(true);
        chipload.setEditable(true);
        filos.setEditable(true);
    }

    private void burProfiling() {
        limpiarDatos();
        diametro.addItem("0.0625");
        diametro.addItem("0.1250");
        diametro.addItem("0.1875");
        diametro.addItem("0.2500");
        diametro.setEditable(true);
        sfm.setEditable(true);
        chipload.setEditable(true);
        filos.setEditable(true);
    }

    private void burd1Slotting() {
        limpiarDatos();
        diametro.addItem("0.0625");
        diametro.addItem("0.1250");
        diametro.addItem("0.1875");
        diametro.addItem("0.2500");
        diametro.setEditable(true);
        sfm.setEditable(true);
        chipload.setEditable(true);
        filos.setEditable(true);
    }

    private void burd1Profiling() {
        limpiarDatos();
        diametro.addItem("0.0625");
        diametro.addItem("0.1250");
        diametro.addItem("0.1875");
        diametro.addItem("0.2500");
        diametro.setEditable(true);
        sfm.setEditable(true);
        chipload.setEditable(true);
        filos.setEditable(true);
    }

    /*private void llenardatos() {
        if (material.getSelectedItem().toString().equalsIgnoreCase("ALUMINIO")) {
            
            if (profiling.isSelected()) {
                limpiarprofilselect();
                TICNyCarbideAluminioProfiling();
            } else if (slotting.isSelected()) {
                limpiarprofilselect();
                TICNyCarbideAluminioSlotting();
            } else if (contouring.isSelected()) {
                TICNyCarbideAceroConturin();
            }
            
        } else if (material.getSelectedItem().toString().equalsIgnoreCase("ACERO K110")) {

            if (profiling.isSelected()) {
                limpiarprofilselect();
                TICNyCarbideAceroProfiling();
            } else if (slotting.isSelected()) {
                limpiarprofilselect();
                TICNyCarbideAceroSlotting();
            } else if (contouring.isSelected()) {
                TICNyCarbideAceroConturin();
            }
        }
         
    }
     */
    private void calcularwocdoc() {

        double a = 0;
        double b = 0;
        double c = 0;
        DecimalFormat formatter = new DecimalFormat("0.0000");
        if (material.getSelectedItem().toString().equalsIgnoreCase("ALUMINIO") && herramientas.getSelectedItem().toString().equalsIgnoreCase("CARBIDE TICN") || herramientas.getSelectedItem().toString().equalsIgnoreCase("CARBIDE SIN RECUBRIMIENTO")) {

            if (maquinado.getSelectedItem().toString().equalsIgnoreCase("PROFILING / CONTOUR")) {//profiling aluminio
                a = Double.parseDouble(diametro.getSelectedItem().toString());
                b = 0.8;
                c = a * b;
                this.woc.setText(formatter.format(c) + " MAX");

                a = Double.parseDouble(diametro.getSelectedItem().toString());
                b = 0.6;
                c = a * b;
                this.doc.setText(formatter.format(c) + " MAX");

            } else if (maquinado.getSelectedItem().toString().equalsIgnoreCase("SLOTTING / RANURADO")) {//slotting aluminio
                a = Double.parseDouble(diametro.getSelectedItem().toString());
                b = 0.5;
                c = a * b;
                this.doc.setText(formatter.format(c) + " MAX");
                
                 a = Double.parseDouble(diametro.getSelectedItem().toString());
                b = 1;
                c = a * b;
                this.woc.setText(formatter.format(c) + " MAX");
                
                

            } else if (maquinado.getSelectedItem().toString().equalsIgnoreCase("CONTOURING / BALL")) {//contouring aluminio

                a = Double.parseDouble(diametro.getSelectedItem().toString());
                b = 0.5;
                c = a * b;
                this.woc.setText(formatter.format(c) + " MAX");
                a = Double.parseDouble(diametro.getSelectedItem().toString());
                b = 0.2;
                c = a * b;
                this.doc.setText(formatter.format(c) + " MAX");

            }
        } else if (material.getSelectedItem().toString().equalsIgnoreCase("ACERO") && herramientas.getSelectedItem().toString().equalsIgnoreCase("CARBIDE TICN") || herramientas.getSelectedItem().toString().equalsIgnoreCase("CARBIDE SIN RECUBRIMIENTO")) {

            if (maquinado.getSelectedItem().toString().equalsIgnoreCase("PROFILING / CONTOUR")) {//profiling acero

                a = Double.parseDouble(diametro.getSelectedItem().toString());
                b = 1;
                c = a * b;
                this.doc.setText(formatter.format(c) + " MAX");
                a = Double.parseDouble(diametro.getSelectedItem().toString());
                b = 0.5;
                c = a * b;
                this.woc.setText(formatter.format(c) + " MAX");
                
            } else if (maquinado.getSelectedItem().toString().equalsIgnoreCase("SLOTTING / RANURADO")) {//slotting acero
                a = Double.parseDouble(diametro.getSelectedItem().toString());
                b = 0.5;
                c = a * b;
                this.doc.setText(formatter.format(c) + " MAX");
                
                 a = Double.parseDouble(diametro.getSelectedItem().toString());
                b = 1;
                c = a * b;
                this.woc.setText(formatter.format(c) + " MAX");
                
            } else if (maquinado.getSelectedItem().toString().equalsIgnoreCase("CONTOURING / BALL")) {//countoring acero

                a = Double.parseDouble(diametro.getSelectedItem().toString());
                b = 0.5;
                c = a * b;
                this.woc.setText(formatter.format(c) + " MAX");
                a = Double.parseDouble(diametro.getSelectedItem().toString());
                b = 0.2;
                c = a * b;
                this.doc.setText(formatter.format(c) + " MAX");
            }

        } else if (material.getSelectedItem().toString().equalsIgnoreCase("ALUMINIO") && herramientas.getSelectedItem().toString().equalsIgnoreCase("ALUMA MILL WIDIA")) {

            if (maquinado.getSelectedItem().toString().equalsIgnoreCase("PROFILING / CONTOUR")) {//profiling acero

                a = Double.parseDouble(diametro.getSelectedItem().toString());
                b = 0.5;
                c = a * b;
                //this.woc.setText(formatter.format(c)+ " MAX");
                woc.setText(formatter.format(c));

                a = Double.parseDouble(diametro.getSelectedItem().toString());
                b = 1;
                c = a * b;
                //this.doc.setText(formatter.format(c)+ " MAX");
                doc.setText(formatter.format(c));

            } else if (maquinado.getSelectedItem().toString().equalsIgnoreCase("SLOTTING / RANURADO")) {//slotting acero

                a = Double.parseDouble(diametro.getSelectedItem().toString());
                b = 1;
                c = a * b;
                //this.woc.setText(formatter.format(c)+ " MAX");
                woc.setText(formatter.format(c));
                a = Double.parseDouble(diametro.getSelectedItem().toString());
                b = 0.5;
                c = a * b;
                //this.doc.setText(formatter.format(c)+ " MAX");
                doc.setText(formatter.format(c));
            }

        } else if (material.getSelectedItem().toString().equalsIgnoreCase("ALUMINIO") && herramientas.getSelectedItem().toString().equalsIgnoreCase("ALUMA MILL FULLERTON")) {

            if (maquinado.getSelectedItem().toString().equalsIgnoreCase("PROFILING / CONTOUR")) {//profiling acero

                a = Double.parseDouble(diametro.getSelectedItem().toString());
                b = 0.5;
                c = a * b;
                woc.setText("");
                woc.setText(formatter.format(c) + " MAX");
                System.out.println("woc " + c);
                a = Double.parseDouble(diametro.getSelectedItem().toString());
                b = 1;
                c = a * b;
                doc.setText(formatter.format(c)+ " MAX");

            } else if (maquinado.getSelectedItem().toString().equalsIgnoreCase("SLOTTING / RANURADO")) {//slotting acero
            
                a = Double.parseDouble(diametro.getSelectedItem().toString());
                b = 1;
                c = a * b;
                woc.setText("");
                woc.setText(formatter.format(c)+ " MAX");

                a = Double.parseDouble(diametro.getSelectedItem().toString());
                b = 0.5;
                c = a * b;
                doc.setText("");
                doc.setText(formatter.format(c)+ " MAX");
            }

        } else if (material.getSelectedItem().toString().equalsIgnoreCase("ACERO K110") && herramientas.getSelectedItem().toString().equalsIgnoreCase("WIDIA TIALN")) {
        

            if (maquinado.getSelectedItem().toString().equalsIgnoreCase("PROFILING / CONTOUR")) {//profiling acero

            a = Double.parseDouble(diametro.getSelectedItem().toString());
            b = 0.5;
            c = a * b;
            this.woc.setText(formatter.format(c) + " MAX");
            a = Double.parseDouble(diametro.getSelectedItem().toString());
            b = 1;
            c = a * b;
            this.doc.setText(formatter.format(c) + " MAX");

            } else if (maquinado.getSelectedItem().toString().equalsIgnoreCase("SLOTTING / RANURADO")) {//slotting acero

            a = Double.parseDouble(diametro.getSelectedItem().toString());
            b = 1;
            c = a * b;
            this.woc.setText(formatter.format(c) + " MAX");
            a = Double.parseDouble(diametro.getSelectedItem().toString());
            b = 0.5;
            c = a * b;
            this.doc.setText(formatter.format(c) + " MAX");

            }
    }
    }
    private void limpiarDatos() {
        mat = 1;
        diametro.removeAllItems();
        //chipload.setText("");
        //sfm.setText("");
        /*woc.setText("");
        doc.setText("");
        rpm.setText("");
        avance.setText("");*/
        mat = 0;

    }

    private void limpiar() {
        mat = 1;
        diametro.removeAllItems();
        chipload.setText("");
        material.removeAllItems();
        maquinado.removeAllItems();
        sfm.setText("");
        filos.setText("");
        rpm.setText("");
        avance.setText("");
        woc.setText("");
        doc.setText("");
        diametro.setEnabled(false);
        chipload.setEnabled(false);
        sfm.setEnabled(false);
        maquinado.setEnabled(false);
        maquinado.setSelectedItem("");
        mat = 0;
    }

    private void seleccionar() {

        if (herramientas.getSelectedItem().toString().equalsIgnoreCase("ALUMA MILL WIDIA") && maquinado.getSelectedItem().toString().equalsIgnoreCase("SLOTTING / RANURADO")) {
            widiaSlotting();
        } else if (herramientas.getSelectedItem().toString().equalsIgnoreCase("ALUMA MILL WIDIA") && maquinado.getSelectedItem().toString().equalsIgnoreCase("PROFILING / CONTOUR")) {
            widiaProfiling();
        } else if (herramientas.getSelectedItem().toString().equalsIgnoreCase("ALUMA MILL FULLERTON") && maquinado.getSelectedItem().toString().equalsIgnoreCase("SLOTTING / RANURADO")) {
            fullertonSlotting();
        } else if (herramientas.getSelectedItem().toString().equalsIgnoreCase("ALUMA MILL FULLERTON") && maquinado.getSelectedItem().toString().equalsIgnoreCase("PROFILING / CONTOUR")) {
            fullertonProfiling();
        } else if (herramientas.getSelectedItem().toString().equalsIgnoreCase("CARBIDE TICN") && maquinado.getSelectedItem().toString().equalsIgnoreCase("SLOTTING / RANURADO") && material.getSelectedItem().toString().equalsIgnoreCase("ALUMINIO")) {
            TICNyCarbideAluminioSlotting();
        } else if (herramientas.getSelectedItem().toString().equalsIgnoreCase("CARBIDE TICN") && maquinado.getSelectedItem().toString().equalsIgnoreCase("PROFILING / CONTOUR") && material.getSelectedItem().toString().equalsIgnoreCase("ALUMINIO")) {
            TICNyCarbideAluminioProfiling();
        } else if (herramientas.getSelectedItem().toString().equalsIgnoreCase("CARBIDE TICN") && maquinado.getSelectedItem().toString().equalsIgnoreCase("SLOTTING / RANURADO") && material.getSelectedItem().toString().equalsIgnoreCase("ACERO")) {
            TICNyCarbideAceroSlotting();
        } else if (herramientas.getSelectedItem().toString().equalsIgnoreCase("CARBIDE TICN") && maquinado.getSelectedItem().toString().equalsIgnoreCase("PROFILING / CONTOUR") && material.getSelectedItem().toString().equalsIgnoreCase("ACERO")) {
            TICNyCarbideAceroProfiling();
        } else if (herramientas.getSelectedItem().toString().equalsIgnoreCase("CARBIDE SIN RECUBRIMIENTO") && maquinado.getSelectedItem().toString().equalsIgnoreCase("SLOTTING / RANURADO") && material.getSelectedItem().toString().equalsIgnoreCase("ALUMINIO")) {
            TICNyCarbideAluminioSlotting();jLabel1.setIcon(new ImageIcon(((new ImageIcon("\\\\SRVANATEK\\Bases de Datos\\Sistema\\CNC\\src\\Herramientas\\4.jpg").getImage()).getScaledInstance(415, 200, java.awt.Image.SCALE_SMOOTH))));
        } else if (herramientas.getSelectedItem().toString().equalsIgnoreCase("CARBIDE SIN RECUBRIMIENTO") && maquinado.getSelectedItem().toString().equalsIgnoreCase("PROFILING / CONTOUR") && material.getSelectedItem().toString().equalsIgnoreCase("ALUMINIO")) {
            TICNyCarbideAluminioProfiling();jLabel1.setIcon(new ImageIcon(((new ImageIcon("\\\\SRVANATEK\\Bases de Datos\\Sistema\\CNC\\src\\Herramientas\\4.jpg").getImage()).getScaledInstance(415, 200, java.awt.Image.SCALE_SMOOTH))));
        } else if (herramientas.getSelectedItem().toString().equalsIgnoreCase("CARBIDE SIN RECUBRIMIENTO") && maquinado.getSelectedItem().toString().equalsIgnoreCase("SLOTTING / RANURADO") && material.getSelectedItem().toString().equalsIgnoreCase("ACERO")) {
            TICNyCarbideAceroSlotting();jLabel1.setIcon(new ImageIcon(((new ImageIcon("\\\\SRVANATEK\\Bases de Datos\\Sistema\\CNC\\src\\Herramientas\\4.jpg").getImage()).getScaledInstance(415, 200, java.awt.Image.SCALE_SMOOTH))));
        } else if (herramientas.getSelectedItem().toString().equalsIgnoreCase("CARBIDE SIN RECUBRIMIENTO") && maquinado.getSelectedItem().toString().equalsIgnoreCase("PROFILING / CONTOUR") && material.getSelectedItem().toString().equalsIgnoreCase("ACERO")) {
            TICNyCarbideAceroProfiling();jLabel1.setIcon(new ImageIcon(((new ImageIcon("\\\\SRVANATEK\\Bases de Datos\\Sistema\\CNC\\src\\Herramientas\\4.jpg").getImage()).getScaledInstance(415, 200, java.awt.Image.SCALE_SMOOTH))));
        } else if (herramientas.getSelectedItem().toString().equalsIgnoreCase("CARBIDE TICN") && maquinado.getSelectedItem().toString().equalsIgnoreCase("CONTOURING / BALL") && material.getSelectedItem().toString().equalsIgnoreCase("ACERO")) {
            TICNyCarbideAceroConturin();
        } else if (herramientas.getSelectedItem().toString().equalsIgnoreCase("CARBIDE SIN RECUBRIMIENTO") && maquinado.getSelectedItem().toString().equalsIgnoreCase("CONTOURING / BALL") && material.getSelectedItem().toString().equalsIgnoreCase("ACERO")) {
            TICNyCarbideAceroConturin();
        } else if (herramientas.getSelectedItem().toString().equalsIgnoreCase("CARBIDE TICN") && maquinado.getSelectedItem().toString().equalsIgnoreCase("CONTOURING / BALL") && material.getSelectedItem().toString().equalsIgnoreCase("ALUMINIO")) {
            TICNyCarbideAceroConturin();
        } else if (herramientas.getSelectedItem().toString().equalsIgnoreCase("CARBIDE SIN RECUBRIMIENTO") && maquinado.getSelectedItem().toString().equalsIgnoreCase("CONTOURING / BALL") && material.getSelectedItem().toString().equalsIgnoreCase("ALUMINIO")) {
            TICNyCarbideAceroConturin();
        } else if (herramientas.getSelectedItem().toString().equalsIgnoreCase("WIDIA TIALN") && maquinado.getSelectedItem().toString().equalsIgnoreCase("SLOTTING / RANURADO")) {
            TIALNSlotting();
        } else if (herramientas.getSelectedItem().toString().equalsIgnoreCase("WIDIA TIALN") && maquinado.getSelectedItem().toString().equalsIgnoreCase("PROFILING / CONTOUR")) {
            TIALNProfiling();
        } else if (herramientas.getSelectedItem().toString().equalsIgnoreCase("X50-70") && maquinado.getSelectedItem().toString().equalsIgnoreCase("SLOTTING / RANURADO")) {
            X50Slotting();
        } else if (herramientas.getSelectedItem().toString().equalsIgnoreCase("X50-70") && maquinado.getSelectedItem().toString().equalsIgnoreCase("PROFILING / CONTOUR")) {
            X50Profiling();
        } else if (herramientas.getSelectedItem().toString().equalsIgnoreCase("SANDVIK 2P050-0635") && maquinado.getSelectedItem().toString().equalsIgnoreCase("SLOTTING / RANURADO")) {
            sandvikSlotting();
        } else if (herramientas.getSelectedItem().toString().equalsIgnoreCase("SANDVIK 2P050-0635") && maquinado.getSelectedItem().toString().equalsIgnoreCase("PROFILING / CONTOUR")) {
            sandvikProfiling();
        } else if (herramientas.getSelectedItem().toString().equalsIgnoreCase("EXO PRO 26800316") && maquinado.getSelectedItem().toString().equalsIgnoreCase("SLOTTING / RANURADO")) {
            exopro2680Slotting();
        } else if (herramientas.getSelectedItem().toString().equalsIgnoreCase("EXO PRO 26800316") && maquinado.getSelectedItem().toString().equalsIgnoreCase("PROFILING / CONTOUR")) {
            exopro2680Profiling();
        } else if (herramientas.getSelectedItem().toString().equalsIgnoreCase("EXO PRO 26500316") && maquinado.getSelectedItem().toString().equalsIgnoreCase("SLOTTING / RANURADO")) {
            exopro2650Slotting();
        } else if (herramientas.getSelectedItem().toString().equalsIgnoreCase("EXO PRO 26500316") && maquinado.getSelectedItem().toString().equalsIgnoreCase("PROFILING / CONTOUR")) {
            exopro2650Profiling();
        } else if (herramientas.getSelectedItem().toString().equalsIgnoreCase("ROUNTOOL D2") && maquinado.getSelectedItem().toString().equalsIgnoreCase("SLOTTING / RANURADO")) {
            roundtoolSlotting();
        } else if (herramientas.getSelectedItem().toString().equalsIgnoreCase("ROUNTOOL D2") && maquinado.getSelectedItem().toString().equalsIgnoreCase("PROFILING / CONTOUR")) {
            roundtoolProfiling();
        } else if (herramientas.getSelectedItem().toString().equalsIgnoreCase("BURR SIN RECUBRIMIENTO") && maquinado.getSelectedItem().toString().equalsIgnoreCase("SLOTTING / RANURADO")) {
            burSlotting();
        } else if (herramientas.getSelectedItem().toString().equalsIgnoreCase("BURR SIN RECUBRIMIENTO") && maquinado.getSelectedItem().toString().equalsIgnoreCase("PROFILING / CONTOUR")) {
            burProfiling();
        } else if (herramientas.getSelectedItem().toString().equalsIgnoreCase("BURR D1") && maquinado.getSelectedItem().toString().equalsIgnoreCase("SLOTTING / RANURADO")) {
            burd1Slotting();
        } else if (herramientas.getSelectedItem().toString().equalsIgnoreCase("BURR D1") && maquinado.getSelectedItem().toString().equalsIgnoreCase("PROFILING / CONTOUR")) {
            burd1Profiling();
        }

        normal();
    }

    private void normal() {

        diametro.setEnabled(true);
        sfm.setEnabled(true);
        chipload.setEnabled(true);

    }

    private void maquinado() {
        maquinado.addItem("SLOTTING / RANURADO");
        maquinado.addItem("PROFILING / CONTOUR");
    }

    private void maquinado1() {
        maquinado.addItem("SLOTTING / RANURADO");
        maquinado.addItem("PROFILING / CONTOUR");
        maquinado.addItem("CONTOURING / BALL");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        material = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        herramientas = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        maquinado = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        diametro = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        filos = new javax.swing.JTextField();
        sfm = new javax.swing.JTextField();
        chipload = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        rpm = new javax.swing.JTextField();
        avance = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        woc = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        doc = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("HERRAMIENTAS");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 102, 0));

        jPanel2.setBackground(new java.awt.Color(102, 204, 0));

        jPanel5.setBackground(new java.awt.Color(51, 204, 0));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("MATERIAL");

        material.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        material.setForeground(new java.awt.Color(0, 0, 255));
        material.setEnabled(false);
        material.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("HERRAMIENTAS");

        herramientas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        herramientas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "ALUMA MILL WIDIA", "ALUMA MILL FULLERTON", "CARBIDE TICN", "CARBIDE SIN RECUBRIMIENTO", "WIDIA TIALN", "X50-70", "SANDVIK 2P050-0635", "EXO PRO 26800316", "EXO PRO 26500316", "ROUNTOOL D2", "BURR SIN RECUBRIMIENTO", "BURR D1" }));
        herramientas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                herramientasActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("MAQUINADO");

        maquinado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        maquinado.setEnabled(false);
        maquinado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maquinadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(material, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(herramientas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(maquinado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel2)
                            .addComponent(jLabel14))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(herramientas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(material, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(maquinado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(51, 204, 0));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("DIAMETRO");

        diametro.setEditable(true);
        diametro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        diametro.setForeground(new java.awt.Color(0, 0, 255));
        diametro.setEnabled(false);
        diametro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diametroActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("SFM");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("CHIP LOAD");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("NO. FILOS");

        filos.setEditable(false);
        filos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        filos.setForeground(new java.awt.Color(255, 51, 51));
        filos.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        sfm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sfm.setForeground(new java.awt.Color(0, 0, 255));

        chipload.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chipload.setForeground(new java.awt.Color(0, 0, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(diametro, 0, 250, Short.MAX_VALUE)
                    .addComponent(filos)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(sfm)
                    .addComponent(chipload, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(diametro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sfm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chipload, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jLabel7)
                .addGap(4, 4, 4)
                .addComponent(filos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(51, 204, 0));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("CALCULAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/cancelar.png"))); // NOI18N
        jButton2.setText("CANCELAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(50, 50, 50)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(51, 204, 0));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("RPM");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("AVANCE");

        rpm.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        rpm.setForeground(new java.awt.Color(0, 0, 255));
        rpm.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        avance.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        avance.setForeground(new java.awt.Color(0, 0, 255));
        avance.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("WOC / LATERAL");

        woc.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        woc.setForeground(new java.awt.Color(255, 51, 51));
        woc.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("DOC / PROFUNDIDAD");

        doc.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        doc.setForeground(new java.awt.Color(255, 51, 51));
        doc.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("NOTA: LA PROFUNDIDAD DE CORTE DEPENDERA DE LA GEOMETRIA DE LA PIEZA");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(rpm, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(jLabel8)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(avance, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addGap(61, 61, 61)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(woc, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(86, 86, 86)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addComponent(doc, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(jLabel15)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(doc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(jLabel8)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(avance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rpm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(woc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("CALCULO DE VELOCIDADES");

        jButton3.setText("MILL");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("INCH / MM");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(261, 261, 261)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4)
                        .addGap(15, 15, 15))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel12)
                        .addGap(18, 18, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void herramientasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_herramientasActionPerformed

        if (herramientas.getSelectedItem().toString().equalsIgnoreCase("ALUMA MILL WIDIA")) {
            jLabel1.setIcon(new ImageIcon(((new ImageIcon("\\\\SRVANATEK\\Bases de Datos\\Sistema\\CNC\\src\\Herramientas\\1.jpg").getImage()).getScaledInstance(415, 200, java.awt.Image.SCALE_SMOOTH))));
            limpiar();
            maquinado();
            material.addItem("ALUMINIO");
            maquinado.setEnabled(true);
            maquinado.setSelectedItem("SLOTTING / RANURADO");

        } else if (herramientas.getSelectedItem().toString().equalsIgnoreCase("ALUMA MILL FULLERTON")) {
            jLabel1.setIcon(new ImageIcon(((new ImageIcon("\\\\SRVANATEK\\Bases de Datos\\Sistema\\CNC\\src\\Herramientas\\2.jpg").getImage()).getScaledInstance(415, 200, java.awt.Image.SCALE_SMOOTH))));
            limpiar();
            maquinado();
            material.addItem("ALUMINIO");
            maquinado.setEnabled(true);
            maquinado.setSelectedItem("SLOTTING / RANURADO");

        } else if (herramientas.getSelectedItem().toString().equalsIgnoreCase("CARBIDE TICN")) {
            jLabel1.setIcon(new ImageIcon(((new ImageIcon("\\\\SRVANATEK\\Bases de Datos\\Sistema\\CNC\\src\\Herramientas\\3.jpg").getImage()).getScaledInstance(415, 200, java.awt.Image.SCALE_SMOOTH))));
            limpiar();
            maquinado1();
            maquinado.setEnabled(true);
            material.setEnabled(true);
            material.addItem("ALUMINIO");
            material.addItem("ACERO");
            filos.setText("4");
            maquinado.setSelectedItem("SLOTTING / RANURADO");
        } else if (herramientas.getSelectedItem().toString().equalsIgnoreCase("CARBIDE SIN RECUBRIMIENTO")) {
            jLabel1.setIcon(new ImageIcon(((new ImageIcon("\\\\SRVANATEK\\Bases de Datos\\Sistema\\CNC\\src\\Herramientas\\4.jpg").getImage()).getScaledInstance(415, 200, java.awt.Image.SCALE_SMOOTH))));
            limpiar();
            maquinado1();
            maquinado.setEnabled(true);
            material.setEnabled(true);
            material.addItem("ALUMINIO");
            material.addItem("ACERO");
            filos.setText("4");
            maquinado.setSelectedItem("SLOTTING / RANURADO");

        } else if (herramientas.getSelectedItem().toString().equalsIgnoreCase("WIDIA TIALN")) {
            jLabel1.setIcon(new ImageIcon(((new ImageIcon("\\\\SRVANATEK\\Bases de Datos\\Sistema\\CNC\\src\\Herramientas\\5.jpg").getImage()).getScaledInstance(415, 200, java.awt.Image.SCALE_SMOOTH))));
            limpiar();
            maquinado();
            material.addItem("ACERO K110");
            maquinado.setEnabled(true);
            filos.setText("4");
            maquinado.setSelectedItem("SLOTTING / RANURADO");

        } else if (herramientas.getSelectedItem().toString().equalsIgnoreCase("X50-70")) {
            jLabel1.setIcon(new ImageIcon(((new ImageIcon("\\\\SRVANATEK\\Bases de Datos\\Sistema\\CNC\\src\\Herramientas\\6.jpg").getImage()).getScaledInstance(415, 200, java.awt.Image.SCALE_SMOOTH))));
            limpiar();
            maquinado();
            material.addItem("TEMPLADO");
            maquinado.setEnabled(true);
            filos.setText("6");
            maquinado.setSelectedItem("SLOTTING / RANURADO");;

        } else if (herramientas.getSelectedItem().toString().equalsIgnoreCase("SANDVIK 2P050-0635")) {
            jLabel1.setIcon(new ImageIcon(((new ImageIcon("\\\\SRVANATEK\\Bases de Datos\\Sistema\\CNC\\src\\Herramientas\\7.jpg").getImage()).getScaledInstance(415, 200, java.awt.Image.SCALE_SMOOTH))));
            limpiar();
            maquinado();
            material.addItem("FIBRA DE VIDRIO");
            maquinado.setEnabled(true);
            filos.setText("7");
            maquinado.setSelectedItem("SLOTTING / RANURADO");

        } else if (herramientas.getSelectedItem().toString().equalsIgnoreCase("EXO PRO 26800316")) {
            jLabel1.setIcon(new ImageIcon(((new ImageIcon("\\\\SRVANATEK\\Bases de Datos\\Sistema\\CNC\\src\\Herramientas\\8.jpg").getImage()).getScaledInstance(415, 200, java.awt.Image.SCALE_SMOOTH))));
            limpiar();
            maquinado();
            material.addItem("FIBRA DE VIDRIO");
            maquinado.setEnabled(true);
            filos.setText("4");
            maquinado.setSelectedItem("SLOTTING / RANURADO");

        } else if (herramientas.getSelectedItem().toString().equalsIgnoreCase("EXO PRO 26500316")) {
            jLabel1.setIcon(new ImageIcon(((new ImageIcon("\\\\SRVANATEK\\Bases de Datos\\Sistema\\CNC\\src\\Herramientas\\9.jpg").getImage()).getScaledInstance(415, 200, java.awt.Image.SCALE_SMOOTH))));
            limpiar();
            maquinado();
            material.addItem("FIBRA DE VIDRIO");
            maquinado.setEnabled(true);
            filos.setText("8");
            maquinado.setSelectedItem("SLOTTING / RANURADO");;

        } else if (herramientas.getSelectedItem().toString().equalsIgnoreCase("ROUNTOOL D2")) {
            jLabel1.setIcon(new ImageIcon(((new ImageIcon("\\\\SRVANATEK\\Bases de Datos\\Sistema\\CNC\\src\\Herramientas\\10.jpg").getImage()).getScaledInstance(415, 200, java.awt.Image.SCALE_SMOOTH))));
            limpiar();
            maquinado();
            material.addItem("FIBRA DE VIDRIO");
            maquinado.setEnabled(true);
            filos.setText("4");
            maquinado.setSelectedItem("SLOTTING / RANURADO");

        } else if (herramientas.getSelectedItem().toString().equalsIgnoreCase("BURR SIN RECUBRIMIENTO")) {
            jLabel1.setIcon(new ImageIcon(((new ImageIcon("\\\\SRVANATEK\\Bases de Datos\\Sistema\\CNC\\src\\Herramientas\\11.jpg").getImage()).getScaledInstance(415, 200, java.awt.Image.SCALE_SMOOTH))));
            limpiar();
            maquinado();
            material.addItem("FIBRA DE VIDRIO");
            maquinado.setEnabled(true);
            //filos.setText("5");
            maquinado.setSelectedItem("SLOTTING / RANURADO");

        } else if (herramientas.getSelectedItem().toString().equalsIgnoreCase("BURR D1")) {
            jLabel1.setIcon(new ImageIcon(((new ImageIcon("\\\\SRVANATEK\\Bases de Datos\\Sistema\\CNC\\src\\Herramientas\\12.jpg").getImage()).getScaledInstance(415, 200, java.awt.Image.SCALE_SMOOTH))));
            limpiar();
            maquinado();
            material.addItem("FIBRA DE VIDRIO");
            maquinado.setEnabled(true);
            //filos.setText("8");
            maquinado.setSelectedItem("SLOTTING / RANURADO");

        } else if (herramientas.getSelectedItem().toString().equalsIgnoreCase(" ")) {
            jLabel1.setIcon(new ImageIcon(((new ImageIcon("\\\\SRVANATEK\\Bases de Datos\\Sistema\\CNC\\src\\Herramientas\\13.jpg").getImage()).getScaledInstance(415, 200, java.awt.Image.SCALE_SMOOTH))));
            limpiar();
            maquinado.setEnabled(true);
            filos.setText("");
        }
        if (mat == 0) {
            timer.start();
        }
    }//GEN-LAST:event_herramientasActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

        Inicio tra = new Inicio();
        tra.show();
        this.dispose();

    }//GEN-LAST:event_formWindowClosed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        DecimalFormat formatter3 = new DecimalFormat("0.00");

        if (herramientas.getSelectedItem().toString().equalsIgnoreCase("ALUMA MILL WIDIA")) {

            if ((Double.parseDouble(chipload.getText()) <= 0.0025 && Double.parseDouble(sfm.getText()) <= 2000)) {
                calculorpm();
                calcularwocdoc();
            } else {
                JOptionPane.showMessageDialog(null, "UN PARAMETRO EXEDE EL MAXIMO PERMITIDO..");
            }

        } else if (herramientas.getSelectedItem().toString().equalsIgnoreCase("ALUMA MILL FULLERTON")) {

            if (Double.parseDouble(chipload.getText()) <= 0.0030 && Integer.parseInt(sfm.getText()) <= 2000) {
                calculorpm();
                calcularwocdoc();
            } else {
                JOptionPane.showMessageDialog(null, "UN PARAMETRO EXEDE EL MAXIMO PERMITIDO..");
            }

        } else if (herramientas.getSelectedItem().toString().equalsIgnoreCase("CARBIDE TICN")&& material.getSelectedItem().toString().equalsIgnoreCase("ALUMINIO")) {

            if (Double.parseDouble(chipload.getText()) <= 0.004 && Integer.parseInt(sfm.getText()) <= 2000) { //CHIP LOAD
                calculorpm();
                calcularwocdoc();
            } else {
                JOptionPane.showMessageDialog(null, "UN PARAMETRO EXEDE EL MAXIMO PERMITIDO..");
            }

        } else if (herramientas.getSelectedItem().toString().equalsIgnoreCase("CARBIDE SIN RECUBRIMIENTO")&& material.getSelectedItem().toString().equalsIgnoreCase("ALUMINIO")) {

            if (Double.parseDouble(chipload.getText()) <= 0.0025 && Integer.parseInt(sfm.getText()) <= 2000) {
                calculorpm();
                calcularwocdoc();
            } else {
                JOptionPane.showMessageDialog(null, "UN PARAMETRO EXEDE EL MAXIMO PERMITIDO..");
            }

        } 
            else if (herramientas.getSelectedItem().toString().equalsIgnoreCase("CARBIDE TICN") && material.getSelectedItem().toString().equalsIgnoreCase("ACERO")) {

            if (Double.parseDouble(chipload.getText()) <= 0.004 && Integer.parseInt(sfm.getText()) <= 500) { //CHIP LOAD
                calculorpm();
                calcularwocdoc();
            } else {
                JOptionPane.showMessageDialog(null, "UN PARAMETRO EXEDE EL MAXIMO PERMITIDO..");
            }

        } else if (herramientas.getSelectedItem().toString().equalsIgnoreCase("CARBIDE SIN RECUBRIMIENTO")&& material.getSelectedItem().toString().equalsIgnoreCase("ACERO")) {

            if (Double.parseDouble(chipload.getText()) <= 0.0025 && Integer.parseInt(sfm.getText()) <= 500) {
                calculorpm();
                calcularwocdoc();
            } else {
                JOptionPane.showMessageDialog(null, "UN PARAMETRO EXEDE EL MAXIMO PERMITIDO..");
            }
            
            
            
        } else if (herramientas.getSelectedItem().toString().equalsIgnoreCase("WIDIA TIALN")) {

            if (Double.parseDouble(chipload.getText()) <= 0.0017 && Integer.parseInt(sfm.getText()) <= 250) {
                calculorpm();
                calcularwocdoc();
            } else {
                JOptionPane.showMessageDialog(null, "UN PARAMETRO EXEDE EL MAXIMO PERMITIDO..");
            }

        } else if (herramientas.getSelectedItem().toString().equalsIgnoreCase("X50-70")) {

            if (Double.parseDouble(chipload.getText()) <= 0.0008 && Integer.parseInt(sfm.getText()) <= 200) {
                calculorpm();
                calcularwocdoc();
            } else {
                JOptionPane.showMessageDialog(null, "UN PARAMETRO EXEDE EL MAXIMO PERMITIDO..");
            }

        } else if (herramientas.getSelectedItem().toString().equalsIgnoreCase("SANDVIK 2P050-0635")) {

            if (Double.parseDouble(chipload.getText()) <= 0.0015 && Integer.parseInt(sfm.getText()) <= 2000) {
                calculorpm();
                calcularwocdoc();
            } else {
                JOptionPane.showMessageDialog(null, "UN PARAMETRO EXEDE EL MAXIMO PERMITIDO..");
            }

        } else if (herramientas.getSelectedItem().toString().equalsIgnoreCase("EXO PRO 26800316")) {

            if (Double.parseDouble(chipload.getText()) <= 0.003 && Integer.parseInt(sfm.getText()) <= 2000) {
                calculorpm();
                calcularwocdoc();
            } else {
                JOptionPane.showMessageDialog(null, "UN PARAMETRO EXEDE EL MAXIMO PERMITIDO..");
            }

        } else if (herramientas.getSelectedItem().toString().equalsIgnoreCase("EXO PRO 26500316")) {

            if (Double.parseDouble(chipload.getText()) <= 0.0018 && Integer.parseInt(sfm.getText()) <= 2000) {
                calculorpm();
                calcularwocdoc();
            } else {
                JOptionPane.showMessageDialog(null, "UN PARAMETRO EXEDE EL MAXIMO PERMITIDO..");
            }

        } else if (herramientas.getSelectedItem().toString().equalsIgnoreCase("ROUNTOOL D2")) {

            if (Double.parseDouble(chipload.getText()) <= 0.003 && Integer.parseInt(sfm.getText()) <= 2000) {
                calculorpm();
                calcularwocdoc();
            } else {
                JOptionPane.showMessageDialog(null, "UN PARAMETRO EXEDE EL MAXIMO PERMITIDO..");
            }

        } else if (herramientas.getSelectedItem().toString().equalsIgnoreCase("BURR SIN RECUBRIMIENTO")) {

            if (Double.parseDouble(chipload.getText()) <= 0.016 && Integer.parseInt(sfm.getText()) <= 2000) {
                calculorpm();
                calcularwocdoc();
            } else {
                JOptionPane.showMessageDialog(null, "UN PARAMETRO EXEDE EL MAXIMO PERMITIDO..");
            }

        } else if (herramientas.getSelectedItem().toString().equalsIgnoreCase("BURR D1")) {

            if (Double.parseDouble(chipload.getText()) <= 0.0020 && Integer.parseInt(sfm.getText()) <= 2000) {
                calculorpm();
                calcularwocdoc();
            } else {
                JOptionPane.showMessageDialog(null, "UN PARAMETRO EXEDE EL MAXIMO PERMITIDO..");
            }

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void materialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialActionPerformed

        if (mat == 0) {
            timer.start();
        }
        /* System.out.println("materererer"+mat);
        if (mat == 1) {
            if (slotting.isSelected() || profiling.isSelected() || contouring.isSelected()) {
                llenardatos();
               
            } else {
                JOptionPane.showMessageDialog(null, "SELECCIONE UNA OPCION DE MAQUINADO");
                diametro.removeAllItems();
                avance.setText("");
                sfm.removeAllItems();
                chipload.removeAllItems();
                rpm.setText("");
            }
            
        }*/
    }//GEN-LAST:event_materialActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        limpiar();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void maquinadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maquinadoActionPerformed

        if (mat == 0) {
            timer.start();
            /*if(maquinado.getSelectedItem().toString().equalsIgnoreCase("SLOTTING / RANURADO"))
        {
        diametro.setEditable(false);
        sfm.setEditable(false);
        chipload.setEditable(false);
        }
        else if(maquinado.getSelectedItem().toString().equalsIgnoreCase("PROFILING / CONTOUR"))
        {
        diametro.setEditable(true);
        sfm.setEditable(true);
        chipload.setEditable(true);
        } 
        else if(maquinado.getSelectedItem().toString().equalsIgnoreCase("CONTOURING / BALL"))
        {
        diametro.setEditable(true);
        sfm.setEditable(true);
        chipload.setEditable(true);*/
        }

        /*
        
           
         */

    }//GEN-LAST:event_maquinadoActionPerformed

    private void diametroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diametroActionPerformed

        if (mat == 0) {
            validar();
        }
    }//GEN-LAST:event_diametroActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       try {
            File path = new File("src/IMG/MILLIN.pdf");
            Desktop.getDesktop().open(path);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
  
         Conversiones tra = new Conversiones();
        tra.show();
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Fresas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fresas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fresas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fresas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fresas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField avance;
    private javax.swing.JTextField chipload;
    private javax.swing.JComboBox<String> diametro;
    private javax.swing.JTextField doc;
    private javax.swing.JTextField filos;
    private javax.swing.JComboBox<String> herramientas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JComboBox<String> maquinado;
    private javax.swing.JComboBox<String> material;
    private javax.swing.JTextField rpm;
    private javax.swing.JTextField sfm;
    private javax.swing.JTextField woc;
    // End of variables declaration//GEN-END:variables
}
