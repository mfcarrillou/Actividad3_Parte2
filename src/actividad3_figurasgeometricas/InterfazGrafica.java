package actividad3_figurasgeometricas;

public class InterfazGrafica extends javax.swing.JFrame {

    public InterfazGrafica() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Circulo = new javax.swing.JPanel();
        simboloCi = new javax.swing.JLabel();
        circuloL = new javax.swing.JLabel();
        datosCi = new javax.swing.JLabel();
        radio = new javax.swing.JTextField();
        borrarCi = new javax.swing.JButton();
        pAreaCi = new javax.swing.JPanel();
        calcularACi = new javax.swing.JButton();
        areaCiL = new javax.swing.JLabel();
        areaCi = new javax.swing.JTextArea();
        pPerimetroCi = new javax.swing.JPanel();
        calcularPCi = new javax.swing.JButton();
        perimetroCiL = new javax.swing.JLabel();
        perimetroCi = new javax.swing.JTextArea();
        Rectangulo = new javax.swing.JPanel();
        simboloR = new javax.swing.JLabel();
        rectanguloL = new javax.swing.JLabel();
        datosR = new javax.swing.JLabel();
        borrarR = new javax.swing.JButton();
        pBaseR = new javax.swing.JPanel();
        baseRL = new javax.swing.JLabel();
        baseR = new javax.swing.JTextField();
        pAreaR = new javax.swing.JPanel();
        calcularAR = new javax.swing.JButton();
        areaRL = new javax.swing.JLabel();
        areaR = new javax.swing.JTextArea();
        pPerimetroR = new javax.swing.JPanel();
        calcularPR = new javax.swing.JButton();
        perimetroRL = new javax.swing.JLabel();
        perimetroR = new javax.swing.JTextArea();
        pAlturaR = new javax.swing.JPanel();
        alturaRL = new javax.swing.JLabel();
        alturaR = new javax.swing.JTextField();
        Triangulo = new javax.swing.JPanel();
        simboloT = new javax.swing.JLabel();
        trianguloL = new javax.swing.JLabel();
        datosT = new javax.swing.JLabel();
        pBaseT = new javax.swing.JPanel();
        baseTL = new javax.swing.JLabel();
        baseT = new javax.swing.JTextField();
        pAlturaT = new javax.swing.JPanel();
        alturaTL = new javax.swing.JLabel();
        alturaT = new javax.swing.JTextField();
        pAPTT = new javax.swing.JPanel();
        perimetroTL = new javax.swing.JLabel();
        calcularPT = new javax.swing.JButton();
        areaTL = new javax.swing.JLabel();
        calcularAT = new javax.swing.JButton();
        tipoTL = new javax.swing.JLabel();
        mostrarTT = new javax.swing.JButton();
        areaT = new javax.swing.JTextArea();
        perimetroT = new javax.swing.JTextArea();
        tipoT = new javax.swing.JTextArea();
        borrarT = new javax.swing.JButton();
        FigurasGeo = new javax.swing.JPanel();
        figGeoL = new javax.swing.JLabel();
        Cuadrado = new javax.swing.JPanel();
        simboloC = new javax.swing.JLabel();
        cuadradoL = new javax.swing.JLabel();
        datosC = new javax.swing.JLabel();
        lado = new javax.swing.JTextField();
        borrarC = new javax.swing.JButton();
        pAreaC = new javax.swing.JPanel();
        calcularAC = new javax.swing.JButton();
        areaCL = new javax.swing.JLabel();
        areaC = new javax.swing.JTextArea();
        pPerimetroC = new javax.swing.JPanel();
        calcularPC = new javax.swing.JButton();
        perimetroCL = new javax.swing.JLabel();
        perimetroC = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));

        Circulo.setBackground(new java.awt.Color(255, 255, 204));
        Circulo.setPreferredSize(new java.awt.Dimension(400, 300));

        simboloCi.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        simboloCi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        simboloCi.setText("●");

        circuloL.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        circuloL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        circuloL.setText("Círculo");

        datosCi.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        datosCi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        datosCi.setText("Ingrese el valor del radio, en centímetros");

        radio.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        radio.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        borrarCi.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        borrarCi.setForeground(new java.awt.Color(153, 0, 0));
        borrarCi.setText("Borrar");
        borrarCi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        borrarCi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarCiActionPerformed(evt);
            }
        });

        pAreaCi.setBackground(new java.awt.Color(255, 255, 204));

        calcularACi.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        calcularACi.setForeground(new java.awt.Color(218, 165, 32));
        calcularACi.setText("Calcular");
        calcularACi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularACiActionPerformed(evt);
            }
        });

        areaCiL.setBackground(new java.awt.Color(0, 0, 0));
        areaCiL.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        areaCiL.setForeground(new java.awt.Color(218, 165, 32));
        areaCiL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        areaCiL.setText("Área (cm²)");

        areaCi.setColumns(24);
        areaCi.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        areaCi.setLineWrap(true);
        areaCi.setRows(1);

        javax.swing.GroupLayout pAreaCiLayout = new javax.swing.GroupLayout(pAreaCi);
        pAreaCi.setLayout(pAreaCiLayout);
        pAreaCiLayout.setHorizontalGroup(
            pAreaCiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAreaCiLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pAreaCiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(areaCiL, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calcularACi, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(areaCi, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        pAreaCiLayout.setVerticalGroup(
            pAreaCiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAreaCiLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(areaCiL)
                .addGap(4, 4, 4)
                .addComponent(areaCi, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(calcularACi)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pPerimetroCi.setBackground(new java.awt.Color(255, 255, 204));

        calcularPCi.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        calcularPCi.setForeground(new java.awt.Color(190, 183, 45));
        calcularPCi.setText("Calcular");
        calcularPCi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularPCiActionPerformed(evt);
            }
        });

        perimetroCiL.setBackground(new java.awt.Color(0, 0, 0));
        perimetroCiL.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        perimetroCiL.setForeground(new java.awt.Color(190, 183, 45));
        perimetroCiL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        perimetroCiL.setText("Perimetro (cm²)");

        perimetroCi.setColumns(24);
        perimetroCi.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        perimetroCi.setLineWrap(true);
        perimetroCi.setRows(1);

        javax.swing.GroupLayout pPerimetroCiLayout = new javax.swing.GroupLayout(pPerimetroCi);
        pPerimetroCi.setLayout(pPerimetroCiLayout);
        pPerimetroCiLayout.setHorizontalGroup(
            pPerimetroCiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPerimetroCiLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pPerimetroCiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(perimetroCiL, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calcularPCi, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(perimetroCi, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        pPerimetroCiLayout.setVerticalGroup(
            pPerimetroCiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPerimetroCiLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(perimetroCiL)
                .addGap(4, 4, 4)
                .addComponent(perimetroCi, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(calcularPCi)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout CirculoLayout = new javax.swing.GroupLayout(Circulo);
        Circulo.setLayout(CirculoLayout);
        CirculoLayout.setHorizontalGroup(
            CirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CirculoLayout.createSequentialGroup()
                .addComponent(simboloCi, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(CirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(circuloL, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                    .addComponent(datosCi, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radio, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(CirculoLayout.createSequentialGroup()
                        .addComponent(pAreaCi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(pPerimetroCi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(borrarCi))
                .addGap(35, 35, 35))
        );
        CirculoLayout.setVerticalGroup(
            CirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CirculoLayout.createSequentialGroup()
                .addGroup(CirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CirculoLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(circuloL))
                    .addComponent(simboloCi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(datosCi)
                .addGap(5, 5, 5)
                .addComponent(radio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(CirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pAreaCi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pPerimetroCi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(borrarCi)
                .addGap(40, 40, 40))
        );

        Rectangulo.setBackground(new java.awt.Color(201, 234, 249));
        Rectangulo.setPreferredSize(new java.awt.Dimension(400, 300));

        simboloR.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        simboloR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        simboloR.setText("▮");

        rectanguloL.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        rectanguloL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rectanguloL.setText("Rectángulo");

        datosR.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        datosR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        datosR.setText("Ingrese el valor de la base y altura, en centímetros");

        borrarR.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        borrarR.setForeground(new java.awt.Color(153, 0, 0));
        borrarR.setText("Borrar");
        borrarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarRActionPerformed(evt);
            }
        });

        pBaseR.setBackground(new java.awt.Color(201, 234, 249));

        baseRL.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        baseRL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        baseRL.setText("Base");

        baseR.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        baseR.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        javax.swing.GroupLayout pBaseRLayout = new javax.swing.GroupLayout(pBaseR);
        pBaseR.setLayout(pBaseRLayout);
        pBaseRLayout.setHorizontalGroup(
            pBaseRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBaseRLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pBaseRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(baseRL, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(baseR, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        pBaseRLayout.setVerticalGroup(
            pBaseRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBaseRLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(baseRL)
                .addGap(5, 5, 5)
                .addComponent(baseR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        pAreaR.setBackground(new java.awt.Color(201, 234, 249));

        calcularAR.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        calcularAR.setForeground(new java.awt.Color(0, 72, 186));
        calcularAR.setText("Calcular");
        calcularAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularARActionPerformed(evt);
            }
        });

        areaRL.setBackground(new java.awt.Color(0, 0, 0));
        areaRL.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        areaRL.setForeground(new java.awt.Color(0, 72, 186));
        areaRL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        areaRL.setText("Área (cm²)");

        areaR.setColumns(24);
        areaR.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        areaR.setLineWrap(true);
        areaR.setRows(1);

        javax.swing.GroupLayout pAreaRLayout = new javax.swing.GroupLayout(pAreaR);
        pAreaR.setLayout(pAreaRLayout);
        pAreaRLayout.setHorizontalGroup(
            pAreaRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAreaRLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pAreaRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(areaRL, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calcularAR, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(areaR, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        pAreaRLayout.setVerticalGroup(
            pAreaRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAreaRLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(areaRL)
                .addGap(4, 4, 4)
                .addComponent(areaR, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(calcularAR)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pPerimetroR.setBackground(new java.awt.Color(201, 234, 249));

        calcularPR.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        calcularPR.setForeground(new java.awt.Color(0, 24, 168));
        calcularPR.setText("Calcular");
        calcularPR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularPRActionPerformed(evt);
            }
        });

        perimetroRL.setBackground(new java.awt.Color(0, 0, 0));
        perimetroRL.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        perimetroRL.setForeground(new java.awt.Color(0, 24, 168));
        perimetroRL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        perimetroRL.setText("Perimetro (cm²)");

        perimetroR.setColumns(24);
        perimetroR.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        perimetroR.setLineWrap(true);
        perimetroR.setRows(1);

        javax.swing.GroupLayout pPerimetroRLayout = new javax.swing.GroupLayout(pPerimetroR);
        pPerimetroR.setLayout(pPerimetroRLayout);
        pPerimetroRLayout.setHorizontalGroup(
            pPerimetroRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPerimetroRLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pPerimetroRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(perimetroRL, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calcularPR, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(perimetroR, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        pPerimetroRLayout.setVerticalGroup(
            pPerimetroRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPerimetroRLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(perimetroRL)
                .addGap(4, 4, 4)
                .addComponent(perimetroR, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(calcularPR)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pAlturaR.setBackground(new java.awt.Color(201, 234, 249));

        alturaRL.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        alturaRL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        alturaRL.setText("Altura");

        alturaR.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        alturaR.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        javax.swing.GroupLayout pAlturaRLayout = new javax.swing.GroupLayout(pAlturaR);
        pAlturaR.setLayout(pAlturaRLayout);
        pAlturaRLayout.setHorizontalGroup(
            pAlturaRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAlturaRLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pAlturaRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(alturaRL, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alturaR, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );
        pAlturaRLayout.setVerticalGroup(
            pAlturaRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAlturaRLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(alturaRL)
                .addGap(5, 5, 5)
                .addComponent(alturaR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout RectanguloLayout = new javax.swing.GroupLayout(Rectangulo);
        Rectangulo.setLayout(RectanguloLayout);
        RectanguloLayout.setHorizontalGroup(
            RectanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RectanguloLayout.createSequentialGroup()
                .addComponent(simboloR, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(RectanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(rectanguloL, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(datosR, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(RectanguloLayout.createSequentialGroup()
                        .addComponent(pBaseR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(pAlturaR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(RectanguloLayout.createSequentialGroup()
                        .addComponent(pAreaR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(pPerimetroR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(borrarR))
                .addGap(35, 35, 35))
        );
        RectanguloLayout.setVerticalGroup(
            RectanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RectanguloLayout.createSequentialGroup()
                .addGroup(RectanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RectanguloLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(rectanguloL))
                    .addComponent(simboloR, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(datosR)
                .addGroup(RectanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pAlturaR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pBaseR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(RectanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pAreaR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pPerimetroR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(borrarR)
                .addGap(30, 30, 30))
        );

        Triangulo.setBackground(new java.awt.Color(207, 253, 175));
        Triangulo.setPreferredSize(new java.awt.Dimension(400, 300));

        simboloT.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        simboloT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        simboloT.setText("▲");

        trianguloL.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        trianguloL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        trianguloL.setText("Triángulo Rectángulo");

        datosT.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        datosT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        datosT.setText("Ingrese el valor de la base y altura, en centímetros");

        pBaseT.setBackground(new java.awt.Color(207, 253, 175));

        baseTL.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        baseTL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        baseTL.setText("Base");

        baseT.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        baseT.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        javax.swing.GroupLayout pBaseTLayout = new javax.swing.GroupLayout(pBaseT);
        pBaseT.setLayout(pBaseTLayout);
        pBaseTLayout.setHorizontalGroup(
            pBaseTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBaseTLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pBaseTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(baseTL, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(baseT, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        pBaseTLayout.setVerticalGroup(
            pBaseTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBaseTLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(baseTL)
                .addGap(5, 5, 5)
                .addComponent(baseT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        pAlturaT.setBackground(new java.awt.Color(207, 253, 175));

        alturaTL.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        alturaTL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        alturaTL.setText("Altura");

        alturaT.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        alturaT.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        javax.swing.GroupLayout pAlturaTLayout = new javax.swing.GroupLayout(pAlturaT);
        pAlturaT.setLayout(pAlturaTLayout);
        pAlturaTLayout.setHorizontalGroup(
            pAlturaTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAlturaTLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pAlturaTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(alturaTL, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alturaT, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        pAlturaTLayout.setVerticalGroup(
            pAlturaTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAlturaTLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(alturaTL)
                .addGap(5, 5, 5)
                .addComponent(alturaT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        pAPTT.setBackground(new java.awt.Color(207, 253, 175));

        perimetroTL.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        perimetroTL.setForeground(new java.awt.Color(53, 104, 45));
        perimetroTL.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        perimetroTL.setText("Perímetro (cm)");

        calcularPT.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        calcularPT.setForeground(new java.awt.Color(53, 104, 45));
        calcularPT.setText("Calcular");
        calcularPT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularPTActionPerformed(evt);
            }
        });

        areaTL.setBackground(new java.awt.Color(0, 0, 0));
        areaTL.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        areaTL.setForeground(new java.awt.Color(86, 130, 3));
        areaTL.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        areaTL.setText("Área (cm²)");

        calcularAT.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        calcularAT.setForeground(new java.awt.Color(86, 130, 3));
        calcularAT.setText("Calcular");
        calcularAT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularATActionPerformed(evt);
            }
        });

        tipoTL.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tipoTL.setForeground(new java.awt.Color(0, 100, 0));
        tipoTL.setText("Tipo");

        mostrarTT.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        mostrarTT.setForeground(new java.awt.Color(0, 100, 0));
        mostrarTT.setText("Mostrar");
        mostrarTT.setPreferredSize(new java.awt.Dimension(82, 23));
        mostrarTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarTTActionPerformed(evt);
            }
        });

        areaT.setColumns(24);
        areaT.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        areaT.setLineWrap(true);
        areaT.setRows(1);

        perimetroT.setColumns(24);
        perimetroT.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        perimetroT.setLineWrap(true);
        perimetroT.setRows(1);

        tipoT.setColumns(24);
        tipoT.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tipoT.setLineWrap(true);
        tipoT.setRows(1);

        javax.swing.GroupLayout pAPTTLayout = new javax.swing.GroupLayout(pAPTT);
        pAPTT.setLayout(pAPTTLayout);
        pAPTTLayout.setHorizontalGroup(
            pAPTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAPTTLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pAPTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pAPTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(perimetroTL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(areaTL, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tipoTL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pAPTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(areaT, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(perimetroT, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipoT, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(pAPTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(calcularPT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(calcularAT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mostrarTT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        pAPTTLayout.setVerticalGroup(
            pAPTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAPTTLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pAPTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(areaTL)
                    .addComponent(calcularAT)
                    .addComponent(areaT, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(pAPTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(perimetroTL)
                    .addComponent(calcularPT)
                    .addComponent(perimetroT, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(pAPTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipoTL)
                    .addComponent(mostrarTT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipoT, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        borrarT.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        borrarT.setForeground(new java.awt.Color(153, 0, 0));
        borrarT.setText("Borrar");
        borrarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TrianguloLayout = new javax.swing.GroupLayout(Triangulo);
        Triangulo.setLayout(TrianguloLayout);
        TrianguloLayout.setHorizontalGroup(
            TrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TrianguloLayout.createSequentialGroup()
                .addGroup(TrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(TrianguloLayout.createSequentialGroup()
                        .addComponent(simboloT, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addGroup(TrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(datosT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(trianguloL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                            .addGroup(TrianguloLayout.createSequentialGroup()
                                .addComponent(pBaseT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pAlturaT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(pAPTT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TrianguloLayout.createSequentialGroup()
                .addComponent(borrarT)
                .addGap(161, 161, 161))
        );
        TrianguloLayout.setVerticalGroup(
            TrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TrianguloLayout.createSequentialGroup()
                .addGroup(TrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TrianguloLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(trianguloL))
                    .addComponent(simboloT, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(datosT)
                .addGap(0, 0, 0)
                .addGroup(TrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pAlturaT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pBaseT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(pAPTT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(borrarT)
                .addGap(30, 30, 30))
        );

        FigurasGeo.setBackground(new java.awt.Color(0, 0, 0));

        figGeoL.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        figGeoL.setForeground(new java.awt.Color(255, 255, 255));
        figGeoL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        figGeoL.setText("Figuras Geométricas");
        figGeoL.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout FigurasGeoLayout = new javax.swing.GroupLayout(FigurasGeo);
        FigurasGeo.setLayout(FigurasGeoLayout);
        FigurasGeoLayout.setHorizontalGroup(
            FigurasGeoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(figGeoL, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        FigurasGeoLayout.setVerticalGroup(
            FigurasGeoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FigurasGeoLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(figGeoL)
                .addContainerGap())
        );

        Cuadrado.setBackground(new java.awt.Color(247, 189, 189));
        Cuadrado.setPreferredSize(new java.awt.Dimension(400, 300));

        simboloC.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        simboloC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        simboloC.setText("◾");

        cuadradoL.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        cuadradoL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cuadradoL.setText("Cuadrado");

        datosC.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        datosC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        datosC.setText("Ingrese el valor de un lado, en centímetros");

        lado.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lado.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        borrarC.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        borrarC.setForeground(new java.awt.Color(0, 0, 153));
        borrarC.setText("Borrar");
        borrarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarCActionPerformed(evt);
            }
        });

        pAreaC.setBackground(new java.awt.Color(247, 189, 189));

        calcularAC.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        calcularAC.setForeground(new java.awt.Color(173, 21, 25));
        calcularAC.setText("Calcular");
        calcularAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularACActionPerformed(evt);
            }
        });

        areaCL.setBackground(new java.awt.Color(0, 0, 0));
        areaCL.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        areaCL.setForeground(new java.awt.Color(173, 21, 25));
        areaCL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        areaCL.setText("Área (cm²)");

        areaC.setColumns(24);
        areaC.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        areaC.setLineWrap(true);
        areaC.setRows(1);

        javax.swing.GroupLayout pAreaCLayout = new javax.swing.GroupLayout(pAreaC);
        pAreaC.setLayout(pAreaCLayout);
        pAreaCLayout.setHorizontalGroup(
            pAreaCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAreaCLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pAreaCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(areaCL, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calcularAC, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(areaC, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        pAreaCLayout.setVerticalGroup(
            pAreaCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAreaCLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(areaCL)
                .addGap(4, 4, 4)
                .addComponent(areaC, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(calcularAC)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pPerimetroC.setBackground(new java.awt.Color(247, 189, 189));

        calcularPC.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        calcularPC.setForeground(new java.awt.Color(130, 0, 0));
        calcularPC.setText("Calcular");
        calcularPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularPCActionPerformed(evt);
            }
        });

        perimetroCL.setBackground(new java.awt.Color(0, 0, 0));
        perimetroCL.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        perimetroCL.setForeground(new java.awt.Color(130, 0, 0));
        perimetroCL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        perimetroCL.setText("Perimetro (cm²)");

        perimetroC.setColumns(24);
        perimetroC.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        perimetroC.setLineWrap(true);
        perimetroC.setRows(1);

        javax.swing.GroupLayout pPerimetroCLayout = new javax.swing.GroupLayout(pPerimetroC);
        pPerimetroC.setLayout(pPerimetroCLayout);
        pPerimetroCLayout.setHorizontalGroup(
            pPerimetroCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPerimetroCLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pPerimetroCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(perimetroCL, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calcularPC, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(perimetroC, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        pPerimetroCLayout.setVerticalGroup(
            pPerimetroCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPerimetroCLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(perimetroCL)
                .addGap(4, 4, 4)
                .addComponent(perimetroC, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(calcularPC)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout CuadradoLayout = new javax.swing.GroupLayout(Cuadrado);
        Cuadrado.setLayout(CuadradoLayout);
        CuadradoLayout.setHorizontalGroup(
            CuadradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadradoLayout.createSequentialGroup()
                .addComponent(simboloC, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(CuadradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(cuadradoL, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(datosC, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lado, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(CuadradoLayout.createSequentialGroup()
                        .addComponent(pAreaC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(pPerimetroC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(borrarC))
                .addGap(35, 35, 35))
        );
        CuadradoLayout.setVerticalGroup(
            CuadradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadradoLayout.createSequentialGroup()
                .addGroup(CuadradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(CuadradoLayout.createSequentialGroup()
                        .addGroup(CuadradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CuadradoLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(cuadradoL))
                            .addComponent(simboloC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(datosC)
                        .addGap(5, 5, 5)
                        .addComponent(lado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(pPerimetroC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pAreaC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(borrarC)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Circulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(Cuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Rectangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(Triangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(FigurasGeo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(FigurasGeo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Circulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Triangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Rectangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calcularACiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularACiActionPerformed
        double r = Double.parseDouble(radio.getText());
        Circulo circulo = new Circulo(r);
        areaCi.setText(String.valueOf(circulo.calcularArea()));
    }//GEN-LAST:event_calcularACiActionPerformed

    private void borrarCiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarCiActionPerformed
        radio.setText("");
        areaCi.setText("");
        perimetroCi.setText("");
    }//GEN-LAST:event_borrarCiActionPerformed

    private void borrarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarRActionPerformed
        baseR.setText("");
        alturaR.setText("");
        areaR.setText("");
        perimetroR.setText("");
    }//GEN-LAST:event_borrarRActionPerformed

    private void borrarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarCActionPerformed
        lado.setText("");
        areaC.setText("");
        perimetroC.setText("");
    }//GEN-LAST:event_borrarCActionPerformed

    private void calcularATActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularATActionPerformed
        double b = Double.parseDouble(baseT.getText());
        double a = Double.parseDouble(alturaT.getText());
        TrianguloRectangulo trec = new TrianguloRectangulo(b,a);
        areaT.setText(String.valueOf(trec.calcularArea()));
    }//GEN-LAST:event_calcularATActionPerformed

    private void calcularPTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularPTActionPerformed
        double b = Double.parseDouble(baseT.getText());
        double a = Double.parseDouble(alturaT.getText());
        TrianguloRectangulo trec = new TrianguloRectangulo(b,a);
        perimetroT.setText(String.valueOf(trec.calcularPerimetro()));
    }//GEN-LAST:event_calcularPTActionPerformed

    private void mostrarTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarTTActionPerformed
        double b = Double.parseDouble(baseT.getText());
        double a = Double.parseDouble(alturaT.getText());
        TrianguloRectangulo trec = new TrianguloRectangulo(b,a);
        tipoT.setText(trec.tipoTriangulo());
    }//GEN-LAST:event_mostrarTTActionPerformed

    private void borrarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarTActionPerformed
        baseT.setText("");
        alturaT.setText("");
        areaT.setText("");
        perimetroT.setText("");
        tipoT.setText("");
    }//GEN-LAST:event_borrarTActionPerformed

    private void calcularPCiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularPCiActionPerformed
        double r = Double.parseDouble(radio.getText());
        Circulo circulo = new Circulo(r);
        perimetroCi.setText(String.valueOf(circulo.calcularPerimetro()));
    }//GEN-LAST:event_calcularPCiActionPerformed

    private void calcularACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularACActionPerformed
        double l = Double.parseDouble(lado.getText());
        Cuadrado cuadrado = new Cuadrado(l);
        areaC.setText(String.valueOf(cuadrado.calcularArea()));
    }//GEN-LAST:event_calcularACActionPerformed

    private void calcularPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularPCActionPerformed
        double l = Double.parseDouble(lado.getText());
        Cuadrado cuadrado = new Cuadrado(l);
        perimetroC.setText(String.valueOf(cuadrado.calcularPerimetro()));
    }//GEN-LAST:event_calcularPCActionPerformed

    private void calcularARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularARActionPerformed
        double b = Double.parseDouble(baseR.getText());
        double a = Double.parseDouble(alturaR.getText());
        Rectangulo rec = new Rectangulo(b,a);
        areaR.setText(String.valueOf(rec.calcularArea()));
    }//GEN-LAST:event_calcularARActionPerformed

    private void calcularPRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularPRActionPerformed
        double b = Double.parseDouble(baseR.getText());
        double a = Double.parseDouble(alturaR.getText());
        Rectangulo rec = new Rectangulo(b,a);
        perimetroR.setText(String.valueOf(rec.calcularPerimetro()));
    }//GEN-LAST:event_calcularPRActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazGrafica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Circulo;
    private javax.swing.JPanel Cuadrado;
    private javax.swing.JPanel FigurasGeo;
    private javax.swing.JPanel Rectangulo;
    private javax.swing.JPanel Triangulo;
    private javax.swing.JTextField alturaR;
    private javax.swing.JLabel alturaRL;
    private javax.swing.JTextField alturaT;
    private javax.swing.JLabel alturaTL;
    private javax.swing.JTextArea areaC;
    private javax.swing.JLabel areaCL;
    private javax.swing.JTextArea areaCi;
    private javax.swing.JLabel areaCiL;
    private javax.swing.JTextArea areaR;
    private javax.swing.JLabel areaRL;
    private javax.swing.JTextArea areaT;
    private javax.swing.JLabel areaTL;
    private javax.swing.JTextField baseR;
    private javax.swing.JLabel baseRL;
    private javax.swing.JTextField baseT;
    private javax.swing.JLabel baseTL;
    private javax.swing.JButton borrarC;
    private javax.swing.JButton borrarCi;
    private javax.swing.JButton borrarR;
    private javax.swing.JButton borrarT;
    private javax.swing.JButton calcularAC;
    private javax.swing.JButton calcularACi;
    private javax.swing.JButton calcularAR;
    private javax.swing.JButton calcularAT;
    private javax.swing.JButton calcularPC;
    private javax.swing.JButton calcularPCi;
    private javax.swing.JButton calcularPR;
    private javax.swing.JButton calcularPT;
    private javax.swing.JLabel circuloL;
    private javax.swing.JLabel cuadradoL;
    private javax.swing.JLabel datosC;
    private javax.swing.JLabel datosCi;
    private javax.swing.JLabel datosR;
    private javax.swing.JLabel datosT;
    private javax.swing.JLabel figGeoL;
    private javax.swing.JTextField lado;
    private javax.swing.JButton mostrarTT;
    private javax.swing.JPanel pAPTT;
    private javax.swing.JPanel pAlturaR;
    private javax.swing.JPanel pAlturaT;
    private javax.swing.JPanel pAreaC;
    private javax.swing.JPanel pAreaCi;
    private javax.swing.JPanel pAreaR;
    private javax.swing.JPanel pBaseR;
    private javax.swing.JPanel pBaseT;
    private javax.swing.JPanel pPerimetroC;
    private javax.swing.JPanel pPerimetroCi;
    private javax.swing.JPanel pPerimetroR;
    private javax.swing.JTextArea perimetroC;
    private javax.swing.JLabel perimetroCL;
    private javax.swing.JTextArea perimetroCi;
    private javax.swing.JLabel perimetroCiL;
    private javax.swing.JTextArea perimetroR;
    private javax.swing.JLabel perimetroRL;
    private javax.swing.JTextArea perimetroT;
    private javax.swing.JLabel perimetroTL;
    private javax.swing.JTextField radio;
    private javax.swing.JLabel rectanguloL;
    private javax.swing.JLabel simboloC;
    private javax.swing.JLabel simboloCi;
    private javax.swing.JLabel simboloR;
    private javax.swing.JLabel simboloT;
    private javax.swing.JTextArea tipoT;
    private javax.swing.JLabel tipoTL;
    private javax.swing.JLabel trianguloL;
    // End of variables declaration//GEN-END:variables
}
