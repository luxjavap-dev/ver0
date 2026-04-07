/*
	winGen.java - Genera la maschera della finestra
	uso:	java winGen
	Compilazione:	javac winGen.java
*/


import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableCellRenderer;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JProgressBar;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;

import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;

import java.util.Vector;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

import java.io.File;
import java.io.Serializable;
import java.io.Writer;
import java.io.OutputStream;

import javax.swing.table.DefaultTableCellRenderer;

// utilizzato nella lettura di un file TXT
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;



interface testWG
{
	int field_CODICE					= 0;
	int field_CODICEABARRE				= 1;
	int field_DESCRIZIONEBREVE			= 2;
	int field_DATIDESCRITTIVIEQTA		= 3;
	int field_DATISTATISTICI			= 4;
	int field_DESCRIZIONEFATTURA		= 5;
	int field_DESCRIZIONELUNGA			= 6;
	int field_COMBOUNITADIMISURA		= 7;
	int field_COMBOFORNITORE			= 8;
	int field_QTAALLMAG					= 9;
	int field_BARRAQTA					= 10;
	int field_TABELLADITEST				= 11;
	int field_FileDD					= 12;
	int field_FileDDhex					= 13;
	int field_FileDropper				= 14;
	
	
	
	int field_QTAMAXORD					= 15;
	int field_COMBOMAGAZZINI			= 16;
	int field_DESCRIZIONEMAGAZZINO		= 17;
	int field_COMBOUBICAZIONE			= 18;
	int field_DESCRIZIONEUBICAZIONE		= 19;
	int field_QTADELMAGAZZINO			= 20;
	int field_QTAMAXDELMAGAZZINO		= 21;
	int field_QTAMINORD					= 22;
	int field_PREZZOSINGOLAUNITA		= 23;
	int field_BOTTONECREA				= 24;
	int field_BOTTONEMODIFICA			= 25;
	int field_BOTTONEIBERNA				= 26;
	int field_CLONA						= 27;
	
}

