
import com.formdev.flatlaf.intellijthemes.FlatArcOrangeIJTheme;
import java.awt.Color;
import java.awt.Image;
import java.net.*;
import javax.swing.ImageIcon;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;
import java.util.Scanner;
import javax.swing.BorderFactory;



public class PrincipalPoke extends javax.swing.JFrame {
private int currentPokemonIndex; // el indice inicial NO TOCAR

    public PrincipalPoke() throws MalformedURLException {
        initComponents();
        FlatArcOrangeIJTheme.setup();
        ApiConnector apiConnector = new ApiConnector();
        String pokemonData = apiConnector.getPokemonData(150);
        showPokemonInfo(1);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
        
    }
    
    public Color getColorForType(String type) {
    switch (type.toLowerCase()) {
        case "fire":
            return Color.ORANGE; 
        case "water":
            return Color.CYAN; 
        case "grass":
            return Color.GREEN.darker().darker(); 
        case "normal":
            return new Color(160, 160, 160); 
        case "flying":
            return new Color(135, 206, 235); 
        case "fighting":
            return new Color(205, 92, 92); 
        case "poison" :
            return new Color(138, 43, 226); 
        case "electric":
            return Color.YELLOW.darker().darker(); 
        case "ground":
            return new Color(139, 69, 19); 
        case "rock":
            return new Color(169, 169, 169); 
        case "psychic":
            return new Color(186, 85, 211); 
        case "ice":
            return new Color(135, 206, 250); 
        case "bug":
            return new Color(154, 205, 50); 
        case "ghost":
            return new Color(128, 0, 128); 
        case "steel":
            return new Color(192, 192, 192); 
        case "dragon":
            return new Color(70, 130, 180); 
        case "dark":
            return new Color(47, 79, 79); 
        case "fairy":
            return new Color(255, 182, 193); 
        default:
            return Color.BLACK; // Por defeecto
    }
}

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        typeLabel = new javax.swing.JLabel();
        btBack = new javax.swing.JButton();
        btNext = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        imgLabel = new javax.swing.JLabel();
        jPanelLateralder = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nameLabel.setBackground(new java.awt.Color(0, 0, 0));
        nameLabel.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(0, 0, 0));
        nameLabel.setText("jLabel3");

        typeLabel.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        typeLabel.setText("jLabel3");

        btBack.setText("back");
        btBack.setPreferredSize(new java.awt.Dimension(56, 32));
        btBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBackActionPerformed(evt);
            }
        });

        btNext.setText("Next");
        btNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNextActionPerformed(evt);
            }
        });

        jPanel5.setLayout(new javax.swing.BoxLayout(jPanel5, javax.swing.BoxLayout.LINE_AXIS));

        imgLabel.setText("jLabel3");
        jPanel5.add(imgLabel);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(309, 309, 309)
                .addComponent(nameLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(typeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(btBack, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btNext, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(132, 132, 132))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(nameLabel)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(typeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btBack, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btNext, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        jPanelLateralder.setBackground(new java.awt.Color(255, 165, 0));
        jPanelLateralder.setForeground(new java.awt.Color(255, 165, 0));

        javax.swing.GroupLayout jPanelLateralderLayout = new javax.swing.GroupLayout(jPanelLateralder);
        jPanelLateralder.setLayout(jPanelLateralderLayout);
        jPanelLateralderLayout.setHorizontalGroup(
            jPanelLateralderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );
        jPanelLateralderLayout.setVerticalGroup(
            jPanelLateralderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(128, 128, 128));

        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Pokepedia first gen!");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pokeball 32.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel1)
                .addGap(157, 157, 157)
                .addComponent(jLabel2)
                .addContainerGap(249, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(128, 128, 128));

        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelLateralder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelLateralder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackActionPerformed
        try {
        if (currentPokemonIndex > 1) {
            showPokemonInfo(currentPokemonIndex - 1);
            btBack.setEnabled(true);
        } else {
            btBack.setEnabled(false);
        }
    } catch (MalformedURLException e){
        e.printStackTrace();
    }
    }//GEN-LAST:event_btBackActionPerformed

    private void btNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNextActionPerformed

        try {
            if(currentPokemonIndex < 151){
            showPokemonInfo(currentPokemonIndex + 1);
            btBack.setEnabled(true);}
            else{
            btNext.setEnabled(false);
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btNextActionPerformed
    private void showPokemonInfo(int index) throws MalformedURLException {
    ApiConnector apiConnector = new ApiConnector();

    // Obtener info del Pokemon
    String name = apiConnector.getPokemonName(index);
        List<String> types = apiConnector.getPokemonTypes(index);  
        
        currentPokemonIndex = index;
        nameLabel.setText("Name: " + name);

//    String type = apiConnector.getPokemonType(index);
    if (types.size() == 1) {
        String type = types.get(0);
        typeLabel.setText("Type: " + types.get(0));
        typeLabel.setForeground(getColorForType(type));    
        
    } else if (types.size() == 2) {
    String type1 = types.get(0);
    String type2 = types.get(1);
    typeLabel.setText("Types: " + type1 + ", " + type2);

    
    Color color1 = getColorForType(type1);
    Color color2 = getColorForType(type2);

    // Mezcla xdd
    int red = (color1.getRed() + color2.getRed()) / 2;
    int green = (color1.getGreen() + color2.getGreen()) / 2;
    int blue = (color1.getBlue() + color2.getBlue()) / 2;

    // y lo que salga aqui
    typeLabel.setForeground(new Color(red, green, blue));
    
    }
    String imageUrl = apiConnector.getPokemonImage(index);

    // Cargar la imagen de la manera original el tamaño es predeterminado
//    try {
//        ImageIcon icon = new ImageIcon(new URL(imageUrl));
//        Image scaledImage = icon.getImage();
//        ImageIcon scaledIcon = new ImageIcon(scaledImage);
//        imgLabel.setIcon(scaledIcon);
//    } catch (MalformedURLException e) {
//        e.printStackTrace();
//    }
try {
    ImageIcon icon = new ImageIcon(new URL(imageUrl));
    Image image = icon.getImage();

    // Escalando la imagen a un tamaño que se quiera (x2 predeterminado) 
    int newWidth = image.getWidth(null) * 2; 
    int newHeight = image.getHeight(null) * 2; 
    Image scaledImage = image.getScaledInstance(newWidth, newHeight, Image.SCALE_DEFAULT);

    ImageIcon scaledIcon = new ImageIcon(scaledImage);
    imgLabel.setIcon(scaledIcon);
} catch (MalformedURLException e) {
    e.printStackTrace();
}

}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBack;
    private javax.swing.JButton btNext;
    private javax.swing.JLabel imgLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelLateralder;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel typeLabel;
    // End of variables declaration//GEN-END:variables
}
