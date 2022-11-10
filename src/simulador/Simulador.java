/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulador;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
import menu.menu;

/**
 *
 * @author pedri
 */
public class Simulador {

    /**
     * @param args the command line arguments
     */
    Connection con;

    public Simulador() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_simulador", "root", "");
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
    }

    public static void main(String[] args) {
        Simulador cn = new Simulador();
        Statement st;
        ResultSet rs;
        try {
            st = cn.con.createStatement();
            rs = st.executeQuery("select * from animales_terrestres");
            while (rs.next()) {
                //System.out.println(rs.getString("nombre_cientifico") + rs.getString("tipo"));
            }
            cn.con.close();
        } catch (Exception e) {

        }
        Scanner sc = new Scanner(System.in);
        int rda = (int) (Math.random() * 9);
        String opc, opc1;

        arbolesClase arbol1 = new arbolesClase(" laurel tucumano (Phoebe porphyria)", "es"
                + "\nuna especie de frondosos árboles de la familia "
                + "\nde las Lauraceae, que viven típicamente en los "
                + "\nbosques umbrosos mixtos", 0, 0);
        arbolesClase arbol2 = new arbolesClase(" cedro tucumano (Cedrela lilloi)"
                + "\nSe halla en Argentina, Bolivia, Perú, Ecuador"
                + ";\nhasta los 3.400 msnm . Está amenazada"
                + "\npor pérdida de hábitat.", "Es un árbol inerme,de "
                + "\n7 a 17 m de altura, con fuste recto, de hasta 12 dm"
                + "\nde diámetro. Florece australmente, de noviembre "
                + "\na enero; fructifica de febrero a marzo. "
                + "\nSumamente explotado por su madera. Hojas, al restregarlas,"
                + "\ndan olor desagradable.", 0, 1);
        arbolesClase arbol3 = new arbolesClase("lapacho rosado (Tabebuia avellanedae)"
                + "\nes una especie arbórea nativa de Sudamérica, donde crece"
                + "\ndesde el Paraguay, Bolivia, Brasil, Perú, Ecuador, Colombia"
                + "\ny el norte de Uruguay y Argentina hasta México. Prefiere"
                + "\nsuelos arenosos y húmedos.", "Es un árbol de buen porte,"
                + "\npudiendo alcanzar los 80 cm de diámetro en el tronco y los 30 m"
                + "\nde altura, de los cuales 10 corresponden aproximadamente al fuste."
                + "\nLa copa es semiglobosa, con el follaje concentrado en su parte"
                + "\nmás alta. Es caducifolio.", 0, 2);
        arbolesClase arbol4 = new arbolesClase(" horco molle (Blepharocalyx salicifolius)"
                + "\npopularmente conocido como arrayán, anacahuita y horco molle,"
                + "\nes una especie de árbol de la familia de las mirtáceas, endémico"
                + "\ndel sur de Brasil, Argentina, Paraguay y Uruguay.", "Árbol de entre"
                + "\n3 y 6 m. Tronco grueso, oscuro, corteza finamente agrietada, con"
                + "\nfollaje persistente, color verde brillante, que desde lejos parece"
                + "\ngris plateado. Tiene hojas simples, opuestas, lanceoladas, 3,5-5,5 cm"
                + "\nde largo. Ápice acuminado o apiculado, de bordes íntegros, y más"
                + "\nclaras en el envés.", 0, 3);
        arbolesClase arbol5 = new arbolesClase("horco-quebracho (Schinopsis haenkeana)"
                + "\nSe halla en Argentina y en Bolivia. Es una especie de árbol"
                + "\ncaracterístico del Chaco serrano, que de manera frecuente y creando"
                + "\nbosques se la suele encontrar por debajo de los 900 msnm.",
                "Arriba de esa altitud prácticamente solo hay ejemplares aislados. En"
                + "\nArgentina las subpoblaciones van desde el noreste del país hasta"
                + "\nSan Juan (en la Sierra de la Huerta), San Luis y Córdoba.", 0, 4);
        arbolesClase arbol6 = new arbolesClase("algarrobos (Prosopis spp.)", "Prosperan en suelo"
                + "árido y resisten sequías, desarrollando sistemas radiculares extremadamente"
                + "profundos. Su madera es dura, densa y durable. Sus frutos son legumbres"
                + "y pueden tener alta concentración de azúcar.", 0, 5);
        arbolesClase arbol7 = new arbolesClase("algarrobos (Prosopis spp.)", "Prosperan en suelo"
                + "árido y resisten sequías, desarrollando sistemas radiculares extremadamente"
                + "profundos. Su madera es dura, densa y durable. Sus frutos son legumbres"
                + "y pueden tener alta concentración de azúcar.", 0, 6);
        arbolesClase arbol8 = new arbolesClase("horco-quebracho (Schinopsis haenkeana)"
                + "\nSe halla en Argentina y en Bolivia. Es una especie de árbol"
                + "\ncaracterístico del Chaco serrano, que de manera frecuente y creando"
                + "\nbosques se la suele encontrar por debajo de los 900 msnm.",
                "Arriba de esa altitud prácticamente solo hay ejemplares aislados. En"
                + "\nArgentina las subpoblaciones van desde el noreste del país hasta"
                + "\nSan Juan (en la Sierra de la Huerta), San Luis y Córdoba.", 0, 7);
        arbolesClase arbol9 = new arbolesClase(" laurel tucumano (Phoebe porphyria)", "es"
                + "\nuna especie de frondosos árboles de la familia "
                + "\nde las Lauraceae, que viven típicamente en los "
                + "\nbosques umbrosos mixtos", 0, 8);
        arbolesClase arbol10 = new arbolesClase(" cedro tucumano (Cedrela lilloi)"
                + "\nSe halla en Argentina, Bolivia, Perú, Ecuador"
                + ";\nhasta los 3.400 msnm . Está amenazada"
                + "\npor pérdida de hábitat.", "Es un árbol inerme,de "
                + "\n7 a 17 m de altura, con fuste recto, de hasta 12 dm"
                + "\nde diámetro. Florece australmente, de noviembre "
                + "\na enero; fructifica de febrero a marzo. "
                + "\nSumamente explotado por su madera. Hojas, al restregarlas,"
                + "\ndan olor desagradable.", 0, 9);

        floresClase flor1 = new floresClase("Anchico Colorado", " Parapiptadenia rigida", "Mediana", "Longeva, su madera es muy apreciada.", "Rojo", 0);
        floresClase flor2 = new floresClase("Jacarandá", " Jacaranda mimosifolia", "Pequeña", " El néctar de sus flores sirve de alimento a colibríes y a la catita chirirí.", "Celeste Violáceo", 1);
        floresClase flor3 = new floresClase("Ceibo de Jujuy", "Erythrina falcata", "Grande", " Su copa roja asoma en medio de la selva en su ámbito natural.", "Rojo", 2);
        floresClase flor4 = new floresClase("Ombú", "Phytolacca dioica", "Grande", "Forma parte de mitos, creencias populares y del folklore", "Verde", 3);
        floresClase flor5 = new floresClase("Higuerón", "Ficus luschnathiana", "crece epífita sobre otras especies", "Pequeño", "Azulada", 4);
        floresClase flor6 = new floresClase("Tala Gateador", "Celtis iguanaea", "es una liana o arbusto trepador, típico de las selvas del norte.", "Mediano", "Rojo", 5);
        floresClase flor7 = new floresClase(" Pindó", " Syagrus romanzoffiana", " Los indígenas utilizaban sus hojas para fabricara cestos, esteras, abanicos, cuerdas de arcos y para techar ranchos", "Grande", "Verde", 6);
        floresClase flor8 = new floresClase("Timbó", " Enterolobium contortisiliquum", " En selvas y montes del norte provee alimento para el mono carayá, el tapir y el pecarí de collar.", "Mediano", "Verde oscuro- negro", 7);
        floresClase flor9 = new floresClase("Cedro Salteño", "Cedrela angustifolia", "es una especie característica del piso superior de la \"selva de montaña\" del noroeste, a altitudes superiores a los 1.100- 1.200 y hasta los 2.500 m s.m.", "Verde", "Pequeña", 8);
        floresClase flor10 = new floresClase("Coronillo", "Scutia buxifolia", "Sus ramitas espinosas son utilizadas para la confección de nidos por varias aves", "Grande", "Verde", 9);

        //5 pajaros
        animalesAereos lechuza = new animalesAereos("Lechuza vizcachera(Athene cunicularia)", " Alimentación: Se alimentan de pequeños mamíferos (tuco-tucos, ratones, murciélagos, etc.), reptiles, anfibios, aves e invertebrados, algunos de los cuales son perjudiciales para la salud de las personas y los cultivos.", "Hábitat: descampados o zonas abiertas, siempre relacionadas a las áreas agrícolas y de vegetación con baja altura.", 0, 0);
        animalesAereos hornero = new animalesAereos("Pirincho o Machilo(Guira guira)", "Alimentación: Se alimenta principalmente de pequeños animales como lagartijas, serpientes, sapitos, ratones, huevos, pichones de aves e invertebrados.", "Hábitat: Viven en todo tipo de ambientes, desde bosque, descampados o zonas abiertas hasta ambientes urbanizados. ", 0, 1);
        animalesAereos tero = new animalesAereos("Charrasquita(Troglodytes aedon)", "Alimentación: Se alimenta principalmente de insectos. En su dieta abundan las langostas tucuras y larvas de diversos insectos.", "Hábitat: Se las suele observar en ramas muy cercanas al suelo, buscando su alimento o trepando por los troncos. ", 0, 2);
        animalesAereos colibri = new animalesAereos("Urraca(Cyanocorax chrysops)", "Alimentación: Se alimenta de pequeños animales como lagartijas, ranas, ratones e invertebrados, algunos de los cuales son perjudiciales para la salud de las personas y los cultivos. ", "Hábitat: Viven en todo tipo de ambientes aunque prefiere zonas con muchos árboles.", 0, 3);
        animalesAereos carancho = new animalesAereos("Carancho (Caracara plancus)", "Alimentación: Se alimenta principalmente de carroña.", "Hábitat: Viven en todo tipo de ambientes, desde bosque, descampados o zonas abiertas hasta ambientes urbanizados.", 0, 4);
        //5 insectos
        animalesAereos escarabajo = new animalesAereos("Chingolo o Incancho( Zonotrichia capensis)", "Alimentación: Más de la mitad de su dieta se compone principalmente de semillas, pero se alimenta también de insectos y arácnidos.", "Hábitat: Se los suele observar en alambrados al costado de las rutas o apoyados en troncos y postes. ", 0, 5);
        animalesAereos araña = new animalesAereos("Pepitero de collar(Saltator)", "Alimentación: por su enorme y fuerte pico podríamos decir que es un semillero, pero también se alimenta de frutos, hojas y brotes de árboles y arbustos.", "Hábitat: por lo general, habita zonas con abundante vegetación como las selvas y bosques, también en descampados o zonas abiertas.", 0, 6);
        animalesAereos hormiga = new animalesAereos("Jilguero o Misto(Sicalis luteola)", "Alimentación: se alimenta de semillas, granos, frutos, pequeños insectos y larvas, que encuentra al caminar por el suelo.", "Hábitat: por lo general habita en bosques y también en descampados o zonas abiertas.", 0, 7);
        animalesAereos alacran = new animalesAereos("Corbatita o tucumanito(Sporophila caerulescens)", "Alimentación: como hace referencia su nombre científico esta especie se alimenta puramente de semillas, su pico robusto está diseñado para esta función.", "Hábitat: zonas abiertas, descampados con pastos y arbustos, campos cultivados y márgenes de canales y arroyos. ", 0, 8);
        animalesAereos ututo = new animalesAereos("Cabecita negra común(Spinus magellanicus )", "Alimentación: se alimenta de semillas, granos y pequeños insectos como los pulgones.", "Hábitat: zonas bajas y de las altas montañas de Tucumán", 0, 9);

        animalesTerrestres huronMayor = new animalesTerrestres("Es un huron mayor es un mamifero carnivoro", "Su nombre cientifico es: Tayra", "Tienden a tener un color negro", 0, 4, 0);
        animalesTerrestres ocelote = new animalesTerrestres("Es un ocelote. El ocelote es una especie de mamíferos carnívoros de la familia Felidae.​ Se encuentra ampliamente distribuido en América, principalmente en ambientes tropicales", "Su nombre cientifico es: Leopardus pardalis", "Tienden a tener un color marron ooscuro", 0, 4, 1);
        animalesTerrestres puma = new animalesTerrestres("Es un puma. Las orejas son redondeadas. La cola es larga y representa cerca de un tercio de la longitud total del animal.", "Su nombre cientifico es: Puma concolor", "Tienden a tener un color marron", 0, 4, 2);
        animalesTerrestres conejo = new animalesTerrestres("Es un conejo El conejo común o conejo europeo es una especie de mamífero lagomorfo de la familia Leporidae, y el único miembro actual del género Oryctolagus.", "Su nombre cientifico es: Oryctolagus cuniculus", "Tienden a tener un color marron claro", 0, 4, 3);
        animalesTerrestres zorro = new animalesTerrestres("Es un zorro. Son una tribu de mamíferos carnívoros incluidos en la familia de los cánidos.", "Su nombre cientifico es: Vulpes Vulpes", "Tienden a tener un color naranja", 0060, 4, 4);
        animalesTerrestres ñandu = new animalesTerrestres("Es un ñandu. Es un ave paleognata endémica de Sudamérica", "Su nombre cientifico es: Rhea", "Tienden a tener un color marron", 1, 2, 5);
        animalesTerrestres coati = new animalesTerrestres("Es un coati. Es una especie de mamífero carnívoro de la familia de los prociónidos que habita predominantemente en las selvas sudamericanas y la parte meridional de Centroamérica", "Su nombre cientifico es: Nasua nasua", "Su color tiende a ser marron", 0053, 4, 6);
        animalesTerrestres tortuga = new animalesTerrestres("Es una tortuga. Las tortugas o quelonios forman un orden de reptiles caracterizados por tener un tronco ancho y corto, y un caparazón que protege los órganos internos de su cuerpo", "Su nombre cientifico es: Testudines", "Su color tiende a ser un gris verdoso", 0050, 4, 7);
        animalesTerrestres corzuela = new animalesTerrestres("Es una corzuela", "Su nombre cientifico es: Mazama gouazoubira", "Su color tiende a ser pardo", 1, 4, 8);
        animalesTerrestres tapir = new animalesTerrestres("Es un tapir. Tienen un número impar de dedos", "Su nombre cientifico es: Tapirus", "Su color tiende a ser negro o marron", 2, 4, 9);

        //repetir 4 de las anteriores clases
        animalesAcuaticos Boga = new animalesAcuaticos("Es una boga. Es una especie omnívora que consume desde semillas, bivalvos y otros invertebrados hasta pequeños peces.", "Su nombre cientifico es: Leporinus obtusidens", "La boga es gris, pero con el agua toma tonalidades celestes", 60, 0);
        animalesAcuaticos Tararira = new animalesAcuaticos("Es una tararira o Dentudo. Se caracterizan por tener un cuerpo alargado, subcilíndrico, cabeza también alargada, deprimida, con la quijada inferior ligeramente sobresaliente.", "Su nombre cientifico es: Hoplias malabaricus", "Su color tiende a ser verde", 40, 1);
        animalesAcuaticos Bagre = new animalesAcuaticos("Es un bagre. El bagre es un pez que se caracteriza por tener bigotes en su mandíbula superior y debido a sus diferentes subespecies, en algunas de ellas, llegan a tener los bigotes en las mandíbulas inferiores", "Su nombre cientifico es: Siluriformes", "Tienden a ser marrones", 30, 2);
        animalesAcuaticos trucha = new animalesAcuaticos("Es una trucha", "Su nombre cientifico es: Salmo trutta", "Tienden a tener un color gris azulado", 50, 3);
        //peces
        animalesAcuaticos palometa = new animalesAcuaticos("Es una palometa negra. Posee escamas de gran tamaño y lisas que se van reduciendo a medida que llegan al pedúnculo caudal", "Su nombre cientifico es: Brama brama", "Posee una tonalidad grisácea azulada brillante", 50, 4);
        animalesAcuaticos mojarra = new animalesAcuaticos("Es una mojarra. Pueden vivir tanto en agua dulce como agua salada, es una variedad de pez que crece con facilidad y su carne contiene muchos nutrientes.", "Su nombre cientifico es: Bryconamericus iheringii", "Tienden a tener un color gris", 20, 5);
        animalesAcuaticos pejerrey = new animalesAcuaticos("Es un pejerrey. Poseen un cuerpo alargado, fusiforme, más o menos comprimido", "Su nombre cientifico es: Odontesthes bonariensis", "Su color tiende a ser amarillento", 40, 6);
        //anfibios
        animalesAcuaticos sapo = new animalesAcuaticos("Es un sapo. Estos animales estan caracterizados por patas cortas, ojos saltones y piel áspera.", "Su nombre cientifico es: Bufonidae", "Su color tiende a ser marron verdoso", 15, 7);
        animalesAcuaticos rana = new animalesAcuaticos("Es una rana. Se caracterizan por su gran capacidad de salto gracias a la morfología de sus extremidades posteriores, potentes y muy desarrolladas.", "Su nombre cientifico es: Anura", "Su color normalmente tiende a ser verdoso", 30, 8);
        //langostas
        animalesAcuaticos piraniaPanzaAmarilla = new animalesAcuaticos("Es una piraña. Son conocidas por sus dientes afilados y por su insaciable y agresivo apetito por la carne", "Su nombre cientifico es: Serrasalmus maculatus", "Su color es gris con tonalidades rojas y panza amarilla", 14, 9);

        MostrarTodo funcion = new MostrarTodo();

        animalesAereos[] Cielito = new animalesAereos[10];
        funcion.animalAereos(lechuza);
        funcion.animalAereos(hornero);
        funcion.animalAereos(tero);
        funcion.animalAereos(colibri);
        funcion.animalAereos(carancho);
        funcion.animalAereos(escarabajo);
        funcion.animalAereos(araña);
        funcion.animalAereos(hormiga);
        funcion.animalAereos(alacran);
        funcion.animalAereos(ututo);

        animalesTerrestres[] Tierrita = new animalesTerrestres[10];
        funcion.animalTerrestre(huronMayor);
        funcion.animalTerrestre(ocelote);
        funcion.animalTerrestre(puma);
        funcion.animalTerrestre(conejo);
        funcion.animalTerrestre(zorro);
        funcion.animalTerrestre(ñandu);
        funcion.animalTerrestre(coati);
        funcion.animalTerrestre(tortuga);
        funcion.animalTerrestre(corzuela);
        funcion.animalTerrestre(tapir);

        animalesAcuaticos[] Aguita = new animalesAcuaticos[10];
        funcion.animalAcuatico(Boga);
        funcion.animalAcuatico(Tararira);
        funcion.animalAcuatico(Bagre);
        funcion.animalAcuatico(trucha);
        funcion.animalAcuatico(palometa);
        funcion.animalAcuatico(mojarra);
        funcion.animalAcuatico(pejerrey);
        funcion.animalAcuatico(sapo);
        funcion.animalAcuatico(rana);
        funcion.animalAcuatico(piraniaPanzaAmarilla);

        arbolesClase[] Bosquecito = new arbolesClase[10];
        funcion.arboles(arbol1);
        funcion.arboles(arbol2);
        funcion.arboles(arbol3);
        funcion.arboles(arbol4);
        funcion.arboles(arbol5);
        funcion.arboles(arbol6);
        funcion.arboles(arbol7);
        funcion.arboles(arbol8);
        funcion.arboles(arbol9);
        funcion.arboles(arbol10);

        floresClase[] Florecita = new floresClase[10];
        funcion.flores(flor1);
        funcion.flores(flor2);
        funcion.flores(flor3);
        funcion.flores(flor4);
        funcion.flores(flor5);
        funcion.flores(flor6);
        funcion.flores(flor7);
        funcion.flores(flor8);
        funcion.flores(flor9);
        funcion.flores(flor10);

        System.out.println("Bienvenido, usted se encunetra en ´El cerro San Javier´"
                + ", a una altura aproximada de 1800 msnm. \n  La formación vegetal "
                + "dominante es la nuboselva, selvas y bosques de montañas o yungas.\n"
                + "Aquí se practican deportes como trekking, parapente, ciclismo, etc."
                + "Pero lo más importante para nosotros es mostrarte la vida que aquí habita."
                + "\n Te encuentras parado entre los árboles; a tus lados verás el bosque, "
                + "hacia arriba verás el cielo, hacia abajo el suelo y hacia adelante una laguna.");
        menu principal = new menu(funcion);
        principal.setVisible(true);
        System.out.println("Hacia donde desea mirar?:"
                + "\n para arriba."
                + "\n para adelante"
                + "\n para izquierda"
                + "\n para derecha."
                + "\n para abajo.");
        opc = sc.nextLine();
        opc1 = opc.toLowerCase();
        String mensaje = "", caracteristicas = "";
        switch (opc1) {

            case "arriba":
                for (int i = 0; i < Cielito.length; i++) {
                    if (rda == Cielito[i].getIDA()) {
                        Cielito[i].capacidades(mensaje);
                    }
                }
                break;
            case "adelante":
                for (int i = 0; i < Aguita.length; i++) {
                    if (rda == Aguita[i].getIDN()) {
                        Aguita[i].capacidades(mensaje);
                    }
                }
                break;
            case "izquierda":
                for (int i = 0; i < Bosquecito.length; i++) {
                    if (rda == Bosquecito[i].getIDR()) {
                        Bosquecito[i].caracteristicas(caracteristicas);
                    }
                }
                for (int i = 0; i < Florecita.length; i++) {
                    if (rda == Florecita[i].getIDF()) {
                        Florecita[i].caracteristicas(caracteristicas);
                    }
                }
                break;
            case "derecha":
                for (int i = 0; i < Bosquecito.length; i++) {
                    if (rda == Bosquecito[i].getIDR()) {
                        Bosquecito[i].caracteristicas(caracteristicas);
                    }
                }
                for (int i = 0; i < Florecita.length; i++) {
                    if (rda == Florecita[i].getIDF()) {
                        Florecita[i].caracteristicas(caracteristicas);
                    }
                }
                break;
            case "abajo":
                for (int i = 0; i < Tierrita.length; i++) {
                    if (rda == Tierrita[i].getIDT()) {
                        Tierrita[i].capacidades(mensaje);
                    }
                }
                break;
        }

    }
}