class testWinGenMagaz implements testWG , winGenConstants
{
	// Classe utility
	// devo metterla o basta inserire .....
	/* START	log1	*/
	public static Vector<Object> log1 = new Vector<>(Arrays.asList(
	    "ID1",                                              // 0: campo_VUOTO
	    "FIELD_LOG",                                        // 1: campo_DESCRIZIONE
	    new JLabel("Log file"),                             // 2: campo_LABEL
	    10,                                                 // 3: campo_LABEL_X
	    10,                                                 // 4: campo_LABEL_Y
	    60,                                                 // 5: campo_LABEL_L
	    22,                                                 // 6: campo_LABEL_H
	    Color.white,                                        // 7: campo_LABEL_FOREGROUND
	    Color.gray.darker(),                                // 8: campo_LABEL_BACKGROUND
	    new Font("COURIER NEW", Font.PLAIN, 14),            // 9: campo_LABEL_FONT
	    null,                                               // 10: campo_LABEL_TOOLTIPTEXT
	    null,                                               // 11: campo_LABEL_POPUPMENU
	    null, null, null, null, null, null, null, null,     // 12-19 (sono 8 null)
	    null,                                               // 20: campo_20 (un altro null)
	    new JTextArea("Descrizione lunga"),                 // 21: campo_COMPONENTE
	    "Descrizione lunga",                                // 22: campo_VALORE
	    80,                                                 // 23: campo_X
	    10,                                                 // 24: campo_Y
	    1000,                                               // 25: campo_L
	    800,                                                // 26: campo_H
	    true,                                               // 27: campo_ENABLED
	    true,                                               // 28: campo_VISIBLE
	    null,                                               // 29: campo_FOREGROUND
	    null,                                               // 30: campo_BACKGROUND
	    "La descrizione lunga e' utile...",                 // 31: campo_TOOLTIPTEXT
	    null,                                               // 32: campo_ACTIONLISTENER
	    new Font("COURIER NEW", Font.PLAIN, 12),            // 33: campo_COMPONENTE_FONT
	    null,                                               // 34: campo_COMPONENTE_IMAGE
	    null, null, null,                                   // 35-37
	    null, null, null,                                   // 38-40
	    null, null,                                         // 41-42
	    null, null, null, null, null, null, null, null, null, null,  // 43-52
	    null, null, null, null, null, null, null, null, null, null,  // 53-62
	    null, null, null, null, null, null, null, null, null, null,  // 63-72
	    null, null, null, null, null, null, null,                     // 73-79
	    
	    
	    "ID1",                                              // 0: campo_VUOTO
	    "FIELD_LOG",                                        // 1: campo_DESCRIZIONE
	    new JLabel("Log file2"),                            // 2: campo_LABEL
	    10,                                                 // 3: campo_LABEL_X
	    40,                                                 // 4: campo_LABEL_Y
	    60,                                                 // 5: campo_LABEL_L
	    22,                                                 // 6: campo_LABEL_H
	    Color.white,                                        // 7: campo_LABEL_FOREGROUND
	    Color.gray.darker(),                                // 8: campo_LABEL_BACKGROUND
	    new Font("COURIER NEW", Font.PLAIN, 14),            // 9: campo_LABEL_FONT
	    null,                                               // 10: campo_LABEL_TOOLTIPTEXT
	    null,                                               // 11: campo_LABEL_POPUPMENU
	    null, null, null, null, null, null, null, null,     // 12-19 (sono 8 null)
	    null,                                               // 20: campo_20 (un altro null)
	    new JLabel("Desc2"),                 // 21: campo_COMPONENTE
	    "Des2",                                // 22: campo_VALORE
	    10,                                                 // 23: campo_X
	    70,                                                 // 24: campo_Y
	    1000,                                               // 25: campo_L
	    800,                                                // 26: campo_H
	    true,                                               // 27: campo_ENABLED
	    true,                                               // 28: campo_VISIBLE
	    null,                                               // 29: campo_FOREGROUND
	    null,                                               // 30: campo_BACKGROUND
	    "La descrizione lunga e' utile...",                 // 31: campo_TOOLTIPTEXT
	    null,                                               // 32: campo_ACTIONLISTENER
	    new Font("COURIER NEW", Font.PLAIN, 12),            // 33: campo_COMPONENTE_FONT
	    null,                                               // 34: campo_COMPONENTE_IMAGE
	    null, null, null,                                   // 35-37
	    null, null, null,                                   // 38-40
	    null, null,                                         // 41-42
	    null, null, null, null, null, null, null, null, null, null,  // 43-52
	    null, null, null, null, null, null, null, null, null, null,  // 53-62
	    null, null, null, null, null, null, null, null, null, null,  // 63-72
	    null, null, null, null, null, null, null                     // 73-79
	    
	    
	));
	/* END	log1	*/
	
	
	/* START campo_login - FORMATO ARRAYS.ASLIST (STILE LOG1) */
	public static Vector<Object> campo_login = new Vector<>(Arrays.asList(
	    // ==================== BLOCCO 0: USERNAME (Indici 0-79) ====================
	    "",                                                 // 0: campo_VUOTO
	    "Login",                                            // 1: campo_DESCRIZIONE
	    new JLabel("Login"),                                // 2: campo_LABEL
	    400,                                                // 3: campo_LABEL_X
	    400,                                                // 4: campo_LABEL_Y
	    160,                                                // 5: campo_LABEL_L
	    30,                                                 // 6: campo_LABEL_H
	    Color.white,                                        // 7: campo_LABEL_FOREGROUND
	    Color.gray.darker(),                                // 8: campo_LABEL_BACKGROUND
	    new Font("COURIER NEW", Font.PLAIN, 18),            // 9: campo_LABEL_FONT
	    "Devi inserire il tuo nome utente per accedere all'applicativo", // 10: campo_LABEL_TOOLTIPTEXT
	    null, null, null, null, null, null, null, null,     // 11-18
	    null, null,                                         // 19-20
	    new JTextField(),                                   // 21: campo_COMPONENTE
	    "luxjava1960",                                      // 22: campo_VALORE
	    580,                                                // 23: campo_X
	    400,                                                // 24: campo_Y
	    270,                                                // 25: campo_L
	    30,                                                 // 26: campo_H
	    true,                                               // 27: campo_ENABLED
	    true,                                               // 28: campo_VISIBLE
	    Color.red,                                          // 29: campo_FOREGROUND
	    null,                                               // 30: campo_BACKGROUND
	    "Username",                                         // 31: campo_TOOLTIPTEXT
	    null,                                               // 32: campo_ACTIONLISTENER
	    new Font("COURIER NEW", Font.PLAIN, 18),            // 33: campo_COMPONENTE_FONT
	    "angelo.gif",                                       // 34: campo_COMPONENTE_IMAGE
	    null, null, null,                                   // 35-37
	    null, null, null, null, null, null, null, null, null, null, // 38-47
	    null, null, null, null, null, null, null, null, null, null, // 48-57
	    null, null, null, null, null, null, null, null, null, null, // 58-67
	    null, null, null, null, null, null, null, null, null, null, // 68-77
	    null, null,                                         // 78-79

	    // ==================== BLOCCO 1: PASSWORD (Indici 80-159) ====================
	    "",                                                 // 80: campo_VUOTO
	    "Password da inserire",                             // 81: campo_DESCRIZIONE
	    new JLabel("Password:"),                            // 82: campo_LABEL
	    400,                                                // 83: campo_LABEL_X
	    440,                                                // 84: campo_LABEL_Y
	    160,                                                // 85: campo_LABEL_L
	    30,                                                 // 86: campo_LABEL_H
	    Color.white,                                        // 87: campo_LABEL_FOREGROUND
	    Color.gray.darker(),                                // 88: campo_LABEL_BACKGROUND
	    new Font("COURIER NEW", Font.PLAIN, 18),            // 89: campo_LABEL_FONT
	    "Password di accesso al DBase",                     // 90: campo_LABEL_TOOLTIPTEXT
	    null, null, null, null, null, null, null, null,     // 91-98
	    null, null,                                         // 99-100
	    new JPasswordField("Test campo 16 f1"),             // 101: campo_COMPONENTE
	    "luxlux60",                                         // 102: campo_VALORE
	    580,                                                // 103: campo_X
	    440,                                                // 104: campo_Y
	    270,                                                // 105: campo_L
	    30,                                                 // 106: campo_H
	    true,                                               // 107: campo_ENABLED
	    true,                                               // 108: campo_VISIBLE
	    null,                                               // 109: campo_FOREGROUND
	    null,                                               // 110: campo_BACKGROUND
	    "<html><font color=blue>PASSWORD di accesso al DBase.<BR>Chiama il numero verde <font color=green>000 000 000<font color=blue> in caso di problemi di accesso</font></html>", // 111: campo_TOOLTIPTEXT
	    null,                                               // 112: campo_ACTIONLISTENER
	    null,                                               // 113: campo_COMPONENTE_FONT
	    null,                                               // 114: campo_COMPONENTE_IMAGE
	    null, null, null,                                   // 115-117
	    null, null, null, null, null, null, null, null, null, null, // 118-127
	    null, null, null, null, null, null, null, null, null, null, // 128-137
	    null, null, null, null, null, null, null, null, null, null, // 138-147
	    null, null, null, null, null, null, null, null, null, null, // 148-157
	    null, null,                                         // 158-159

	    // ==================== BLOCCO 2: LOGIN BUTTON (Indici 160-239) ====================
	    "",                                                 // 160: campo_VUOTO
	    "Controlla il login",                               // 161: campo_DESCRIZIONE
	    null, null, null, null, null, null, null, null, null, null, // 162-171
	    null, null, null, null, null, null, null, null, null,      // 172-180 (19 null)
	    new JButton("Login"),                               // 181: campo_COMPONENTE
	    "Login",                                            // 182: campo_VALORE
	    580,                                                // 183: campo_X
	    480,                                                // 184: campo_Y
	    270,                                                // 185: campo_L
	    27,                                                 // 186: campo_H
	    true,                                               // 187: campo_ENABLED
	    true,                                               // 188: campo_VISIBLE
	    Color.green.darker(),                               // 189: campo_FOREGROUND
	    null,                                               // 190: campo_BACKGROUND
	    "Login: accede al programma",                       // 191: campo_TOOLTIPTEXT
	    new voidLoginButton(),                              // 192: campo_ACTIONLISTENER
	    new Font("COURIER NEW", Font.PLAIN, 18),            // 193: campo_COMPONENTE_FONT
	    null, null, null, null, null, null, null, null, null, null, // 194-203
	    null, null, null, null, null, null, null, null, null, null, // 204-213
	    null, null, null, null, null, null, null, null, null, null, // 214-223
	    null, null, null, null, null, null, null, null, null, null, // 224-233
	    null, null, null, null, null,                       // 234-238
	    null,                                               // 239

	    // ==================== BLOCCO 3: LOGOUT BUTTON (Indici 240-319) ====================
	    "",                                                 // 240: campo_VUOTO
	    "Richiesta di logout",                              // 241: campo_DESCRIZIONE
	    null, null, null, null, null, null, null, null, null, null, // 242-251
	    null, null, null, null, null, null, null, null, null,      // 252-260 (19 null)
	    new JButton("Logout"),                              // 261: campo_COMPONENTE
	    "Logout",                                           // 262: campo_VALORE
	    580,                                                // 263: campo_X
	    520,                                                // 264: campo_Y
	    270,                                                // 265: campo_L
	    27,                                                 // 266: campo_H
	    true,                                               // 267: campo_ENABLED
	    true,                                               // 268: campo_VISIBLE
	    Color.red.darker(),                                 // 269: campo_FOREGROUND
	    null,                                               // 270: campo_BACKGROUND
	    "Logout: esce dal Login. Per accedere bisogna fare di nuovo Login.", // 271: campo_TOOLTIPTEXT
	    new voidLogoutButton(),                             // 272: campo_ACTIONLISTENER
	    new Font("COURIER NEW", Font.PLAIN, 18),            // 273: campo_COMPONENTE_FONT
	    null, null, null, null, null, null, null, null, null, null, // 274-283
	    null, null, null, null, null, null, null, null, null, null, // 284-293
	    null, null, null, null, null, null, null, null, null, null, // 294-303
	    null, null, null, null, null, null, null, null, null, null, // 304-313
	    null, null, null, null, null,                       // 314-318
	    null,                                               // 319

	    // ==================== BLOCCO 4: RESET BUTTON (Indici 320-399) ====================
	    "",                                                 // 320: campo_VUOTO
	    "Richiesta di reset del login",                     // 321: campo_DESCRIZIONE
	    null, null, null, null, null, null, null, null, null, null, // 322-331
	    null, null, null, null, null, null, null, null, null,      // 332-340 (19 null)
	    new JButton("Reset Login"),                         // 341: campo_COMPONENTE
	    "Reset del Login",                                  // 342: campo_VALORE
	    580,                                                // 343: campo_X
	    560,                                                // 344: campo_Y
	    270,                                                // 345: campo_L
	    27,                                                 // 346: campo_H
	    true,                                               // 347: campo_ENABLED
	    true,                                               // 348: campo_VISIBLE
	    Color.red.darker(),                                 // 349: campo_FOREGROUND
	    null,                                               // 350: campo_BACKGROUND
	    "Login Reset: richiesta di nuova password.",        // 351: campo_TOOLTIPTEXT
	    new voidLoginResetButton(),                         // 352: campo_ACTIONLISTENER
	    new Font("COURIER NEW", Font.PLAIN, 18),            // 353: campo_COMPONENTE_FONT
	    null, null, null, null, null, null, null, null, null, null, // 354-363
	    null, null, null, null, null, null, null, null, null, null, // 364-373
	    null, null, null, null, null, null, null, null, null, null, // 374-383
	    null, null, null, null, null, null, null, null, null, null, // 384-393
	    null, null, null, null, null,                       // 394-398
	    null,                                               // 399

	    // ==================== BLOCCO 5: CHANGE PASSWORD BUTTON (Indici 400-479) ====================
	    "",                                                 // 400: campo_VUOTO
	    "Cambio Password",                                  // 401: campo_DESCRIZIONE
	    null, null, null, null, null, null, null, null, null, null, // 402-411
	    null, null, null, null, null, null, null, null, null,      // 412-420 (19 null)
	    new JButton("Cambio Password"),                     // 421: campo_COMPONENTE
	    "Cambio Password",                                  // 422: campo_VALORE
	    580,                                                // 423: campo_X
	    600,                                                // 424: campo_Y
	    270,                                                // 425: campo_L
	    27,                                                 // 426: campo_H
	    true,                                               // 427: campo_ENABLED
	    true,                                               // 428: campo_VISIBLE
	    Color.green.darker(),                               // 429: campo_FOREGROUND
	    null,                                               // 430: campo_BACKGROUND
	    "Cambio Password: cambio password. Devi essere loggato per cambiare la Password!", // 431: campo_TOOLTIPTEXT
	    new voidLoginCambioPasswordButton(),                // 432: campo_ACTIONLISTENER
	    new Font("COURIER NEW", Font.PLAIN, 18),            // 433: campo_COMPONENTE_FONT
	    null, null, null, null, null, null, null, null, null, null, // 434-443
	    null, null, null, null, null, null, null, null, null, null, // 444-453
	    null, null, null, null, null, null, null, null, null, null, // 454-463
	    null, null, null, null, null, null, null, null, null, null, // 464-473
	    null, null, null, null, null                        // 474-478
	    // 479 non serve perché 400+80=480, l'ultimo indice è 479
	));
	/* END campo_login - FORMATO ARRAYS.ASLIST (STILE LOG1) */
		
	
	// START	campo1 //
	public static Vector<Object> campo1 = new Vector<>(Arrays.asList(
	    // ==================== BLOCCO 0: field_CODICE (Indici 0-79) ====================
	    "",                                                 // 0: campo_VUOTO
	    "field_CODICE",                                     // 1: campo_DESCRIZIONE
	    new JLabel("Codice"),                               // 2: campo_LABEL
	    20,                                                 // 3: campo_LABEL_X
	    10,                                                 // 4: campo_LABEL_Y
    160,                                                // 5: campo_LABEL_L
    22,                                                 // 6: campo_LABEL_H
    Color.white,                                        // 7: campo_LABEL_FOREGROUND
    Color.gray.darker(),                                // 8: campo_LABEL_BACKGROUND
    new Font("COURIER NEW", Font.PLAIN, 14),            // 9: campo_LABEL_FONT
    "Tasto dx per menu PopUp contestuale 1",            // 10: campo_LABEL_TOOLTIPTEXT
    new voidMouseTest_campo1_01(),                      // 11: campo_LABEL_POPUPMENU (MouseListener)
    null, null, null, null, null, null, null, null,     // 12-19 (sono 8 null)
    null,                                               // 20: campo_20
    new JTextField(),                                   // 21: campo_COMPONENTE
    "Vincent",                                          // 22: campo_VALORE
    185,                                                // 23: campo_X
    10,                                                 // 24: campo_Y
    270,                                                // 25: campo_L
    22,                                                 // 26: campo_H
    true,                                               // 27: campo_ENABLED
    true,                                               // 28: campo_VISIBLE
    Color.red,                                          // 29: campo_FOREGROUND
    null,                                               // 30: campo_BACKGROUND
    "CODICE del prodotto",                              // 31: campo_TOOLTIPTEXT
    null,                                               // 32: campo_ACTIONLISTENER
    new Font("COURIER NEW", Font.PLAIN, 14),            // 33: campo_COMPONENTE_FONT
    "angelo.gif",                                       // 34: campo_COMPONENTE_IMAGE
    null, null, null,                                   // 35-37
    null, null, null, null, null, null, null, null, null, null, // 38-47
    null, null, null, null, null, null, null, null, null, null, // 48-57
    null, null, null, null, null, null, null, null, null, null, // 58-67
    null, null, null, null, null, null, null, null, null, null, // 68-77
    null, null,                                         // 78-79

    // ==================== BLOCCO 1: field_CODICEABARRE (Indici 80-159) ====================
    "field_CODICEABARRE",                               // 80: campo_VUOTO (RI-USATO COME DESCRIZIONE)
    "field_CODICEABARRE",                               // 81: campo_DESCRIZIONE
    new JLabel("Codice a barre"),                       // 82: campo_LABEL
    20,                                                 // 83: campo_LABEL_X
    40,                                                 // 84: campo_LABEL_Y
    160,                                                // 85: campo_LABEL_L
    22,                                                 // 86: campo_LABEL_H
    Color.white,                                        // 87: campo_LABEL_FOREGROUND
    Color.gray.darker(),                                // 88: campo_LABEL_BACKGROUND
    new Font("COURIER NEW", Font.PLAIN, 14),            // 89: campo_LABEL_FONT
    "Tasto dx per menu PopUp contestuale 2",            // 90: campo_LABEL_TOOLTIPTEXT
    new voidMouseTest_campo1_02(),                      // 91: campo_LABEL_POPUPMENU (MouseListener)
    null, null, null, null, null, null, null, null,     // 92-99
    null,                                               // 100: campo_20
    new JTextField(),                                   // 101: campo_COMPONENTE
    null,                                               // 102: campo_VALORE
    185,                                                // 103: campo_X
    40,                                                 // 104: campo_Y
    270,                                                // 105: campo_L
    22,                                                 // 106: campo_H
    true,                                               // 107: campo_ENABLED
    true,                                               // 108: campo_VISIBLE
    null,                                               // 109: campo_FOREGROUND
    null,                                               // 110: campo_BACKGROUND
    "CODICE A BARRE del prodotto",                      // 111: campo_TOOLTIPTEXT
    null,                                               // 112: campo_ACTIONLISTENER
    new Font("COURIER NEW", Font.PLAIN, 14),            // 113: campo_COMPONENTE_FONT
    null,                                               // 114: campo_COMPONENTE_IMAGE
    null, null, null,                                   // 115-117
    null, null, null, null, null, null, null, null, null, null, // 118-127
    null, null, null, null, null, null, null, null, null, null, // 128-137
    null, null, null, null, null, null, null, null, null, null, // 138-147
    null, null, null, null, null, null, null, null, null, null, // 148-157
    null, null,                                         // 158-159

    // ==================== BLOCCO 2: field_DESCRIZIONEBREVE (Indici 160-239) ====================
    "field_DESCRIZIONEBREVE",                           // 160: campo_VUOTO (RI-USATO COME DESCRIZIONE)
    "field_DESCRIZIONEBREVE",                           // 161: campo_DESCRIZIONE
    new JLabel("Descrizione breve"),                    // 162: campo_LABEL
    20,                                                 // 163: campo_LABEL_X
    70,                                                 // 164: campo_LABEL_Y
    160,                                                // 165: campo_LABEL_L
    22,                                                 // 166: campo_LABEL_H
    Color.white,                                        // 167: campo_LABEL_FOREGROUND
    Color.gray.darker(),                                // 168: campo_LABEL_BACKGROUND
    new Font("COURIER NEW", Font.PLAIN, 14),            // 169: campo_LABEL_FONT
    null,                                               // 170: campo_LABEL_TOOLTIPTEXT
    null,                                               // 171: campo_LABEL_POPUPMENU (MouseListener)
    null, null, null, null, null, null, null, null,     // 172-179
    null,                                               // 180: campo_20
    new JTextField(""),                                 // 181: campo_COMPONENTE
    "Descrizione breve",                                // 182: campo_VALORE
    185,                                                // 183: campo_X
    70,                                                 // 184: campo_Y
    270,                                                // 185: campo_L
    22,                                                 // 186: campo_H
    true,                                               // 187: campo_ENABLED
    true,                                               // 188: campo_VISIBLE
    Color.red,                                          // 189: campo_FOREGROUND
    Color.yellow,                                       // 190: campo_BACKGROUND
    "Mettere qui la descrizione breve che verra' utilizzato per ... bho!!!", // 191: campo_TOOLTIPTEXT
    null,                                               // 192: campo_ACTIONLISTENER
    new Font("COURIER NEW", Font.PLAIN, 12),            // 193: campo_COMPONENTE_FONT
    null,                                               // 194: campo_COMPONENTE_IMAGE
    null, null, null,                                   // 195-197
    null, null, null, null, null, null, null, null, null, null, // 198-207
    null, null, null, null, null, null, null, null, null, null, // 208-217
    null, null, null, null, null, null, null, null, null, null, // 218-227
    null, null, null, null, null, null, null, null, null, null, // 228-237
    null, null,                                         // 238-239

    // ==================== BLOCCO 3: field_DATIDESCRITTIVIEQTA (Indici 240-319) ====================
    "field_DATIDESCRITTIVIEQTA",                        // 240: campo_VUOTO (RI-USATO COME DESCRIZIONE)
    "field_DATIDESCRITTIVIEQTA",                        // 241: campo_DESCRIZIONE
    null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, // 242-261 (label e vari campi a null)
    new JButton(""),                                    // 262: campo_COMPONENTE (Nota: indice corretto per campo21)
    "Dati descrittivi",                                 // 263: campo_VALORE
    20,                                                 // 264: campo_X
    110,                                                // 265: campo_Y
    180,                                                // 266: campo_L
    27,                                                 // 267: campo_H
    true,                                               // 268: campo_ENABLED
    true,                                               // 269: campo_VISIBLE
    null,                                               // 270: campo_FOREGROUND
    null,                                               // 271: campo_BACKGROUND
    "Mettere qui la descrizione breve che verra' utilizzato per ... bho!!!", // 272: campo_TOOLTIPTEXT
    new voidDatiDescrittiviEQta(),                      // 273: campo_ACTIONLISTENER
    new Font("COURIER NEW", Font.BOLD, 15),             // 274: campo_COMPONENTE_FONT
    null,                                               // 275: campo_COMPONENTE_IMAGE
    null, null, null,                                   // 276-278
    null, null, null, null, null, null, null, null, null, null, // 279-288
    null, null, null, null, null, null, null, null, null, null, // 289-298
    null, null, null, null, null, null, null, null, null, null, // 299-308
    null, null, null, null, null, null, null, null, null, null, // 309-318
    null,                                               // 319

    // ==================== BLOCCO 4: field_DATISTATISTICI (Indici 320-399) ====================
    "field_DATISTATISTICI",                             // 320: campo_VUOTO (RI-USATO COME DESCRIZIONE)
    "field_DATISTATISTICI",                             // 321: campo_DESCRIZIONE
    null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, // 322-341 (label e vari campi a null)
    new JButton(""),                                    // 342: campo_COMPONENTE
    "Dati statistici",                                  // 343: campo_VALORE
    210,                                                // 344: campo_X
    110,                                                // 345: campo_Y
    180,                                                // 346: campo_L
    27,                                                 // 347: campo_H
    true,                                               // 348: campo_ENABLED
    true,                                               // 349: campo_VISIBLE
    Color.white.darker(),                               // 350: campo_FOREGROUND
    null,                                               // 351: campo_BACKGROUND
    "Mettere qui la descrizione breve che verra' utilizzato per ... bho!!!", // 352: campo_TOOLTIPTEXT
    new voidDatiStatistici(),                           // 353: campo_ACTIONLISTENER
    new Font("COURIER NEW", Font.PLAIN, 13),            // 354: campo_COMPONENTE_FONT
    null,                                               // 355: campo_COMPONENTE_IMAGE
    null, null, null,                                   // 356-358
    null, null, null, null, null, null, null, null, null, null, // 359-368
    null, null, null, null, null, null, null, null, null, null, // 369-378
    null, null, null, null, null, null, null, null, null, null, // 379-388
    null, null, null, null, null, null, null, null, null, null, // 389-398
    null,                                               // 399

    // ==================== BLOCCO 5: field_DESCRIZIONEFATTURA (Indici 400-479) ====================
    "field_DESCRIZIONEFATTURA",                         // 400: campo_VUOTO (RI-USATO COME DESCRIZIONE)
    "field_DESCRIZIONEFATTURA",                         // 401: campo_DESCRIZIONE
    new JLabel("Descrizione fattura"),                  // 402: campo_LABEL
    20,                                                 // 403: campo_LABEL_X
    160,                                                // 404: campo_LABEL_Y
    160,                                                // 405: campo_LABEL_L
    22,                                                 // 406: campo_LABEL_H
    Color.white,                                        // 407: campo_LABEL_FOREGROUND
    Color.gray.darker(),                                // 408: campo_LABEL_BACKGROUND
    new Font("COURIER NEW", Font.PLAIN, 14),            // 409: campo_LABEL_FONT
    null,                                               // 410: campo_LABEL_TOOLTIPTEXT
    null,                                               // 411: campo_LABEL_POPUPMENU (MouseListener)
    null, null, null, null, null, null, null, null,     // 412-419
    null,                                               // 420: campo_20
    new JTextField(""),                                 // 421: campo_COMPONENTE
    "Descrizione da stampare in fattura",               // 422: campo_VALORE
    185,                                                // 423: campo_X
    160,                                                // 424: campo_Y
    270,                                                // 425: campo_L
    22,                                                 // 426: campo_H
    true,                                               // 427: campo_ENABLED
    true,                                               // 428: campo_VISIBLE
    null,                                               // 429: campo_FOREGROUND
    null,                                               // 430: campo_BACKGROUND
    "Mettere qui la descrizione che verra' stampata nella fattura (vale anche per la bolla)", // 431: campo_TOOLTIPTEXT
    null,                                               // 432: campo_ACTIONLISTENER
    new Font("COURIER NEW", Font.PLAIN, 12),            // 433: campo_COMPONENTE_FONT
    null,                                               // 434: campo_COMPONENTE_IMAGE
    null, null, null,                                   // 435-437
    null, null, null, null, null, null, null, null, null, null, // 438-447
    null, null, null, null, null, null, null, null, null, null, // 448-457
    null, null, null, null, null, null, null, null, null, null, // 458-467
    null, null, null, null, null, null, null, null, null, null, // 468-477
    null, null,                                         // 478-479

    // ==================== BLOCCO 6: field_DESCRIZIONELUNGA (Indici 480-559) ====================
    "field_DESCRIZIONELUNGA",                           // 480: campo_VUOTO (RI-USATO COME DESCRIZIONE)
    "field_DESCRIZIONELUNGA",                           // 481: campo_DESCRIZIONE
    new JLabel("Descrizione lunga"),                    // 482: campo_LABEL
    20,                                                 // 483: campo_LABEL_X
    190,                                                // 484: campo_LABEL_Y
    160,                                                // 485: campo_LABEL_L
    22,                                                 // 486: campo_LABEL_H
    Color.white,                                        // 487: campo_LABEL_FOREGROUND
    Color.gray.darker(),                                // 488: campo_LABEL_BACKGROUND
    new Font("COURIER NEW", Font.PLAIN, 14),            // 489: campo_LABEL_FONT
    null,                                               // 490: campo_LABEL_TOOLTIPTEXT
    null,                                               // 491: campo_LABEL_POPUPMENU (MouseListener)
    null, null, null, null, null, null, null, null,     // 492-499
    null,                                               // 500: campo_20
    new JTextArea(""),                                  // 501: campo_COMPONENTE
    "Descrizione lunga",                                // 502: campo_VALORE
    185,                                                // 503: campo_X
    190,                                                // 504: campo_Y
    270,                                                // 505: campo_L
    120,                                                // 506: campo_H
    true,                                               // 507: campo_ENABLED
    true,                                               // 508: campo_VISIBLE
    null,                                               // 509: campo_FOREGROUND
    null,                                               // 510: campo_BACKGROUND
    "La descrizione lunga e' utile per capire tutto del prodotto", // 511: campo_TOOLTIPTEXT
    null,                                               // 512: campo_ACTIONLISTENER
    new Font("COURIER NEW", Font.PLAIN, 12),            // 513: campo_COMPONENTE_FONT
    null,                                               // 514: campo_COMPONENTE_IMAGE
    null, null, null,                                   // 515-517
    null, null, null, null, null, null, null, null, null, null, // 518-527
    null, null, null, null, null, null, null, null, null, null, // 528-537
    null, null, null, null, null, null, null, null, null, null, // 538-547
    null, null, null, null, null, null, null, null, null, null, // 548-557
    null, null,                                         // 558-559

    // ==================== BLOCCO 7: field_COMBOUNITADIMISURA (Indici 560-639) ====================
    "field_COMBOUNITADIMISURA",                         // 560: campo_VUOTO (RI-USATO COME DESCRIZIONE)
    "field_COMBOUNITADIMISURA",                         // 561: campo_DESCRIZIONE
    new JLabel("Unita' di misura"),                     // 562: campo_LABEL
    20,                                                 // 563: campo_LABEL_X
    320,                                                // 564: campo_LABEL_Y
    160,                                                // 565: campo_LABEL_L
    22,                                                 // 566: campo_LABEL_H
    Color.white,                                        // 567: campo_LABEL_FOREGROUND
    Color.gray.darker(),                                // 568: campo_LABEL_BACKGROUND
    new Font("COURIER NEW", Font.PLAIN, 14),            // 569: campo_LABEL_FONT
    null,                                               // 570: campo_LABEL_TOOLTIPTEXT
    null,                                               // 571: campo_LABEL_POPUPMENU (MouseListener)
    null, null, null, null, null, null, null, null,     // 572-579
    null,                                               // 580: campo_20
    // 581: campo_COMPONENTE - JComboBox
    new JComboBox<Object>(new Vector<String>(Arrays.asList("Pezzi", "Kili", "Grammi", "Metri", "Mq")).toArray()),
    "Unita' di misura",                                 // 582: campo_VALORE
    185,                                                // 583: campo_X
    320,                                                // 584: campo_Y
    270,                                                // 585: campo_L
    22,                                                 // 586: campo_H
    true,                                               // 587: campo_ENABLED
    true,                                               // 588: campo_VISIBLE
    null,                                               // 589: campo_FOREGROUND
    null,                                               // 590: campo_BACKGROUND
    "Unita' di misrura utilizzata",                     // 591: campo_TOOLTIPTEXT
    null,                                               // 592: campo_ACTIONLISTENER
    new Font("COURIER NEW", Font.PLAIN, 12),            // 593: campo_COMPONENTE_FONT
    null,                                               // 594: campo_COMPONENTE_IMAGE
    null, null, null,                                   // 595-597
    null, null, null, null, null, null, null, null, null, null, // 598-607
    null, null, null, null, null, null, null, null, null, null, // 608-617
    null, null, null, null, null, null, null, null, null, null, // 618-627
    null, null, null, null, null, null, null, null, null, null, // 628-637
    null, null,                                         // 638-639

    // ==================== BLOCCO 8: field_COMBOFORNITORE (Indici 640-719) ====================
    "field_COMBOFORNITORE",                             // 640: campo_VUOTO (RI-USATO COME DESCRIZIONE)
    "field_COMBOFORNITORE",                             // 641: campo_DESCRIZIONE
    new JLabel("Fornitore"),                            // 642: campo_LABEL
    20,                                                 // 643: campo_LABEL_X
    350,                                                // 644: campo_LABEL_Y
    160,                                                // 645: campo_LABEL_L
    22,                                                 // 646: campo_LABEL_H
    Color.white,                                        // 647: campo_LABEL_FOREGROUND
    Color.gray.darker(),                                // 648: campo_LABEL_BACKGROUND
    new Font("COURIER NEW", Font.PLAIN, 14),            // 649: campo_LABEL_FONT
    null,                                               // 650: campo_LABEL_TOOLTIPTEXT
    null,                                               // 651: campo_LABEL_POPUPMENU (MouseListener)
    null, null, null, null, null, null, null, null,     // 652-659
    null,                                               // 660: campo_20
    // 661: campo_COMPONENTE - JComboBox
    new JComboBox<Object>(new Vector<String>(Arrays.asList("Fornitore 1", "Fornitore 2", "Fornitore 3", "Fornitore 4")).toArray()),
    "Fornitore",                                        // 662: campo_VALORE
    185,                                                // 663: campo_X
    350,                                                // 664: campo_Y
    270,                                                // 665: campo_L
    22,                                                 // 666: campo_H
    true,                                               // 667: campo_ENABLED
    true,                                               // 668: campo_VISIBLE
    null,                                               // 669: campo_FOREGROUND
    null,                                               // 670: campo_BACKGROUND
    "Fornitore del materiale",                          // 671: campo_TOOLTIPTEXT
    null,                                               // 672: campo_ACTIONLISTENER
    new Font("COURIER NEW", Font.PLAIN, 12),            // 673: campo_COMPONENTE_FONT
    null,                                               // 674: campo_COMPONENTE_IMAGE
    null, null, null,                                   // 675-677
    null, null, null, null, null, null, null, null, null, null, // 678-687
    null, null, null, null, null, null, null, null, null, null, // 688-697
    null, null, null, null, null, null, null, null, null, null, // 698-707
    null, null, null, null, null, null, null, null, null, null, // 708-717
    null, null,                                         // 718-719

    // ==================== BLOCCO 9: field_QTAALLMAG (Indici 720-799) ====================
    "field_QTAALLMAG",                                  // 720: campo_VUOTO (RI-USATO COME DESCRIZIONE)
    "field_QTAALLMAG",                                  // 721: campo_DESCRIZIONE
    new JLabel("Quantita' :"),                          // 722: campo_LABEL
    20,                                                 // 723: campo_LABEL_X
    380,                                                // 724: campo_LABEL_Y
    160,                                                // 725: campo_LABEL_L
    22,                                                 // 726: campo_LABEL_H
    Color.white,                                        // 727: campo_LABEL_FOREGROUND
    Color.gray.darker(),                                // 728: campo_LABEL_BACKGROUND
    new Font("COURIER NEW", Font.PLAIN, 14),            // 729: campo_LABEL_FONT
    "Start con 'Attiva vendita'",                       // 730: campo_LABEL_TOOLTIPTEXT
    null,                                               // 731: campo_LABEL_POPUPMENU (MouseListener)
    null, null, null, null, null, null, null, null,     // 732-739
    null,                                               // 740: campo_20
    new JTextField(),                                   // 741: campo_COMPONENTE
    "1.210",                                            // 742: campo_VALORE
    185,                                                // 743: campo_X
    380,                                                // 744: campo_Y
    270,                                                // 745: campo_L
    22,                                                 // 746: campo_H
    true,                                               // 747: campo_ENABLED
    true,                                               // 748: campo_VISIBLE
    Color.red.darker(),                                 // 749: campo_FOREGROUND
    Color.yellow,                                       // 750: campo_BACKGROUND
    "ToolTipText JProgressBar 1 F1",                    // 751: campo_TOOLTIPTEXT
    null,                                               // 752: campo_ACTIONLISTENER
    null,                                               // 753: campo_COMPONENTE_FONT
    null,                                               // 754: campo_COMPONENTE_IMAGE
    null, null, null,                                   // 755-757
    null, null, null, null, null, null, null, null, null, null, // 758-767
    null, null, null, null, null, null, null, null, null, null, // 768-777
    null, null, null, null, null, null, null, null, null, null, // 778-787
    null, null, null, null, null, null, null, null, null, null, // 788-797
    null, null,                                         // 798-799

    // ==================== BLOCCO 10: field_BARRAQTA (Indici 800-879) ====================
    "Test JPtogressBar 1 F1 - Start con 'Attiva vendita'", // 800: campo_VUOTO (RI-USATO COME DESCRIZIONE)
    "Test JPtogressBar 1 F1 - Start con 'Attiva vendita'", // 801: campo_DESCRIZIONE
    new JLabel("JProgressBar 1 F1:"),                   // 802: campo_LABEL
    20,                                                 // 803: campo_LABEL_X
    410,                                                // 804: campo_LABEL_Y
    160,                                                // 805: campo_LABEL_L
    22,                                                 // 806: campo_LABEL_H
    Color.white,                                        // 807: campo_LABEL_FOREGROUND
    Color.gray.darker(),                                // 808: campo_LABEL_BACKGROUND
    new Font("COURIER NEW", Font.PLAIN, 14),            // 809: campo_LABEL_FONT
    "Start con 'Attiva vendita'",                       // 810: campo_LABEL_TOOLTIPTEXT
    null,                                               // 811: campo_LABEL_POPUPMENU (MouseListener)
    null, null, null, null, null, null, null, null,     // 812-819
    null,                                               // 820: campo_20
    new JProgressBar(),                                 // 821: campo_COMPONENTE
    true,                                               // 822: campo_VALORE
    185,                                                // 823: campo_X
    410,                                                // 824: campo_Y
    270,                                                // 825: campo_L
    22,                                                 // 826: campo_H
    true,                                               // 827: campo_ENABLED
    true,                                               // 828: campo_VISIBLE
    Color.red.darker(),                                 // 829: campo_FOREGROUND
    Color.yellow,                                       // 830: campo_BACKGROUND
    "ToolTipText JProgressBar 1 F1",                    // 831: campo_TOOLTIPTEXT
    null,                                               // 832: campo_ACTIONLISTENER
    null,                                               // 833: campo_COMPONENTE_FONT
    null,                                               // 834: campo_COMPONENTE_IMAGE
    0,                                                  // 835: campo_MINIMUM_JPROGRESSBAR
    100,                                                // 836: campo_MAXIMUM_JPROGRESSBAR
    75,                                                 // 837: campo_VALUE_JPROGRESSBAR
    null, null, null,                                   // 838-840
    null, null, null, null, null, null, null, null, null, null, // 841-850
    null, null, null, null, null, null, null, null, null, null, // 851-860
    null, null, null, null, null, null, null, null, null, null, // 861-870
    null, null, null, null, null, null, null, null, null,      // 871-879

    // ==================== BLOCCO 11: field_TABELLADITEST (Indici 880-959) ====================
    "Test JTable 1 F1",                                 // 880: campo_VUOTO (RI-USATO COME DESCRIZIONE)
    "Test JTable 1 F1",                                 // 881: campo_DESCRIZIONE
    new JLabel("JTable 1 F1:"),                         // 882: campo_LABEL
    20,                                                 // 883: campo_LABEL_X
    440,                                                // 884: campo_LABEL_Y
    160,                                                // 885: campo_LABEL_L
    22,                                                 // 886: campo_LABEL_H
    Color.white,                                        // 887: campo_LABEL_FOREGROUND
    Color.gray.darker(),                                // 888: campo_LABEL_BACKGROUND
    new Font("COURIER NEW", Font.PLAIN, 14),            // 889: campo_LABEL_FONT
    "Gestione di una JTable di test",                   // 890: campo_LABEL_TOOLTIPTEXT
    null,                                               // 891: campo_LABEL_POPUPMENU (MouseListener)
    null, null, null, null, null, null, null, null,     // 892-899
    null,                                               // 900: campo_20
    new JTable(),                                       // 901: campo_COMPONENTE
    null,                                               // 902: campo_VALORE
    185,                                                // 903: campo_X
    440,                                                // 904: campo_Y
    270,                                                // 905: campo_L
    122,                                                // 906: campo_H
    true,                                               // 907: campo_ENABLED
    true,                                               // 908: campo_VISIBLE
    Color.red.darker(),                                 // 909: campo_FOREGROUND
    Color.yellow,                                       // 910: campo_BACKGROUND
    null,                                               // 911: campo_TOOLTIPTEXT
    null,                                               // 912: campo_ACTIONLISTENER
    null,                                               // 913: campo_COMPONENTE_FONT
    null,                                               // 914: campo_COMPONENTE_IMAGE
    0,                                                  // 915: campo_MINIMUM_JPROGRESSBAR
    100,                                                // 916: campo_MAXIMUM_JPROGRESSBAR
    75,                                                 // 917: campo_VALUE_JPROGRESSBAR
    null,                                               // 918: campo_38 (componente fileSoundAtClick)
    // Il modello della tabella verrà impostato dopo la creazione del vettore, come nel codice originale
    null, null, null, null, null, null, null, null, null, null, // 919-928
    null, null, null, null, null, null, null, null, null, null, // 929-938
    null, null, null, null, null, null, null, null, null, null, // 939-948
    null, null, null, null, null, null, null, null, null, null, // 949-958
    null ,                                               // 959




    // ==================== BLOCCO 12: field_FileDD (Indici 960-1039) ====================
    "field_FileDD",                                     // 960: campo_VUOTO (RI-USATO COME DESCRIZIONE)
    "field_FileDD",                                     // 961: campo_DESCRIZIONE
    null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, // 962-981 (label e vari campi a null)
    new JButton(""),                                    // 982: campo_COMPONENTE
    "File DD",                                          // 983: campo_VALORE
    800,                                                // 984: campo_X
    20,                                                 // 985: campo_Y
    180,                                                // 986: campo_L
    27,                                                 // 987: campo_H
    true,                                               // 988: campo_ENABLED
    true,                                               // 989: campo_VISIBLE
    Color.white.darker(),                               // 990: campo_FOREGROUND
    null,                                               // 991: campo_BACKGROUND
    "Mettere qui la descrizione breve che verra' utilizzato per ... file!!!", // 992: campo_TOOLTIPTEXT
    new voidFileDD(),                                   // 993: campo_ACTIONLISTENER
    new Font("COURIER NEW", Font.PLAIN, 13),            // 994: campo_COMPONENTE_FONT
    null,                                               // 995: campo_COMPONENTE_IMAGE
    null, null, null,                                   // 996-998
    null, null, null, null, null, null, null, null, null, null, // 999-1008
    null, null, null, null, null, null, null, null, null, null, // 1009-1018
    null, null, null, null, null, null, null, null, null, null, // 1019-1028
    null, null, null, null, null, null, null, null, null, null, // 1029-1038
    null,                                               // 1039

    // ==================== BLOCCO 13: field_FileDropper (Indici 1040-1119) ====================
    "field_FileDropper",                                // 1040: campo_VUOTO (RI-USATO COME DESCRIZIONE)
    "field_FileDropper",                                // 1041: campo_DESCRIZIONE
    null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, // 1042-1061 (label e vari campi a null)
    new JButton(""),                                    // 1062: campo_COMPONENTE
    "File Dropper",                                     // 1063: campo_VALORE
    800,                                                // 1064: campo_X
    60,                                                 // 1065: campo_Y
    180,                                                // 1066: campo_L
    27,                                                 // 1067: campo_H
    true,                                               // 1068: campo_ENABLED
    true,                                               // 1069: campo_VISIBLE
    Color.white.darker(),                               // 1070: campo_FOREGROUND
    null,                                               // 1071: campo_BACKGROUND
    "Mettere qui la descrizione breve che verra' utilizzato per ... file!!!", // 1072: campo_TOOLTIPTEXT
    new voidFileDropper(),                              // 1073: campo_ACTIONLISTENER
    new Font("COURIER NEW", Font.PLAIN, 13),            // 1074: campo_COMPONENTE_FONT
    null,                                               // 1075: campo_COMPONENTE_IMAGE
    null, null, null,                                   // 1076-1078
    null, null, null, null, null, null, null, null, null, null, // 1079-1088
    null, null, null, null, null, null, null, null, null, null, // 1089-1098
    null, null, null, null, null, null, null, null, null, null, // 1099-1108
    null, null, null, null, null, null, null, null, null, null, // 1109-1118
    null,                                               // 1119

    // ==================== BLOCCO 14: field_FileDD_HEX (Indici 1120-1199) ====================
    ">field_FileDD_HEX",                                // 1120: campo_VUOTO (RI-USATO COME DESCRIZIONE)
    ">field_FileDD_HEX",                                // 1121: campo_DESCRIZIONE
    null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, // 1122-1141 (label e vari campi a null)
    new JButton(""),                                    // 1142: campo_COMPONENTE
    "File DD HEX",                                      // 1143: campo_VALORE
    800,                                                // 1144: campo_X
    100,                                                // 1145: campo_Y
    180,                                                // 1146: campo_L
    27,                                                 // 1147: campo_H
    true,                                               // 1148: campo_ENABLED
    true,                                               // 1149: campo_VISIBLE
    Color.white.darker(),                               // 1150: campo_FOREGROUND
    null,                                               // 1151: campo_BACKGROUND
    "Visualizza in HEX i file in Drop!!!",              // 1152: campo_TOOLTIPTEXT
    new voidFileDropperHex(),                           // 1153: campo_ACTIONLISTENER
    new Font("COURIER NEW", Font.PLAIN, 13),            // 1154: campo_COMPONENTE_FONT
    null,                                               // 1155: campo_COMPONENTE_IMAGE
    null, null, null,                                   // 1156-1158
    null, null, null, null, null, null, null, null, null, null, // 1159-1168
    null, null, null, null, null, null, null, null, null, null, // 1169-1178
    null, null, null, null, null, null, null, null, null, null, // 1179-1188
    null, null, null, null, null, null, null, null, null, null, // 1189-1198
    null,                                               // 1199

    // ==================== BLOCCO 15: PASSWORD (Indici 1200-1279) ====================
    "campo numero 16 frame1",                           // 1200: campo_VUOTO (RI-USATO COME DESCRIZIONE)
    "campo numero 16 frame1",                           // 1201: campo_DESCRIZIONE
    new JLabel("Password:"),                            // 1202: campo_LABEL
    800,                                                // 1203: campo_LABEL_X
    140,                                                // 1204: campo_LABEL_Y
    160,                                                // 1205: campo_LABEL_L
    30,                                                 // 1206: campo_LABEL_H
    Color.white,                                        // 1207: campo_LABEL_FOREGROUND
    Color.gray.darker(),                                // 1208: campo_LABEL_BACKGROUND
    new Font("COURIER NEW", Font.PLAIN, 18),            // 1209: campo_LABEL_FONT
    "Password di accesso al DBase",                     // 1210: campo_LABEL_TOOLTIPTEXT
    null,                                               // 1211: campo_LABEL_POPUPMENU (MouseListener)
    null, null, null, null, null, null, null, null,     // 1212-1219
    null,                                               // 1220: campo_20
    new JPasswordField("Test  campo 16 f1"),            // 1221: campo_COMPONENTE
    "luxlux60",                                         // 1222: campo_VALORE
    970,                                                // 1223: campo_X
    140,                                                // 1224: campo_Y
    270,                                                // 1225: campo_L
    30,                                                 // 1226: campo_H
    true,                                               // 1227: campo_ENABLED
    true,                                               // 1228: campo_VISIBLE
    null,                                               // 1229: campo_FOREGROUND
    null,                                               // 1230: campo_BACKGROUND
    "<html><font color=blue>PASSWORD di accesso al DBase.<BR>Chiama il numero verde <font color=red>000 000 000<font color=blue> in caso di problemi di accesso</font></html>", // 1231: campo_TOOLTIPTEXT
    null,                                               // 1232: campo_ACTIONLISTENER
    null,                                               // 1233: campo_COMPONENTE_FONT
    null,                                               // 1234: campo_COMPONENTE_IMAGE
    null, null, null,                                   // 1235-1237
    null, null, null, null, null, null, null, null, null, null, // 1238-1247
    null, null, null, null, null, null, null, null, null, null, // 1248-1257
    null, null, null, null, null, null, null, null, null, null, // 1258-1267
    null, null, null, null, null, null, null, null, null, null, // 1268-1277
    null, null,                                         // 1278-1279

    // ==================== BLOCCO 16: CHECKBOX PASSWORD (Indici 1280-1359) ====================
    "campo numero 17 frame1",                           // 1280: campo_VUOTO (RI-USATO COME DESCRIZIONE)
    "campo numero 17 frame1",                           // 1281: campo_DESCRIZIONE
    new JLabel("Inserimento password?:"),               // 1282: campo_LABEL
    800,                                                // 1283: campo_LABEL_X
    180,                                                // 1284: campo_LABEL_Y
    160,                                                // 1285: campo_LABEL_L
    30,                                                 // 1286: campo_LABEL_H
    Color.white,                                        // 1287: campo_LABEL_FOREGROUND
    Color.gray.darker(),                                // 1288: campo_LABEL_BACKGROUND
    new Font("COURIER NEW", Font.PLAIN, 18),            // 1289: campo_LABEL_FONT
    "Abilita il campo per inserimento della Password di accesso al DBase", // 1290: campo_LABEL_TOOLTIPTEXT
    null,                                               // 1291: campo_LABEL_POPUPMENU (MouseListener)
    null, null, null, null, null, null, null, null,     // 1292-1299
    null,                                               // 1300: campo_20
    new JCheckBox("Test  campo 17 f1"),                 // 1301: campo_COMPONENTE
    true,                                               // 1302: campo_VALORE
    960,                                                // 1303: campo_X
    180,                                                // 1304: campo_Y
    270,                                                // 1305: campo_L
    30,                                                 // 1306: campo_H
    true,                                               // 1307: campo_ENABLED
    true,                                               // 1308: campo_VISIBLE
    null,                                               // 1309: campo_FOREGROUND
    null,                                               // 1310: campo_BACKGROUND
    "<html><font color=blue>Abilita la visualizzazione della PASSWORD di accesso al DBase.<BR>Chiama il numero verde <font color=red>000 000 000<font color=blue> in caso di problemi di accesso</font></html>", // 1311: campo_TOOLTIPTEXT
    new voidQuartoMyActListener(),                      // 1312: campo_ACTIONLISTENER
    null,                                               // 1313: campo_COMPONENTE_FONT
    null,                                               // 1314: campo_COMPONENTE_IMAGE
    null, null, null,                                   // 1315-1317
    null, null, null, null, null, null, null, null, null, null, // 1318-1327
    null, null, null, null, null, null, null, null, null, null, // 1328-1337
    null, null, null, null, null, null, null, null, null, null, // 1338-1347
    null, null, null, null, null, null, null, null, null, null, // 1348-1357
    null, null,                                         // 1358-1359

    // ==================== BLOCCO 17: IMMAGINE (Indici 1360-1439) ====================
    "campo numero 18 frame1",                           // 1360: campo_VUOTO
    "campo numero 18 frame1",                           // 1361: campo_DESCRIZIONE
    new JLabel("Gestione jpeg: "),                      // 1362: campo_LABEL
    800,                                                // 1363: campo_LABEL_X
    220,                                                // 1364: campo_LABEL_Y
    160,                                                // 1365: campo_LABEL_L
    20,                                                 // 1366: campo_LABEL_H
    Color.white,                                        // 1367: campo_LABEL_FOREGROUND
    Color.gray.darker(),                                // 1368: campo_LABEL_BACKGROUND
    new Font("COURIER NEW", Font.PLAIN, 16),            // 1369: campo_LABEL_FONT
    "ImageIcon",                                        // 1370: campo_LABEL_TOOLTIPTEXT
    null,                                               // 1371: campo_LABEL_POPUPMENU
    null, null, null, null, null, null, null, null,     // 1372-1379
    null,                                               // 1380: campo_20
    new ImageIcon("fotolucio.jpg"),                     // 1381: campo_COMPONENTE
    null,                                               // 1382: campo_VALORE
    800,                                                // 1383: campo_X
    250,                                                // 1384: campo_Y
    270,                                                // 1385: campo_L
    20,                                                 // 1386: campo_H
    true,                                               // 1387: campo_ENABLED
    true,                                               // 1388: campo_VISIBLE
    null,                                               // 1389: campo_FOREGROUND
    null,                                               // 1390: campo_BACKGROUND
    "<html><font color=blue>ImageIcon.<BR>Chiama il numero verde <font color=red>000 000 000<font color=blue> in caso di problemi di accesso</font></html>", // 1391: campo_TOOLTIPTEXT
    new voidQuartoMyActListener(),                      // 1392: campo_ACTIONLISTENER
    null,                                               // 1393: campo_COMPONENTE_FONT
    null,                                               // 1394: campo_COMPONENTE_IMAGE
    null, null, null,                                   // 1395-1397
    null, null, null,                                   // 1398-1400
    new JLabel(),                                       // 1401: campo_JLabel_ImageIcon1  <-- QUI! (era 1409)
    null,                                               // 1402: campo_ImageIcon1
    null, null, null, null, null, null, null, null, null, null, // 1403-1412
    null, null, null, null, null, null, null, null, null, null, // 1413-1422
    null, null, null, null, null, null, null, null, null, null, // 1423-1432
    null, null, null, null, null, null, null            // 1433-1439
    
));	
// END	campo1 //	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
// START	campo2 //	
// SOSTITUISCI QUESTA RIGA:
// public static Vector<Object> campo2 = new Vector<Object>();
// CON QUESTO NUOVO BLOCCO:

public static Vector<Object> campo2 = new Vector<>(Arrays.asList(
    // ==================== BLOCCO 0: PRIMO CAMPO (Indici 0-79) ====================
    "",                                                 // 0: campo_VUOTO
    "campo numero 01 frame2",                           // 1: campo_DESCRIZIONE
    new JLabel("Label1:"),                              // 2: campo_LABEL
    20,                                                 // 3: campo_LABEL_X
    20,                                                 // 4: campo_LABEL_Y
    100,                                                // 5: campo_LABEL_L
    30,                                                 // 6: campo_LABEL_H
    Color.white,                                        // 7: campo_LABEL_FOREGROUND
    Color.gray.darker(),                                // 8: campo_LABEL_BACKGROUND
    new Font("COURIER NEW", Font.PLAIN, 18),            // 9: campo_LABEL_FONT
    null,                                               // 10: campo_LABEL_TOOLTIPTEXT
    null,                                               // 11: campo_LABEL_POPUPMENU
    null, null, null, null, null, null, null, null,     // 12-19
    null,                                               // 20: campo_20
    new JTextField("Test campo 1"),                     // 21: campo_COMPONENTE
    "Testo del campo numero 1",                         // 22: campo_VALORE
    125,                                                // 23: campo_X
    20,                                                 // 24: campo_Y
    200,                                                // 25: campo_L
    30,                                                 // 26: campo_H
    true,                                               // 27: campo_ENABLED
    true,                                               // 28: campo_VISIBLE
    null,                                               // 29: campo_FOREGROUND
    null,                                               // 30: campo_BACKGROUND
    "ToolTipText primo frame1",                         // 31: campo_TOOLTIPTEXT
    null,                                               // 32: campo_ACTIONLISTENER
    null,                                               // 33: campo_COMPONENTE_FONT
    null,                                               // 34: campo_COMPONENTE_IMAGE
    null, null, null,                                   // 35-37
    null,                                               // 38
    null,                                               // 39
    null, null, null, null, null, null, null, null, null, null, // 40-49 (10 null)
    null, null, null, null, null, null, null, null, null, null, // 50-59 (10 null)
    null, null, null, null, null, null, null, null, null, null, // 60-69 (10 null)
    null, null, null, null, null, null, null, null, null, null, // 70-79 (10 null)

    // ==================== BLOCCO 1: SECONDO CAMPO (Indici 80-159) ====================
    "",                                                 // 80: campo_VUOTO (riuso)
    "campo numero 02 frame2",                           // 81: campo_DESCRIZIONE
    new JLabel("Label2:"),                              // 82: campo_LABEL
    200,                                                // 83: campo_LABEL_X
    300,                                                // 84: campo_LABEL_Y
    100,                                                // 85: campo_LABEL_L
    30,                                                 // 86: campo_LABEL_H
    Color.white,                                        // 87: campo_LABEL_FOREGROUND
    Color.gray.darker(),                                // 88: campo_LABEL_BACKGROUND
    new Font("COURIER NEW", Font.PLAIN, 18),            // 89: campo_LABEL_FONT
    null,                                               // 90: campo_LABEL_TOOLTIPTEXT
    null,                                               // 91: campo_LABEL_POPUPMENU
    null, null, null, null, null, null, null, null,     // 92-99
    null,                                               // 100: campo_20
    new JTextField("Test campo 2 f2"),                  // 101: campo_COMPONENTE
    "Testo del campo numero 2",                         // 102: campo_VALORE
    310,                                                // 103: campo_X
    300,                                                // 104: campo_Y
    200,                                                // 105: campo_L
    30,                                                 // 106: campo_H
    true,                                               // 107: campo_ENABLED
    true,                                               // 108: campo_VISIBLE
    null,                                               // 109: campo_FOREGROUND
    null,                                               // 110: campo_BACKGROUND
    "ToolTipText primo frame2",                         // 111: campo_TOOLTIPTEXT
    null,                                               // 112: campo_ACTIONLISTENER
    null,                                               // 113: campo_COMPONENTE_FONT
    null,                                               // 114: campo_COMPONENTE_IMAGE
    null, null, null, null, null, null, null, null, null, null, // 115-124
    null, null, null, null, null, null, null, null, null, null, // 125-134
    null, null, null, null, null, null, null, null, null, null, // 135-144
    null, null, null, null, null, null, null, null, null, null, // 145-154
    null, null, null, null, null,                       // 155-159

    // ==================== BLOCCO 2: TERZO CAMPO (Indici 160-239) ====================
    "",                                                 // 160: campo_VUOTO
    "campo numero 03 frame2",                           // 161: campo_DESCRIZIONE
    new JLabel("Label3:"),                              // 162: campo_LABEL
    200,                                                // 163: campo_LABEL_X
    500,                                                // 164: campo_LABEL_Y
    100,                                                // 165: campo_LABEL_L
    30,                                                 // 166: campo_LABEL_H
    Color.white,                                        // 167: campo_LABEL_FOREGROUND
    Color.cyan.darker(),                                // 168: campo_LABEL_BACKGROUND
    new Font("COURIER NEW", Font.PLAIN, 14),            // 169: campo_LABEL_FONT
    null,                                               // 170: campo_LABEL_TOOLTIPTEXT
    null,                                               // 171: campo_LABEL_POPUPMENU
    null, null, null, null, null, null, null, null,     // 172-179
    null,                                               // 180: campo_20
    new JCheckBox("Test campo 3 f2"),                   // 181: campo_COMPONENTE
    true,                                               // 182: campo_VALORE
    310,                                                // 183: campo_X
    500,                                                // 184: campo_Y
    200,                                                // 185: campo_L
    30,                                                 // 186: campo_H
    true,                                               // 187: campo_ENABLED
    true,                                               // 188: campo_VISIBLE
    null,                                               // 189: campo_FOREGROUND
    null,                                               // 190: campo_BACKGROUND
    "ToolTipText terzo frame2",                         // 191: campo_TOOLTIPTEXT
    new voidTerzoMyActListener(),                       // 192: campo_ACTIONLISTENER
    null,                                               // 193: campo_COMPONENTE_FONT
    null,                                               // 194: campo_COMPONENTE_IMAGE
    null, null, null, null, null, null, null, null, null, null, // 195-204
    null, null, null, null, null, null, null, null, null, null, // 205-214
    null, null, null, null, null, null, null, null, null, null, // 215-224
    null, null, null, null, null, null, null, null, null, null, // 225-234
    null, null, null, null, null,                       // 235-239

    // ==================== BLOCCO 3: QUARTO CAMPO (Indici 240-319) ====================
    "",                                                 // 240: campo_VUOTO
    "campo numero 04 frame2",                           // 241: campo_DESCRIZIONE
    new JLabel("Label4:"),                              // 242: campo_LABEL
    200,                                                // 243: campo_LABEL_X
    500,                                                // 244: campo_LABEL_Y
    100,                                                // 245: campo_LABEL_L
    30,                                                 // 246: campo_LABEL_H
    Color.white,                                        // 247: campo_LABEL_FOREGROUND
    Color.cyan.darker(),                                // 248: campo_LABEL_BACKGROUND
    new Font("COURIER NEW", Font.PLAIN, 10),            // 249: campo_LABEL_FONT
    null,                                               // 250: campo_LABEL_TOOLTIPTEXT
    null,                                               // 251: campo_LABEL_POPUPMENU
    null, null, null, null, null, null, null, null,     // 252-259
    null,                                               // 260: campo_20
    // Nota: il JComboBox richiede un Vector, ma Arrays.asList lo crea implicitamente
    new JComboBox<>(new Vector<>(Arrays.asList("Uno", "Due", "Tre"))), // 261: campo_COMPONENTE
    true,                                               // 262: campo_VALORE
    310,                                                // 263: campo_X
    600,                                                // 264: campo_Y
    200,                                                // 265: campo_L
    30,                                                 // 266: campo_H
    true,                                               // 267: campo_ENABLED
    true,                                               // 268: campo_VISIBLE
    Color.red.darker(),                                 // 269: campo_FOREGROUND
    Color.yellow,                                       // 270: campo_BACKGROUND
    "ToolTipText terzo frame2",                         // 271: campo_TOOLTIPTEXT
    new voidQuattroMyActListener(),                     // 272: campo_ACTIONLISTENER
    null,                                               // 273: campo_COMPONENTE_FONT
    null,                                               // 274: campo_COMPONENTE_IMAGE
    null, null, null, null, null, null, null, null, null, null, // 275-284
    null, null, null, null, null, null, null, null, null, null, // 285-294
    null, null, null, null, null, null, null, null, null, null, // 295-304
    null, null, null, null, null, null, null, null, null, null, // 305-314
    null, null, null, null, null,                       // 315-319

    // ==================== BLOCCO 4: QUINTO CAMPO (Indici 320-399) ====================
    "",                                                 // 320: campo_VUOTO
    "campo numero 05 frame2",                           // 321: campo_DESCRIZIONE
    new JLabel("JProgressBar 1:"),                      // 322: campo_LABEL
    20,                                                 // 323: campo_LABEL_X
    700,                                                // 324: campo_LABEL_Y
    100,                                                // 325: campo_LABEL_L
    30,                                                 // 326: campo_LABEL_H
    Color.white,                                        // 327: campo_LABEL_FOREGROUND
    Color.cyan.darker(),                                // 328: campo_LABEL_BACKGROUND
    new Font("COURIER NEW", Font.PLAIN, 10),            // 329: campo_LABEL_FONT
    null,                                               // 330: campo_LABEL_TOOLTIPTEXT
    null,                                               // 331: campo_LABEL_POPUPMENU
    null, null, null, null, null, null, null, null,     // 332-339
    null,                                               // 340: campo_20
    new JProgressBar(),                                 // 341: campo_COMPONENTE
    true,                                               // 342: campo_VALORE
    130,                                                // 343: campo_X
    700,                                                // 344: campo_Y
    100,                                                // 345: campo_L
    30,                                                 // 346: campo_H
    true,                                               // 347: campo_ENABLED
    true,                                               // 348: campo_VISIBLE
    Color.red.darker(),                                 // 349: campo_FOREGROUND
    Color.yellow,                                       // 350: campo_BACKGROUND
    "ToolTipText quinto frame2",                        // 351: campo_TOOLTIPTEXT
    null,                                               // 352: campo_ACTIONLISTENER
    null,                                               // 353: campo_COMPONENTE_FONT
    null,                                               // 354: campo_COMPONENTE_IMAGE
    0,                                                  // 355: campo_MINIMUM_JPROGRESSBAR
    100,                                                // 356: campo_MAXIMUM_JPROGRESSBAR
    75,                                                 // 357: campo_VALUE_JPROGRESSBAR
    null, null, null,                                   // 358-360
    null, null, null, null, null, null, null, null, null, null, // 361-370
    null, null, null, null, null, null, null, null, null, null, // 371-380
    null, null, null, null, null, null, null, null, null, null, // 381-390
    null, null, null, null, null, null, null, null, null,      // 391-399

    // ==================== BLOCCO 5: SESTO CAMPO (Indici 400-479) ====================
    "",                                                 // 400: campo_VUOTO
    "campo numero 06 frame2",                           // 401: campo_DESCRIZIONE
    new JLabel("JProgressBar 2:"),                      // 402: campo_LABEL
    20,                                                 // 403: campo_LABEL_X
    800,                                                // 404: campo_LABEL_Y
    100,                                                // 405: campo_LABEL_L
    30,                                                 // 406: campo_LABEL_H
    Color.white,                                        // 407: campo_LABEL_FOREGROUND
    Color.cyan.darker(),                                // 408: campo_LABEL_BACKGROUND
    new Font("COURIER NEW", Font.PLAIN, 10),            // 409: campo_LABEL_FONT
    null,                                               // 410: campo_LABEL_TOOLTIPTEXT
    null,                                               // 411: campo_LABEL_POPUPMENU
    null, null, null, null, null, null, null, null,     // 412-419
    null,                                               // 420: campo_20
    new JProgressBar(),                                 // 421: campo_COMPONENTE
    true,                                               // 422: campo_VALORE
    130,                                                // 423: campo_X
    800,                                                // 424: campo_Y
    100,                                                // 425: campo_L
    30,                                                 // 426: campo_H
    true,                                               // 427: campo_ENABLED
    true,                                               // 428: campo_VISIBLE
    Color.blue.darker(),                                // 429: campo_FOREGROUND
    Color.yellow,                                       // 430: campo_BACKGROUND
    "ToolTipText sesto frame2",                         // 431: campo_TOOLTIPTEXT
    null,                                               // 432: campo_ACTIONLISTENER
    null,                                               // 433: campo_COMPONENTE_FONT
    null,                                               // 434: campo_COMPONENTE_IMAGE
    0,                                                  // 435: campo_MINIMUM_JPROGRESSBAR
    100,                                                // 436: campo_MAXIMUM_JPROGRESSBAR
    25,                                                 // 437: campo_VALUE_JPROGRESSBAR
    null, null, null, null, null, null, null, null, null, null, // 438-447
    null, null, null, null, null, null, null, null, null, null, // 448-457
    null, null, null, null, null, null, null, null, null, null, // 458-467
    null, null, null, null, null, null, null, null, null, null, // 468-477
    null, null,                                         // 478-479

    // ==================== BLOCCO 6: SETTIMO CAMPO (Indici 480-559) ====================
    "",                                                 // 480: campo_VUOTO
    "campo numero 06 frame2",                           // 481: campo_DESCRIZIONE
    new JLabel("JProgressBar 3:"),                      // 482: campo_LABEL
    20,                                                 // 483: campo_LABEL_X
    900,                                                // 484: campo_LABEL_Y
    100,                                                // 485: campo_LABEL_L
    30,                                                 // 486: campo_LABEL_H
    Color.white,                                        // 487: campo_LABEL_FOREGROUND
    Color.cyan.darker(),                                // 488: campo_LABEL_BACKGROUND
    new Font("COURIER NEW", Font.PLAIN, 10),            // 489: campo_LABEL_FONT
    null,                                               // 490: campo_LABEL_TOOLTIPTEXT
    null,                                               // 491: campo_LABEL_POPUPMENU
    null, null, null, null, null, null, null, null,     // 492-499
    null,                                               // 500: campo_20
    new JProgressBar(),                                 // 501: campo_COMPONENTE
    true,                                               // 502: campo_VALORE
    130,                                                // 503: campo_X
    900,                                                // 504: campo_Y
    100,                                                // 505: campo_L
    30,                                                 // 506: campo_H
    true,                                               // 507: campo_ENABLED
    true,                                               // 508: campo_VISIBLE
    Color.green.darker(),                               // 509: campo_FOREGROUND
    Color.yellow,                                       // 510: campo_BACKGROUND
    "ToolTipText settimo frame2",                       // 511: campo_TOOLTIPTEXT
    null,                                               // 512: campo_ACTIONLISTENER
    null,                                               // 513: campo_COMPONENTE_FONT
    null,                                               // 514: campo_COMPONENTE_IMAGE
    0,                                                  // 515: campo_MINIMUM_JPROGRESSBAR
    100,                                                // 516: campo_MAXIMUM_JPROGRESSBAR
    25,                                                 // 517: campo_VALUE_JPROGRESSBAR
    null, null, null, null, null, null, null, null, null, null, // 518-527
    null, null, null, null, null, null, null, null, null, null, // 528-537
    null, null, null, null, null, null, null, null, null, null, // 538-547
    null, null, null, null, null, null, null, null, null, null, // 548-557
    null, null,                                         // 558-559

    // ==================== BLOCCO 7: OTTAVO CAMPO (Indici 560-639) ====================
    "",                                                 // 560: campo_VUOTO
    "campo numero 08 frame2",                           // 561: campo_DESCRIZIONE
    new JLabel("Label8:"),                              // 562: campo_LABEL
    600,                                                // 563: campo_LABEL_X
    300,                                                // 564: campo_LABEL_Y
    100,                                                // 565: campo_LABEL_L
    30,                                                 // 566: campo_LABEL_H
    Color.white,                                        // 567: campo_LABEL_FOREGROUND
    Color.gray.darker(),                                // 568: campo_LABEL_BACKGROUND
    new Font("COURIER NEW", Font.PLAIN, 18),            // 569: campo_LABEL_FONT
    null,                                               // 570: campo_LABEL_TOOLTIPTEXT
    null,                                               // 571: campo_LABEL_POPUPMENU
    null, null, null, null, null, null, null, null,     // 572-579
    null,                                               // 580: campo_20
    new JPasswordField("Test campo 8 f2"),              // 581: campo_COMPONENTE
    "Testo del campo numero 8",                         // 582: campo_VALORE
    710,                                                // 583: campo_X
    300,                                                // 584: campo_Y
    200,                                                // 585: campo_L
    30,                                                 // 586: campo_H
    true,                                               // 587: campo_ENABLED
    true,                                               // 588: campo_VISIBLE
    null,                                               // 589: campo_FOREGROUND
    null,                                               // 590: campo_BACKGROUND
    "ToolTipText ottavo PASSWORD frame2",               // 591: campo_TOOLTIPTEXT
    null,                                               // 592: campo_ACTIONLISTENER
    null,                                               // 593: campo_COMPONENTE_FONT
    null,                                               // 594: campo_COMPONENTE_IMAGE
    null, null, null, null, null, null, null, null, null, null, // 595-604
    null, null, null, null, null, null, null, null, null, null, // 605-614
    null, null, null, null, null, null, null, null, null, null, // 615-624
    null, null, null, null, null, null, null, null, null, null, // 625-634
    null, null, null, null, null,                       // 635-639

    // ==================== BLOCCO 8: NONO CAMPO (Indici 640-719) ====================
    "",                                                 // 640: campo_VUOTO
    "NOME LABEL",                                       // 641: campo_DESCRIZIONE
    new JLabel("Label9:"),                              // 642: campo_LABEL
    630,                                                // 643: campo_LABEL_X
    350,                                                // 644: campo_LABEL_Y
    100,                                                // 645: campo_LABEL_L
    30,                                                 // 646: campo_LABEL_H
    Color.white,                                        // 647: campo_LABEL_FOREGROUND
    Color.gray.darker(),                                // 648: campo_LABEL_BACKGROUND
    new Font("COURIER NEW", Font.PLAIN, 18),            // 649: campo_LABEL_FONT
    null,                                               // 650: campo_LABEL_TOOLTIPTEXT
    null,                                               // 651: campo_LABEL_POPUPMENU
    null, null, null, null, null, null, null, null,     // 652-659
    null,                                               // 660: campo_20
    new JPasswordField("Test campo 8 f2"),              // 661: campo_COMPONENTE
    "Testo del campo numero 8",                         // 662: campo_VALORE
    710,                                                // 663: campo_X
    300,                                                // 664: campo_Y
    200,                                                // 665: campo_L
    30,                                                 // 666: campo_H
    true,                                               // 667: campo_ENABLED
    true,                                               // 668: campo_VISIBLE
    null,                                               // 669: campo_FOREGROUND
    null,                                               // 670: campo_BACKGROUND
    "ToolTipText ottavo PASSWORD frame2",               // 671: campo_TOOLTIPTEXT
    null,                                               // 672: campo_ACTIONLISTENER
    null,                                               // 673: campo_COMPONENTE_FONT
    null,                                               // 674: campo_COMPONENTE_IMAGE
    null, null, null, null, null, null, null, null, null, null, // 675-684
    null, null, null, null, null, null, null, null, null, null, // 685-694
    null, null, null, null, null, null, null, null, null, null, // 695-704
    null, null, null, null, null, null, null, null, null, null, // 705-714
    null, null, null, null, null                        // 715-719
));
// END	campo2 //	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	// ========== AGGIUNGI QUESTE RIGHE PER IL VERSIONING ==========
	static VersioningManagerWinGen versioningManager;
	static VersioningCallbackImpl versioningCallback;
	// =============================================================
	
