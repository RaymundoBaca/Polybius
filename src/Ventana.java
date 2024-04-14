//Librerías utilizadas:

import java.awt.Image;
import java.awt.Toolkit;

/*
Hecho por: José Raymundo Baca Hernández
Algoritmos y Sistemas de Cifrado - Criptografía
Instituto Tecnológico de Chihuahua ll
 */
public class Ventana extends javax.swing.JFrame {

    public Ventana() {
        initComponents();
        setLocationRelativeTo(null); // Centrar el JFrame en la pantalla
        setTitle("Método Polibios"); //Declaramos título
        setIconImage(getIconImage()); //Pone el icono personalizado
    }

    @Override
    public Image getIconImage() {
        //Cambia el icono del JFrame
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Logo/Polibios.jpg"));
        return retValue;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();

        jLabel2.setText("jLabel2");

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 153));
        jLabel1.setText("Polibios");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 34));

        jLabel3.setForeground(new java.awt.Color(204, 204, 255));
        jLabel3.setText("Texto plano");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel4.setForeground(new java.awt.Color(204, 204, 255));
        jLabel4.setText("Texto cifrado");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, -1, -1));

        jTextArea2.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea2.setColumns(20);
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, -1, -1));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 51));
        jButton1.setText("Cifrar");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 150, 30));

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setForeground(new java.awt.Color(255, 153, 0));
        jButton2.setText("Limpiar");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 160, 30));

        jButton3.setBackground(new java.awt.Color(51, 51, 51));
        jButton3.setForeground(new java.awt.Color(51, 204, 0));
        jButton3.setText("Descifrar");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 160, 30));

        jTextArea1.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 240, -1));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTextArea2.setText(""); // Borra el contenido de jTextArea2
        // Obtendremos el texto de jTextArea1 y lo convertimos a minúsculas
        String cad = jTextArea1.getText().toLowerCase();
        // Convierte la cadena en un arreglo de caracteres
        char[] arreCar = cad.toCharArray();
        // Declaración e inicialización de las variables car y pos
        char[] car = new char[26]; // Arreglo para las letras del alfabeto
        int[] pos = new int[26];  // Arreglo para las posiciones de las letras
        // Ciclo for con la inicialización de car con letras del alfabeto y pos con posiciones
        for (int i = 0; i < 26; i++) {
            car[i] = (char) (i + 97); // Inicializa car con letras minúsculas 'a' a 'z'
            pos[i] = i; // Inicializa pos con posiciones de '0' a '25'
        }
        // Desordenar el arreglo car haciendo shuffle
        car = shuffle(car);
        // Cifrar el texto
        String resultado = ""; // Inicializa la cadena de resultado
        for (int i = 0; i < arreCar.length; i++) {
            char c = arreCar[i]; // Obtén el carácter en la posición actual
            for (int l = 0; l < car.length; l++) {
                if (c == car[l]) {
                    resultado += (int) (pos[l] / 5) + "" + (pos[l] % 5);
                }
            }
        }
        // Establece el resultado en jTextArea2
        jTextArea2.setText(resultado);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTextArea1.setText(""); // Borra el contenido de jTextArea1
        jTextArea2.setText(""); // Borra el contenido de jTextArea2
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jTextArea1.setText(""); // Borra el contenido de jTextArea1
        // Obtén el texto cifrado de jTextArea2
        String resultado = jTextArea2.getText();
        // Declaración e inicialización de las variables car y pos
        char[] car = new char[26]; // Arreglo para las letras del alfabeto
        int[] pos = new int[26];  // Arreglo para las posiciones de las letras
        // Ciclo for con la inicialización de car con letras del alfabeto y pos con posiciones
        for (int i = 0; i < 26; i++) {
            car[i] = (char) (i + 97); // Inicializa car con letras minúsculas 'a' a 'z'
            pos[i] = i; // Inicializa pos con posiciones de '0' a '25'
        }
        // Desordenar el arreglo car haciendo shuffle
        car = shuffle(car);
        // Ahora desciframos el texto con string
        String textoDescifrado = ""; // Inicializa la cadena de texto descifrado
        for (int i = 0; i < resultado.length(); i += 2) {
            // Obtén dos dígitos de posición como caracteres
            char p1 = resultado.charAt(i);
            char p2 = resultado.charAt(i + 1);
            // Calcula la posición en el arreglo pos
            int posicion = (p1 - '0') * 5 + (p2 - '0');
            // Encuentra el carácter correspondiente en el arreglo car
            char c = ' '; // Espacio en blanco por defecto
            for (int j = 0; j < car.length; j++) {
                //Comprueba si la posición calculada
                if (posicion == pos[j]) {
                    //Asigna la letra correspondiente al arreglo
                    c = car[j];
                    break;
                }
            }
            // Agregaremos el carácter descifrado al texto descifrado
            textoDescifrado += c;
        }
        // Establece el texto descifrado en jTextArea1
        jTextArea1.setText(textoDescifrado);
    }//GEN-LAST:event_jButton3ActionPerformed

    //Método modificado de clase porque el de la clase me daba problemas
    public char[] shuffle(char[] letra) {
        // Creamos un nuevo arreglo para almacenar las letras desordenadas
        char[] shuffle = new char[26];
        // Iteramos a través del arreglo original de letras
        for (int i = 0; i < letra.length; i++) {
            // Calculamos la nueva posición desordenada de la letra utilizando una regla fija
            // que consiste en sumar 13 a la posición actual y tomar el resultado módulo 26
            int newPosition = (i + 13) % 26;
            // Asignamos la letra en la posición actual del arreglo original
            // a la posición calculada en el nuevo arreglo desordenado
            shuffle[newPosition] = letra[i];
        }
        // Devolvemos el nuevo arreglo con las letras desordenadas
        return shuffle;
    }

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
            java.util.logging.Logger.getLogger(Ventana.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