	public	static	MyThread1			th1			= new MyThread1();
	public	static	MyThread1			th2			= new MyThread1();
//	public	static	MyThread1			th3			= new MyThread1();
	public	static	MyThread2			th3			= new MyThread2();
	public	static	MyThread1			th4			= new MyThread1();
	
	public static Vector<Object> jTabF1				= new Vector<Object>();
	
	public static Vector<Object> radioGruppo1AttivoDisattivo			= new Vector<Object>();
	public static Vector<Object> radioGruppo2AttivoDisattivoVendita		= new Vector<Object>();
	public static Vector<Object> radioGruppo3AttivoDisattivoOrdini		= new Vector<Object>();
	public static Vector<Object> radioGruppo4AttivoDisattivoStampa		= new Vector<Object>();
	
//	public static JPopupMenu menu_campo1 = new JPopupMenu("Popup");
//	public static JMenuItem item_campo1 = new JMenuItem("Test 01");
	
	public final static int larghezza	= 1280;
	public final static int altezza	= 1000;
	
	// ========== CLASSE PER IL CALLBACK DEL VERSIONING ==========
	static class VersioningCallbackImpl implements VersioningManagerWinGen.VersioningCallback {
	    @Override
	    public void onUpdateAvailable(String nuovaVersione) {
		   System.out.println("[Versioning] Nuova versione disponibile: " + nuovaVersione);
		   WingenUtil.log(6, "Nuova versione disponibile: " + nuovaVersione);
	    }
	    
	    @Override
	    public void onUpdateCompleted() {
		   System.out.println("[Versioning] Update completato!");
		   WingenUtil.log(6, "Update completato - Il programma si chiuderà");
	    }
	    
	    @Override
	    public void onStopRequested() {
		   System.out.println("[Versioning] STOP richiesto dal sistema");
		   WingenUtil.log(6, "Stop richiesto dal sistema di versioning");
	    }
	    
	    @Override
	    public void onError(String error) {
		   System.err.println("[Versioning] ERRORE: " + error);
		   WingenUtil.log(3, "Errore Versioning: " + error);
	    }
	}
	// ==============================================================
	
	
	// istanze
	static	winGen wG = new winGen();
	static	winGen.utility			ut			= wG.new utility();
	static	winGen.utility.fLog log				= new winGen.utility.fLog();
	static	winGen.HashingManager	hashing		= wG.new HashingManager(); 
	static	winGen.wingen_sqlFunctions	Sql		= wG.new wingen_sqlFunctions();
	static	winGen.utility.UserSessionManager sessionManager = ut.new UserSessionManager();
	static	winGen.utility.DecryptFile 	decryptFile	= ut.new DecryptFile();
	
	static	winGen.fileDropper fd1			= wG.new fileDropper();
	public static java.io.Writer out = null;
	
	// solo per testare il Virtual Thread
	private static void testVirtualThread()  // solo per testare il Virtual Thread
	{
		Runnable task = () ->
		{
			System.out.println("Esecuzione su virtual thread: " + Thread.currentThread());
		};
		
		Thread t1 = Thread.ofVirtual().start(task);
		Thread t2 = Thread.ofVirtual().start(task);
		Thread t3 = Thread.ofVirtual().start(task);
		
	}
	
	// termina tutti i tread USATO PER TEST!!!
	private static void end()
	{
	    // ========== FERMA IL VERSIONING PRIMA DI CHIUDERE ==========
	    if (versioningManager != null) {
		   System.out.println("[Versioning] Arresto VersioningManager...");
		   versioningManager.stop();
	    }
	    // ============================================================
	    
	    MyThread1.endAllThreads = true;
	    MyThread2.endAllThreads = true;
	    while ( th1.isAlive() ) {}
	    while ( th2.isAlive() ) {}
	    while ( th3.isAlive() ) {}
	    while ( th4.isAlive() ) {}
	    System.out.println( "4. th1.getState() "+th1.getState() );
	    System.out.println( "5. th2.getState() "+th2.getState() );
	    System.out.println( "6. th3.getState() "+th3.getState() );
	    System.out.println( "7. th3.getState() "+th4.getState() );
	    WingenUtil.close();  // Chiudi il log
	    System.exit(0);
	}	
	// END private static void end()


public static java.sql.Connection con = null;

// ========================================================================
    // METODI PER IL CONTROLLO RAPIDO START/STOP
    // ========================================================================
 // ========================================================================
    // METODI PER IL CONTROLLO RAPIDO START/STOP
    // ========================================================================
// ========================================================================
    // METODI PER IL CONTROLLO RAPIDO START/STOP
    // ========================================================================
public static boolean checkStatoIniziale(java.sql.Connection c) { 
    try { 
        if (c == null) {
            System.err.println("[Versioning] Errore: Connessione passata è NULL.");
            return true; 
        }

        // Imposta il database corretto
        c.setCatalog("versioning"); 
        
        String sql = "SELECT RUNNINGSTOPPED, NUMEROVERSIONEATTIVA FROM applicazioni WHERE NUMEROAPPLICAZIONE = '0001'"; 
        try (java.sql.PreparedStatement pstmt = c.prepareStatement(sql)) { 
            java.sql.ResultSet rs = pstmt.executeQuery(); 
            if (rs.next()) {
                String stato = rs.getString("RUNNINGSTOPPED");
                // Se è STOP, chiudiamo subito
                if ("STOP".equalsIgnoreCase(stato)) {
                    mostraDialogStopEDEsci("SISTEMA IN MANUTENZIONE - Chiusura immediata.");
                    return false;
                }
                
                // Qui puoi aggiungere il check immediato della versione se vuoi
                System.out.println("  [Versioning] Check rapido superato. Stato: " + stato);
            } 
        } 
    } catch (Exception e) { 
        System.err.println("[Versioning] Errore nel check: " + e.getMessage()); 
    } 
    return true; 
}
    
         
     
    private static void mostraDialogStopEDEsci(String messaggio) { 
        final javax.swing.JDialog stopDialog = new javax.swing.JDialog((java.awt.Frame)null, "Blocco Sistema", true); 
        javax.swing.JLabel label = new javax.swing.JLabel("<html><div style='text-align: center;'>" + messaggio + "</div></html>", javax.swing.SwingConstants.CENTER); 
        javax.swing.JButton okButton = new javax.swing.JButton("OK (10)"); 
         
        stopDialog.setLayout(new java.awt.BorderLayout(10, 10)); 
        stopDialog.add(label, java.awt.BorderLayout.CENTER); 
        stopDialog.add(okButton, java.awt.BorderLayout.SOUTH); 
        stopDialog.setSize(350, 150); 
        stopDialog.setLocationRelativeTo(null); 
     
        int[] countdown = {10}; 
        javax.swing.Timer t = new javax.swing.Timer(1000, e -> { 
            countdown[0]--; 
            okButton.setText("OK (" + countdown[0] + ")"); 
            if (countdown[0] <= 0) { 
                stopDialog.dispose(); 
                System.exit(0); 
            } 
        }); 
     
        stopDialog.addWindowFocusListener(new java.awt.event.WindowAdapter() { 
            @Override 
            public void windowLostFocus(java.awt.event.WindowEvent e) { 
                System.exit(0); 
            } 
        }); 
     
        okButton.addActionListener(e -> System.exit(0)); 
        t.start(); 
        stopDialog.setVisible(true); 
    }
    
        
    
    // ========================================================================
    // START main(String[] args)  
    // ========================================================================
// ======================================================================== 
    // START main(String[] args)    
    // ======================================================================== 


public static void main(String[] args)     
    {     
        javax.swing.SwingUtilities.invokeLater(new Runnable()     
        {     
           public void run()     
           {     
              // 1. PRIMA DI TUTTO: Identifichiamo se il versioning è attivo
              boolean versioningEnabled = true;     
              for (String arg : args) {     
                 if (arg.equalsIgnoreCase("-noversioning")) { versioningEnabled = false; }     
              }     
                     
              // 2. CONTROLLO VERSIONING (Solo l'indispensabile)
              if (versioningEnabled) {     
                 versioningCallback = new VersioningCallbackImpl();    
                 versioningManager = new VersioningManagerWinGen("WINGEN", "1.0", versioningCallback);     
                 
                 if (versioningManager.init()) {
                     java.sql.Connection cV = versioningManager.getConnection();
                     
                     // Se checkStatoIniziale rileva STOPPED, mostra il dialog e restituisce FALSE
                     if (!checkStatoIniziale(cV)) {      
                         System.out.println("  [Versioning] ACCESSO NEGATO: Uscita immediata.");
                         // QUI CI FERMIAMO. Non chiamiamo startup_fields, non apriamo log, non avviamo thread.
                         return; 
                     }     
                     versioningManager.start(); 
                 }
              }     
 
              // 3. CARICAMENTO EFFETTIVO (Eseguito solo se NON siamo usciti sopra)
              // Sposta qui tutte le inizializzazioni pesanti
              WingenUtil.open("logwingen.txt");     
              testVirtualThread(); // I thread partiranno SOLO ORA
              startup_fields();     
                   
              WingenUtil.log(6, "[TestWinGenMagaz] Avvio regolare");     
              try {     
                 out = winGen.utility.fLog.prepLog( "outWINGEN.txt" );     
                 winGen.utility.timeStart();     
              } catch (java.io.IOException e) {     
                 System.exit(1);     
              }     
               
              winGen.utility.timeStart(); 
           }     
        });     
    }  


    
 // END main
    
    
	
	// START startup_fields()
	public static void startup_fields()
	{
		th1.start();
		th2.start();
		th3.start();
		th4.start();
		JFrame jF_frame1 = new JFrame();
		jF_frame1.addWindowListener(new WindowAdapter()
		{
			public void windowActivated(WindowEvent e){}
			public void windowClosed(WindowEvent e)
			{
				System.out.println( "Fine - Chiusura finestra 1" );
				end();
			}
			public void windowClosing(WindowEvent e){}
			public void windowDeiconified(WindowEvent e){}
			public void windowIconified(WindowEvent e){}
			public void windowDeactivated(WindowEvent e){}
		});
		JPanel jp_login = new JPanel();
		JPanel jp1_1 	= new JPanel();
		JPanel jp1_2 	= new JPanel();
		JPanel jp1_3 	= new JPanel();
		JPanel jp1_4 	= new JPanel();
		JPanel jp1_5 	= new JPanel();
		JPanel jp1_7 	= new JPanel();
		
		wG.setPanel(  jp_login , 5 , 5 , larghezza-20 , altezza-40 , jF_frame1 , "<html><font color=blue>Login</font></html>" /*null*/ );
		
		//jF_frame1.setIconImage(mrmIcona.getImage());
		
		JFrame jF_frame2 = new JFrame();
		
		jF_frame2.addWindowListener(new WindowAdapter()
		{
			public void windowClosed(WindowEvent e)
			{
				System.out.println( "Fine - Chiusura finestra 2" );
				end();
			}
		});
		
		JPanel jp2 = new JPanel();
		wG.setPanel(  jp2 , 5 , 5 , larghezza-20 , altezza-40 , jF_frame2 , "Test border 2" );
		
		
		
		
		
		
		
		
		
		
		
		/*
			JTab
		*/
		JTabbedPane tabbedPane = new JTabbedPane();
		
		
		jTabF1.removeAllElements();
		
		jTabF1.add( "Login"  );
		jTabF1.add( new javax.swing.ImageIcon("img1.gif")  );
		jTabF1.add( jp_login  );
		jTabF1.add( "Login-Accesso al programma"  );
		jTabF1.add( false  );	// la jTab se true viene posizionata come prima scelta... se piu' jTab hanno true allora vale l'ultima e sara' selezionata l'ultima
		jTabF1.add( true  );	// la jTab è cliccabile?
		
		jTabF1.add( "Scheda articoli"  );
		jTabF1.add( new javax.swing.ImageIcon("img1.gif")  );
		jTabF1.add( jp1_1  );
		jTabF1.add( "ToolTip di Tab 1 F1"  );
		jTabF1.add( true  );	// la jTab se true viene posizionata come prima scelta... se piu' jTab hanno true allora vale l'ultima e sara' selezionata l'ultima
		jTabF1.add( true  );	// la jTab è cliccabile?
		
		jTabF1.add( "Tab 2 F1"  );
		jTabF1.add( new javax.swing.ImageIcon("img2.gif")  );
		jTabF1.add( jp1_2  );
		jTabF1.add( "ToolTip di Tab 2 F1"  );
		jTabF1.add( false  );	// la jTab se true viene posizionata come prima scelta... se piu' jTab hanno true allora vale l'ultima e sara' selezionata l'ultima
		jTabF1.add( false  );	// la jTab è cliccabile?
		
		jTabF1.add( "Tab 3 F1"  );
		jTabF1.add( null  );
		jTabF1.add( jp1_3  );
		jTabF1.add( "ToolTip di Tab 3 F1"  );
		jTabF1.add( false  );	// la jTab se true viene posizionata come prima scelta... se piu' jTab hanno true allora vale l'ultima e sara' selezionata l'ultima
		jTabF1.add( false  );	// la jTab è cliccabile?
		
		jTabF1.add( "Tab 4 F1"  );
		jTabF1.add( new javax.swing.ImageIcon("img2.gif")  );
		jTabF1.add( jp1_4  );
		jTabF1.add( "ToolTip di Tab 4 F1"  );
		jTabF1.add( false  );	// la jTab se true viene posizionata come prima scelta... se piu' jTab hanno true allora vale l'ultima e sara' selezionata l'ultima
		jTabF1.add( false  );	// la jTab è cliccabile?
		
		jTabF1.add( "Tab 5 Log"  );
		jTabF1.add( new javax.swing.ImageIcon("img2.gif")  );
		jTabF1.add( jp1_5  );
		jTabF1.add( "ToolTip di Tab 5 log"  );
		jTabF1.add( false  );	// la jTab se true viene posizionata come prima scelta... se piu' jTab hanno true allora vale l'ultima e sara' selezionata l'ultima
		jTabF1.add( true  );	// la jTab è cliccabile?
		
		jTabF1.add( "Tab 7 Classificazioni"  );
		jTabF1.add( new javax.swing.ImageIcon("img2.gif")  );
		jTabF1.add( jp1_7  );
		jTabF1.add( "ToolTip di Classificazioni"  );
		jTabF1.add( false  );	// la jTab se true viene posizionata come prima scelta... se piu' jTab hanno true allora vale l'ultima e sara' selezionata l'ultima
		jTabF1.add( true  );	// la jTab è cliccabile?
		
		wG.setJTabbedPane( jF_frame1 , 10 , 10 , 1250 , 950 , tabbedPane , jTabF1 );
		
		
		
		// devo metto il setLog() ???????????????????????
		
		/*
			Ecco dove vanno messi i valori dei campi di LOG
		*/
		// Primo campo LOG - field_LOG
		// campo01: descrizione
		WingenUtil.log(6, "Primo campo LOG - field_LOG");

System.out.println("=== DEBUG log1 ===");
System.out.println("log1.size() = " + log1.size());
System.out.println("campo_LABEL = " + campo_LABEL);
System.out.println("log1.get(campo_LABEL) = " + log1.get(campo_LABEL));
System.out.println("log1.get(campo_COMPONENTE) = " + log1.get(campo_COMPONENTE));
System.out.println("log1.get(campo_X) = " + log1.get(campo_X));
System.out.println("log1.get(campo_Y) = " + log1.get(campo_Y));
System.out.println("jp1_5 = " + jp1_5);
System.out.println("log1.size() = " + log1.size());  // Deve essere 80
System.out.println("Numero cicli = " + ((log1.size()-1)/campo_MAX_NUM_CAMPO));
System.out.println("==================");
System.out.println("=== VERIFICA INDICI ===");
System.out.println("log1.get(21) = " + log1.get(21));
System.out.println("log1.get(22) = " + log1.get(22));
System.out.println("log1.get(21) instanceof JTextArea = " + (log1.get(21) instanceof JTextArea));
System.out.println("========================");
		wG.setParameters( log1 , jp1_5 );
		
System.out.println("jp1_5 dopo setParameters: " + jp1_5);
System.out.println("jp1_5 componenti: " + jp1_5.getComponentCount());
for (Component c : jp1_5.getComponents())
{
    System.out.println("  componente: " + c + " bounds=" + c.getBounds());
}		
		
		//ut.setLog( logJTA , 10, 20 );
		
		
//		tabbedPane.addTab("Tab 1", icon1, jp, "ToolTip di Tab 1");
//		tabbedPane.setBounds( 10 , 10 , 1250 , 950 );
//		jF_frame1.add ( tabbedPane );
				
		/*
			Ecco dove vanno messi i valori dei campi di campo_login
		*/
		// campo00: sempre vuoto per semplificare!
		
		// PRIMO CAMPO login (Username)
		// campo01: descrizione
			
			
			wG.setParameters( campo_login , jp_login );
System.out.println( "Valore di del primo componente 1 del campo_login: "+wG.getText( campo_login , 0 ) );
//System.out.println( "Valore di del primo componente 2 del campo_login: "+wG.getText( campo_login , 1 ) ); // <-- ERRORE!
		
		
		
		// l'abilitazione della JFrame deve stare alla fine!
		wG.setFrame( jF_frame2 , larghezza , altezza , JFrame.DISPOSE_ON_CLOSE , "Titolo test 2" , "img2.gif");
		wG.setFrame( jF_frame1 , larghezza , altezza , JFrame.DISPOSE_ON_CLOSE , "Titolo test 1" , "img1.gif" );
		System.out.println( "Valore di del primo componente 1 del campo1: "+wG.getText( campo1 , field_CODICE ) );
		System.out.println( "Valore di del primo componente 2 del campo1: "+wG.getText( campo1 , field_CODICEABARRE ) );
		
		System.out.println( "Valore di del primo componente 1 del campo_login: "+wG.getText( campo_login , 0 ) );
		System.out.println( "Valore di del primo componente 2 del campo_login: "+wG.getText( campo_login , 1 ) );
		
		jF_frame2.setVisible(true);
		jF_frame2.setExtendedState(JFrame.ICONIFIED);  // Parte minimizzata
		// AGGIUNGI QUESTE RIGHE PER PORTARE jF_frame1 IN PRIMO PIANO
		jF_frame1.toFront();
		jF_frame1.requestFocus();		
		
		wG.setParameters( campo1 , jp1_1 );
		wG.setParameters( campo2 , jp2 );

JTable jt = (JTable) campo1.get(901);
jt.setModel(new modJT1());
jt.setToolTipText(null);

jt.setDefaultRenderer(Object.class, new javax.swing.table.DefaultTableCellRenderer() {
    @Override
    public Component getTableCellRendererComponent(
            JTable table, Object value, boolean isSelected,
            boolean hasFocus, int row, int column) {

        Component c = super.getTableCellRendererComponent(
                table, value, isSelected, hasFocus, row, column);

        if (c instanceof JComponent) {
            JComponent jc = (JComponent)c;

            if (column == 1) {
                jc.setToolTipText(String.valueOf(value));
            } else {
                jc.setToolTipText(null);
            }
        }

        return c;
    }
});

	
// ==========================================================
              // RIPRISTINO PANNELLI MANCANTI (jp3 e jp_drop1)
              // ==========================================================
              
// Pannello jp3: Radio Button Test
              JPanel jp3 = new JPanel();
              wG.setPanel(jp3, 465, 5, 300, 200, jp1_1, "Test");
              
              radioGruppo1AttivoDisattivo.removeAllElements();
              // La tua winGen vuole probabilmente che tu aggiunga i componenti prima o che usi il vector
              // Se la tua winGen non ha il metodo a 5 parametri, usa questo:
              wG.setRadioButton(jp3, radioGruppo1AttivoDisattivo); 

              radioGruppo2AttivoDisattivoVendita.removeAllElements();
              wG.setRadioButton(jp3, radioGruppo2AttivoDisattivoVendita);

              radioGruppo3AttivoDisattivoOrdini.removeAllElements();
              wG.setRadioButton(jp3, radioGruppo3AttivoDisattivoOrdini);

              radioGruppo4AttivoDisattivoStampa.removeAllElements();
              wG.setRadioButton(jp3, radioGruppo4AttivoDisattivoStampa);
              
			// Pannello jp_drop1: Drag & Drop 
              JPanel jp_drop1 = new JPanel(); 
              wG.setPanel(jp_drop1, 465, 450, 600, 200, jp1_1, "Test file drag & drop..."); 
               
              // Usa una variabile locale invece di fd1 se fd1 ti dà errore di tipo
              voidFileDropper mioListenerDrop = new voidFileDropper(); 
              java.awt.dnd.DropTarget dropTarget = new java.awt.dnd.DropTarget(jp_drop1, mioListenerDrop);
                            
              // Fine ripristino pannelli
              // ==========================================================	
	}
	// END startup_fields()
	
	
	/****************************************************************************/
	/*	Codice modello per tutti i Model delle JTable - START					*/
	/****************************************************************************/
	private static String[] modJT1_columnNames = { "First Name", "Last Name", "Sport", "# of Years", "Vegetarian" };
	private static Object[][] modJT1_data = { {"Kathy", "Smith", "Snowboarding", 5, false},
											{"John", "Doe", "Rowing", 3, true},
											{"Sue", "Black", "Knitting", 2, false},
											{"Jane", "White", "Speed reading", 20, true},
											{"John", "Doe", "Rowing", 3, true},
											{"Sue", "Black", "Knitting", 2, false},
											{"Jane", "White", "Speed reading", 20, true},
											{"John", "Doe", "Rowing", 3, true},
											{"Sue", "Black", "Knitting", 2, false},
											{"Jane", "White", "Speed reading", 20, true},
											{"John", "Doe", "Rowing", 3, true},
											{"Sue", "Black", "Knitting", 2, false},
											{"Jane", "White", "Speed reading", 20, true},
											{"Joe", "Brown", "Pool", 10, false} };
	private static class modJT1 extends AbstractTableModel implements Serializable
	{
		private static final long serialVersionUID = 1L; // Aggiungi questa riga
		public int getColumnCount()
		{
			System.out.println( "modJT1_columnNames.length; "+modJT1_columnNames.length );
			return modJT1_columnNames.length;
		}
		
		public int getRowCount()
		{
			return modJT1_data.length;
		}
		
		public String getColumnName(int col)
		{
			return modJT1_columnNames[col];
		}
		
		public Object getValueAt(int row, int col)
		{
		//	System.out.println( "Valore della colonna: "+modJT1_data[row][col] );
			return modJT1_data[row][col];
		}
		
		public Class<?> getColumnClass(int c)
		{
			return getValueAt(0, c).getClass();
		}
		
		/*
			Metodo implementato solo in caso di editazione dei valori della tabella.
		*/
		public boolean isCellEditable(int row, int col)
		{
			//Note that the data/cell address is constant,
			//no matter where the cell appears onscreen.
			System.out.println( "asaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" );
			if (col < 2)
			{
				return false;
			}
			else
			{
				return true;
			}
		}
		
		/*
			Metodo implementato solo in caso di cambiamento dei valori della tabella.
		*/
		public void setValueAt(Object value, int row, int col)
		{
			modJT1_data[row][col] = value;
			fireTableCellUpdated(row, col);
		}
		
		
		
		
		
		
/*		
		
		// inserisce un JToolTipText col valore della cella
		// va usato solo se non c'e' un tooltiptext generico sulla JTable!
		///////////////////// NON FUNZIONAAAAAAAAAAAAAAAAAAAAAAA
		public Component prepareRenderer(TableCellRenderer renderer, int rowIndex, int vColIndex)
		{
			Component c = prepareRenderer(renderer, rowIndex, vColIndex);
			System.out.println( "xxxxxxxxxxxxxxxxxxx" );
			if (c instanceof JComponent)
			{
				JComponent jc = (JComponent)c;
				// Notified by a colonna 5
				if (vColIndex==1)
				{
					jc.setToolTipText((String)getValueAt(rowIndex, vColIndex ));
				}
				else
				{
					jc.setToolTipText(null);
				}
			}
			return c;
		}
		
*/		
		
		
		// Anche questo NON FUNZIONAAAAAAAAAAAAAAAAAAAAAAAAA
		/*
		public String getToolTipText(java.awt.event.MouseEvent e)
		{
			java.awt.Point p = e.getPoint();
			int rowIndex = rowAtPoint(p);
			int colIndex = columnAtPoint(p);
			//int realColumnIndex = convertColumnIndexToModel(colIndex);	// perche'?
			String jTTT = "";
			if ( colIndex == 2 )
			{
				jTTT = getToolTipText(e);
				return jTTT;
			}
			
			String s00 = "";
			
			
			setToolTipText( jTTT );
			return jTTT;
		}
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	/****************************************************************************/
	/*	Codice modello per tutti i Model delle JTable - END						*/
	/****************************************************************************/
	
	
	
	/****************************************************************************/
	/* Gestione dell'winGen - END										*/
	/****************************************************************************/
	
	
	// bottone voidDatiDescrittiviEQta USATO PER TEST!!!
	private static class voidDatiDescrittiviEQta implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			System.out.println( "Dati descrittivi Abilitato" );
			System.out.println( "Dati statistici Disabilitato" );
			System.out.println( "testWinGenMagaz.voidDatiDescrittiviEQta - Start Suona" );
			winGen.suonoMid	leggeMid = wG.new suonoMid();
			leggeMid.suonare( "hi_hat.mid" , 3000 );
			System.out.println( "testWinGenMagaz.voidDatiDescrittiviEQta - Fine Suona" );
			wG.setColor( campo1 , field_DATIDESCRITTIVIEQTA , Color.black , null );
			wG.setColor( campo1 , field_DATISTATISTICI , Color.white.darker() , null );
			wG.setFont( campo1 , field_DATIDESCRITTIVIEQTA , new Font( "COURIER NEW" , Font.BOLD, 15 ) );
			wG.setFont( campo1 , field_DATISTATISTICI , new Font( "COURIER NEW" , Font.PLAIN, 13 ) );
		}
	}
	// bottone voidDatiStatistici USATO PER TEST!!!
	private static class voidDatiStatistici implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			System.out.println( "Dati statistici Abilitato" );
			System.out.println( "Dati descrittivi Disabilitato" );
			
//			System.out.println( "testWinGenMagaz.voidDatiStatistici - Start Suona" );
//			winGen.suonoMid	leggeMid = wG.new suonoMid();
//			leggeMid.suonare( "refresh.mid" , 1500 );
//			System.out.println( "testWinGenMagaz.voidDatiStatistici - Fine Suona" );
			
			
			System.out.println( "testWinGenMagaz.voidDatiStatistici - Start Suona" );
			winGen.suonoWav	leggeWav = wG.new suonoWav();
			leggeWav.suonare( "bell03.wav" , 1500 );
			System.out.println( "testWinGenMagaz.voidDatiStatistici - Fine Suona" );
			
			wG.setColor( campo1 , field_DATISTATISTICI , Color.black , null );
			wG.setColor( campo1 , field_DATIDESCRITTIVIEQTA , Color.white.darker() , null );
			wG.setFont( campo1 , field_DATISTATISTICI , new Font( "COURIER NEW" , Font.BOLD, 15 ) );
			wG.setFont( campo1 , field_DATIDESCRITTIVIEQTA , new Font( "COURIER NEW" , Font.PLAIN, 13 ) );
			( (JButton)wG.getObject( campo1 , field_DATISTATISTICI ) ).setText("Selezionato");
		}
	}
	
	
	// bottone voidFileDD USATO PER TEST!!!
	private static class voidFileDD implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			System.out.println( "Dati statistici Abilitato" );
			System.out.println( "Dati descrittivi Disabilitato" );
			
//			System.out.println( "testWinGenMagaz.voidFileDD - Start Suona" );
//			winGen.suonoMid	leggeMid = wG.new suonoMid();
//			leggeMid.suonare( "refresh.mid" , 1500 );
//			System.out.println( "testWinGenMagaz.voidFileDD - Fine Suona" );
			
			
			System.out.println( "testWinGenMagaz.voidFileDD - Start Suona" );
			winGen.suonoWav	leggeWav = wG.new suonoWav();
			leggeWav.suonare( "bell03.wav" , 1500 );
			System.out.println( "testWinGenMagaz.voidFileDD - Fine Suona" );
			
			wG.setColor( campo1 , field_FileDD , Color.black , null );
			wG.setFont( campo1 , field_FileDD , new Font( "COURIER NEW" , Font.BOLD, 15 ) );
			( (JButton)wG.getObject( campo1 , field_FileDD ) ).setText("Leggi risultato");
			if ( fd1.is_drag_and_drop_ok() )
			{
				System.out.println( "voidFileDD - C'e' uno o piu' files nel contenitore Drag & Drop" );
				System.out.println( "voidFileDD - C'e' uno o piu' files nel contenitore Drag & Drop" );
				List<Object> fileList = fd1.getFileList();
				
				int totFile = fileList.size();
				System.out.println( "Totale file = "+totFile );
				for (int i=0;i<totFile;i++)
				{
					System.out.println( "File = "+(i+1)+" --> "+fileList.get((i)) );
				}
				// fd1.getFileList();
			}
			else
			{
				System.out.println( "voidFileDD - Non c'e' nessun file nel contenitore Drag & Drop" );
			}
		}
	}
	
	
	// bottone voidFileDropper USATO PER TEST E DRAG & DROP!!! 
    private static class voidFileDropper implements ActionListener, java.awt.dnd.DropTargetListener 
    { 
        // --- METODI OBBLIGATORI PER IL DRAG & DROP ---
        @Override
        public void dragEnter(java.awt.dnd.DropTargetDragEvent dtde) { dtde.acceptDrag(java.awt.dnd.DnDConstants.ACTION_COPY); }
        
        @Override
        public void dragOver(java.awt.dnd.DropTargetDragEvent dtde) { dtde.acceptDrag(java.awt.dnd.DnDConstants.ACTION_COPY); }
        
        @Override
        public void dropActionChanged(java.awt.dnd.DropTargetDragEvent dtde) {}
        
        @Override
        public void dragExit(java.awt.dnd.DropTargetEvent dte) {}

        @Override
        public void drop(java.awt.dnd.DropTargetDropEvent dtde) {
            // Qui gestiamo l'evento quando il file viene "mollato" nel pannello
            System.out.println("File rilasciato nel pannello!");
            dtde.acceptDrop(java.awt.dnd.DnDConstants.ACTION_COPY);
            // Nota: Se fd1 gestisce internamente la lista, non serve aggiungere altro qui
            dtde.dropComplete(true);
        }

        // --- IL TUO CODICE ORIGINALE (ACTION PERFORMED) ---
        public void actionPerformed(ActionEvent e) 
        { 
            System.out.println( "Elaborazione FileDropper" ); 
            
            System.out.println( "testWinGenMagaz.voidFileDropper - Start Suona" ); 
            winGen.suonoWav leggeWav = wG.new suonoWav(); 
            leggeWav.suonare( "bell03.wav" , 1500 ); 
            System.out.println( "testWinGenMagaz.voidFileDropper - Fine Suona" ); 
             
            wG.setColor( campo1 , field_FileDropper , Color.black , null ); 
            wG.setFont( campo1 , field_FileDropper , new Font( "COURIER NEW" , Font.BOLD, 15 ) ); 
            ( (JButton)wG.getObject( campo1 , field_FileDropper ) ).setText("Leggi risultato"); 
            
            if ( fd1 != null && fd1.is_drag_and_drop_ok() ) 
            { 
                System.out.println( "voidFileDropper - C'e' uno o piu' files nel contenitore Drag & Drop" ); 
                List<Object> objectList = fd1.getFileList(); 
                List<File> fileList = new ArrayList<>(); 
                for (Object obj : objectList) { 
                    if (obj instanceof File) 
                    { 
                        fileList.add((File) obj); 
                    } 
                    else 
                    { 
                        System.out.println("Oggetto non di tipo File: " + obj); 
                    } 
                } 
                 
                int totFile = fileList.size(); 
                System.out.println( "Totale file = "+totFile ); 
                for (int i=0;i<totFile;i++) 
                { 
                    System.out.println( "File = "+(i+1)+" --> "+fileList.get((i)) ); 
                } 
            } 
            else 
            { 
                System.out.println( "voidFileDropper - Non c'e' nessun file nel contenitore Drag & Drop" ); 
            } 
        } 
    }


	
	// bottone voidFileDropperHex	 USATO PER TEST!!!
	private static class voidFileDropperHex	 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			System.out.println( "Elaborazione FileDropperHex" );
			
			System.out.println( "testWinGenMagaz.voidFileDropperHex - Start Suona" );
			winGen.suonoWav	leggeWav = wG.new suonoWav();
			leggeWav.suonare( "bell03.wav" , 1500 );
			System.out.println( "testWinGenMagaz.voidFileDropperHex - Fine Suona" );
			
			wG.setColor( campo1 , field_FileDropper , Color.black , null );
			wG.setFont( campo1 , field_FileDropper , new Font( "COURIER NEW" , Font.BOLD, 15 ) );
			( (JButton)wG.getObject( campo1 , field_FileDropper ) ).setText("Leggi risultato");
			if ( fd1.is_drag_and_drop_ok() )
			{
				System.out.println( "voidFileDropperHex - C'e' uno o piu' files nel contenitore Drag & Drop" );
				List<Object> objectList = fd1.getFileList();
				List<File> fileList = new ArrayList<>();
				for (Object obj : objectList) {
					if (obj instanceof File)
					{
						fileList.add((File) obj); // Aggiungi solo gli oggetti di tipo File
					}
					else
				 	  {
						// Gestisci il caso in cui l'oggetto non e' un File
						System.out.println("Oggetto non di tipo File: " + obj);
					}
				}
					
				int totFile = fileList.size();
				System.out.println( "Totale fileHex = "+totFile );
				for (int i=0;i<totFile;i++)
				{
					System.out.println( "File = "+(i+1)+" --> "+fileList.get((i)) );
					//readMyFileDropperHex( fileList.get((i)) );
				}
				// fd1.getFileList();
			}
			else
			{
				System.out.println( "voidFileDropperHex - Non c'e' nessun file nel contenitore Drag & Drop" );
			}
		}
	}
	
	
	/****************************************************************************/
	// login Buttoms:	contiene tre classi: voidLoginButton - voidLogoutButton - voidLoginResetButton - voidLoginCambioPasswordButton
	//					Da qui si puo' fare login immettendo Username e Password e verificandoen la correttezza.
	//						Il Login abilita le JTab secondo quanto configurato nel profilo dell'utente.
	//					Da qui si puo' fare logout per uscire dal programma.
	//						Il logout disabilita tutte le JTab e abilita solo la JTab del login.
	//					Da qui si puo' richiedere il reset della Password dimenticata.
	//					Da qui si puo' cambiare la Password solo dopo aver fatto il login.
	/****************************************************************************/
	private static class voidLoginButton	 implements ActionListener
	{
		// databaseName e' dichiarato final in "public interface winGenConstants"
		// per le istruzioni CREATE DATABASE e DROP DATABASE in MariaDB (e MySQL), non hai bisogno di fare COMMIT.
		public void actionPerformed(ActionEvent e)
		{
			System.out.println( "Elaborazione LoginButton" );
			
			//System.out.println( "testWinGenMagaz.voidLoginButton - Start Suona" );
			//winGen.suonoMid	leggeMid = wG.new suonoMid();
			//leggeMid.suonare( "refresh.mid" , 1500 );
			//System.out.println( "testWinGenMagaz.voidLoginButton - Fine Suona" );
			
			
			System.out.println( "testWinGenMagaz.voidLoginButton - Start Suona" );
			winGen.suonoWav	leggeWav = wG.new suonoWav();
			leggeWav.suonare( "bell03.wav" , 1500 );
			System.out.println( "testWinGenMagaz.voidLoginButton - Fine Suona" );
			
			//wG.setColor( campo1 , field_FileDropper , Color.black , null );
			//wG.setFont( campo1 , field_FileDropper , new Font( "COURIER NEW" , Font.BOLD, 15 ) );
			//( (JButton)wG.getObject( campo1 , field_FileDropper ) ).setText("Leggi risultato");
			
			// sessionManager.loginUser();	// usato per test!
			System.out.println( "Valore di del primo componente 1 del campo_login: "+wG.getText( campo_login , 0 ) );	// usato per test!
			WingenUtil.log(6, "Tentativo di Login");
			if (sessionManager.isLoggedIn())	// già loggato!!!!
			{
				winGen.utility.dialogInfo( "Sei gia' loggato. Devi fare Logout prima di fare un altro Login!" );
				WingenUtil.log(6, "Sei gia' loggato. Devi fare Logout prima di fare un altro Login!" );
			}
			else if ( wG.getText( campo_login , 0 ).isEmpty() )	// CAMPO USERNAME VUOTO!
			{
				winGen.utility.dialogInfo( "Campo Username vuoto! Devi metter l'Username!" );
				WingenUtil.log(6, "Campo Username vuoto! Devi metter l'Username!" );
			}
			else if ( wG.getText( campo_login , 1 ).isEmpty() )	// CAMPO PASSWORD VUOTO!
			{
				winGen.utility.dialogInfo( "Campo Password vuoto! Devi mettere una PASSWORD" );
				WingenUtil.log(6, "Campo Password vuoto! Devi mettere una PASSWORD" );
			}
			else
			{
				System.out.println( "Valore di del primo componente 1 del campo_login: "+wG.getText( campo_login , 0 ) );	// usato per test!
				System.out.println( "Valore di del primo componente 2 del campo_login: "+wG.getText( campo_login , 1 ) );	// usato per test!
				
				System.out.println( "hashing - START" );	// usato per test!
				String pwd = wG.getText( campo_login , 1 );
				String hashedPasswordDaSalvareNelDB = hashing.myHashing( pwd );
				System.out.println( "hashing - END" );	// usato per test!
				
				System.out.println( "hashedPasswordDaSalvareNelDB: "+hashedPasswordDaSalvareNelDB );	// usato per test!
				System.out.println( "faccio il Check: "+hashing.checkStringa( pwd, hashedPasswordDaSalvareNelDB ) );	// usato per test!
				
				WingenUtil.log(6, "Tentativo di connessione al DB" );
				// connessione al DB - START
				if ( sqlConnection() )
				{
					if ( Sql.checkIfDatabaseExist( databaseName ) )	// databaseName è su winGenConstants.java
					{
						System.out.println( "Faccio il Check se esiste il database '"+databaseName+"': SI, esiste!" );	// usato per test!
						WingenUtil.log(6, "Faccio il Check se esiste il database '"+databaseName+"': SI, esiste!" );
					}
					else
					{
						System.out.println( "Faccio il Check se esiste il database '"+databaseName+"': NO, NON esiste!" );	// usato per test!
						WingenUtil.log(6, "Faccio il Check se esiste il database '"+databaseName+"': NO, NON esiste!" );
						System.out.println( "Creazione del database '"+databaseName+"'" );	// usato per test!
						WingenUtil.log(6, "Creazione del database '"+databaseName+"'" );
						// lo creo... da aggiustare
						String s = "CREATE DATABASE IF NOT EXISTS "+databaseName+";";
						if ( Sql.execute( s ) )
						{
							System.out.println( "Creazione del database '"+databaseName+"' avvenuto con successo" );	// usato per test!
							WingenUtil.log(6, "Creazione del database '"+databaseName+"' avvenuto con successo" );
						}
						else
						{
							System.out.println( "Creazione del database '"+databaseName+"' FALLITO!!!" );	// usato per test! DA GESTIRE
							WingenUtil.log(6, "Creazione del database '"+databaseName+"' FALLITO!!!" );
						}
					}
					sessionManager.loginUser();	// usato per test!
					winGen.utility.dialogInfo( "Login eseguito con successo! Puoi accedere alle tab predefinite per il tuo profilo!" );
					System.out.println( "Login eseguito con successo!" );
					WingenUtil.log(6, "Login eseguito con successo!" );
				}
				// connessione al DB - END
			}
		}
	}
	
	
	// bottone voidLogoutButton	 USATO PER TEST!!!
	private static class voidLogoutButton	 implements ActionListener
	{
		// databaseName e' dichiarato final in "public interface winGenConstants"
		// per le istruzioni CREATE DATABASE e DROP DATABASE in MariaDB (e MySQL), non hai bisogno di fare COMMIT.
		public void actionPerformed(ActionEvent e)
		{
			WingenUtil.log(6, "Tentativo di Logout!" );
			System.out.println( "Elaborazione LogoutButton" );
			
			//System.out.println( "testWinGenMagaz.voidLogoutButton - Start Suona" );
			//winGen.suonoMid	leggeMid = wG.new suonoMid();
			//leggeMid.suonare( "refresh.mid" , 1500 );
			//System.out.println( "testWinGenMagaz.voidLogoutButton - Fine Suona" );
			
			
			System.out.println( "testWinGenMagaz.voidLogoutButton - Start Suona" );
			winGen.suonoWav	leggeWav = wG.new suonoWav();
			leggeWav.suonare( "bell03.wav" , 1500 );
			System.out.println( "testWinGenMagaz.voidLogoutButton - Fine Suona" );
			
			
			// sessionManager.loginUser();	// usato per test!
			System.out.println( "Valore di del primo componente 1 del campo_login: "+wG.getText( campo_login , 0 ) );	// usato per test!
			if (sessionManager.isLoggedIn())	// già loggato: OK!!!!
			{
				// QUESTE ISTRUZIONI SERVONO PER CANCELLARE IL DATABASE "WINGEN" E FARE QUINDI I TEST DI CREAZIONE!
				// Distruggo WIGEN... da CANCELLARE/COMMENTARE
				String s = "DROP DATABASE IF EXISTS "+databaseName+";";
				if ( Sql.execute( s ) )
				{
					System.out.println( "DROP del database '"+databaseName+"' avvenuto con successo" );	// usato per test!
				}
				else
				{
					System.out.println( "DROP del database '"+databaseName+"' FALLITO!!!" );	// usato per test! DA GESTIRE
				}
				// QUESTE ISTRUZIONI SERVONO PER CANCELLARE IL DATABASE "WINGEN" E FARE QUINDI I TEST DI CREAZIONE!
				
				// disconnessione al DB - START
				if ( Sql.disconnect() )
				{
					sessionManager.logoutUser();	// usato per test!
					System.out.println( "Logout effettuato con successo. Devi fare Login o devi uscire dal programma!" );
					winGen.utility.dialogInfo( "Logout effettuato con successo. Devi fare Login o devi uscire dal programma!" );
					wG.setText( campo_login , 0 , "" );	// anche se Boolean per vedere se c'e' un errore!
					wG.setText( campo_login , 1 , "" );	// anche se Boolean per vedere se c'e' un errore!
					System.out.println( "Valore di del primo componente 1 del campo_login: "+wG.getText( campo_login , 0 ) );
					System.out.println( "Valore di del primo componente 2 del campo_login: "+wG.getText( campo_login , 1 ) );
				}
				else
				{
					// che faccio????
					sessionManager.logoutUser();	// usato per test!
					winGen.utility.dialogInfo( "Logout effettuato con successo. Devi fare Login o devi uscire dal programma!" );
					WingenUtil.log(6, "Logout effettuato con successo. Devi fare Login o devi uscire dal programma!" );
				}
				// disconnessione al DB - END
			}
			else	// non sei loggato!!!! non posso fare il Logout!
			{
				System.out.println( "Non sei loggato! Non posso fare il Logout!" );
				winGen.utility.dialogInfo( "Non sei loggato! Non posso fare il Logout!!" );
				WingenUtil.log(6, "Non sei loggato! Non posso fare il Logout!!" );
			}
		}
	}
	
	// bottone voidLoginResetButton	 USATO PER TEST!!!
	private static class voidLoginResetButton	 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			System.out.println( "Elaborazione LoginResetButton" );
			
			//System.out.println( "testWinGenMagaz.voidLoginButton - Start Suona" );
			//winGen.suonoMid	leggeMid = wG.new suonoMid();
			//leggeMid.suonare( "refresh.mid" , 1500 );
			//System.out.println( "testWinGenMagaz.voidLoginButton - Fine Suona" );
			
			
			System.out.println( "testWinGenMagaz.voidLoginResetButton - Start Suona" );
			winGen.suonoWav	leggeWav = wG.new suonoWav();
			leggeWav.suonare( "beep15.wav" , 1500 );
			System.out.println( "testWinGenMagaz.voidLoginResetButton - Fine Suona" );
			
			//wG.setColor( campo1 , field_FileDropper , Color.black , null );
			//wG.setFont( campo1 , field_FileDropper , new Font( "COURIER NEW" , Font.BOLD, 15 ) );
			//( (JButton)wG.getObject( campo1 , field_FileDropper ) ).setText("Leggi risultato");
			if ( true )
			{
				System.out.println( "voidLoginResetButton - if" );
				winGen.utility.dialogInfo( "Avvio della richiesta di reset della password" );
			}
			else
			{
				System.out.println( "voidLoginResetButton - else" );
			}
		}
	}
	
	// bottone voidLoginCambioPasswordButton	 USATO PER TEST!!!
	private static class voidLoginCambioPasswordButton	 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			System.out.println( "Elaborazione voidLoginCambioPasswordButton" );
			
			System.out.println( "testWinGenMagaz.voidLogoutButton - Start Suona" );
			winGen.suonoWav	leggeWav = wG.new suonoWav();
			leggeWav.suonare( "bell03.wav" , 1500 );
			System.out.println( "testWinGenMagaz.voidLogoutButton - Fine Suona" );
			
			if (sessionManager.isLoggedIn())	// già loggato: OK, posso cambiare la Password!!!!
			{
				System.out.println( "La Password è "+wG.getText( campo_login , 1 ) );	// usato per test!
				sessionManager.logoutUser();	// usato per test!
				winGen.utility.dialogInfo( "Fare la procedura di cambio password! Sei stato Logout. Fai nuovamnte il Login!" );
				// Password cambiata: AZZERARE il campo PASSWORD e fare logout
			}
			else	// Non sei loggato! Non posso camboiare la Password!
			{
				winGen.utility.dialogInfo( "Non sei loggato! Non posso camboiare la Password!" );
				System.out.println( "Non sei loggato! Non posso camboiare la Password!" );
			}
		}
	}
	
	// readMyFileDropperHex( nomeDelFile ) - legge il file come row flow ma in Hex
	private static void readMyFileDropperHex( File nomeDelFile )
	{
		System.out.println( "START - readMyFileDropperHex( "+nomeDelFile+" )" );
		BufferedReader reader=null;
		long startime = System.currentTimeMillis();
		int nLine = 0;
		try
		{
			//File file = new File("sample-file.dat");
			reader = new BufferedReader(new FileReader(nomeDelFile));
			String line;
			System.out.println( "Lettura del file "+nomeDelFile+" - Lunghezza in Bytes = "+nomeDelFile.length() );
			while ((line = reader.readLine()) != null)
			{
				byte[] b = line.getBytes();
				System.out.print( "line ASCII = " );
				for(int i=0; i<line.length(); i++)
				{
					System.out.print( line.substring(i,i+1)+"  " );
				}
				System.out.println();
				System.out.print( "line  HEX  = " );
				for(int i=0; i<line.length(); i++)
				{
					byte singleByte = b[i];
					// System.out.print( "byte["+i+"] b = "+b[i]+ " ("+(char)b[i]+")" );
					System.out.print( winGen.utility.zTrim(b[i],2)+" " );
				}
				System.out.println();
				nLine++;
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();	
		}
		finally
		{
			try
			{
				reader.close();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println( "Durata in ms: "+(System.currentTimeMillis() - startime) +" - Righe del file: "+nLine );
		System.out.println( "START - readMyFileDropperHex( "+nomeDelFile+" )" );
	}
	
	// SQL: sqlConnection() - connessione al DB
	private static boolean sqlConnection()
	{
		// connessione al DB - START
		Sql.setJdbcDriver ( SQL_JDBC_DRIVER );
		Sql.setJdbcUrl ( SQL_JDBC_URL );
		//Sql.setJdbcName ( SQL_JDBC_NAME );
		
		// decryptFile START
		// Sql.setJdbcPassword ( SQL_JDBC_PASS );	// prima era così semplicemente
		// Sql.setJdbcName ( SQL_JDBC_NAME );		// prima era così semplicemente
		// user di acceso a MariaDB: la cerco nela file crittografato! studiare meglio
		// password di aaccesso a MariaDB: la cerco nela file crittografato! studiare meglio
		try
		{
			String fileContentPassword = decryptFile.readFile( "db_pass.enc" );
			String fileContentUsername = decryptFile.readFile( "db_user.enc" );
			// IMPORTANTE: il metodo decrypt si aspetta encryptedText come primo parametro
			// e masterPassword come secondo. La tua riga è invertita.
			// L'output di decryptFile.readFile( "db_user.enc" ) è il testo criptato.
			// L'output di decryptFile.readFile( "db_pass.enc" ) è il testo criptato.
			// "MyUltraSecretMasterKeyForMariaDbUsernameAccess" è la master key di username di accesso
			// "MyUltraSecretMasterKeyForMariaDbPasswordAccess" è la master key di password di acceso

			// Correggi l'ordine dei parametri qui:
			String decryptedUsername = decryptFile.decrypt( fileContentUsername , "MyUltraSecretMasterKeyForMariaDbUsernameAccess");
			String decryptedPassword = decryptFile.decrypt( fileContentPassword , "MyUltraSecretMasterKeyForMariaDbPasswordAccess");

			// Ora puoi usare la decryptedUsername e la decryptedPassword,  ad esempio per configurare il JDBC
			System.out.println("Username MariaDB decriptata: " + decryptedUsername);
			Sql.setJdbcName ( decryptedUsername );
			System.out.println("Password MariaDB decriptata: " + decryptedPassword);
			Sql.setJdbcPassword ( decryptedPassword );
			// Sql.setJdbcName ( SQL_JDBC_NAME );		// prima era così semplicemente
			//Sql.setJdbcPassword ( SQL_JDBC_PASS ); // prma era così semplicemente
		}
		catch (IOException e)
		{
			System.err.println("Errore di I/O durante la lettura del file 'db_pass.enc': " + e.getMessage());
			// Puoi aggiungere qui una logica per gestire l'errore, es. uscire dall'applicazione
			System.exit(1);
		}
		catch (Exception e)
		{
			// Questo catch generico prenderà qualsiasi altra Exception (es. da decrypt)
			System.err.println("Errore generico durante la decrittazione della password: " + e.getMessage());
			// Puoi aggiungere qui una logica per gestire l'errore, es. uscire dall'applicazione
			// e.printStackTrace(); // Utile per il debug, da rimuovere in produzione
			System.exit(1);
		}
		// decryptFile END
			
		if (Sql.classForName())
		{
			if (Sql.connect())
			{
				System.out.println( "sqlConnection - Connessione al dbase Ok" );
				return( true );
			}
			else
			{
				System.out.println( "sqlConnection - Connessione al dbase non riuscita" );
				winGen.utility.dialogError( "sqlConnection - Connessione al dbase non riuscita" );
				//?? errore
				System.exit(0);
				// return( false );
			}
		}
		else
		{
			System.out.println( "sqlConnection - Connessione al dbase non riuscita (ClassForName)" );
			winGen.utility.dialogError( "sqlConnection - Connessione al dbase non riuscita (ClassForName)" );
			System.exit(0);
			// return( false );
		}
		return( false );
		// connessione al DB - END
	}
	
	// bottone voidMyActListener USATO PER TEST!!!
	private static class voidMyActListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			System.out.println( "Test Listener1 di testWinGenMagaz" );
			System.out.println( "Valore di del primo componente 2 del campo2: "+wG.getText( campo1 , 0 ) );
			System.out.println( "Valore di del primo componente 2 del campo2: "+wG.getText( campo1 , 1 ) );
		}
	}
	// checkbox voidTerzoMyActListener USATO PER TEST!!!
	private static class voidTerzoMyActListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			System.out.println( "Test Listener2 di testWinGenMagaz" );
			System.out.println( "Valore del terzo componente 3 del campo2: "+wG.isSelected( campo2 , 2 ) );
			System.out.println( "Punto sul Valore 2 del JComboBox" );
			wG.setSelectedIndex( campo2 , 3, 2 );
			// stampo anche la password
			System.out.println( "Password = "+wG.getText( campo2 , 7 ) );
		}
	}
	// checkbox voidQuartoMyActListener USATO PER TEST!!!
	private static class voidQuartoMyActListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			System.out.println( "Quarto Listener di testWinGenMagaz per attivazione del campo password" );
			System.out.println( "Valore del terzo componente 3 del campo1: "+wG.isSelected( campo1 , 2 ) );
			System.out.println( "Punto sul Valore 1 del JComboBox" );
			wG.setSelectedIndex( campo1 , 3, 2 );
			// stampo anche la password
			System.out.println( "Password = "+wG.getText( campo1 , 1 ) );
		}
	}
	// combobox voidQuattroMyActListener USATO PER TEST!!!
	private static class voidQuattroMyActListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			System.out.println( "Test Listener3 di testWinGen" );
			System.out.println( "Valore del terzo componente 4 del campo2: "+wG.getSelectedItem( campo2 , 3 )+"("+wG.getSelectedIndex( campo2 , 3 )+")" );
		}
	}
	// radio1 voidMyradioGruppo1AttivoDisattivoActListener1 USATO PER TEST!!!
	private static class voidMyradioGruppo1AttivoDisattivoActListener1 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			System.out.println( "Test Listener radio1" );
			//((JProgressBar)campo2.get( (181) )).setValue( 25 );
			// vtedu MyThread1
			if (!th1.starting)
			{
				th1.campoThread = campo1;
				int x = (campo_MAX_NUM_CAMPO*(field_BARRAQTA-1))+campo_COMPONENTE;
				System.out.println( "campo_MAX_NUM_CAMPO*field_BARRAQTA)+campo_COMPONENTE "+x  );
				//th1.jPB_progressRun = ((JProgressBar)campo1.get( (421) ));
				th1.jPB_progressRun = ((JProgressBar)campo1.get( (campo_MAX_NUM_CAMPO*field_BARRAQTA)+campo_COMPONENTE ));
				th1.starting = true;
			}
			else
			{
				System.out.println( "Sta girando th1 (radio1)!!!" );
			}
		}
	}
	// radio2 voidMyradioGruppo1AttivoDisattivoActListener2 USATO PER TEST!!!
	private static class voidMyradioGruppo1AttivoDisattivoActListener2 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			System.out.println( "Test Listener radio2" );
			//((JProgressBar)campo2.get( (221) )).setValue( 50 );
			if (!th2.starting)
			{
				th2.campoThread = campo2;
				th2.jPB_progressRun = ((JProgressBar)campo2.get( (416) ));
				th2.starting = true;
			}
			else
			{
				System.out.println( "Sta girando th2 (radio2)!!!" );
			}
		}
	}
	// radio1 voidMyradioGruppo2AttivoDisattivoVenditaActListener1 USATO PER TEST!!!
	private static class voidMyradioGruppo2AttivoDisattivoVenditaActListener1 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			System.out.println( "Test Listener radio3" );
			//((JProgressBar)campo2.get( (221) )).setValue( 50 );
			if (!th3.starting)
			{
				th3.campoThread = campo1;
				int x = (campo_MAX_NUM_CAMPO*(field_BARRAQTA-1))+campo_COMPONENTE;
				System.out.println( "campo_MAX_NUM_CAMPO*field_BARRAQTA)+campo_COMPONENTE "+x  );
				//th3.jPB_progressRun = ((JProgressBar)campo1.get( (421) ));
				th3.jPB_progressRun = ((JProgressBar)campo1.get( (campo_MAX_NUM_CAMPO*field_BARRAQTA)+campo_COMPONENTE ));
				th3.starting = true;
				
				// vedi MyThread2
				th3.attualeValore = 0;
				th3.massimoValore = 10;
				
				for (int i=0; i<=th3.massimoValore; i++)
				{
					th3.attualeValore = i;
					try {Thread.sleep(250);}catch(InterruptedException ieex){}
				}
			}
			else
			{
				System.out.println( "Sta girando th3 (radio3)!!!" );
			}
		}
	}
	// radio2 voidMyradioGruppo2AttivoDisattivoVenditaActListener2 USATO PER TEST!!!
	private static class voidMyradioGruppo2AttivoDisattivoVenditaActListener2 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
		}
	}
	// radio1 voidMyradioGruppo3AttivoDisattivoOrdiniActListener1 USATO PER TEST!!!
	private static class voidMyradioGruppo3AttivoDisattivoOrdiniActListener1 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
		}
	}
	// radio2 voidMyradioGruppo3AttivoDisattivoOrdiniActListener2 USATO PER TEST!!!
	private static class voidMyradioGruppo3AttivoDisattivoOrdiniActListener2 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
		}
	}
	// radio1 voidMyradioGruppo4AttivoDisattivoStampaActListener1 USATO PER TEST!!!
	private static class voidMyradioGruppo4AttivoDisattivoStampaActListener1 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			System.out.println( "Test Listener radio4" );
			if (fd1.dropFile != null)
			{
				System.out.println( "testWinGenMagaz::voidMyradioGruppo4AttivoDisattivoStampaActListener1 - fd1.dropFile = " + fd1.dropFile );
				//((JProgressBar)campo2.get( (221) )).setValue( 50 );
				if (!th4.starting)
				{
					th4.campoThread = campo1;
					int x = (campo_MAX_NUM_CAMPO*(field_BARRAQTA-1))+campo_COMPONENTE;
					System.out.println( "campo_MAX_NUM_CAMPO*field_BARRAQTA)+campo_COMPONENTE "+x  );
					//th4.jPB_progressRun = ((JProgressBar)campo1.get( (421) ));
					th4.jPB_progressRun = ((JProgressBar)campo1.get( (campo_MAX_NUM_CAMPO*field_BARRAQTA)+campo_COMPONENTE ));
					
					th4.starting = true;
		read_file_log_x25 read_x25	= new read_file_log_x25();
		read_x25.open( "prova1.txt" );
					
				}
				else
				{
					System.out.println( "Sta girando th4 (radio3)!!!" );
				}
			}
			else
			{
				System.out.println( "testWinGenMagaz::voidMyradioGruppo4AttivoDisattivoStampaActListener1 - fd1.dropFile e' vuoto, cioe' e' null" );
			}
			
			
			
			
		}
	}
	// radio2 voidMyradioGruppo4AttivoDisattivoStampaActListener2 USATO PER TEST!!!
	private static class voidMyradioGruppo4AttivoDisattivoStampaActListener2 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
		}
	}
	// test MouseListener PopUpMenu tasto dx USATO PER TEST!!!
	private static class voidMouseTest_campo1_01 implements MouseListener
	{
		public void mouseReleased(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
		public void mousePressed(MouseEvent e) {}
		public void mouseClicked(MouseEvent e)
		{
			System.out.println( "Test mouse clicked" );
			if (e.getClickCount() == 2)
			{
				System.out.println( "++ DOPPIO CLICK!" );
				if ( e.getButton() == MouseEvent.BUTTON3 ) { System.out.println( "BOTTONE DESTRO" ); }
				else { System.out.println( "BOTTONE SINSTRO" );  System.out.println( "e.getPoint() = "+e.getPoint() ); }
			}
			else if (e.getClickCount() == 1)
			{
				System.out.println( "+UN CLICK SOLO!" );
				if ( e.getButton() == MouseEvent.BUTTON3 )
				{
					System.out.println( "BOTTONE DESTRO" );
					// test attivazione trigger del menu
					System.out.println( "Apre il popup menu" );
					JPopupMenu menu_campo1 = new JPopupMenu();
					JMenuItem item_campo1 = new JMenuItem("test 1 campo 1");
					item_campo1.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e2) { System.out.println("PopUpMenu: test 1 campo 1"); } });
					menu_campo1.add(item_campo1);
					item_campo1 = new JMenuItem("test 2 campo 1");
					item_campo1.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e2) { System.out.println("PopUpMenu: test 2 campo 1"); } });
					menu_campo1.add(item_campo1);
					menu_campo1.show( e.getComponent(), e.getX()+5, e.getY()-5 );
				}
				else
				{
					System.out.println( "BOTTONE SINSTRO" );
				}
			}
		}
	}
	// test MouseListener PopUpMenu tasto dx USATO PER TEST!!!
	private static class voidMouseTest_campo1_02 implements MouseListener
	{
		public void mouseReleased(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
		public void mousePressed(MouseEvent e) {}
		public void mouseClicked(MouseEvent e)
		{
			System.out.println( "Test mouse clicked" );
			if (e.getClickCount() == 2)
			{
				System.out.println( "++ DOPPIO CLICK!" );
				if ( e.getButton() == MouseEvent.BUTTON3 ) { System.out.println( "BOTTONE DESTRO" ); }
				else { System.out.println( "BOTTONE SINSTRO" );  System.out.println( "e.getPoint() = "+e.getPoint() ); }
			}
			else if (e.getClickCount() == 1)
			{
				System.out.println( "+UN CLICK SOLO!" );
				if ( e.getButton() == MouseEvent.BUTTON3 )
				{
					System.out.println( "BOTTONE DESTRO" );
					// test attivazione trigger del menu
					System.out.println( "Apre il popup menu" );
					JPopupMenu menu_campo1 = new JPopupMenu();
					JMenuItem item_campo1 = new JMenuItem("test 1 campo 2");
					item_campo1.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e2) { System.out.println("PopUpMenu: test 1 campo 2"); } });
					menu_campo1.add(item_campo1);
					item_campo1 = new JMenuItem("test 2 campo 2");
					item_campo1.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e2) { System.out.println("PopUpMenu: test 2 campo 2"); } });
					menu_campo1.add(item_campo1);
					menu_campo1.show( e.getComponent(), e.getX()+5, e.getY()-5 );
				}
				else
				{
					System.out.println( "BOTTONE SINSTRO" );
				}
			}
		}
	}
}








/****************************************************************************/
/****************************************************************************/
class MyThread1 extends Thread	// avvia e scorre la JProgressBar USATO PER TEST!!!
{
	public	Object jPB_progressRun;
	public	Vector<Object> campoThread = new Vector<Object>();
	public	boolean starting = false;
	public boolean isRunning = true;
	public static boolean endAllThreads = false;
	
	public synchronized void run()
	{
		System.out.println( "1. getState() "+getState() );
		System.out.println( "MyThread: START" );
		while ( isRunning )
		{
			if (endAllThreads) {break;}
			// System.out.println( "2. getState() "+getState() );
			try {Thread.sleep(200);}catch(InterruptedException ieex){}
			if ( starting )	// sta girando ... la JProgressBar
			{
				System.out.println( "ProgressBar avviata" );
				int value = 0;
				((JProgressBar)jPB_progressRun).setValue(0);
				for (int i=0; i<=100;i++)
				{
					if (endAllThreads) {break;}
					((JProgressBar)jPB_progressRun).setValue( i );
					try {Thread.sleep(50);}catch(InterruptedException ieex){}
				}
				starting = false;
			}
			else
			{
				// serve per dare pausa mentre il thread e' spento: SERVE?!?!?!
				try {Thread.sleep(250);}catch(InterruptedException ieex){}
			}
		}
		// Fine del processo
		System.out.println( "3. getState() "+getState() );
		System.out.println( "MyThread: END" );
	}
}
/****************************************************************************/
/****************************************************************************/
class MyThread2 extends Thread	// avvia e scorre la JProgressBar USATO PER TEST!!!
{
	public	Object jPB_progressRun;
	public	Vector<Object>	campoThread = new Vector<Object>();
	public	boolean			starting = false;
	public	boolean			isRunning = true;
	public	int				attualeValore;
	public	int				massimoValore;
	
	public static boolean endAllThreads = false;
	
	
	public synchronized void run()
	{
		System.out.println( "1. getState() MyThread2 "+getState() );
		System.out.println( "MyThread2: START" );
		while ( isRunning )
		{
			if (endAllThreads) {break;}
			// System.out.println( "2. getState() "+getState() );
			try {Thread.sleep(200);}catch(InterruptedException ieex){}
			if ( starting )	// sta girando ... la JProgressBar
			{
				System.out.println( "ProgressBar avviata MyThread2" );
				
				((JProgressBar)jPB_progressRun).setMaximum(massimoValore);
				((JProgressBar)jPB_progressRun).setValue(0);
				int i = 0;
				while (i<massimoValore)
				{
					if (endAllThreads) {break;}
					if (i==attualeValore)	// il valore non e' variato e quindi non ristampa la JProgressBar
					{
					}
					else	// il valore e' cambiato: stampare la JProgressBar
					{
					//	System.out.println( "attualeValore = "+attualeValore );
					//	System.out.println( "massimoValore = "+massimoValore );
						i=attualeValore;
						((JProgressBar)jPB_progressRun).paintImmediately(0, 0, 1000, 100);	// i valori sono sommari e coprono ogni esigenza
						((JProgressBar)jPB_progressRun).setValue( attualeValore );
					}
					if (!starting) {break;}
				}
				
				starting = false;
			}
			else
			{
				// serve per dare pausa mentre il thread e' spento: SERVE?!?!?!
				try {Thread.sleep(250);}catch(InterruptedException ieex){}
			}
		}
		// Fine del processo
		System.out.println( "3. getState() MyThread2 "+getState() );
		System.out.println( "MyThread2: END" );
	}
}
/****************************************************************************/
