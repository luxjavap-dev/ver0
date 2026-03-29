/**

ATTENZIONE ... PER USARE IL BLOB FARE COME SEGUE
mysql --password=luxlux --user=root
mysql> SET GLOBAL max_allowed_packet=32*1024*1024;
meglio ancora andare nei fine .ini e cambiare in 32M il valore di max_allowed_packet
il file corretto e' my.ini e va messo cosi', RICORDARSI DI METTERE SOTTO [mysqld] :
[mysqld]
...
max_allowed_packet = 32M
...

Auesto punto fare ripartire il server o riavviare il server


	Programma:
		versioning_main.java
	Data creazione:
		22 settembre 2009
	Copyright:
		copyright (c) 2008 by ENAV S.p.A. - I.C.C.
	Licenza:
		TBD
	Compilazione:
		javac versioning_main.java
	Uso:
		java versioning_main
	Versione:
		1.0 del 22 settembre 2009
	
	Versione java (ultima compilazione):
		JDK7 build 1.7.0-ea-b23
		Nota: Download il JDK7 da: https://jdk7.dev.java.net/
	
	MySql version (ultima release):
		MySql server version 5.0.27-community-nt
	
	Servers:
		\\172.24.130.12			- (vecchio da dismettere)
		\\172.31.4.21			- (nuovo)
		\\172.31.4.23			- (doc.server)
	
	Interfacce, classi e metodi:
		* versioning_constants			- interface
		* versioning_main				- questo file
		  versioning_main.main()		- start
		* 
	
	Author:
		lucio la verde (ENAV S.p.A. - I.C.C.)
	
	Since:
		JDK7 build 1.7.0-ea-b23
		MySql server version 5.0.27-community-nt
	
	
	********************************************************************************************
	Lista dei Programmi
		versioning_main.java
		
	Lista delle CLASSI
		versioning_constants	(interface)
		versioning_main			(ver)	implements	versioning_constants
		versioning_MMI			(mmi)	implements	versioning_constants
		versioning_login		(login)	implements	versioning_constants
		versioning_util			(ut)	implements	versioning_constants
		versioning_sqlFunctions	(Sql)	
		versioning_db			(db)	implements	versioning_constants
		versioning_fileDropper	(fd)	extends DropTargetAdapter	implements	versioning_constants
		versioning_MyThread		(th)	extends Thread				implements	versioning_constants
		
	Lista dei METODI
		-versioning_main
			main									- main()
			loadListaApplicazioni()					- applicazioni: caricamento della lista
			loadApplicazione()						- applicazioni: caricamento dell'applicazione selezionata
			newApplicazione()						- applicazioni: creazione
			delApplicazione()						- applicazioni: cancellazione
			altApplicazione()						- applicazioni: mette in 'Stopped'
			runApplicazione()						- applicazioni: mette in 'Running'
			loadListaVersioni()						- versioni: caricamento della lista
			loadVersione()							- versioni: caricamento della versione selezionata
			newVersione()							- versioni: creazione
			clonaVersione()							+ versioni: clonazione
			delVersione()							- versioni: cancellazione
			attivaVersione()						- versioni: mette in 'Attiva'
			storedVersione()						- versioni: mette in 'Stored'
			loadListaFiles()						- files: caricamento in JTable
			filesDel()								- files: cancellazione di un singolo file
			getDesAppFromCombo()					- applicazioni: descrizione attuale dell'Applicazione selezionata
			getIsRunningAttApplicazione(			- applicazioni: descrizione attuale dell'Applicazione selezionata
			getNumAppFromCombo()					- applicazioni: prende il numero applicazione da Combo selezionato
			getNumVerFromCombo()					- versioni: prende il numero versione da Combo selezionato
			setComponentsEnabled1()					- interfaccia: selezione pannello 'Applicazioni'
			setComponentsEnabled2()					- interfaccia: selezione pannello 'Versioni'
			setComponentsEnabled3()					- interfaccia: selezione pannello 'Files'
			setComponentsEnabled4()					+ interfaccia: NON USATA
			loadNumApplicazioneFromApplicazione()	- applicazioni: caricamento dell'applicazione selezionata
		-versioning_MMI
			init()									- mmi: inizializzazione
			setEnabled()							- mmi: visualizzazione [login.check()]
			initAllComponents()						- mmi: (private) [mmi.init()]
			jP_main_button_boolean()				+ mmi: (private) NON USATO
		-versioning_login
			jPlogin_enterKeyListenerClass (classe privata che implementa KeyListener)
			setEnabled()							-login: abilita/disabilita il login [ver.main(), mmi.initAllComponents()]
			check()									-login: check nome e password [login.initAllComponents(),login.jPlogin_enterKeyListenerClass]
			chiusuraCarp()							-login: chiusura Versioning [login.initAllComponents()]
		-versioning_MyThread
			setFileList()							- setta la lista dei files da copiare in versioning.files
			run()									- Thread della copia dei files con ProgressiveBar
			insertFile()							- inserisce un file nella tabella versioning.files
	private boolean insertFile( File f )
		-versioning_util
			readFilePara()
			rowIsParam()
			zTrim()
			lTrim()
			rTrim()
			lrTrim()
			setLog()
			JTextArea getLogJTA()
			writeLog()
			writeLog()
			writeLog()
			clearLog()
			sleep()
			data1()
			data2()
			data3()
			data4()
			data5()
			data6()
			data7()
			data8()
			readJTableOnDisk()
			writeJTableOnDisk()
			read_VectorOnDisk()
			write_VectorOnDisk()
			setFirstRowJTable()
			setLastRowJTable()
			createMD5()
			bytesToHEx()
			fileHashing()
			setEnabledJtab()
			getPassword()
			copyFile()
			isNumber()
			giorniTraDueDate()
			padStringa()
			dialogError()
			dialogInfo()
			dialogWarning()
			getDirSize()
			isRowInJTable()
			zipFile()
			zipDir()
			zipDir()
			unzip()
			copyInputStream()
		-versioning_sqlFunctions
			setConDb()
			setJdbcDriver()
			setJdbcUrl()
			setJdbcName()
			setJdbcPassword()
			setJdbcQuery()
			setJdbcColumns()
			setException()
			resetException()
			addJdbcSelect()
			delJdbcSelect()
			addJdbcColumnsName()
			delJdbcColumnsName()
			getConDb()
			getJdbcDriver()
			getJdbcUrl()
			getJdbcName()
			getJdbcPassword()
			getJdbcQuery()
			getJdbcColumns()
			getJdbcSelect()
			getJdbcColumnsName()
			getException()
			classForName()
			connect()
			disconnect()
			select()
			execute()
			delete()
			commit()
			rollback()
			update()
			columnType()
			exception()
			printStatus()
			isConnected()
			setConnected()
			getCurrentURL()
		-versioning_db
			creaDbIfNotExist()			- db: se non esistono crea database 'versioning' e tabelle 'applicazioni', 'versioni', 'files'
		-versioning_fileDropper
			drop()
			handleFileTransfer()
			handleURLStringsTransfer()
			fillFileList()
			fillFileListWithURLs()
			urlToFile()
			listaFilesDrop()			
			
			
			
			
		// ?? e questi qui sotto?
		printHTML.java						-	Gestione delle stampe nel file HTML
	********************************************************************************************
	
	Lista delle tabelle:
		versioning.applicazioni			- descrizione delle applicazioni (eCARP, QMT TT, Logistica, ecc.)
			NUMEROAPPLICAZIONE		CHARACTER (4)	NOT NULL UNIQUE	- numero applicazione (0001-9999)
			RUNNINGSTOPPED			CHARACTER (7)	NOT NULL		- "Running", "Stopped"
			DESCRIZIONE				CHARACTER (40)	NOT NULL UNIQUE	- descrizione della applicazione
			NUMEROVERSIONEATTIVA	CHARACTER (6)	NOT NULL 		- numero versione (001.00-999.99). 000.00=nessuna versione
			
		versioning.versioni				- descrizioni delle versioni delle applicazioni
			NUMEROAPPLICAZIONE		CHARACTER (4)	NOT NULL 		- numero applicazione (0001-9999)
			NUMEROVERSIONE			CHARACTER (6)	NOT NULL 		- numero versione (001.00-999.99)
			DATA					CHARACTER (10)	NOT NULL 		- data (Es: 2009-04-22)
			ATTIVASTORED			CHARACTER (6)	NOT NULL 		- "Attiva", "Stored"
			DESCRIZIONE				CHARACTER (120)	NOT NULL 		- descrizione della versione
			- UNIQUE (NUMEROAPPLICAZIONE,NUMEROVERSIONE)
			
		versioning.files				- file suddivisi per applicazione e versione
			NUMEROAPPLICAZIONE		CHARACTER (4)	NOT NULL 		- numero applicazione (0001-9999)
			NUMEROVERSIONE			CHARACTER (6)	NOT NULL 		- numero versione (001.00-999.99)
			OLDNEWUP				CHARACTER (3)	NOT NULL 		- "Old", "New", "Up"
			TIPO					CHARACTER (3)	NOT NULL 		- "Dir", "Fil"
			DIRECTORY				CHARACTER (40)	NOT NULL 		- nome directory se tipo e' "Dir"
			FILE					CHARACTER (80)	NOT NULL 		- nome file: "Fil" e' un file qualsiasi, "Dir" e' un file zip
			HASH					CHARACTER (32)	NOT NULL		- hash code
			BLOBFILE				LONGBLOB		NOT NULL		- file o directory (MaxLen=4Gb)	//?? compressi?
			- UNIQUE (NUMEROAPPLICAZIONE,NUMEROVERSIONE,DIRECTORY,FILE)
*/



import java.util.zip.ZipFile;
import java.util.zip.ZipEntry;
import java.net.URL;
import java.net.URI;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.awt.dnd.*;
import java.awt.datatransfer.*;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import javax.swing.JFrame;
import javax.swing.ListSelectionModel;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.event.TableModelListener;
import javax.swing.event.TableModelEvent;
import javax.swing.table.TableModel;
import javax.swing.table.DefaultTableCellRenderer;
import java.util.Vector;
import javax.swing.ToolTipManager;
import java.awt.Rectangle;
import java.io.File;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.JTabbedPane;
import javax.swing.JPasswordField;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.io.InputStream;
//import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.io.BufferedOutputStream;
import java.util.Vector;
import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionListener;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.*;
import java.util.Vector;
import java.sql.DatabaseMetaData;
import java.awt.Font;
import javax.swing.event.ListSelectionEvent;
import java.util.zip.ZipOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

///////////////////////////////////////////////////////
/** versioning_constants START */
interface versioning_constants
{
	/** SQL */
	public final boolean	SQL_JDBC_LOCAL	= true;
	public final String		SQL_JDBC_SERVER_NAME	= SQL_JDBC_LOCAL ? "[Server locale]" : "[Server QMT]";
	public final String		SQL_JDBC_IP				= SQL_JDBC_LOCAL ? "127.0.0.1" : "172.31.4.21";	// 127.0.0.1 o 172.31.4.21 (vecchio server era 172.24.130.12)
	public final String		SQL_JDBC_PORT			= SQL_JDBC_LOCAL ? "3306" : "3306";	// 3306 o 3306;
	public final String		SQL_JDBC_NAME			= SQL_JDBC_LOCAL ? "root" : "root";	// root o root
	public final String		SQL_JDBC_PASS			= SQL_JDBC_LOCAL ? "luxlux" : "enav";	// luxlux o enav
	public final String		SQL_JDBC_URL			= "jdbc:mariadb://"+SQL_JDBC_IP+":"+SQL_JDBC_PORT+"/"; //"jdbc:mariadb://"+SQL_JDBC_IP+":"+SQL_JDBC_PORT+"/";
	public final String		SQL_JDBC_DRIVER			= "org.mariadb.jdbc.Driver"; //"com.mysql.jdbc.Driver";
	
	// costanti
	public static final String				LOG_NOME				= "admin";
	public static final String				LOG_PASSWORD			= "admin";
	
	// istanze
	public versioning_main					ver						= new versioning_main();
	public versioning_login					login					= new versioning_login();
	public versioning_util					ut						= new versioning_util();
	public versioning_sqlFunctions			Sql						= new versioning_sqlFunctions();
	public versioning_MMI					mmi						= new versioning_MMI();
	public versioning_fileDropper			fd						= new versioning_fileDropper();
	public versioning_db					db						= new versioning_db();
	
	// eol
	public static final char[]			e_ol					= { (char) 0x0d , (char) 0x0a };
	public static final String			eol						= String.valueOf(e_ol[0]) + String.valueOf(e_ol[1]);
	public static final ImageIcon		versioningIcona			= new ImageIcon("versioning_icona.jpg");			// icona
	
	// dialog
	public static final JFrame			jFdialog				= new JFrame();
	
	// -login
	public static JFrame				jFlogin					= new JFrame();
	public static JPanel				jPlogin					= new JPanel( ); 
	public static TitledBorder 			jTlogin					= BorderFactory.createTitledBorder( "Nome e Password" );
	public static JLabel				jPlogin_labelUsername	= new JLabel( "Nome" );
	public static JTextField			jPlogin_textUsername	= new JTextField( 50 );
	public static JButton				jPlogin_buttonConferma	= new JButton( "Login" );
	public static JLabel				jPlogin_labelPassword	= new JLabel( "Password" );
	public static JPasswordField	 	jPlogin_textPassword	= new JPasswordField( 50 );
	public static JButton				jPlogin_buttonExit		= new JButton( "Exit" );
	
	// main
	public static final JFrame			jF_main					= new JFrame();
	public static final JPanel			jP_main					= new JPanel();
	public static final TitledBorder	jTBjP_main				= BorderFactory.createTitledBorder( "Interfaccia principale" );
	public static final JPanel			jP_applicazioni			= new JPanel();
	public static final TitledBorder	jTBjP_applicazioni		= BorderFactory.createTitledBorder( "Applicazioni" );
	public static final JPanel			jP_versioni				= new JPanel();
	public static final TitledBorder	jTBjP_versioni			= BorderFactory.createTitledBorder( "Versioni" );
	public static final JPanel			jP_listaFiles			= new JPanel();
	public static final TitledBorder	jTBjP_listaFiles		= BorderFactory.createTitledBorder( "Tabella della versione selezionata" );
	public static final JPanel			jP_listaFilesDrop		= new JPanel();
	public static final TitledBorder	jTBjP_listaFilesDrop	= BorderFactory.createTitledBorder( "  Fai il Drop dei file che vuoi caricare in questo riquadro  " );
	public static final DropTarget		dropTarget				= new DropTarget( jP_listaFilesDrop, fd );
	public static final JProgressBar	jPB_progress			= new JProgressBar();
	public static final Vector<String>	v_listaApplicazioni		= new Vector<String>();
	public static final JComboBox<String> jCB_listaApplicazioni = new JComboBox<>(v_listaApplicazioni);
	public static final JButton			jB_listaApplicazioniLoad= new JButton("Carica");
	public static final JButton			jB_listaApplicazioniNew	= new JButton("Nuova");
	public static final JButton			jB_listaApplicazioniDel	= new JButton("Cancella");
	public static final JButton			jB_listaApplicazioniAlt	= new JButton("Stop");
	public static final JButton			jB_listaApplicazioniRun	= new JButton("Start");
	public static final JButton			jB_listaApplicazioniUp	= new JButton("Vai a Login");
	public static final JLabel			jL_listaApplicazioniStat= new JLabel();
	public static final Vector<String>	v_listaVersioni			= new Vector<String>();
	public static final JComboBox<String> jCB_listaVersioni		= new JComboBox<>(v_listaVersioni);
	public static final JLabel			jL_versioneAttivaYN		= new JLabel();
	public static final JButton			jB_listaVersioniLoad	= new JButton("Carica");
	public static final JButton			jB_listaVersioniNew		= new JButton("Nuova");
	public static final JButton			jB_listaVersioniClona	= new JButton("Clona");
	public static final JButton			jB_listaVersioniDel		= new JButton("Cancella");
	public static final JButton			jB_listaVersioniAttiva	= new JButton("Attiva");
	public static final JButton			jB_listaVersioniStored	= new JButton("Stored");
	public static final JButton			jB_listaVersioniUp		= new JButton("Vai a Applicazioni");
	public static final JButton			jB_listaFilesDel		= new JButton("Cancella il file");
	public static final JButton			jB_listaFilesUp			= new JButton("Vai a Versioni");
	
	
	
	
	
	
	// tabella
	public static final int				colVER1					= 0;
	public static final int				colVER2					= 1;
	public static final int				colOLD_NEW_UP			= 2;
	public static final int				colTIPO					= 3;
	public static final int				colDIR					= 4;
	public static final int				colFILE					= 5;
	public static final int				colHASH					= 6;
	public static final DefaultTableModel	jT_listaFilesMod	= new DefaultTableModel();
	public static final JTable			jT_listaFiles			= new JTable( jT_listaFilesMod )
	{
		public Class<?> getColumnClass(int c)
		{
			try
			{
			if ( !(getValueAt(0, c).getClass()==null) )
			{
				return getValueAt(0, c).getClass();
			}
			else
			{
				return (new String()).getClass()  ;
			}
			}
			catch (Exception x)
			{
			}
			return (new String()).getClass()  ;
		}
		// inserisce un JToolTipText col valore della cella
		public Component prepareRenderer(TableCellRenderer renderer, int rowIndex, int vColIndex)
		{
			Component c = super.prepareRenderer(renderer, rowIndex, vColIndex);
			if (c instanceof JComponent)
			{
				JComponent jc = (JComponent)c;
				String s0 = (String)getValueAt(rowIndex, colVER1 );
				String s1 = (String)getValueAt(rowIndex, colVER2 );
				String s2 = (String)getValueAt(rowIndex, colOLD_NEW_UP );
				String s3 = (String)getValueAt(rowIndex, colTIPO );
				String s4 = (String)getValueAt(rowIndex, colDIR );
				String s5 = (String)getValueAt(rowIndex, colFILE );
				String s6 = (String)getValueAt(rowIndex, colHASH );
				jc.setToolTipText("<html><font color=blue>Versione: <font color=green>"+s0+"."+s1+"<BR>"+
									"<font color=blue>Old/New/Up: <font color=green>"+s2+"<BR>"+
									"<font color=blue>File/Dir: <font color=green>"+s3+"<BR>"+
									"<font color=blue>Dir: <font color=red>"+s4+"<BR>"+
									"<font color=blue>File: <font color=green>"+s5+"<BR>"+
									"<font color=blue>Hash: <font color=green>"+s6 );
			}
			return c;
		}
		public boolean isCellEditable(int row, int col)
		{
		//	if ( col >= colVER1 && col <= 2 ) // edita da colIMPIEGO e colNONAPPROVATO
		//	{
		//		return true;
		//	}
			return false;
		}
	};
	public static ListSelectionModel lsmjT_listaFiles = jT_listaFiles.getSelectionModel();
	public static JScrollPane jSP_listaFiles = new JScrollPane( jT_listaFiles, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
}
/** versioning_constants END */
///////////////////////////////////////////////////////


///////////////////////////////////////////////////////
/** versioning_main START */
class versioning_main implements versioning_constants
{
// Inizio del file versioning_main.java (o versioning_util.java)

// Assicurati che tutti gli import necessari siano presenti qui


// QUESTA e' LA TUA CLASSE PRINCIPALE O LA CLASSE CHE CONTIENE QUESTI METODI.
// Assicurati che sia l'unica classe public in questo file e che il nome corrisponda al nome del file.

public class versioning_util { // Se la tua classe si chiama versioning_main, usa quello.

    // Il metodo writeLog non deve essere commentato e deve stare qui
    private void writeLog(int errorCode) {
        System.err.println("LOGGING ERRORE: " + errorCode);
        // Qui potresti avere la tua logica di logging reale
    }

    // Il metodo readJTableOnDisk (incollato qui)
	public Vector<Vector<Object>> readJTableOnDisk(String file) {
	    try (FileInputStream fis = new FileInputStream(file);
		    ObjectInputStream ois = new ObjectInputStream(fis)) {

		   // QUESTO E' IL PUNTO CRUCIALE. Leggi come Object.
		   Object obj = ois.readObject();

		   // Poi, verifica il tipo prima di castare.
		   if (obj instanceof Vector) {
			  // Cast dell'outer Vector (sicuro con wildcard)
			  Vector<?> rawOuterVector = (Vector<?>) obj;
			  Vector<Vector<Object>> typedOuterVector = new Vector<>();

			  // Itera sugli elementi interni
			  for (Object innerObj : rawOuterVector) {
				 if (innerObj instanceof Vector) {
					// Cast dell'inner Vector (sicuro con wildcard)
					Vector<?> rawInnerVector = (Vector<?>) innerObj;
					Vector<Object> typedInnerVector = new Vector<>();
					for (Object item : rawInnerVector) {
					    typedInnerVector.add(item); // Aggiunta sicura
					}
					typedOuterVector.add(typedInnerVector);
				 } else {
					System.err.println("versioning_util.readJTableOnDisk(): Errore: Trovato elemento interno inatteso. Tipo: " + innerObj.getClass().getName());
					writeLog(9012);
					return null;
				 }
			  }
			  System.out.println("versioning_util.readJTableOnDisk(): letto JTable dal file " + file + " len of Vector=" + typedOuterVector.size());
			  return typedOuterVector;
		   } else {
			  // Gestione del caso in cui l'oggetto letto non sia un Vector principale
			  System.err.println("versioning_util.readJTableOnDisk(): Errore: Tipo di oggetto principale inatteso. Tipo: " + obj.getClass().getName());
			  writeLog(9013);
			  return null;
		   }
	    } catch (ClassNotFoundException e) {
		   writeLog(9010);
		   e.printStackTrace();
		   return null;
	    } catch (FileNotFoundException e) {
		   writeLog(9011);
		   e.printStackTrace();
		   return null;
	    } catch (IOException e) {
		   writeLog(9010);
		   e.printStackTrace();
		   return null;
	    }
	}    // Qui incollare il metodo writeJTableOnDisk (che non hai mostrato in questo snippet ma dovrebbe stare qui)
	public boolean writeJTableOnDisk(DefaultTableModel jT, String file) {
	    System.out.println("versioning_util.writeJTableOnDisk(): write JTable su file " + file + " len=" + jT.getRowCount());

	    try (FileOutputStream fos = new FileOutputStream(file);
		    ObjectOutputStream oos = new ObjectOutputStream(fos)) {

		   Vector<?> rawDataVector = jT.getDataVector(); // Preleva il Vector grezzo
		   Vector<Vector<Object>> typedDataVector = new Vector<>(); // Crea Vector tipizzato

		   for (Object rowObj : rawDataVector) {
			  if (rowObj instanceof Vector) { // Controllo del tipo interno
				 Vector<?> rawRow = (Vector<?>) rowObj;
				 Vector<Object> typedRow = new Vector<>();
				 for (Object cellObj : rawRow) {
					typedRow.add(cellObj); // Aggiunta sicura
				 }
				 typedDataVector.add(typedRow);
			  } else {
				 System.err.println("versioning_util.writeJTableOnDisk(): Errore: Trovato elemento inatteso nel modello JTable. Tipo: " + rowObj.getClass().getName());
				 writeLog(9014);
				 return false;
			  }
		   }
		   oos.writeObject(typedDataVector); // Scrive il Vector fortemente tipizzato
		   oos.flush();
		   return true;
	    } catch (IOException e) {
		   writeLog(9012);
		   e.printStackTrace();
		   return false;
	    }
	}





    // Esempio di un altro metodo o della funzione main se questa e' la classe principale
    /*
    public static void main(String[] args) {
        // Il tuo codice main qui
    }
    */



 // FINE della classe versioning_util (o versioning_main)


}

	
	
	
	/** main - Avvio del programma */
	public static void main(String[] args)	throws IOException	
	{
		System.out.println( "versioning_main.main - Start" );
		
		mmi.init(); // Actives the SplashScreen and the Log
		
		
		// connessione al DB
		Sql.setJdbcDriver ( SQL_JDBC_DRIVER );
		Sql.setJdbcUrl ( SQL_JDBC_URL );
		Sql.setJdbcName ( SQL_JDBC_NAME );
		Sql.setJdbcPassword ( SQL_JDBC_PASS );
		if (Sql.classForName())
		{
			if (Sql.connect())
			{
				System.out.println( "versioning_main.main - Connessione al dbase Ok" );
			}
			else
			{
				System.out.println( "versioning_main.main - Connessione al dbase non riuscita" );
				//?? errore
				System.exit(0);
			}
		}
		else
		{
			System.out.println( "versioning_main.main - Connessione al dbase non riuscita (ClassForName)" );
			ut.dialogError( "Connessione al dbase non riuscita (ClassForName)" );
			System.exit(0);
		}
		// UNA TANTUM
		boolean fareVariazioniUnaTantum = false;	// UNA TANTUM
		if (fareVariazioniUnaTantum)	// UNA TANTUM
		{
			// funzione del main per cambiamento DB da eseguire solo una volta
			System.out.println( "mrm.main(): UNA TANTUM - START modifica delle tabelle" );
			try
			{
				PreparedStatement prepStat;
			
				String update1 = "alter table versioning.applicazioni add column NUMEROVERSIONEATTIVA CHARACTER (6) NOT NULL AFTER DESCRIZIONE";
				prepStat = Sql.getConDb().prepareStatement(update1);prepStat.executeUpdate();
				String update2 = "UPDATE versioning.applicazioni SET NUMEROVERSIONEATTIVA='00000';";
				prepStat = Sql.getConDb().prepareStatement(update2);prepStat.executeUpdate();
				Sql.getConDb().commit();
				prepStat.close();
			}
			catch (SQLException sqlEx)
			{
				System.out.println( "Errore "+sqlEx );
				sqlEx.printStackTrace();
				ut.dialogError("Errore una tantum: chiamare assistenza\n"+sqlEx.getMessage());
				System.exit(0);
			}
			catch (Exception Ex)
			{
				System.out.println( "Errore "+Ex );
				Ex.printStackTrace();
				ut.dialogError( "Errore una tantum: chiamare assistenza\n\n\nCodice errore:\n"+Ex.getCause()+"\n\nDescrizione errore:\n"+Ex.getMessage()+"\n\nTrace errore:\n"+Ex.getStackTrace()[0] );
				System.exit(0);
			}
			System.out.println( "mrm.main(): UNA TANTUM - END modifica delle tabelle" );
			System.exit(0);
		}
		db.creaDbIfNotExist();
		versioning_login.setEnabled(true);	// Login
		System.out.println( "versioning_main.main - End" );
		
		
		
		
		// TEST
		/*
		System.out.println( "(ut.zipDir(\"testcom\", \"miatestcom.zip\"))" );		
		if (ut.zipDir("testcom", "miatestcom.zip"))
		{
			System.out.println( "(ut.zipDir(\"testcom\", \"miatestcom.zip\")) --> Ok" );		
		}
		else
		{
			System.out.println( "(ut.zipDir(\"testcom\", \"miatestcom.zip\")) --> FALLITO!" );		
		}
		*/
		/*
		System.out.println( "(ut.unzip(\"miatestcom.zip\"))" );		
		if (ut.unzip("miatestcom.zip"))
		{
			System.out.println( "(ut.unzip(\"miatestcom.zip\")) --> Ok" );		
		}
		else
		{
			System.out.println( "(ut.unzip(\"miatestcom.zip\")) --> Fallito" );		
		}
		*/
		/*
		
		System.out.println( "(ut.zipDir(\"test2\", \"last2.zip\"))" );		
		if (ut.zipDir("test2", "last2.zip"))
		{
			System.out.println( "zipDir Ok" );
		}
		
		System.out.println( "(ut.zipFile(\"testo.txt\", \"testo.zip\"))" );		
		if (ut.zipFile("testo.txt", "testo.zip"))
		{
			System.out.println( "zipFile Ok" );
		}
		*/
	}
	//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX	//
	// PROGRAMMAZIONE VERSIONING												//
	//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX	//
	/** PARAMETRI */
	





	public String normalizzaVersione(String input) {
	    if (input == null || input.isEmpty()) return "00000";
	    
	    // Rimuoviamo il punto se l'utente lo ha scritto (es: "3.0" -> "30")
	    String pulita = input.replace(".", "");
	    
	    String risultato = "";

	    // CASO 1: L'utente ha scritto solo "3"
	    if (pulita.length() == 1) {
		   // Parte intera: "3" diventa "03" usando il tuo metodo (stringa, carattere, lunghezza)
		   String parteIntera = ut.padStringa(pulita, "0", 2);
		   // Aggiungiamo 3 zeri a destra per i decimali
		   risultato = parteIntera + "000";
	    } 
	    // CASO 2: L'utente ha scritto "30" (che per te e' 3.0)
	    else if (pulita.length() == 2) {
		   String parteIntera = ut.padStringa(pulita, "0", 2);
		   risultato = parteIntera + "000";
	    }
	    // CASO 3: L'utente ha scritto qualcosa di p lungo (es: "101" per 10.1)
	    else {
		   // Usiamo il tuo metodo standard per arrivare a 5 caratteri
		   risultato = ut.padStringa(pulita, "0", 5);
	    }
	    
	    return risultato;
	}






	
	/** loadListaApplicazioni() */
	public boolean loadListaApplicazioni()
	{
		boolean b = false;
		jCB_listaApplicazioni.removeAllItems();
		String query1 = "SELECT RUNNINGSTOPPED,DESCRIZIONE FROM versioning.applicazioni ORDER BY DESCRIZIONE";
		if (Sql.select(  query1 ))
		{
			Vector<Object> v = Sql.getJdbcSelect();
			int size = v.size();
			for (int i=0; i<size; i++)
			{
				v_listaApplicazioni.add((String)v.get(i++)+" - "+(String)v.get(i));
			}
			b = true;
		}
		else
		{
			Exception e = Sql.getException();
			System.out.println( "versioning_main.loadListaApplicazioni - Errore nel caricamento delle applicazioni: "+e.getMessage() );
			ut.dialogError("Non riesco a fare la query per caricare le applicazioni dal dbase!\n\n"+e.getMessage());
		}
		if (v_listaApplicazioni.size()>0)
		{
			jCB_listaApplicazioni.setSelectedIndex(0);
		}
		return b;
	}
	/** loadApplicazione() */
	public boolean loadApplicazione()
	{
		System.out.println( "versioning_main.loadApplicazione - start" );
		int attApp = jCB_listaApplicazioni.getSelectedIndex();
		if (attApp==-1)
		{
			ut.dialogError( "Nessuna applicazione selezionata da caricare" );
			return false;
		}
		// test
		loadListaVersioni();
		setComponentsEnabled2();
		return true;
	}
	/** newApplicazione() */
	public boolean newApplicazione()
	{
		System.out.println( "versioning_main.newApplicazione - start" );
		
		// test
		String s = (String)JOptionPane.showInputDialog(
			jFdialog,
			"Inserire il nome della nuova applicazione",
			"Nuova applicazione",
			JOptionPane.PLAIN_MESSAGE,
			null,
			null,
			"");
		if ( s==null || s.isEmpty() )
		{
			ut.dialogError( "Devi dare un nome all'applicazione" );
			return false;
		}
		else
		{
			if ( v_listaApplicazioni.lastIndexOf("Stopped - "+s)> -1 || v_listaApplicazioni.lastIndexOf("Running - "+s)> -1 )
			{
				ut.dialogError( "Esiste gia' l'applicazione '"+s+"'" );
				return false;
			}
			else
			{
				System.out.println( "versioning_main.newApplicazione - Ricerca di un nuovo NUMEROAPPLICAZIONE" );
				String query1 = "SELECT MAX(NUMEROAPPLICAZIONE) FROM versioning.applicazioni";
				if (Sql.select(  query1 ))
				{
					// check nuovo NUMEROAPPLICAZIONE
					int numapp = 0;
					Vector<Object> v = Sql.getJdbcSelect();
					System.out.println( "Len v = "+v.size() );
					if (v.size()>0)
					{
						if (v.get(0)!=null)
						{
							numapp = Integer.parseInt( (String)v.get(0) );
						}
					}
					++numapp;
					// insert applicazione nel database
					query1 = "INSERT INTO versioning.applicazioni"+
							" (NUMEROAPPLICAZIONE,RUNNINGSTOPPED,DESCRIZIONE,NUMEROVERSIONEATTIVA)"+
							" VALUES (?,?,?,?)";
					v.removeAllElements(); v.add(ut.zTrim(numapp,4)); v.add("Stopped"); v.add(s); v.add("00000");
					if (Sql.execute(  query1 , v  ))
					{
						System.out.println( "versioning_main.newApplicazione - Nuovo NUMEROAPPLICAZIONE: "+ut.zTrim(numapp,4) );
						v_listaApplicazioni.add("Stopped - "+s);
						jCB_listaApplicazioni.updateUI();
						jCB_listaApplicazioni.setSelectedIndex( jCB_listaApplicazioni.getItemCount()-1 );
						ut.dialogInfo( "Inserita la nuova applicazione '"+s+"'\n\nNel database l'applicazione e' la numero "+ut.zTrim(numapp,4) );
						return true;
					}
					else
					{
						Exception e = Sql.getException();
						System.out.println( "versioning_main.newApplicazione - Errore nell'inserimento nel database della nuova applicazione: "+e.getMessage() );
						ut.dialogError("Errore di inserimento nel database della nuova applicazione!\n\n"+e.getMessage());
						return false;
					}
				}
				else
				{
					Exception e = Sql.getException();
					System.out.println( "versioning_main.newApplicazione - Errore nel trovare un nuovo NUMEROAPPLICAZIONE: "+e.getMessage() );
					ut.dialogError("Non riesco a fare la query per trovare un nuovo numero a questa applicazione!\n\n"+e.getMessage());
					return false;
				}
			}
		}
	}
	/** delApplicazione() */
	public boolean delApplicazione()
	{
		System.out.println( "versioning_main.delApplicazione - start" );
		// check se l'applicazione e' selezionata
		String attDes = getDesAppFromCombo();
		if (attDes.equals(null))
		{
			ut.dialogError( "Nessuna applicazione selezionata da cancellare" );
			return false;
		}
		// check se l'applicazione e' running
		String isRunning = getIsRunningAttApplicazione();
		if (isRunning.equals("Running"))
		{
			ut.dialogError( "Una applicazione 'Running' non si puo' cancellare" );
			return false;
		}
		Object[] opzioni = {"Si" , "Annulla" };
		jFdialog.setVisible(true);
		int i = JOptionPane.showOptionDialog(jFdialog,
				"Cancello la seguente applicazione?\n'"+attDes+"'\n",
				"Richiesta di conferma della cancellazione di una applicazione",
				JOptionPane.DEFAULT_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null,
				opzioni,
				opzioni[1]);
		jFdialog.dispose();
		if (i!=0)
		{
			return false;
		}
		System.out.println( "-- Ok cancellazione" );
		// cerca il numero applicazione
		String attNumApp= getNumAppFromCombo();
		if (attNumApp==null)
		{
			return false;
		}
		// cancello l'applicazione
		Vector<Object> v = new Vector<Object>();
		String query1 = "DELETE FROM versioning.applicazioni WHERE DESCRIZIONE = ?";
		v.removeAllElements(); v.add(attDes);
		System.out.println( "v.get(0) *"+v.get(0)+"*" );
		if (Sql.execute(  query1 , v  ))
		{
			// cancello le versioni
			query1 = "DELETE FROM versioning.versioni WHERE NUMEROAPPLICAZIONE = ?";
			v.removeAllElements(); v.add(attNumApp);
			if (Sql.execute(  query1 , v  ))
			{
				// cancello i files
				query1 = "DELETE FROM versioning.files WHERE NUMEROAPPLICAZIONE = ?";
				v.removeAllElements();//?? non serve tutto questo update!!!
				v.add(attNumApp);
				if (Sql.execute( query1 , v  ))
				{
					System.out.println( "versioning_main.delApplicazione - Cancellata l'applicazione: "+attDes );
					jCB_listaApplicazioni.removeItemAt(jCB_listaApplicazioni.getSelectedIndex());
					ut.dialogInfo( "Cancellata l'applicazione '"+attDes );
					return true;
				}
				else
				{
					Exception e = Sql.getException();
					System.out.println( "versioning_main.delApplicazione - Errore di cancellazione delle versioni: "+e.getMessage() );
					ut.dialogError("Errore di Errore di cancellazione delle versioni: "+e.getMessage() );
					return false;
				}
			}
			else
			{
				Exception e = Sql.getException();
				System.out.println( "versioning_main.delApplicazione - Non riesco a cancellare le versioni dal dbase: "+e.getMessage() );
				ut.dialogError("Non riesco a cancellare le versioni dal dbase!\n\n"+e.getMessage());
				return false;
			}
		}
		else
		{
			Exception e = Sql.getException();
			System.out.println( "versioning_main.delApplicazione - Errore nella cancellazione dell'applicazione '"+attDes+"' "+e.getMessage() );
			ut.dialogError("Errore nella cancellazione dell'applicazione '"+attDes+"'\n\n"+e.getMessage());
			return false;
		}
	}
	/** altApplicazione() */
	public boolean altApplicazione()
	{
		System.out.println( "versioning_main.altApplicazione - start" );
		// check se l'applicazione e' selezionata
		int attApp = jCB_listaApplicazioni.getSelectedIndex();
		if (attApp==-1)
		{
			ut.dialogError( "Nessuna applicazione selezionata da stoppare" );
			return false;
		}
		// check se l'applicazione e' gia' stopped
		String attDes = (String)jCB_listaApplicazioni.getSelectedItem();
		if (attDes.substring(0,7).equals("Stopped"))
		{
			ut.dialogError( "L'applicazione e' gia' 'Stopped'" );
			return false;
		}
		Object[] opzioni = {"Si" , "Annulla" };
		jFdialog.setVisible(true);
		int i = JOptionPane.showOptionDialog(jFdialog,
				"Fermo la seguente applicazione?\n'"+attDes+"'\n",
				"Stop di una applicazione",
				JOptionPane.DEFAULT_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null,
				opzioni,
				opzioni[1]);
		jFdialog.dispose();
		if (i!=0)
		{
			return false;
		}
		// aggiorna la tabella applicazioni
		attDes = attDes.substring( 10, attDes.length() );
		String query1 = "SELECT NUMEROAPPLICAZIONE FROM versioning.applicazioni WHERE DESCRIZIONE = ?";
		Vector<Object> v = new Vector<Object>();
		v.removeAllElements(); v.add(attDes);
		if (Sql.select(  query1 , v  ))
		{
			v = Sql.getJdbcSelect();
			if (v.size()>0)
			{
				if (v.get(0)!=null)
				{
					String attNumApp = (String)v.get(0);
					query1 = "UPDATE versioning.applicazioni SET RUNNINGSTOPPED = ? WHERE NUMEROAPPLICAZIONE = ?";
					v.removeAllElements(); v.add("Stopped"); v.add(attNumApp);
					if (Sql.execute(  query1 , v  ))
					{
						System.out.println( "versioning_main.altApplicazione - Messa in 'Stopped' l'applicazione "+attDes );
						v_listaApplicazioni.set(attApp,"Stopped - "+attDes);
						jCB_listaApplicazioni.updateUI();
						jCB_listaApplicazioni.setSelectedIndex( attApp );
						return true;
					}
					else
					{
						Exception e = Sql.getException();
						System.out.println( "versioning_main.altApplicazione - Errore nella scrittura della tabella 'applcazioni': "+e.getMessage() );
						ut.dialogError("Errore nella scrittura della tabella 'applcazioni'!\n\n"+e.getMessage());
					}
				}
			}
		}
		else
		{
			Exception e = Sql.getException();
			System.out.println( "versioning_main.altApplicazione - Errore nella lettura della tabella 'applcazioni' - Errore nel caricamento del NUMEROAPPLICAZIONE dalle applicazioni: "+e.getMessage() );
			ut.dialogError("Non riesco a fare la query per caricare il NUMEROAPPLICAZIONE dal dbase!\n\n"+e.getMessage());
		}
		return false;
	}
	/** runApplicazione() */
	public boolean runApplicazione()
	{
		System.out.println( "versioning_main.runApplicazione - start" );
		// check se l'applicazione e' selezionata
		int attApp = jCB_listaApplicazioni.getSelectedIndex();
		if (attApp==-1)
		{
			ut.dialogError( "Nessuna applicazione selezionata da mettere in running" );
			return false;
		}
		// check se l'applicazione e' gia' running
		String attDes = (String)jCB_listaApplicazioni.getSelectedItem();
		if (attDes.substring(0,7).equals("Running"))
		{
			ut.dialogError( "L'applicazione e' gia' 'Running'" );
			return false;
		}
		Object[] opzioni = {"Si" , "Annulla" };
		jFdialog.setVisible(true);
		int i = JOptionPane.showOptionDialog(jFdialog,
				"Metto in running la seguente applicazione?\n'"+attDes+"'\n",
				"Running di una applicazione",
				JOptionPane.DEFAULT_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null,
				opzioni,
				opzioni[1]);
		jFdialog.dispose();
		if (i!=0)
		{
			return false;
		}
		// aggiorna la tabella applicazioni
		attDes = attDes.substring( 10, attDes.length() );
		String query1 = "SELECT NUMEROAPPLICAZIONE FROM versioning.applicazioni WHERE DESCRIZIONE = ?";
		Vector<Object> v = new Vector<Object>();
		v.removeAllElements(); v.add(attDes);
		if (Sql.select(  query1 , v  ))
		{
			v = Sql.getJdbcSelect();
			if (v.size()>0)
			{
				if (v.get(0)!=null)
				{
					String attNumApp = (String)v.get(0);
					query1 = "UPDATE versioning.applicazioni SET RUNNINGSTOPPED = ? WHERE NUMEROAPPLICAZIONE = ?";
					v.removeAllElements(); v.add("Running"); v.add(attNumApp);
					if (Sql.execute(  query1 , v  ))
					{
						System.out.println( "versioning_main.runApplicazione - Messa in 'Running' l'applicazione "+attDes );
						v_listaApplicazioni.set(attApp,"Running - "+attDes);
						jCB_listaApplicazioni.updateUI();
						jCB_listaApplicazioni.setSelectedIndex( attApp );
						return true;
					}
					else
					{
						Exception e = Sql.getException();
						System.out.println( "versioning_main.runApplicazione - Errore nella scrittura della tabella 'applcazioni': "+e.getMessage() );
						ut.dialogError("Errore nella scrittura della tabella 'applcazioni'!\n\n"+e.getMessage());
					}
				}
			}
		}
		else
		{
			Exception e = Sql.getException();
			System.out.println( "versioning_main.runApplicazione - Errore nella lettura della tabella 'applcazioni' - Errore nel caricamento del NUMEROAPPLICAZIONE dalle applicazioni: "+e.getMessage() );
			ut.dialogError("Non riesco a fare la query per caricare il NUMEROAPPLICAZIONE dal dbase!\n\n"+e.getMessage());
		}
		return false;
	}
		
		
	// Variabile globale per la versione corrente
	private static String currentVersion = "0.0";


	/** 
	 * Converte versione VV.SSS in formato pulito
	 */
	public static String convertVersion(String version) {
	    if (version == null || version.isEmpty()) {
		   return "0.0"; // default se input vuoto
	    }

	    String[] parts = version.split("\\.");
	    int vv = 0;
	    int sss = 0;

	    try {
		   if (parts.length >= 1) {
			  vv = Integer.parseInt(parts[0]);
		   }
		   if (parts.length >= 2) {
			  sss = Integer.parseInt(parts[1]);
		   }
		   // se c'e' solo una parte, sss rimane 0
		   return vv + "." + sss;
	    } catch (NumberFormatException e) {
		   throw new IllegalArgumentException("Versione contiene caratteri non numerici: " + version, e);
	    }
	}

		
		
	/** loadListaVersioni() START */
	public boolean loadListaVersioni() {
	    System.out.println("versioning_main.loadListaVersioni - start");
	    boolean b = false;
	    jCB_listaVersioni.removeAllItems();
	    System.out.println("jCB_listaVersioni.getItemCount() " + jCB_listaVersioni.getItemCount());

	    String attDes = getDesAppFromCombo();
	    if (attDes == null || attDes.isEmpty()) {
		   ut.dialogError("Nessuna applicazione selezionata da cui caricare le versioni");
		   return b;
	    }

	    String query1 = "SELECT NUMEROAPPLICAZIONE FROM versioning.applicazioni WHERE DESCRIZIONE = ?";
	    Vector<Object> v = new Vector<>();
	    v.add(attDes);

	    if (Sql.select(query1, v)) {
		   v = Sql.getJdbcSelect();
		   if (v.size() > 0 && v.get(0) != null) {
			  String attNumApp = (String)v.get(0);
			  query1 = "SELECT ATTIVASTORED,NUMEROVERSIONE,DATA,DESCRIZIONE FROM versioning.versioni WHERE NUMEROAPPLICAZIONE = ?";
			  v.clear();
			  v.add(attNumApp);

			  if (Sql.select(query1, v)) {
				 v = Sql.getJdbcSelect();
				 int size = v.size();
				 if (size > 0) {
					System.out.println("versioning_main.loadListaVersioni - Trovata lista versioni");
					for (int i = 0; i < size; i++) {
					    String rs = (String)v.get(i++);
					    String ver = (String)v.get(i++);
					    // usa convertVersion invece di spezzare a mano
					    String cleanVer = convertVersion(ver);
					    v_listaVersioni.add(rs + " - v." + cleanVer + " - " + (String)v.get(i++) + " - " + attDes + " - " + (String)v.get(i));
					}
					b = true;
				 }
			  } else {
				 Exception e = Sql.getException();
				 System.out.println("versioning_main.loadListaVersioni - Errore nel caricamento delle versioni: " + e.getMessage());
				 ut.dialogError("Non riesco a fare la query per caricare le versioni dal dbase!\n\n" + e.getMessage());
			  }
		   }
	    } else {
		   Exception e = Sql.getException();
		   System.out.println("versioning_main.loadListaVersioni - Errore nel caricamento del NUMEROAPPLICAZIONE dalle applicazioni: " + e.getMessage());
		   ut.dialogError("Non riesco a fare la query per caricare il NUMEROAPPLICAZIONE dal dbase!\n\n" + e.getMessage());
	    }

	    System.out.println("v_listaVersioni.size() " + v_listaVersioni.size());
	    if (v_listaVersioni.size() > 0) {
		   jCB_listaVersioni.setSelectedIndex(0);
	    }
	    jCB_listaVersioni.updateUI();
	    return b;
	}
	/** loadListaVersioni() END */



	/** loadVersione() START*/
	public boolean loadVersione() {
	    System.out.println("versioning_main.loadVersione - start");
	    int attVer = jCB_listaVersioni.getSelectedIndex();
	    if (attVer == -1) {
		   ut.dialogError("Nessuna versione selezionata da caricare");
		   return false;
	    }

	    // Prendi la stringa della versione selezionata dal combo box
	    String selItem = (String) jCB_listaVersioni.getSelectedItem();
	    if (selItem != null && !selItem.isEmpty()) {
		   // estrai la parte della versione VV.SSS dalla stringa
		   // esempio: "1 - v.01.002 - 2026-03-29 - App - Desc"
		   String[] parts = selItem.split(" - ");
		   if (parts.length > 1) {
			  String rawVersion = parts[1].replace("v.", "").trim();
			  String cleanVersion = convertVersion(rawVersion);
			  System.out.println("Versione convertita: " + cleanVersion);
			  // qui puoi salvare cleanVersion in una variabile globale se serve
			  currentVersion = cleanVersion; // se hai una variabile globale currentVersion
		   }
	    }

	    // test
	    loadListaFiles();
	    setComponentsEnabled3();
	    return true;
	}
	/** loadVersione() END*/	


		
	/** newVersione() START*/
	public boolean newVersione(boolean clona) {
	    System.out.println("versioning_main.newVersione - start");
	    String attNumVer = "";
	    // cerca il numero applicazione
	    String attNumApp = getNumAppFromCombo();
	    if (attNumApp == null) {
		   return false;
	    }

	    // input utente
	    String s = (String) JOptionPane.showInputDialog(
			  jFdialog,
			  "Inserire il nome della nuova versione",
			  "Nuova versione",
			  JOptionPane.PLAIN_MESSAGE,
			  null,
			  null,
			  "");

	    if (s == null || s.isEmpty()) {
		   ut.dialogWarning("\nNon e' stata creata nessuna nuova versione\n");
		   return false;
	    }

	    // prende numero versione se deve clonare
	    if (clona) { 
		   String attVerDes = (String) jCB_listaVersioni.getSelectedItem();
		   if (attVerDes != null && !attVerDes.isEmpty()) {
			  // estrai VV.SSS dalla stringa e converti
			  String rawVer = attVerDes.substring(11, 17); // mantiene lo stesso intervallo
			  attNumVer = convertVersion(rawVer).replace(".", ""); // rimuove il punto per DB se serve
		   }
	    }

	    // esiste gia' una descrizione simile
	    for (int i = 0; i < v_listaVersioni.size(); i++) {
		   String ricerca = v_listaVersioni.get(i);
		   if (ricerca.length() - s.length() > -1) {
			  ricerca = ricerca.substring(ricerca.length() - s.length());
			  if (ricerca.equals(s)) {
				 ut.dialogWarning("ATTENZIONE!\nEsiste gia' una versione con questa descrizione:\n'" + v_listaVersioni.get(i) + "'\n\nIl programma prosegue comunque nella creazione della versione\n");
			  }
		   }
	    }

	    // calcola nuova versione incrementando version/sub-version
	    int v1 = 0, v2 = 0;
	    for (int i = 0; i < v_listaVersioni.size(); i++) {
		   String ricerca = v_listaVersioni.get(i);
		   String ricerca1 = ricerca.substring(11, 14);
		   String ricerca2 = ricerca.substring(15, 17);
		   int newv1 = Integer.parseInt(ricerca1);
		   int newv2 = Integer.parseInt(ricerca2);
		   if (newv1 > v1 || (newv1 == v1 && newv2 >= v2)) {
			  v1 = newv1;
			  v2 = newv2;
		   }
	    }

	    // scelta incremento versione o sub-versione
	    Object[] opzioni = {"Versione " + v1 + "." + (v2 + 1), "Versione " + (v1 + 1) + ".00", "Annulla"};
	    jFdialog.setVisible(true);
	    int i = JOptionPane.showOptionDialog(jFdialog,
			  "Incremento la versione o la sub-versione?\n\nScegli una delle possibili combinazioni\n",
			  "Scelta della versione e sub-versione",
			  JOptionPane.DEFAULT_OPTION,
			  JOptionPane.QUESTION_MESSAGE,
			  null,
			  opzioni,
			  opzioni[0]);
	    jFdialog.dispose();

	    if (i == 0) {
		   v2 += 1;
	    } else if (i == 1) {
		   v1 += 1;
		   v2 = 0;
	    } else {
		   return false;
	    }

	    // inserimento versione nel DB
	    Vector<Object> v = new Vector<>();
	    String data = ut.data8();
	    String query1 = "INSERT INTO versioning.versioni (NUMEROAPPLICAZIONE,NUMEROVERSIONE,DATA,ATTIVASTORED,DESCRIZIONE) VALUES (?,?,?,?,?)";
	    v.add(attNumApp);
	    // usa convertVersion anche qui per il DB
		String newVerStr = ut.zTrim(v1, 2) + ut.zTrim(v2, 3); // 01.002 --> 01002
		v.add(newVerStr);
	    v.add(newVerStr);
	    v.add(data);
	    v.add("Stored");
	    v.add(s);

	    if (Sql.execute(query1, v)) {
		   System.out.println("versioning_main.newVersione - Nuova versione " + v1 + "." + v2);
		   String attApplicazione = (String) jCB_listaApplicazioni.getSelectedItem();
		   attApplicazione = attApplicazione.substring(10);
		   s = "Stored - v." + ut.zTrim(v1, 3) + "." + ut.zTrim(v2, 2) + " - " + data + " - " + attApplicazione + " - " + s;
		   v_listaVersioni.add(s);
		   jCB_listaVersioni.updateUI();
		   jCB_listaVersioni.setSelectedIndex(jCB_listaVersioni.getItemCount() - 1);
		   ut.dialogInfo("Inserita la seguente nuova versione:\n'" + s + "'\n");

		   // clonazione files se richiesto
		   if (clona) {
			  System.out.println("versioning_main.newVersione - Inizio clonazione");
			  ut.dialogInfo("Inizio clonazione dalla versione " + attNumVer);
			  // codice clonazione gia' esistente
		   }
		   return true;
	    } else {
		   Exception e = Sql.getException();
		   System.out.println("versioning_main.newVersione - Errore nell'inserimento nel database della nuova versione: " + e.getMessage());
		   ut.dialogError("Errore di inserimento nel database della nuova versione!\n\n" + e.getMessage());
		   return false;
	    }
	}
	/** newVersione() END*/	
	
	
	/** clonaVersione() */
	public boolean clonaVersione()
	{
		System.out.println( "versioning_main.clonaVersione - start" );
		int attVer = jCB_listaVersioni.getSelectedIndex();
		if (attVer==-1)
		{
			ut.dialogError( "Nessuna versione selezionata da clonare" );
			return false;
		}
		if (newVersione(true))	// crea una nuova versione e clona i files
		{
			//?? fare la clonazione di attVer
			System.out.println( "versioning_main.clonaVersione - fare la clonazione" );
		}
		return true;
	}
	/** delVersione() */
	public boolean delVersione()
	{
		System.out.println( "versioning_main.delVersione - start" );
		// check se la versione e' selezionata
		String attNumVer= getNumVerFromCombo();
		if (attNumVer==null)
		{
			return false;
		}
		// check se la versione e' stoppata
		String attDes = (String)jCB_listaVersioni.getSelectedItem();
		if (attDes.substring(0,6).equals("Attiva"))
		{
			ut.dialogError( "Una versione 'Attiva' non si puo' cancellare" );
			return false;
		}
		Object[] opzioni = {"Si" , "Annulla" };
		jFdialog.setVisible(true);
		int i = JOptionPane.showOptionDialog(jFdialog,
				"Cancello la seguente versione?\n'"+attDes+"'\n",
				"Richiesta di conferma della cancellazione di una versione",
				JOptionPane.DEFAULT_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null,
				opzioni,
				opzioni[1]);
		jFdialog.dispose();
		if (i!=0)
		{
			return false;
		}
		System.out.println( "-- Ok cancellazione" );
		// cerca il numero applicazione
		String attNumApp= getNumAppFromCombo();
		if (attNumApp==null)
		{
			return false;
		}
		int attVerRow = jCB_listaVersioni.getSelectedIndex();
		Vector<Object> v = new Vector<Object>();
		// cancello le versioni
		String versione = attDes.substring( 11, 14 ) + attDes.substring( 15, 17 );
		String query1 = "DELETE FROM versioning.versioni WHERE NUMEROAPPLICAZIONE = ? AND NUMEROVERSIONE = ?";
		v.removeAllElements(); v.add(attNumApp); v.add(versione);
		if (Sql.execute(  query1 , v  ))
		{
			jCB_listaVersioni.removeItemAt(attVerRow);
			// cancello i files
			query1 = "DELETE FROM versioning.files WHERE NUMEROAPPLICAZIONE = ? AND NUMEROVERSIONE = ?";
			v.removeAllElements(); v.add(attNumApp); v.add(versione);
			if (Sql.execute( query1 , v  ))
			{
				System.out.println( "versioning_main.delVersione - Cancellata la versione: "+attDes.substring( 11, 14 ) +"."+ attDes.substring( 15, 17 ) );
				ut.dialogInfo( "Cancellata la versione "+attDes.substring( 11, 14 ) +"."+ attDes.substring( 15, 17 ) );
				return true;
			}
			else
			{
				Exception e = Sql.getException();
				System.out.println( "versioning_main.delVersione - Errore di cancellazione del file: "+e.getMessage() );
				ut.dialogError("Errore di cancellazione dei file!\n\n"+e.getMessage());
				return false;
			}
		}
		else
		{
			Exception e = Sql.getException();
			System.out.println( "versioning_main.delVersione - Non riesco a cancellare le versioni dal dbase: "+e.getMessage() );
			ut.dialogError("Non riesco a cancellare le versioni dal dbase!\n\n"+e.getMessage());
			return false;
		}
	}
	/** attivaVersione() */
	public boolean attivaVersione()
	{
		System.out.println( "versioning_main.attivaVersione - start" );
		// check se la versione e' selezionata
		int attApp = jCB_listaVersioni.getSelectedIndex();
		if (attApp==-1)
		{
			ut.dialogError( "Nessuna versione selezionata da attivare" );
			return false;
		}
		// check se la versione e' gia' attiva
		String attDes = (String)jCB_listaVersioni.getSelectedItem();
		if (attDes.substring(0,6).equals("Attiva"))
		{
			ut.dialogError( "La versione e' gia' 'Attiva'" );
			return false;
		}
		// controlla se c'e' una versione gia' attiva
		for (int x=0; x<v_listaVersioni.size(); x++)
		{
			if ( v_listaVersioni.get(x).substring( 0, 6).equals("Attiva") )
			{
				ut.dialogError( "C'e' la versione seguente gia' 'Attiva'\n'"+v_listaVersioni.get(x)+"'\n" );
				return false;
			}
		}
		Object[] opzioni = {"Si" , "Annulla" };
		jFdialog.setVisible(true);
		int i = JOptionPane.showOptionDialog(jFdialog,
				"Attivo la seguente versione?\n'"+attDes+"'\n",
				"Attivazione di una versione",
				JOptionPane.DEFAULT_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null,
				opzioni,
				opzioni[1]);
		jFdialog.dispose();
		if (i!=0)
		{
			return false;
		}
		else
		{
			// aggiorna la tabella versioni
			String attApplicazione = (String)jCB_listaApplicazioni.getSelectedItem();
			attApplicazione = attApplicazione.substring( 10, attApplicazione.length() );
			String query1 = "SELECT NUMEROAPPLICAZIONE FROM versioning.applicazioni WHERE DESCRIZIONE = ?";
			Vector<Object> v = new Vector<Object>();
			v.removeAllElements(); v.add(attApplicazione);
			if (Sql.select(  query1 , v  ))
			{
				v = Sql.getJdbcSelect();
				if (v.size()>0)
				{
					if (v.get(0)!=null)
					{
						String attNumApp = (String)v.get(0);
						String versione = attDes.substring( 11, 14 ) + attDes.substring( 15, 17 );
						query1 = "UPDATE versioning.versioni SET ATTIVASTORED = ? WHERE NUMEROAPPLICAZIONE = ? AND NUMEROVERSIONE = ?";
						v.removeAllElements(); v.add("Attiva"); v.add(attNumApp); v.add(versione);
						if (Sql.execute(  query1 , v  ))
						{
							System.out.println( "versioning_main.attivaVersione - Messa 'Attiva' la versione selezionata "+versione );
							v_listaVersioni.set(attApp,"Attiva"+attDes.substring( 6, attDes.length()));
							jCB_listaVersioni.updateUI();
							jCB_listaVersioni.setSelectedIndex( attApp );
							// update versioning.applicazioni.NUMEROVERSIONE con nuovo numero di versione attiva
							query1 = "UPDATE versioning.applicazioni SET NUMEROVERSIONEATTIVA = ? WHERE NUMEROAPPLICAZIONE = ?";
							v.removeAllElements(); v.add(versione); v.add(attNumApp);
							if (Sql.execute(  query1 , v  ))
							{
								System.out.println( "versioning_main.attivaVersione - Messa la versione "+versione+" in versioning.applicazioni.NUMEROVERSIONE" );
								return true;
							}
							else
							{
								Exception e = Sql.getException();
								System.out.println( "versioning_main.attivaVersione - Errore nella scrittura della versione "+versione+" in versioning.applicazioni.NUMEROVERSIONE:\n"+e.getMessage() );
								ut.dialogError("Errore nella scrittura della tabella 'versioni'!\n\n"+e.getMessage());
							}
						}
						else
						{
							Exception e = Sql.getException();
							System.out.println( "versioning_main.attivaVersione - Errore nella scrittura della tabella 'versioni': "+e.getMessage() );
							ut.dialogError("Errore nella scrittura della tabella 'versioni'!\n\n"+e.getMessage());
						}
					}
				}
			}
			else
			{
				Exception e = Sql.getException();
				System.out.println( "versioning_main.attivaVersione - Errore nel caricamento del NUMEROAPPLICAZIONE dalle applicazioni: "+e.getMessage() );
				ut.dialogError("Non riesco a fare la query per caricare il NUMEROAPPLICAZIONE dal dbase!\n\n"+e.getMessage());
			}
		}
		return false;
	}
	/** storedVersione() */
	public boolean storedVersione()
	{
		System.out.println( "versioning_main.storedVersione - start" );
		// check se la versione e' selezionata
		int attApp = jCB_listaVersioni.getSelectedIndex();
		if (attApp==-1)
		{
			ut.dialogError( "Nessuna versione selezionata da mettere in 'Stored'" );
			return false;
		}
		// check se la versione e' gia' 'Stored'
		String attDes = (String)jCB_listaVersioni.getSelectedItem();
		if (attDes.substring(0,6).equals("Stored"))
		{
			ut.dialogError( "La versione e' gia' 'Stored'" );
			return false;
		}
		Object[] opzioni = {"Si" , "Annulla" };
		jFdialog.setVisible(true);
		int i = JOptionPane.showOptionDialog(jFdialog,
				"Metto in 'Stored' la seguente versione?\n'"+attDes+"'\n",
				"Storicizzazione di una versione",
				JOptionPane.DEFAULT_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null,
				opzioni,
				opzioni[1]);
		jFdialog.dispose();
		if (i!=0)
		{
			return false;
		}
		else
		{
			// aggiorna la tabella versioni
			String attApplicazione = (String)jCB_listaApplicazioni.getSelectedItem();
			attApplicazione = attApplicazione.substring( 10, attApplicazione.length() );
			String query1 = "SELECT NUMEROAPPLICAZIONE FROM versioning.applicazioni WHERE DESCRIZIONE = ?";
			Vector<Object> v = new Vector<Object>();
			v.removeAllElements(); v.add(attApplicazione);
			if (Sql.select(  query1 , v  ))
			{
				v = Sql.getJdbcSelect();
				if (v.size()>0)
				{
					if (v.get(0)!=null)
					{
						String attNumApp = (String)v.get(0);
						String versione = attDes.substring( 11, 14 ) + attDes.substring( 15, 17 );
						query1 = "UPDATE versioning.versioni SET ATTIVASTORED = ? WHERE NUMEROAPPLICAZIONE = ? AND NUMEROVERSIONE = ?";
						v.removeAllElements(); v.add("Stored"); v.add(attNumApp); v.add(versione);
						if (Sql.execute(  query1 , v  ))
						{
							System.out.println( "versioning_main.storedVersione - Messa 'Stored' la versione selezionata "+versione );
							v_listaVersioni.set(attApp,"Stored"+attDes.substring( 6, attDes.length()));
							jCB_listaVersioni.updateUI();
							jCB_listaVersioni.setSelectedIndex( attApp );
							// update versioning.applicazioni.NUMEROVERSIONE con nuovo numero di versione 00000 per indicare che nessuna versione e' attiva
							query1 = "UPDATE versioning.applicazioni SET NUMEROVERSIONEATTIVA = ? WHERE NUMEROAPPLICAZIONE = ?";
							v.removeAllElements(); v.add("00000"); v.add(attNumApp);
							if (Sql.execute(  query1 , v  ))
							{
								System.out.println( "versioning_main.storedVersione - Messa la versione "+versione+" in versioning.applicazioni.NUMEROVERSIONE" );
								return true;
							}
							else
							{
								Exception e = Sql.getException();
								System.out.println( "versioning_main.storedVersione - Errore nella scrittura della versione "+versione+" in versioning.applicazioni.NUMEROVERSIONE:\n"+e.getMessage() );
								ut.dialogError("Errore nella scrittura della tabella 'versioni'!\n\n"+e.getMessage());
							}
						}
						else
						{
							Exception e = Sql.getException();
							System.out.println( "versioning_main.storedVersione - Errore nella scrittura della tabella 'versioni': "+e.getMessage() );
							ut.dialogError("Errore nella scrittura della tabella 'versioni'!\n\n"+e.getMessage());
						}
					}
				}
			}
			else
			{
				Exception e = Sql.getException();
				System.out.println( "versioning_main.storedVersione - Errore nel caricamento del NUMEROAPPLICAZIONE dalle applicazioni: "+e.getMessage() );
				ut.dialogError("Non riesco a fare la query per caricare il NUMEROAPPLICAZIONE dal dbase!\n\n"+e.getMessage());
			}
		}
		return false;
	}
	/** loadListaVersioni() */
	public boolean loadListaFiles()
	{
		System.out.println( "versioning_main.loadListaFiles - start" );
		String attNumVer= getNumVerFromCombo();
		if (attNumVer==null)
		{
			return false;
		}
		jT_listaFilesMod.setRowCount( 0 );	// azzera JTable
		String attVerDes = (String)jCB_listaVersioni.getSelectedItem();
		String attVer1 = attVerDes.substring( 11, 13 );
		String attVer2 = attVerDes.substring( 14, 17 );
		// cerca il numero applicazione
		String attNumApp= getNumAppFromCombo();
		if (attNumApp==null)
		{
			return false;
		}
		Vector<Object> v = new Vector<Object>();
		// carica files
		String query1 = "SELECT TIPO,DIRECTORY,FILE,HASH FROM versioning.files WHERE NUMEROAPPLICAZIONE = ? AND NUMEROVERSIONE = ? ";
		v.removeAllElements(); v.add(attNumApp); v.add(attNumVer);
		if (Sql.select(  query1 , v  ))
		{
			v = Sql.getJdbcSelect();
			if (v.size()>0)
			{
				Object[] o = new Object[jT_listaFiles.getColumnCount()];
				o[colVER1] = attVer1; o[colVER2] = attVer2; o[colOLD_NEW_UP] = "Old";
				for (int i=0; i<v.size(); i++)
				{
					o[colTIPO] = (String)v.get(i++);
					o[colDIR] = (String)v.get(i++);
					o[colFILE] = (String)v.get(i++);
					o[colHASH] = (String)v.get(i);	// i finale
					jT_listaFilesMod.insertRow( 0, o );
				}
			}
		}
		else
		{
			Exception e = Sql.getException();
			System.out.println( "versioning_main.loadListaFiles - Errore nel caricamento della lista dei files/dir dalla tabella 'files': "+e.getMessage() );
			ut.dialogError("Errore nel caricamento della lista dei files/dir dalla tabella 'files'\n\n"+e.getMessage());
			return false;
		}
		
		return true;
	}
	/** filesDel() */
	public boolean filesDel()
	{
		System.out.println( "versioning_main.filesDel - start" );
		// check il file/dir selezionato
		int attRow = jT_listaFiles.getSelectedRow();
		if (attRow==-1)
		{
			ut.dialogError( "Nessun file/dir selezionato da cancellare" );
			return false;
		}
		// check se la versione e' attiva
		String attDes = (String)jCB_listaVersioni.getSelectedItem();
		if (attDes.substring(0,6).equals("Attiva"))
		{
			ut.dialogError( "In una versione 'Attiva' non si puossono cancellare file/dir" );
			return false;
		}
		// cerca il numero applicazione
		String attNumApp= getNumAppFromCombo();
		if (attNumApp==null)
		{
			return false;
		}
		Vector<Object> v = new Vector<Object>();
		// cancella file in 'Files'
		String attVer = (String)jT_listaFiles.getValueAt( attRow, colVER1 )+(String)jT_listaFiles.getValueAt( attRow, colVER2 );
		String attTip = (String)jT_listaFiles.getValueAt( attRow, colTIPO );
		String attDir = (String)jT_listaFiles.getValueAt( attRow, colDIR );
		String attFil = (String)jT_listaFiles.getValueAt( attRow, colFILE );
		String attHas = (String)jT_listaFiles.getValueAt( attRow, colHASH );
		Object[] opzioni = {"Si" , "Annulla" };
		jFdialog.setVisible(true);
		String des = "";
		if (attTip.equals("Dir"))
		{
			des = "Cancello la seguente directory?\n'"+attDir+"'\n";
		}
		else if (attTip.equals("Fil"))
		{
			des = "Cancello il seguente file dal database?\n'"+attFil+"'\n";
		}
		int i = JOptionPane.showOptionDialog(jFdialog,
				des,
				"Richiesta di conferma della cancellazione di un file/dir",
				JOptionPane.DEFAULT_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null,
				opzioni,
				opzioni[1]);
		jFdialog.dispose();
		if (i!=0)
		{
			return false;
		}
		System.out.println( "-- Ok cancellazione" );
		
		String query1 = "DELETE FROM versioning.files WHERE NUMEROAPPLICAZIONE = ? AND NUMEROVERSIONE = ? AND HASH = ?";
		v.removeAllElements();//?? non serve tutto questo update!!!
		v.add(attNumApp);
		v.add(attVer);
		v.add(attHas);
		if (Sql.execute( query1 , v  ))
		{
			jT_listaFilesMod.removeRow( attRow );
			if ( (attRow == jT_listaFilesMod.getRowCount()) )
			{
				attRow--;
			}
			lsmjT_listaFiles.setSelectionInterval(0,attRow);
			Rectangle rettangolo = jT_listaFiles.getCellRect(attRow, 0, true);
		}
		else
		{
			Exception e = Sql.getException();
			System.out.println( "versioning_main.filesDel - Errore di update del file: "+e.getMessage() );
			ut.dialogError("Errore di cancellazione del file!\n\n"+e.getMessage());
			return false;
		}
		
		System.out.println( "versioning_main.filesDel - fare la cancellazione del dir selezionato" );
		
		System.out.println( "versioning_main.filesDel - Fare cancellazione Directory" );
		return true;
	}
	/** getDesAppFromCombo() */
	public String getDesAppFromCombo()
	{
		int attApp = jCB_listaApplicazioni.getSelectedIndex();
		if (attApp==-1)
		{
			ut.dialogError( "Nessuna applicazione selezionata" );
			return null;
		}
		String attDes = (String)jCB_listaApplicazioni.getSelectedItem();
		attDes = attDes.substring( 10, attDes.length() );
		return attDes;
	}
	/** getIsRunningAttApplicazione() */
	public String getIsRunningAttApplicazione()
	{
		int attApp = jCB_listaApplicazioni.getSelectedIndex();
		if (attApp==-1)
		{
			ut.dialogError( "Nessuna applicazione selezionata" );
			return null;
		}
		String attDes = (String)jCB_listaApplicazioni.getSelectedItem();
		attDes = attDes.substring(0,7);
		return attDes;
	}
	/** getNumAppFromCombo() */
	public String getNumAppFromCombo()
	{
		if (jCB_listaApplicazioni.getSelectedIndex()==-1)
		{
			ut.dialogError( "Nessuna applicazione selezionata" );
			return null;
		}
		String attApplicazione = (String)jCB_listaApplicazioni.getSelectedItem();
		attApplicazione = attApplicazione.substring( 10, attApplicazione.length() );
		String query1 = "SELECT NUMEROAPPLICAZIONE FROM versioning.applicazioni WHERE DESCRIZIONE = ?";
		Vector<Object> v = new Vector<Object>();
		v.removeAllElements(); v.add(attApplicazione);
		if (Sql.select(  query1 , v  ))
		{
			v = Sql.getJdbcSelect();
			if (v.size()>0)
			{
				if (v.get(0)!=null)
				{
					System.out.println( "versioning_main.getNumAppFromCombo - (String)v.get(0) = "+(String)v.get(0) );
					return (String)v.get(0);
				}
			}
		}
		else
		{
			Exception e = Sql.getException();
			System.out.println( "versioning_main.getNumAppFromCombo - Errore nel caricamento del NUMEROAPPLICAZIONE dalle applicazioni: "+e.getMessage() );
			ut.dialogError("Non riesco a fare la query per caricare il NUMEROAPPLICAZIONE dal dbase!\n\n"+e.getMessage());
			return null;
		}
		return null;
	}
	/** getNumVerFromCombo() */
	public String getNumVerFromCombo()
	{
		if (jCB_listaVersioni.getSelectedIndex()==-1)
		{
			ut.dialogError( "Nessuna versione selezionata" );
			return null;
		}
		String attVerDes = (String)jCB_listaVersioni.getSelectedItem();
		return attVerDes.substring(11,13)+attVerDes.substring(14,17);
	}
	
	/** enabled componenti - caso 1: Applicazioni*/
	public void setComponentsEnabled1()
	{
		boolean b = false;
		jF_main.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		jCB_listaApplicazioni.setEnabled(!b);
		jB_listaApplicazioniLoad.setEnabled(!b);
		jB_listaApplicazioniNew.setEnabled(!b);
		jB_listaApplicazioniDel.setEnabled(!b);
		jB_listaApplicazioniAlt.setEnabled(!b);
		jB_listaApplicazioniRun.setEnabled(!b);
		jB_listaApplicazioniUp.setEnabled(!b);
		jL_listaApplicazioniStat.setEnabled(!b);
		jCB_listaVersioni.setEnabled(b);
		jCB_listaVersioni.setVisible(b);
		jL_versioneAttivaYN.setEnabled(b);
		jL_versioneAttivaYN.setVisible(b);
		jB_listaVersioniLoad.setEnabled(b);
		jB_listaVersioniNew.setEnabled(b);
		jB_listaVersioniClona.setEnabled(b);
		jB_listaVersioniDel.setEnabled(b);
		jB_listaVersioniAttiva.setEnabled(b);
		jB_listaVersioniStored.setEnabled(b);
		jB_listaVersioniUp.setEnabled(b);
		jSP_listaFiles.setVisible(b);
		jB_listaFilesDel.setEnabled(b);
		jP_listaFilesDrop.setVisible(b);
		dropTarget.setActive(b);
		jPB_progress.setVisible(b);
		jPB_progress.setEnabled(b);
		jPB_progress.setValue(0);
		jB_listaFilesUp.setEnabled(b);
	}
	/** enabled componenti - caso 2: Versioni */
	public void setComponentsEnabled2()
	{
		boolean b = false;
		jF_main.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		jCB_listaApplicazioni.setEnabled(b);
		jB_listaApplicazioniLoad.setEnabled(b);
		jB_listaApplicazioniNew.setEnabled(b);
		jB_listaApplicazioniDel.setEnabled(b);
		jB_listaApplicazioniAlt.setEnabled(b);
		jB_listaApplicazioniRun.setEnabled(b);
		jB_listaApplicazioniUp.setEnabled(b);
		jL_listaApplicazioniStat.setEnabled(b);
		jCB_listaVersioni.setEnabled(!b);
		jCB_listaVersioni.setVisible(!b);
		jL_versioneAttivaYN.setEnabled(!b);
		jL_versioneAttivaYN.setVisible(!b);
		jB_listaVersioniLoad.setEnabled(!b);
		jB_listaVersioniNew.setEnabled(!b);
		jB_listaVersioniClona.setEnabled(!b);
		jB_listaVersioniDel.setEnabled(!b);
		jB_listaVersioniAttiva.setEnabled(!b);
		jB_listaVersioniStored.setEnabled(!b);
		jB_listaVersioniUp.setEnabled(!b);
		jSP_listaFiles.setVisible(b);
		jB_listaFilesDel.setEnabled(b);
		jP_listaFilesDrop.setVisible(b);
		dropTarget.setActive(b);
		jPB_progress.setVisible(b);
		jPB_progress.setEnabled(b);
		jPB_progress.setValue(0);
		jB_listaFilesUp.setEnabled(b);
	}
	/** enabled componenti - caso 3: JTable */
	public void setComponentsEnabled3()
	{
		boolean b = false;
		//jTBjP_applicazioni.setTitleColor(Color.blue);
		jF_main.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		jCB_listaApplicazioni.setEnabled(b);
		jB_listaApplicazioniLoad.setEnabled(b);
		jB_listaApplicazioniNew.setEnabled(b);
		jB_listaApplicazioniDel.setEnabled(b);
		jB_listaApplicazioniAlt.setEnabled(b);
		jB_listaApplicazioniRun.setEnabled(b);
		jB_listaApplicazioniUp.setEnabled(b);
		jL_listaApplicazioniStat.setEnabled(b);
		jCB_listaVersioni.setEnabled(b);
		jCB_listaVersioni.setVisible(!b);
		jL_versioneAttivaYN.setEnabled(b);
		jL_versioneAttivaYN.setVisible(!b);
		jB_listaVersioniLoad.setEnabled(b);
		jB_listaVersioniNew.setEnabled(b);
		jB_listaVersioniClona.setEnabled(b);
		jB_listaVersioniDel.setEnabled(b);
		jB_listaVersioniAttiva.setEnabled(b);
		jB_listaVersioniStored.setEnabled(b);
		jB_listaVersioniUp.setEnabled(b);
		jSP_listaFiles.setVisible(!b);
		jB_listaFilesDel.setEnabled(!b);
		if ( ((String)jCB_listaVersioni.getSelectedItem()).substring(0,6).equals("Attiva") )
		{
			jP_listaFilesDrop.setVisible(b); dropTarget.setActive(b);
			jPB_progress.setVisible(b);jPB_progress.setEnabled(b);

		}
		else
		{
			jP_listaFilesDrop.setVisible(!b); dropTarget.setActive(!b);
			jPB_progress.setVisible(!b);jPB_progress.setEnabled(!b);
		}
		jPB_progress.setValue(0);
		jB_listaFilesUp.setEnabled(!b);
	}
	/** enabled componenti - caso 4 */
	public void setComponentsEnabled4()
	{
		boolean b = false;
		jF_main.setDefaultCloseOperation( JFrame.DO_NOTHING_ON_CLOSE );
		jCB_listaApplicazioni.setEnabled(b);
		jB_listaApplicazioniLoad.setEnabled(b);
		jB_listaApplicazioniNew.setEnabled(b);
		jB_listaApplicazioniDel.setEnabled(b);
		jB_listaApplicazioniAlt.setEnabled(b);
		jB_listaApplicazioniRun.setEnabled(b);
		jB_listaApplicazioniUp.setEnabled(b);
		jL_listaApplicazioniStat.setEnabled(b);
		jCB_listaVersioni.setEnabled(b);
		jCB_listaVersioni.setVisible(b);
		jL_versioneAttivaYN.setEnabled(b);
		jL_versioneAttivaYN.setVisible(b);
		jB_listaVersioniLoad.setEnabled(b);
		jB_listaVersioniNew.setEnabled(b);
		jB_listaVersioniClona.setEnabled(b);
		jB_listaVersioniDel.setEnabled(b);
		jB_listaVersioniAttiva.setEnabled(b);
		jB_listaVersioniStored.setEnabled(b);
		jB_listaVersioniUp.setEnabled(b);
		jSP_listaFiles.setVisible(!b);
		jB_listaFilesDel.setEnabled(b);
		jP_listaFilesDrop.setVisible(!b);
		dropTarget.setActive(b);
		jPB_progress.setVisible(!b);
		jPB_progress.setEnabled(b);
		jPB_progress.setValue(0);
		jB_listaFilesUp.setEnabled(b);
	}
	//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX	//
	// FINE PROGRAMMAZIONE VERSIONING											//
	//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX	//
}	
/** versioning_main END */
///////////////////////////////////////////////////////



///////////////////////////////////////////////////////
/** versioning_MMI START */
class versioning_MMI implements versioning_constants
{
	/** <b>init()</b><BR>
		This method initialized just once the <i>main window</i>.<BR>
	 */
	public void init()
	{
		System.out.println( "versioning_MMI.init(): START" );
		
		// globali
		ToolTipManager.sharedInstance().setInitialDelay(100);
		ToolTipManager.sharedInstance().setDismissDelay(20000);
		
		// inizializzazioni e login
		initAllComponents();
		
		// jFdialog
		jFdialog.setBounds( 400 , 300,100,100);
		
		System.out.println( "versioning_MMI.init(): END" );
	}
	
	/** setEnabled( boolean b ) */
	public void setEnabled( boolean b )
	{
		jF_main.setEnabled(b);
		jF_main.setVisible(b);
		if (b)
		{
			ver.setComponentsEnabled1();
		}
		//// thread
	}
	
	/** implemetazione di tutti i componenti */
	private void initAllComponents()
	{
		System.out.println( "versioning_MMI.initAllComponents()" );
		
		// login
		jFlogin.setLayout( null );jFlogin.setBounds( 100 , 100 , 630 , 140 );
		jFlogin.setMinimumSize( new Dimension( 630 , 140 ) );
		jFlogin.setMaximumSize( new Dimension( 630 , 140 ) );
		jFlogin.setSize( new Dimension( 630 , 140 ) );
		jFlogin.setTitle( "Login all'applicazione 'Gestione versioning'" );
		jPlogin.setLayout( null );jPlogin.setBounds( 5 , 5 , 520 , 95 );
		jPlogin_textPassword.setEchoChar('*');
		jPlogin_textPassword.setText( "" );
		jTlogin.setTitleColor( Color.red.darker() );
		jPlogin.setBorder( jTlogin );
		jPlogin_buttonConferma.setToolTipText( "Entra nell'applicazione 'Gestione versioning'" );
		jPlogin_buttonExit.setToolTipText( "Uscita dall'applicazione 'Gestione versioning'" );
		jPlogin_buttonConferma.setEnabled( true );
		jPlogin_buttonExit.setEnabled( true );
		jPlogin_buttonConferma.setForeground( Color.green.darker() );
		jPlogin_buttonExit.setForeground( Color.red );
		jPlogin_buttonConferma.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){System.out.println( "versioning_MMI.login() - Login entry da bottone 'Login'" );login.check();}});
		jPlogin_buttonExit.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){System.out.println( "versioning_MMI.login() - Login exit da bottone 'Exit'" );versioning_login.chiusuraCarp();}});
		jPlogin_labelUsername.setBounds( 15 , 25 , 100 , 20 );
		jPlogin_textUsername.setBounds( 105 , 25 , 400 , 20 );
		jPlogin_textUsername.addKeyListener(versioning_login.jPlogin_enterKeyListener);
		jPlogin_textUsername.setToolTipText( "Inserire il nome utente - Controllare le maiuscole e minuscole" );
		jPlogin_labelPassword.setBounds( 15 , 55 , 100 , 20 );
		jPlogin_textPassword.setBounds( 105 , 55 , 400 , 20 );
		jPlogin_textPassword.addKeyListener(versioning_login.jPlogin_enterKeyListener);
		jPlogin_textPassword.setToolTipText( "Inserire la password - Controllare le maiuscole e minuscole" );
		jPlogin_buttonConferma.setBounds( 530 , 30 , 80 , 20 );
		jPlogin_buttonExit.setBounds( 530 , 60 , 80 , 20 );
		jPlogin.add( jPlogin_labelUsername );
		jPlogin.add( jPlogin_textUsername );
		jFlogin.add( jPlogin_buttonConferma );
		jPlogin.add( jPlogin_labelPassword );
		jPlogin.add( jPlogin_textPassword );
		jFlogin.add( jPlogin_buttonExit );
		jFlogin.add( jPlogin );
		jPlogin.setOpaque(false);
		jFlogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFlogin.addWindowListener(new WindowAdapter()
		{
			public void windowActivated(WindowEvent e){}
			public void windowClosed(WindowEvent e){}
			public void windowClosing(WindowEvent e){versioning_login.chiusuraCarp();}
			public void windowDeiconified(WindowEvent e){}
			public void windowIconified(WindowEvent e){}
			public void windowDeactivated(WindowEvent e){}
		});
		jFlogin.setIconImage(versioningIcona.getImage());
		
		// main
		jF_main.setLayout( null );
		jF_main.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		jF_main.setMinimumSize( new Dimension( 1020 , 730 ) );
		jF_main.setMaximumSize( new Dimension( 1020 , 730 ) );
		jF_main.setSize( new Dimension( 1020 , 710 ) );
		// quando metto qui l'Utenza? Nel MAIN MENU!
		//jF_main.setTitle( "Gestione delle versioni e dell'update dei programmi - (v.1.0 del 22 settembre 2009)" );
		jF_main.setTitle( SQL_JDBC_SERVER_NAME + " - Gestione delle versioni e dell'update dei programmi - (v.1.1 del 22 settembre 2009)" );
		jF_main.addWindowListener(new WindowAdapter()
		{
			public void windowActivated(WindowEvent e){}
			public void windowClosed(WindowEvent e){ versioning_login.setEnabled(true); }
			public void windowClosing(WindowEvent e){}
			public void windowDeiconified(WindowEvent e){}
			public void windowIconified(WindowEvent e){}
			public void windowDeactivated(WindowEvent e){}
		});
		jF_main.setIconImage(versioningIcona.getImage());
		
		jP_main.setLayout( null );
		jP_main.setBorder( jTBjP_main );
		jF_main.add( jP_main );
		
		jP_applicazioni.setLayout( null );
		jP_applicazioni.setBorder( jTBjP_applicazioni );
		jP_main.add( jP_applicazioni );
		
		jP_versioni.setLayout( null );
		jP_versioni.setBorder( jTBjP_versioni );
		jP_main.add( jP_versioni );
		
		jP_listaFiles.setLayout( null );
		jP_listaFiles.setBorder( jTBjP_listaFiles );
		jP_main.add( jP_listaFiles );
		
		jP_listaFilesDrop.setLayout( null );
		//jP_listaFilesDrop.setLayout( new BorderLayout()); // Imposta BorderLayout per il frame
		jP_listaFilesDrop.setBorder( jTBjP_listaFilesDrop );
		jP_listaFilesDrop.setToolTipText( "<html>Seleziona uno o piu' file e directory e trascinale in questo riquadro" );
		jP_listaFiles.add( jP_listaFilesDrop );
		
		jPB_progress.setLayout( null );
		jPB_progress.setMinimum(0);
		jPB_progress.setStringPainted(true);
		jP_listaFilesDrop.add(jPB_progress);
		
		jP_applicazioni.add( jCB_listaApplicazioni );
		jCB_listaApplicazioni.setForeground( Color.red );
		jCB_listaApplicazioni.setFont(new Font( "COURIER NEW" , Font.PLAIN, 12 ));
		jCB_listaApplicazioni.setToolTipText( "Entra nell'applicazione 'Gestione versioning'" );
		jCB_listaApplicazioni.addActionListener(new ActionListener()
		{public void actionPerformed(ActionEvent e)
			{
			}
		});
		
		jP_applicazioni.add( jB_listaApplicazioniLoad );
		jB_listaApplicazioniLoad.setForeground( Color.green.darker() );
		jB_listaApplicazioniLoad.setToolTipText( "Carica l'applicazione selezionata" );
		jB_listaApplicazioniLoad.addActionListener(new ActionListener()
		{public void actionPerformed(ActionEvent e)
			{
				ver.loadApplicazione();
			}
		});
		
		jP_applicazioni.add( jB_listaApplicazioniNew );
		jB_listaApplicazioniNew.setForeground( Color.green.darker() );
		jB_listaApplicazioniNew.setToolTipText( "Crea una nuova applicazione" );
		jB_listaApplicazioniNew.addActionListener(new ActionListener()
		{public void actionPerformed(ActionEvent e)
			{
				ver.newApplicazione();
			}
		});
		
		jP_applicazioni.add( jB_listaApplicazioniDel );
		jB_listaApplicazioniDel.setForeground( Color.red );
		jB_listaApplicazioniDel.setToolTipText( "Cancella l'applicazione selezionata" );
		jB_listaApplicazioniDel.addActionListener(new ActionListener()
		{public void actionPerformed(ActionEvent e)
			{
				ver.delApplicazione();
			}
		});
		
		jP_applicazioni.add( jB_listaApplicazioniAlt );
		jB_listaApplicazioniAlt.setForeground( Color.red );
		jB_listaApplicazioniAlt.setToolTipText( "Blocca l'applicazione selezionata" );
		jB_listaApplicazioniAlt.addActionListener(new ActionListener()
		{public void actionPerformed(ActionEvent e)
			{
				ver.altApplicazione();
			}
		});
		
		jP_applicazioni.add( jB_listaApplicazioniRun );
		jB_listaApplicazioniRun.setForeground( Color.green.darker() );
		jB_listaApplicazioniRun.setToolTipText( "Fai ripartire l'applicazione selezionata" );
		jB_listaApplicazioniRun.addActionListener(new ActionListener()
		{public void actionPerformed(ActionEvent e)
			{
				ver.runApplicazione();
			}
		});
		
		jP_applicazioni.add( jB_listaApplicazioniUp );
		jB_listaApplicazioniUp.setForeground( Color.magenta );
		jB_listaApplicazioniUp.setToolTipText( "Chiude la finestra corrente e ritorna al menu di login" );
		jB_listaApplicazioniUp.addActionListener(new ActionListener()
		{public void actionPerformed(ActionEvent e)
			{
				//?? controllare se ci sono operazioni in corso
				jF_main.dispose();
				//login.setEnabled(true);	// va a Login
			}
		});
		
		jP_applicazioni.add( jL_listaApplicazioniStat );
		//jL_listaApplicazioniStat.setToolTipText( "Stato dell'applicazione selezionata. Puo' essere RUNNING o STOPPED" );
		//jL_listaApplicazioniStat.setText( "<html><font color=red>Status: STOPPED" );
		//jL_listaApplicazioniStat.setText( "<html><font color=green>Status: RUNNING" );
		
		jP_versioni.add( jCB_listaVersioni );
		jCB_listaVersioni.setForeground( Color.red );
		jCB_listaVersioni.setFont(new Font( "COURIER NEW" , Font.PLAIN, 12 ));
		jCB_listaVersioni.setToolTipText( "Entra nell'applicazione 'Gestione versioning'" );
		jCB_listaVersioni.addActionListener(new ActionListener()
		{public void actionPerformed(ActionEvent e)
			{
			}
		});
		
		
		jP_versioni.add( jL_versioneAttivaYN );
		//jL_versioneAttivaYN.setToolTipText( "Se 'ATTIVA' vuol dire che questa versione e' on-line, altrimenti e' 'NON ATTIVA'" );
		//jL_versioneAttivaYN.setText( "<html><font color=blue>Versione STORED" );
		//jL_versioneAttivaYN.setText( "<html><font color=green>Versione ATTIVA" );
		
		jP_versioni.add( jB_listaVersioniLoad );
		jB_listaVersioniLoad.setForeground( Color.green.darker() );
		jB_listaVersioniLoad.setToolTipText( "Carica la versione selezionata" );
		jB_listaVersioniLoad.addActionListener(new ActionListener()
		{public void actionPerformed(ActionEvent e)
			{
				ver.loadVersione();
			}
		});
		
		jP_versioni.add( jB_listaVersioniNew );
		jB_listaVersioniNew.setForeground( Color.green.darker() );
		jB_listaVersioniNew.setToolTipText( "Crea una nuova versione per questa applicazione" );
		jB_listaVersioniNew.addActionListener(new ActionListener()
		{public void actionPerformed(ActionEvent e)
			{
				ver.newVersione(false);
			}
		});
		
		jP_versioni.add( jB_listaVersioniClona );
		jB_listaVersioniClona.setForeground( Color.green.darker() );
		jB_listaVersioniClona.setToolTipText( "Clona una nuova versione dalla versione selezionata" );
		jB_listaVersioniClona.addActionListener(new ActionListener()
		{public void actionPerformed(ActionEvent e)
			{
				ver.clonaVersione();
			}
		});
		
		jP_versioni.add( jB_listaVersioniDel );
		jB_listaVersioniDel.setForeground( Color.red );
		jB_listaVersioniDel.setToolTipText( "Elimina la versione selezionata per questa applicazione" );
		jB_listaVersioniDel.addActionListener(new ActionListener()
		{public void actionPerformed(ActionEvent e)
			{
				ver.delVersione();
			}
		});
		
		jP_versioni.add( jB_listaVersioniAttiva );
		jB_listaVersioniAttiva.setForeground( Color.green.darker() );
		jB_listaVersioniAttiva.setToolTipText( "Attiva la versione selezionata" );
		jB_listaVersioniAttiva.addActionListener(new ActionListener()
		{public void actionPerformed(ActionEvent e)
			{
				ver.attivaVersione();
			}
		});
		
		jP_versioni.add( jB_listaVersioniStored );
		jB_listaVersioniStored.setForeground( Color.red );
		jB_listaVersioniStored.setToolTipText( "Stored della versione selezionata" );
		jB_listaVersioniStored.addActionListener(new ActionListener()
		{public void actionPerformed(ActionEvent e)
			{
				ver.storedVersione();
			}
		});
		
		jP_versioni.add( jB_listaVersioniUp );
		jB_listaVersioniUp.setForeground( Color.magenta );
		jB_listaVersioniUp.setToolTipText( "Ritorna al riquadro 'Applicazioni'" );
		jB_listaVersioniUp.addActionListener(new ActionListener()
		{public void actionPerformed(ActionEvent e)
			{
				//?? controllare se ci sono operazioni in corso
				ver.setComponentsEnabled1();
			}
		});
		
		jP_listaFiles.add( jB_listaFilesDel );
		jB_listaFilesDel.setForeground( Color.red );
		jB_listaFilesDel.setToolTipText( "<html>Elimina dal database versioning il file selezionato<BR>(Non elimina il file dal disco)" );
		jB_listaFilesDel.addActionListener(new ActionListener()
		{public void actionPerformed(ActionEvent e)
			{
				ver.filesDel();
			}
		});
		
		jP_listaFiles.add( jB_listaFilesUp );
		jB_listaFilesUp.setForeground( Color.magenta );
		jB_listaFilesUp.setToolTipText( "Elimina la versione selezionata per questa applicazione" );
		jB_listaFilesUp.addActionListener(new ActionListener()
		{public void actionPerformed(ActionEvent e)
			{
				//?? controllare se ci sono operazioni in corso
				ver.setComponentsEnabled2();
			}
		});
		
		jT_listaFiles.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		jT_listaFiles.setFont(new Font( "COURIER NEW" , Font.PLAIN, 12 ));
		jT_listaFiles.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		jT_listaFiles.getTableHeader().setReorderingAllowed(false);
		// descrizione delle colonne
		jT_listaFilesMod.addColumn("Ver1");
		jT_listaFilesMod.addColumn("Ver2");
		jT_listaFilesMod.addColumn("Old/New/Up");
		jT_listaFilesMod.addColumn("Tipo");
		jT_listaFilesMod.addColumn("Directory");
		jT_listaFilesMod.addColumn("File");
		jT_listaFilesMod.addColumn("Hash");
		jT_listaFiles.setPreferredScrollableViewportSize(new Dimension(/*1600 doubled*/3200, 300));
		// nasconde la colonna colVER1
		jT_listaFiles.getColumnModel().getColumn( colVER1 ).setMaxWidth(0);
		jT_listaFiles.getColumnModel().getColumn( colVER1 ).setMinWidth(0);
		jT_listaFiles.getColumnModel().getColumn( colVER1 ).setWidth(0);
		jT_listaFiles.getColumnModel().getColumn( colVER1 ).setPreferredWidth(0);
		//
		// nasconde la colonna colVER2
		jT_listaFiles.getColumnModel().getColumn( colVER2 ).setMaxWidth(0);
		jT_listaFiles.getColumnModel().getColumn( colVER2 ).setMinWidth(0);
		jT_listaFiles.getColumnModel().getColumn( colVER2 ).setWidth(0);
		jT_listaFiles.getColumnModel().getColumn( colVER2 ).setPreferredWidth(0);
		//
		jT_listaFiles.getColumnModel().getColumn( colOLD_NEW_UP ).setPreferredWidth( 60 );
		jT_listaFiles.getColumnModel().getColumn( colTIPO ).setPreferredWidth( 40 );
		jT_listaFiles.getColumnModel().getColumn( colDIR ).setPreferredWidth( 100 );
		jT_listaFiles.getColumnModel().getColumn( colFILE ).setPreferredWidth( 600 );
		jT_listaFiles.getColumnModel().getColumn( colHASH ).setPreferredWidth( 200 );
		//
		// Lock the movement of columns
		jT_listaFiles.getTableHeader().setReorderingAllowed(false);
		// colora le celle: jT_listaFiles column[colOLD_NEW_UP] - red (Dir) - blue (File)
		jT_listaFiles.getColumnModel().getColumn(colOLD_NEW_UP).setCellRenderer
		(
			new DefaultTableCellRenderer()
			{
				public Component getTableCellRendererComponent (JTable jT_listaFiles, Object value, boolean isSelected, boolean hasFocus, int row, int col)
				{
					Component cell = super.getTableCellRendererComponent (jT_listaFiles, value, isSelected, hasFocus, row, col);
					String real_value = (String)value;
					if (real_value==null)
					{
					}
					else
					{
						if ( real_value.isEmpty() )
						{
							cell.setForeground( null );
						}
						else if ( real_value.equals("Old") )
						{
							cell.setForeground( null );
						}
						else if ( real_value.equals("New") )
						{
							cell.setForeground( Color.magenta );
						}
						else if ( real_value.equals("Up") )
						{
							cell.setForeground( Color.red );
						}
						else
						{
							cell.setForeground( null );
						}
					}
					return cell;
				}
			}
		);
		// colora le celle: jT_listaFiles column[colTIPO] - red (Dir) - blue (File)
		jT_listaFiles.getColumnModel().getColumn(colTIPO).setCellRenderer
		(
			new DefaultTableCellRenderer()
			{
				public Component getTableCellRendererComponent (JTable jT_listaFiles, Object value, boolean isSelected, boolean hasFocus, int row, int col)
				{
					Component cell = super.getTableCellRendererComponent (jT_listaFiles, value, isSelected, hasFocus, row, col);
					String real_value = (String)value;
					if (real_value==null)
					{
					}
					else
					{
						if ( real_value.isEmpty() )
						{
							cell.setForeground( Color.green.darker() );
						}
						else if ( real_value.equals("Dir") )
						{
							cell.setForeground( Color.red );
						}
						else if ( real_value.equals("Fil") )
						{
							cell.setForeground( Color.blue );
						}
						else
						{
							cell.setForeground( null );
						}
					}
					return cell;
				}
			}
		);
		jT_listaFiles.addMouseListener
		(
			new MouseAdapter()
			{
				public void mouseClicked(MouseEvent e)
				{
				}
			}
		);
		jT_listaFiles.getModel().addTableModelListener
		(
			new TableModelListener()
			{
				public void tableChanged(TableModelEvent e)
				{
					return;
				}
			}
		);
		// listener del cambio riga
		ListSelectionListener lsljT_listaFiles = new ListSelectionListener()
		{
			public void valueChanged(ListSelectionEvent e)
			{
				if (e.getValueIsAdjusting()) { return; }
				//listaGiustificazioni.historyInScroll();
			}
		};
		lsmjT_listaFiles.addListSelectionListener(lsljT_listaFiles);
		jP_listaFiles.add( jSP_listaFiles );
		
		// posizionamento dei componenti
		jP_main.setBounds( 5 , 5 , 1000 , 690 );
		jP_applicazioni.setBounds( 5 , 20 , 990 , 120 );
		jP_versioni.setBounds( 5 , 140 , 990 , 120 );
		jP_listaFiles.setBounds( 5 , 260 , 990 , 380 );
		jP_listaFilesDrop.setBounds( 200 , 320 , 400 , 50 );
		jPB_progress.setBounds( 15 , 15 , 370 , 30 );
		jCB_listaApplicazioni.setBounds( 10 , 20 , 380 , 25 );
		jL_listaApplicazioniStat.setBounds( 10 , 50 , 100 , 25 );
		jB_listaApplicazioniLoad.setBounds( 10 , 80 , 100 , 25 );
		jB_listaApplicazioniNew.setBounds( 130 , 80 , 100 , 25 );
		jB_listaApplicazioniDel.setBounds( 250 , 80 , 100 , 25 );
		jB_listaApplicazioniAlt.setBounds( 370 , 80 , 100 , 25 );
		jB_listaApplicazioniRun.setBounds( 490 , 80 , 100 , 25 );
		jB_listaApplicazioniUp.setBounds( 860 , 80 , 100 , 25 );
		jCB_listaVersioni.setBounds( 10 , 20 , 920 , 25 );
		jL_versioneAttivaYN.setBounds( 10 , 50 , 150 , 25 );
		jB_listaVersioniLoad.setBounds( 10 , 80 , 100 , 25 );
		jB_listaVersioniNew.setBounds( 130 , 80 , 100 , 25 );
		jB_listaVersioniClona.setBounds( 250 , 80 , 100 , 25 );
		jB_listaVersioniAttiva.setBounds( 490 , 80 , 100 , 25 );
		jB_listaVersioniStored.setBounds( 610 , 80 , 100 , 25 );
		jB_listaVersioniDel.setBounds( 370 , 80 , 100 , 25 );
		jB_listaVersioniUp.setBounds( 800 , 80 , 160 , 25 );
		jSP_listaFiles.setBounds( 10 , 20 , 970 , 300 );
		jB_listaFilesDel.setBounds( 10 , 330 , 160 , 25 );
		jB_listaFilesUp.setBounds( 800 , 330 , 160 , 25 );
		
		

		
	}
	/** */
	///////////////////////////////////////////////////////
	
	
	// jP_main_button_boolean - rende editabili/non editabili i bottoni
	public void jP_main_button_boolean(String s)
	{
		System.out.println( "versioning_MMI.jP_main_button_boolean" );
	}
	/****************************************************************************/
	/****************************************************************************/
	
	
}
/** versioning_MMI END */
///////////////////////////////////////////////////////



///////////////////////////////////////////////////////
/** versioning_login START */
class versioning_login implements versioning_constants
{
	// listener del tasto ENTER
	public static KeyListener jPlogin_enterKeyListener = new jPlogin_enterKeyListenerClass();
	private static class jPlogin_enterKeyListenerClass implements KeyListener
	{
		public void keyTyped(KeyEvent e) { }
		public void keyReleased(KeyEvent e) { }
		// e' stato premuto INVIO?
		public void keyPressed(KeyEvent e) { if (e.getKeyCode() == 10) { System.out.println( "versioning_MMI.jPlogin_enterKeyListenerClass() - Login entry da tasto 'ENTER'" );login.check(); } }
	}
	
	// abilita/disabilita la JFrame del login
	public static void setEnabled( boolean b )
	{
		jFlogin.setEnabled( b );
		jFlogin.setVisible( b );
		return;
	}
	
	// avvia il main
	public boolean check()
	{
//this.setEnabled( false ); mmi.setEnabled( true );
jPlogin_textUsername.setText("admin");
jPlogin_textPassword.setText("admin");
		System.out.println( "versioning_login.check - Controllo se il login e' corretto" );
		String username = jPlogin_textUsername.getText();
		String password = ut.getPassword( jPlogin_textPassword );
		if ( username.isEmpty() || password.isEmpty() )
		{
			Exception e = Sql.getException();
			Object[] opzioni = {"Ok"};
			jFdialog.setVisible(true);
			int n = JOptionPane.showOptionDialog(jFdialog,
					"Nome e password obbligatori",
					"Errore - Login errato",
					JOptionPane.DEFAULT_OPTION,
					JOptionPane.ERROR_MESSAGE,
					null,
					opzioni,
					opzioni[0]);
			jFdialog.dispose();
			return false;
		}
		if ( username.equals(LOG_NOME) && password.equals(LOG_PASSWORD) )
		{
			System.out.println( "versioning_login.check - Login corretto" );
			ver.loadListaApplicazioni();
			versioning_login.setEnabled( false );
			mmi.setEnabled( true );
		}
		else
		{
			System.out.println( "versioning_login.check - Login errato" );
		}
		/*
		if (Sql.select(  q , v ))
		{
			if (Sql.getJdbcSelect().size()==0)	// utente NON trovato
			{
				Exception e = Sql.getException();
				Object[] opzioni = {lan.r(8950)};
				jFdialog.setVisible(true);
				int n = JOptionPane.showOptionDialog(jFdialog,
						"\n"+lan.r(9113),
						lan.r(9113),
						JOptionPane.DEFAULT_OPTION,
						JOptionPane.ERROR_MESSAGE,
						null,
						opzioni,
						opzioni[0]);
				jFdialog.dispose();
				System.out.println( "versioning_login.check - Utente NON trovato" );
				return false;
			}
			Vector g = Sql.getJdbcSelect();
			for (int i=0; i<v.size(); i++)
			{
				boolean b = false;
				if (g.get(i++).equals("S"))
				{
					datoUtente_Settore.setText((String)g.get(i++));
					datoUtente_Profilo.setText((String)g.get(i++));
					datoUtente_Matricola.setText((String)g.get(i++));
					datoUtente_Username.setText((String)g.get(i++));
					i++;	//bypass LOGIN
					i++;	//bypass PASSWORD
					datoUtente_Password.setText(password);
					if (g.get(i++).equals("S")) {b=true;} else {b=false;}
					datoUtente_Normale.setSelected( b );
					if (g.get(i++).equals("S")) {b=true;} else {b=false;}
					datoUtente_Impiego.setSelected( b );
					if (g.get(i++).equals("S")) {b=true;} else {b=false;}
					datoUtente_Manager.setSelected( b );
					i--;
					String s = "Livello ";
					isVariazioneAllOrMatricola.setSelected( false );
					if (datoUtente_Normale.isSelected())
					{
						s+="'User' ";
						isVariazioneAllOrMatricola.setSelected( false );
					}
					if (datoUtente_Impiego.isSelected())
					{
						s+="'Impiego' ";
						isVariazioneAllOrMatricola.setSelected( true );
					}
					if (datoUtente_Manager.isSelected())
					{
						s+="'Manager'";
						isVariazioneAllOrMatricola.setSelected( true );
					}
					datoUtente_NormaleImpiegoManager.setText(s);
					jF_main.setTitle( lan.r(0)+" v."+update.getActualVersionNumber1()+"."+update.getActualVersionNumber2()+"  [Matricola "+datoUtente_Matricola.getText()+" -  "+datoUtente_Username.getText()+" ("+datoUtente_Settore.getText()+") - "+datoUtente_NormaleImpiegoManager.getText()+"]" );
					// On/Off jTab - Setta lo STANDARD per questo User oppure costringe al cambio Password
					if ( password.equals( password_standard.getText() ) )	// usa la password standard e lo costringe a cambiarla
					{
						System.out.println( "versioning_login.check - Cambio password ('forzato') da standard a personale" );
						// avviso l'utente che deve cambiare la Password e rifare il login
						Object[] opzioni = {lan.r(8950)};
						jFdialog.setVisible(true);
						int n = JOptionPane.showOptionDialog(jFdialog,
								"\n"+lan.r(8508),
								lan.r(8507),
								JOptionPane.DEFAULT_OPTION,
								JOptionPane.INFORMATION_MESSAGE,
								null,
								opzioni,
								opzioni[0]);
						jFdialog.dispose();
						v_jTabStandard.removeAllElements();
						v_jTabStandard.add(false);	// 0 = jT01 - CARP
						v_jTabStandard.add(false);	// 1 = jT02 - Istituto
						v_jTabStandard.add(false);	// 2 = jT03 - Users
						v_jTabStandard.add(false);	// 3 = jT04 - Filtri giustificazioni
						v_jTabStandard.add(false);	// 4 = jT05 - Filtro Statistiche
						v_jTabStandard.add(false);	// 5 = jT06 - Statistiche
						v_jTabStandard.add(false);	// 6 = jT07 - 
						v_jTabStandard.add(false);	// 7 = jT08 - 
						v_jTabStandard.add(true);	// 8 = jT09 - Cambio password
						v_jTabStandard.add(false);	// 9 = jT10 - Log
						v_jTabStandard.add(false);	// 10 = jT11 - Calendario
						jTab.setSelectedIndex(8);	// posizionati sulla Tab 8 - Cambio password
					}
					else	// password diversa dalla password standard: Ok, andare avanti
					{
						v_jTabStandard.removeAllElements();
						v_jTabStandard.add(true);	// 0 = jT01 - CARP
						v_jTabStandard.add(datoUtente_Impiego.isSelected());	// 1 = jT02 - Istituto
						v_jTabStandard.add(datoUtente_Impiego.isSelected());	// 2 = jT03 - Users
						v_jTabStandard.add(true);	// 3 = jT04 - Filtri giustificazioni
						v_jTabStandard.add(datoUtente_Manager.isSelected());	// 4 = jT05 - Filtro Statistiche
						v_jTabStandard.add(datoUtente_Manager.isSelected());	// 5 = jT06 - Statistiche
						v_jTabStandard.add(false);	// 6 = jT07 - 
						v_jTabStandard.add(false);	// 7 = jT08 - 
						v_jTabStandard.add(true);	// 8 = jT09 - Cambio password
						v_jTabStandard.add(false);	// 9 = jT10 - Log
						v_jTabStandard.add(false);	// 10 = jT11 - Calendario
						jTab.setSelectedIndex(0);	// posizionati sulla Tab 0 - CARP
					}
					ut.setEnabledJtab( jTab, v_jTabStandard );
					
					// Filtri - devono essere tolti alla partenza e attivati i filtri standard
					// Giustificativi
					jP04_checkData.setSelected(false);
					jP04_checkUsername.setSelected(false);
					jP04_checkIstituto.setSelected(false);
					filtro.jP04_showDateUsernameIstituto();
					jP04_filtro.setText("");
					if (datoUtente_Impiego.isSelected())	// se impiego ripristinare filtro impiego
					{
						jP04_descrizioneFiltro.setText(lan.r(940));
					}
					else
					{
						jP04_descrizioneFiltro.setText(lan.r(941));
					}
					// Statistiche
					jP05_checkData.setSelected(false);
					jP05_checkUsername.setSelected(false);
					jP05_checkIstituto.setSelected(false);
					filtroStat.jP05_showDateUsernameIstituto();
					jP05_filtro.setText("");
					jP05_descrizioneFiltro.setText(lan.r(1950));
					//
					
					// prepara il login e legge tutto il database
						// prima readVariazionePrimaVolta
					checkVariazioneTable.readVariazionePrimaVolta( isVariazioneAllOrMatricola.isSelected(), datoUtente_Matricola.getText(), matricola_variazioni.getText(), par.getDbCARP()+"."+par.getTableUsers() );
						// poi start
					checkVariazioneTable.start();//// E QUESTO?!?!?! VA BENE QUI?
					listaUsers.readAllUsers();	// da caricare prima delle Giustificazioni
					listaIstituto.readAllIstituto();	// da caricare prima delle Giustificazioni
					listaIstituto.fillvComboIstituto();	// carica il JComboBox Istituto
					listaFiles.readAllGiustificazioni();	// da caricare per ultimo
					mmi.jP_main_button_boolean( "READ" );	// aziona i bottoni a secondo dell'utenza
					cambioPassword.jP09_buttonClear_void();	// cambioPassword clear dei campi
					checkVariazioneTable.start();//// E QUESTO?!?!?! VA BENE QUI?
					//
					
					setEnabled( false );
					mmi.setEnabled( true );
					return true;
				}
				else // user NON abilitato
				{
					Exception e = Sql.getException();
					Object[] opzioni = {lan.r(8950)};
					jFdialog.setVisible(true);
					int n = JOptionPane.showOptionDialog(jFdialog,
							"\n"+lan.r(9111),
							lan.r(9111),
							JOptionPane.DEFAULT_OPTION,
							JOptionPane.ERROR_MESSAGE,
							null,
							opzioni,
							opzioni[0]);
					jFdialog.dispose();
					System.out.println( "versioning_login.check - Utente non abilitato" );
					return false;
				}
			}
			return false;
		}
		else
		{
			Exception e = Sql.getException();
			Object[] opzioni = {lan.r(8950)};
			jFdialog.setVisible(true);
			int n = JOptionPane.showOptionDialog(jFdialog,
					"\n"+lan.r(9013)+"\n"+lan.r(9014)+" "+e.getCause()+"\n"+lan.r(9015)+" "+e.getMessage(),
					lan.r(9013),
					JOptionPane.DEFAULT_OPTION,
					JOptionPane.ERROR_MESSAGE,
					null,
					opzioni,
					opzioni[0]);
			jFdialog.dispose();
			System.out.println( "versioning_login.check - Errore Sql" );
			return false;
		}
		*/
		return true;
	}
	
	// chiusura Carp
	public static void chiusuraCarp()
	{
		System.exit(0);
	}
}
/** versioning_login END */
///////////////////////////////////////////////////////



///////////////////////////////////////////////////////
/** versioning_util START */
class versioning_util implements versioning_constants
{
	private boolean isComment = false; boolean isParameter = false; private String valueParameter = "";

	/****************************************************************************/
	/**
	* Read a file with parameters.
	* The parameters are putted in a text file (with estension txt)
	* and each parameter is separed by colons ":"<p>
	* - ';' is a commento 
	* - each row ends with 13 10 (CR LF)
	* Example of parameter:
	*		MYPARAMATER: 10
	*/
	/****************************************************************************/
	public boolean readFilePara( String file , Vector<String> vDes , Vector<String> vVal )
	{
		System.out.println( "versioning_util.readFilePara(): File: "+file );
		try
		{
			if (new java.io.File( file ).exists())
			{
				File fil_in  = new File(file);FileInputStream in = new FileInputStream( file );
				char charRead=(char)0; int intRead=0; String stringRead=""; boolean moreChars=true;
				// ogni riga (anche l'ultima) deve terminare con CR (chr 13)
				while (moreChars)
				{
					// read until there are datas in the file
					if (in.available()!=0) { intRead = in.read(); charRead = (char)intRead; }
					else { moreChars = false; intRead = 13; }
					if ((intRead == 13) || (intRead == 10) )
					{
						if (intRead == 13)	// il 13 c'e' sempre, il 10 a volte in certi files non c'e'!
						{
							if ( stringRead.length() > 0 )
							{
								for ( int cnt = 0 ; cnt < vDes.size() ; cnt++)
								{
									if ( rowIsParam( vDes.get(cnt) , stringRead ) )
									{
										if ( isComment ){}
										else if ( isParameter ) {vVal.set(cnt, valueParameter);}
										break;
									}
									else if (cnt == vDes.size()-1){} // No Parameter No Comment
								}
							}
							stringRead = "";
						}
					}
					else { stringRead += charRead; }
				}
				in.close( );
				return true;
			}
			else
			{
				Object[] opzioni = {"Ok"};
				jFdialog.setVisible(true);
				int n = JOptionPane.showOptionDialog(jFdialog,
						"File parametri: "+file+" mancante",
						"Errore - File dei paramentri non trovato",
						JOptionPane.DEFAULT_OPTION,
						JOptionPane.ERROR_MESSAGE,
						null,
						opzioni,
						opzioni[0]);
				jFdialog.dispose();
				System.out.println( "versioning_util.readFilePara: Non trovato il file "+file );
				System.exit(0);
				return false;
			}
		}
		catch (Exception e)
		{
			Object[] opzioni = {"Ok"};
			jFdialog.setVisible(true);
			int n = JOptionPane.showOptionDialog(jFdialog,
					"Errore di lettura del file parametri: "+file+"\n\nCausa "+e.getCause()+"\nMotivo "+e.getMessage(),
					"Errore - File dei paramentri non trovato",
					JOptionPane.DEFAULT_OPTION,
					JOptionPane.ERROR_MESSAGE,
					null,
					opzioni,
					opzioni[0]);
			jFdialog.dispose();
			System.out.println( "versioning_util.readFilePara() error: "+e );e.printStackTrace();
			System.exit(0);
			return false;
		}
	}
	/****************************************************************************/
	
	/****************************************************************************/
	/** <b>rowIsParam( String s1 , String s2 )</b><BR>
		Check if a row is a <i>parameter</i>.<BR>
	 */
	/****************************************************************************/
	private boolean rowIsParam( String s1 , String s2 )
	{
		isComment = false;
		isParameter = false;
		valueParameter = "";
		if ( ";".equals( s2.substring(0,1) ) ){isComment = true;return true;}
		if ( s2.length() < s1.length() ){return false;}
		if ( s1.equals( s2.substring( 0, s1.length() ) ) )
		{
			isParameter = true;
			if ( s2.length() > s1.length() ){valueParameter = lrTrim( s2.substring( s1.length() ) );}
			else {valueParameter = "";}
			return true;
		}
		return false;
	}
	/****************************************************************************/
	
	
	/****************************************************************************/
	/** Fill n zeros left
	*/
	/****************************************************************************/
	public String zTrim( short ztrim_num , int ztrim_len )
	{
		String s = "0000000000"+Short.toString( ztrim_num );int l = s.length();
		return s.substring(  l-ztrim_len , l ) ;
	}
	
	public String zTrim( int ztrim_num , int ztrim_len )
	{
		String s = "0000000000"+Integer.toString( ztrim_num );int l = s.length();
		return s.substring(  l-ztrim_len , l ) ;
	}
			
	public String zTrim( long ztrim_num , int ztrim_len )
	{
		String s = "0000000000"+Long.toString( ztrim_num );int l = s.length();
		return s.substring(  l-ztrim_len , l ) ;
	}
	/****************************************************************************/
	
	
	/****************************************************************************/
	/****************************************************************************/
	// lTrim - Delete the space left
	/****************************************************************************/
	public String lTrim( String s )
	{
		int k  = s.length();
		if ( k > 0 )
		{
			int i = 0;
			while ( " ".equals( s.substring(i, i+1) ) ){if ( ++i == k ){return( "" );}}
			if ( i > 0 ){return ( s.substring(i, k) );}
			return ( s );
		}
		return ( "" );
	}
	/****************************************************************************/

		
	/****************************************************************************/
	/****************************************************************************/
	// rTrim -Delete the space right
	/****************************************************************************/
	public String rTrim( String s )
	{
		int k  = s.length();
		if ( k > 0 )
		{
			int i = k-1;
			while ( " ".equals( s.substring(i, i+1) ) ){if ( --i < 0 ){return( "" );}}
			if ( i > -1 ){return ( s.substring(0, i+1) );}
			return ( s );
		}
		return ( "" );
	}
	/****************************************************************************/
	
	
	/****************************************************************************/
	/****************************************************************************/
	/** lrTrim - Delete the space left and right */
	/****************************************************************************/
	public String lrTrim( String s )
	{
		if ( s.length() == 0 ){return( "" );}else{return( lTrim( rTrim ( s ) ) );}
	}
	
	
	/****************************************************************************/
	/****************************************************************************/
	/** log - set */
	/****************************************************************************/
	private JTextArea logJTA;
	private int logLenCat = 0;
	private int logRowAtt = 0;
	private int logRowMin = 400;
	private int logRowMax = 700;
	/** log - setLog */
	public void setLog( JTextArea logJTA , int logRowMin , int logRowMax )
	{
		this.logJTA = logJTA;
		this.logRowMin = logRowMin;
		this.logRowMax = logRowMax;
	}
	public JTextArea getLogJTA()
	{
		return logJTA;
	}
	public void writeLog( int i )
	{
		writeLog( ""+i );
	}
	public void writeLog( long i )
	{
		writeLog( ""+i );
	}
	//private final Rectangle bottomLogJTA = new Rectangle( 0, Integer.MAX_VALUE, 0, 0 );
	public void writeLog( String s )
	{
		// logJTA.append( data1()+" - "+s+"\n" );
		logJTA.insert( data1()+" - "+s+"\n" , 0 );
		++logRowAtt;
		if ( logRowAtt==logRowMin )
		{
			logLenCat = logJTA.getText().length();
		}
		else if ( logRowAtt==logRowMax )
		{
			logRowAtt = logRowMax-logRowMin;
			String s2 = logJTA.getText();
			logJTA.setText( s2.substring( 0 , s2.length()-logLenCat ) );
			logLenCat = logJTA.getText().length();
		}
		// scroll to the bottom - non necessario
		//logJTA.scrollRectToVisible( bottomLogJTA );
	}
	// clear log
	public void clearLog()
	{
		logLenCat = 0;
		logRowAtt = 0;
		logJTA.setText("");
	}
	/****************************************************************************/
	
	
	
	/****************************************************************************/
	/****************************************************************************/
	/** sleep */
	/****************************************************************************/
	private boolean endSleep = false;
	private final long SLEEP_MIN = 200;
	public void sleep( long t )
	{
		long i=0;
		while (true)
		{
			try {Thread.sleep(SLEEP_MIN);}catch(InterruptedException ieex){}
			i += SLEEP_MIN;
			if ( i >= t )
			{
				return;
			}
			else if ( endSleep )
			{
				return;
			}
		}
	}
	/****************************************************************************/
	/****************************************************************************/
	/** data and time */
	/****************************************************************************/
	//* data1 - gg/mm/aaaa-hh:mm:ss.mmm Es.: 01/01/2005-12:32:08.682 */
	public String data1()
	{
		Calendar d = Calendar.getInstance();
		return zTrim( d.get(Calendar.DAY_OF_MONTH), 2 ) +"/"+
				zTrim( d.get(Calendar.MONTH)+1, 2 ) +"/"+
				zTrim( d.get(Calendar.YEAR), 4 )+"-"+
				zTrim( d.get(Calendar.HOUR_OF_DAY), 2 ) +":"+
				zTrim( d.get(Calendar.MINUTE), 2 ) +":"+
				zTrim( d.get(Calendar.SECOND), 2 ) +"."+
				zTrim( d.get(Calendar.MILLISECOND), 3 );
	}
	public String data1( Long l )
	{
		Calendar d = Calendar.getInstance();
		d.setTimeInMillis(l);
		return zTrim( d.get(Calendar.DAY_OF_MONTH), 2 ) +"/"+
				zTrim( d.get(Calendar.MONTH)+1, 2 ) +"/"+
				zTrim( d.get(Calendar.YEAR), 4 )+"-"+
				zTrim( d.get(Calendar.HOUR_OF_DAY), 2 ) +":"+
				zTrim( d.get(Calendar.MINUTE), 2 ) +":"+
				zTrim( d.get(Calendar.SECOND), 2 ) +"."+
				zTrim( d.get(Calendar.MILLISECOND), 3 );
	}
	//* data2 - aaaa/mm/gg-hh:mm:ss Es.: 2007/12/31-12:32:08 */
	public String data2()
	{
		Calendar d = Calendar.getInstance();
		return zTrim( d.get(Calendar.YEAR), 4 )+"-"+
				zTrim( d.get(Calendar.MONTH)+1, 2 ) +"/"+
				zTrim( d.get(Calendar.DAY_OF_MONTH), 2 ) +"/"+
				zTrim( d.get(Calendar.HOUR_OF_DAY), 2 ) +":"+
				zTrim( d.get(Calendar.MINUTE), 2 ) +":"+
				zTrim( d.get(Calendar.SECOND), 2 );
	}
	public String data2( Long l )
	{
		Calendar d = Calendar.getInstance();
		d.setTimeInMillis(l);
		return zTrim( d.get(Calendar.YEAR), 4 )+"-"+
				zTrim( d.get(Calendar.MONTH)+1, 2 ) +"/"+
				zTrim( d.get(Calendar.DAY_OF_MONTH), 2 ) +"/"+
				zTrim( d.get(Calendar.HOUR_OF_DAY), 2 ) +":"+
				zTrim( d.get(Calendar.MINUTE), 2 ) +":"+
				zTrim( d.get(Calendar.SECOND), 2 );
	}
	//* data3 - aaaammgghhmmss Es.: 20071231123208 */
	public String data3()
	{
		Calendar d = Calendar.getInstance();
		return zTrim( d.get(Calendar.YEAR), 4 )+
				zTrim( d.get(Calendar.MONTH)+1, 2 ) +
				zTrim( d.get(Calendar.DAY_OF_MONTH), 2 ) +
				zTrim( d.get(Calendar.HOUR_OF_DAY), 2 ) +
				zTrim( d.get(Calendar.MINUTE), 2 ) +
				zTrim( d.get(Calendar.SECOND), 2 );
	}
	public String data3( Long l )
	{
		Calendar d = Calendar.getInstance();
		d.setTimeInMillis(l);
		return zTrim( d.get(Calendar.YEAR), 4 )+
				zTrim( d.get(Calendar.MONTH)+1, 2 ) +
				zTrim( d.get(Calendar.DAY_OF_MONTH), 2 ) +
				zTrim( d.get(Calendar.HOUR_OF_DAY), 2 ) +
				zTrim( d.get(Calendar.MINUTE), 2 ) +
				zTrim( d.get(Calendar.SECOND), 2 );
	}
	//* data4 - aaaammgg Es.: 20071231 */
	public String data4()
	{
		Calendar d = Calendar.getInstance();
		return zTrim( d.get(Calendar.YEAR), 4 )+
				zTrim( d.get(Calendar.MONTH)+1, 2 ) +
				zTrim( d.get(Calendar.DAY_OF_MONTH), 2 );
	}
	public String data4( Long l )
	{
		Calendar d = Calendar.getInstance();
		d.setTimeInMillis(l);
		return zTrim( d.get(Calendar.YEAR), 4 )+
				zTrim( d.get(Calendar.MONTH)+1, 2 ) +
				zTrim( d.get(Calendar.DAY_OF_MONTH), 2 );
	}
	//* data5 - gg/mm/aaaa Es.: 11/12/2009 */
	public String data5()
	{
		Calendar d = Calendar.getInstance();
		return zTrim( d.get(Calendar.DAY_OF_MONTH), 2 )+"/"+
				zTrim( d.get(Calendar.MONTH)+1, 2 ) +"/"+
				zTrim( d.get(Calendar.YEAR), 4 );
	}
	public String data5( Long l )
	{
		Calendar d = Calendar.getInstance();
		d.setTimeInMillis(l);
		return zTrim( d.get(Calendar.DAY_OF_MONTH), 2 )+"/"+
				zTrim( d.get(Calendar.MONTH)+1, 2 ) +"/"+
				zTrim( d.get(Calendar.YEAR), 4 );
	}
	//* data6 - aaaamm Es.: 200712 */
	public String data6()
	{
		Calendar d = Calendar.getInstance();
		return zTrim( d.get(Calendar.YEAR), 4 )+
				zTrim( d.get(Calendar.MONTH)+1, 2 );
	}
	public String data6( Long l )
	{
		Calendar d = Calendar.getInstance();
		d.setTimeInMillis(l);
		return zTrim( d.get(Calendar.YEAR), 4 )+
				zTrim( d.get(Calendar.MONTH)+1, 2 );
	}
	//* data7 - trasforma da aaaammgghhmmss in gg/mm/aaaa hh:mm:ss Es.: 11/12/2008 25:32:58 */
	public String data7( String s )
	{
		// aaaammgghhmmss
		// 01234567890123
		// 12345678901234
		return s.substring(6,8)+"/"+s.substring(4,6)+s.substring(0,4)+" "+
				s.substring(8,10)+":"+s.substring(10,12)+":"+s.substring(12,14);
	}
	//* data8 - aaaa-mm-gg Es.: 2007-12-31 */
	public String data8()
	{
		Calendar d = Calendar.getInstance();
		return zTrim( d.get(Calendar.YEAR), 4 )+"-"+
				zTrim( d.get(Calendar.MONTH)+1, 2 ) +"-"+
				zTrim( d.get(Calendar.DAY_OF_MONTH), 2 );
	}
	public String data8( Long l )
	{
		Calendar d = Calendar.getInstance();
		d.setTimeInMillis(l);
		return zTrim( d.get(Calendar.YEAR), 4 )+"-"+
				zTrim( d.get(Calendar.MONTH)+1, 2 ) +"-"+
				zTrim( d.get(Calendar.DAY_OF_MONTH), 2 );
	}
	/****************************************************************************/
	
	
	/****************************************************************************/
	/****************************************************************************/
	/** read/write Objects -  serialization and deserialization */
	/****************************************************************************/
	/* read an Object Jtable - return null in case of error */

    // Il metodo writeJTableOnDisk (incollato qui, senza la sua "public class ...")
    public boolean writeJTableOnDisk(DefaultTableModel jT, String file) {
        System.out.println("versioning_util.writeJTableOnDisk(): write JTable su file " + file + " len=" + jT.getRowCount());

        // Usiamo try-with-resources per assicurarci che gli stream vengano chiusi automaticamente.
        try (FileOutputStream fos = new FileOutputStream(file);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            // Preleva il Vector grezzo dal DefaultTableModel
            Vector<?> rawDataVector = jT.getDataVector();

            // Crea un nuovo Vector fortemente tipizzato per la serializzazione
            Vector<Vector<Object>> typedDataVector = new Vector<>();

            // Itera sul Vector grezzo e ricrea un Vector type-safe
            for (Object rowObj : rawDataVector) {
                if (rowObj instanceof Vector) {
                    Vector<?> rawRow = (Vector<?>) rowObj; // Cast sicuro a Vector con wildcard

                    Vector<Object> typedRow = new Vector<>();
                    for (Object cellObj : rawRow) {
                        typedRow.add(cellObj); // Aggiunta sicura: Object in Vector<Object>
                    }
                    typedDataVector.add(typedRow);
                } else {
                    // Questo caso indica che il DefaultTableModel contiene dati inattesi.
                    // Ad esempio, una "riga" che non e' un Vector.
                    System.err.println("versioning_util.writeJTableOnDisk(): Errore: Trovato elemento inatteso nel modello JTable. Tipo: " + rowObj.getClass().getName());
                    writeLog(9014); // Nuovo codice errore per dati inattesi nel modello
                    return false; // Non possiamo serializzare dati non conformi
                }
            }

            // Scrive il Vector fortemente tipizzato sull'output stream
            oos.writeObject(typedDataVector);
            oos.flush();
            // oos.close() e fos.close() sono gestiti automaticamente da try-with-resources

            return true;
        } catch (IOException e) {
            writeLog(9012);
            e.printStackTrace();
            return false;
        }
    }

	/* read an Object Vector - return null in case of error */
public Vector<Object> read_VectorOnDisk( String file )
{
    try (FileInputStream fis = new FileInputStream(file); // Utilizzo di try-with-resources
         ObjectInputStream ois = new ObjectInputStream(fis)) {

        // Punto critico per il warning [unchecked] unchecked cast:
        // Leggiamo l'oggetto in modo generico e lo controlliamo prima del cast.
        Object obj = ois.readObject();

        if (obj instanceof Vector) { // Controlliamo che l'oggetto sia effettivamente un Vector
            // Cast a un Vector con wildcard per la sicurezza del tipo
            Vector<?> rawVector = (Vector<?>) obj;
            // Creiamo un nuovo Vector fortemente tipizzato per il risultato finale
            Vector<Object> typedVector = new Vector<>();

            // Iteriamo sugli elementi del Vector "grezzo" e li aggiungiamo al Vector tipizzato
            for (Object item : rawVector) {
                typedVector.add(item); // Questa aggiunta e' sicura perche' 'typedVector' accetta Object
            }

            System.out.println( "versioning_util.read_VectorOnDisk():read Vector on file "+file+" len="+typedVector.size() );
            return typedVector; // Restituiamo il Vector ricostruito e type-safe
        } else {
            // Caso in cui l'oggetto letto non sia un Vector (errore nel formato del file)
            System.err.println("versioning_util.read_VectorOnDisk(): Errore: Tipo di oggetto inatteso. Atteso Vector, ma ottenuto " + obj.getClass().getName());
            writeLog(9013); // Chiama il tuo metodo di logging per l'errore
            return null;
        }
    }
    catch (ClassNotFoundException e)
    {
        writeLog(9010);
        e.printStackTrace();
        return null;
    }
    catch (FileNotFoundException e)
    {
        writeLog(9011);
        e.printStackTrace();
        return null;
    }
    catch (IOException e)
    {
        writeLog(9010); // Riutilizzo del codice di errore, o specifico per IO
        e.printStackTrace();
        return null;
    }
}

/* write an Object Vector - return false in case of error */
public boolean write_VectorOnDisk( Vector<Object> v , String file )
{
    System.out.println( "versioning_util.write_VectorOnDisk():write Vector on file "+file+" len="+v.size() );
    // Utilizzo di try-with-resources per garantire la chiusura automatica degli stream
    try (FileOutputStream fos = new FileOutputStream(file);
         ObjectOutputStream oos = new ObjectOutputStream(fos)) {

        oos.writeObject(v); // Scrivi il Vector tipizzato
        oos.flush();
        // Non e' necessario chiamare oos.close() e fos.close(); try-with-resources lo fa per te.
        return true;
    }
    catch (IOException e)
    {
        writeLog(9012);
        e.printStackTrace();
        return false;
    }
}
/****************************************************************************/	
	
	/****************************************************************************/
	/****************************************************************************/
	/** seleziona la prima riga (se c'e') di una JTable e ne prende il focus */
	/****************************************************************************/
	private Rectangle rettangolo;
	public void setFirstRowJTable( JTable jt )
	{
		int t = jt.getRowCount();
		if ( t > 0 )
		{
			jt.setRowSelectionInterval(0, 0);
			// Le successive istruzioni sono state rimosse
			// perche' lo scrollRectToVisible deve stare un tread.
			// Questo thread e', come in nc.java, un ListSelectionListener 
			rettangolo = jt.getCellRect(0, 0, true);
			jt.scrollRectToVisible(rettangolo);
		}
	}
	/****************************************************************************/
	
	/****************************************************************************/
	// setLastRowJTable( JTable )
	// si seleziona all'ultima riga di una JTable e ne prende il focus
	/****************************************************************************/
	public void setLastRowJTable( JTable jt )
	{
		int t = jt.getRowCount();
		if ( t > 0 )
		{
			jt.setRowSelectionInterval(t-1, t-1);
			// Le successive istruzioni sono state rimosse
			// perche' lo scrollRectToVisible deve stare un tread.
			// Questo thread e', come in nc.java, un ListSelectionListener 
			rettangolo = jt.getCellRect(t-1, 0, true);
			jt.scrollRectToVisible(rettangolo);
		}
	}
	/****************************************************************************/

	
	
	/****************************************************************************/
	/* Gestione dell'Hashing													*/
	/****************************************************************************/
	/** createMD5( String s , String t )
	* Convert the String s in the hashing algorithm t
	* s = string to convert
	* t = "MD5" or "SHA"
	*/
	public String createMD5( String s , String t )
	{
		MessageDigest md;
		try
		{
			md = MessageDigest.getInstance( t );
			try
			{
				md.update(s.getBytes("UTF8"));
			}
			catch (Exception e)
			{
				System.out.println( "Conversion error in "+t+" format" );
				e.printStackTrace();
			}
			byte[] sDigest = md.digest();
			return bytesToHEx(sDigest);
		}
		catch (NoSuchAlgorithmException cnse2)
		{
			System.out.println( "Errore conversione in "+s+"!!!" );
			cnse2.printStackTrace();
			return "";
		}
	}
	/** String bytesToHEx( byte[] b) 
	* @return <i>the string in HEX of the b[]</i>
	* Usato da createMD5()
	*/
	private String bytesToHEx( byte[] b)
	{
		String hexChar = ""; 
		String allhexChar = "";
		if(b != null)
		{
			for(int i=0; i<b.length; i++)
			{
				//System.out.println( "----> "+i+" = "+b[i] );
				if(b[i] > 0)
				{ 
					hexChar = Integer.toHexString(b[i]);
				}
				else if(b[i] < 0)
				{
					hexChar = Integer.toHexString(b[i]).substring(6);
				}
				else
				{
					hexChar = "00";
				}
				if ( hexChar.equals("1") ) hexChar="01";
				if ( hexChar.equals("2") ) hexChar="02";
				if ( hexChar.equals("3") ) hexChar="03";
				if ( hexChar.equals("4") ) hexChar="04";
				if ( hexChar.equals("5") ) hexChar="05";
				if ( hexChar.equals("6") ) hexChar="06";
				if ( hexChar.equals("7") ) hexChar="07";
				if ( hexChar.equals("8") ) hexChar="08";
				if ( hexChar.equals("9") ) hexChar="09";
				if ( hexChar.equals("a") ) hexChar="0a";
				if ( hexChar.equals("b") ) hexChar="0b";
				if ( hexChar.equals("c") ) hexChar="0c";
				if ( hexChar.equals("d") ) hexChar="0d";
				if ( hexChar.equals("e") ) hexChar="0e";
				if ( hexChar.equals("f") ) hexChar="0f";
				allhexChar+=hexChar;
			}
			return allhexChar;
		}
		else
		{
			return "";
		}
	}
	/** 
	* public byte[] fileHashing(String filePathAndName , String hashCodify)
	* Description: create an hash from the file
	*/
	public String fileHashing(String filePathAndName , String hashCodify)
	{
		final int bufferLen = 16;
		try
		{
			//System.out.println( "versioning_util.fileHashing - Codifica "+hashCodify+" del file "+filePathAndName );
			MessageDigest digest=MessageDigest.getInstance(hashCodify); 
			File f = new File(filePathAndName);
			long iLengthofData = f.length();
			f = null;
			FileInputStream fis = new FileInputStream(filePathAndName);
			BufferedInputStream inBuf = new BufferedInputStream(fis);
			int chunkSize = (bufferLen * 1024);
			long bytesRead = 0; //this will actually be bytesRead or Hashed, of file.
			byte[] buffer = new byte[chunkSize];
			digest.reset();
			String finalHash="";
			
			long time_start = System.currentTimeMillis();
			
			while (bytesRead < iLengthofData)
			{
				int iActualBytesRead;
				iActualBytesRead=inBuf.read(buffer,0,chunkSize);
				digest.update(buffer,0, iActualBytesRead); //update the MessageDigest.
				bytesRead += chunkSize;
			}
			long time_end = System.currentTimeMillis();
			//System.out.println( "versioning_util.fileHashing -   "+iLengthofData+" bytes in "+(time_end-time_start)+" ms" );
			
			byte[] digestBuf = digest.digest(); //get hash
			return  bytesToHEx( digestBuf );
		}
		catch (FileNotFoundException e)
		{
			//?????
			System.out.println( "versioning_util.fileHashing - file not found "+filePathAndName );
			return null;
		}
		catch (Exception e)
		{
			//?????
			System.out.println( "versioning_util.fileHashing - error in fileHashing" );
			e.printStackTrace();
			return null;
		}
	}	
	/****************************************************************************/
	/* Gestione dell'Hashing - END												*/
	/****************************************************************************/
	
	
	/****************************************************************************/
	/** setEnabledJtab( JTabbedPane jt, Vector v )
	* Attiva/disattiva le Jtab di jt secondo i valori del vettore booleano v
	* Es.: v = { false, true, false } attiva solo la seconda jTab
	*/
	public void setEnabledJtab( JTabbedPane jt, Vector<Boolean> v )
	{
		for (int i=0;i<jt.getTabCount();i++)
		{
			jt.setEnabledAt(i,v.get(i));
		}
	}
	/****************************************************************************/
	
	
	/****************************************************************************/
	/** getPassword( jPlogin_textPassword )
	* Ritorna la stringa password di una JPasswordField
	*/
	public String getPassword( JPasswordField jpf )
	{
		char[] pwd = jpf.getPassword();
		String password = "";
		for (int i=0; i<pwd.length; i++)
		{
			password += pwd[i];
		}
		return password;
	}
	/****************************************************************************/
	
	
	/****************************************************************************/
	/****************************************************************************/
	// copia un file in un altro file
	// copyFile( String Fi, String Fo )
	// copia il file Fi in Fo
	/****************************************************************************/
	public boolean copyFile( String Fi, String Fo )
	{
		File iF = new File( Fi );
		File oF = new File( Fo );
		try
		{
			InputStream i = new FileInputStream(iF);
			OutputStream o = new FileOutputStream(oF);
			byte[] buffer = new byte[1024];
			int len;
			while ((len = i.read(buffer)) > 0)
			{
				o.write(buffer, 0, len);
			}
			i.close();
			o.close();
		}
		catch (IOException e)
		{
			return false;
		}
		return true;
	}
	/****************************************************************************/
	
	
	/****************************************************************************/
	/****************************************************************************/
	// check se il campo String e' un numero.
	// true=solo numeri o e' vuoto
	// false=contiene caratteri alfanumerici
	/****************************************************************************/
	public boolean isNumber( String s )
	{
		int l = s.length();
		if (l==0) { return true; }
		String n="0123456789";
		for (int i=0; i<l; i++)
		{
			if (!n.contains(s.substring(i,i+1))) { return false; }
		}
		return true;
	}
	/****************************************************************************/
	
	
	/****************************************************************************/
	/****************************************************************************/
	// giorniTraDueDate - controlla la distanza tra die date in formato gg/mm/aaaa Es.: 11/12/1960
	//					- la prima data si suppone minore della seconda
	// giorniTraDueDate( String s1 , String s2 )
	// return differenza
	// s1 = data nel formato gg/mm/aaaa
	// s2 = data nel formato gg/mm/aaaa
	// s1 < s2
	// differenza e' long e in giorni
	/****************************************************************************/
	public static long giorniTraDueDate( String s1 , String s2 )
	{
		int gg1 = Integer.parseInt(s1.substring( 0, 2 ));
		int mm1 = Integer.parseInt(s1.substring( 3, 5 ));
		int aa1 = Integer.parseInt(s1.substring( 6, 10 ));
		int gg2 = Integer.parseInt(s2.substring( 0, 2 ));
		int mm2 = Integer.parseInt(s2.substring( 3, 5 ));
		int aa2 = Integer.parseInt(s2.substring( 6, 10 ));
		Calendar data1 = new GregorianCalendar(aa1, mm1, gg1);
		Calendar data2 = new GregorianCalendar(aa2, mm2, gg2);
		long differenza = data2.getTimeInMillis()-data1.getTimeInMillis();
		return differenza/(24*60*60*1000);
	}
	/****************************************************************************/
	
	
	/****************************************************************************/
	// padStringa - Aggiunge il carattere specificato all fine della riga
	//				fintantoche la riga non diventa lunga n caratteri.
	//			  I caratteri CR r LF sono sotituiti con SPAZIO.
	/****************************************************************************/
	public String padStringa( String s1 , String s2, int n )
	{
		s1 = rTrim ( s1 );
		s1 = s1.replace(eol, " ");
		s1 = s1.replace(String.valueOf(e_ol[0]), " ");
		s1 = s1.replace(String.valueOf(e_ol[1]), " ");
		int x,y;
		int sLen = s1.length();
		if ( sLen > n ) 
		{
			s1 = s1.substring( 0 , n );
		}
		else
		{
			x = n - sLen;
			for( y=0 ; y<x ; ++y)
			{
				s1 += s2;
			}
		}
		return ( s1 );
	}
	
	/****************************************************************************/
	// dialogError - JDialog di un errore con la stringa passata come parametro.
	//				Il bottone e' "Ritorna"
	/****************************************************************************/
	private static final JFrame jFdialog = new JFrame();
	public void dialogError( String s )
	{
		jFdialog.setBounds( 400 , 300,100,100);
		Object[] opzioni = {"Ritorna"};
		jFdialog.setVisible(true);
		int n = JOptionPane.showOptionDialog(jFdialog,
				s,
				"Errore",
				JOptionPane.DEFAULT_OPTION,
				JOptionPane.ERROR_MESSAGE,
				null,
				opzioni,
				opzioni[0]);
		jFdialog.dispose();
	}
	/****************************************************************************/
	// dialogInfo - JDialog di informazione con la stringa passata come parametro.
	//				Il bottone e' "Ritorna"
	/****************************************************************************/
	public void dialogInfo( String s )
	{
		jFdialog.setBounds( 400 , 300,100,100);
		Object[] opzioni = {"Ritorna"};
		jFdialog.setVisible(true);
		int n = JOptionPane.showOptionDialog(jFdialog,
				s,
				"Informazione",
				JOptionPane.DEFAULT_OPTION,
				JOptionPane.INFORMATION_MESSAGE,
				null,
				opzioni,
				opzioni[0]);
		jFdialog.dispose();
	}
	/****************************************************************************/
	// dialogWarning - JDialog di warning con la stringa passata come parametro.
	//				Il bottone e' "Ritorna"
	/****************************************************************************/
	public void dialogWarning( String s )
	{
		jFdialog.setBounds( 400 , 300,100,100);
		Object[] opzioni = {"Ritorna"};
		jFdialog.setVisible(true);
		int n = JOptionPane.showOptionDialog(jFdialog,
				s,
				"Warning",
				JOptionPane.DEFAULT_OPTION,
				JOptionPane.WARNING_MESSAGE,
				null,
				opzioni,
				opzioni[0]);
		jFdialog.dispose();
	}
	/****************************************************************************/
	// getDirSize - Ritorna la grandezza di in byte della directory passata come parametro
	//				Ritorna 0 se non e' directory
	/****************************************************************************/
	public long getDirSize(File dir)
	{
		long size = 0;
		if (dir.isDirectory())
		{
			File[] subFiles = dir.listFiles();
			for (File file : subFiles)
			{
				if (file.isFile())
				{
					size += file.length();
				}
				else
				{
					size += this.getDirSize(file);
				}
			}
		}
		return size;
	}
	
	
	/****************************************************************************/
	// isRowInJTable - Cerca la stringa di una determinata colonna di una JTable
	//					Ritorna la riga trovata
	//					Ritorna -1 se non trova la riga
	/****************************************************************************/
	public int isRowInJTable( JTable jtable , int colonna , String stringaDiRicerca )
	{
		for (int row=0; row<jT_listaFiles.getRowCount(); row++)
		{
			if ( ((String)jT_listaFiles.getValueAt( row, colonna )).equals(stringaDiRicerca) )
			{
				return row;
			}
		}
		return -1;
	}
	
	
	/****************************************************************************/
	// zipFile - Compatta in un file zip
	//			Ritorna true o false a seconda di come e' andata l'operazione
	/****************************************************************************/
	public boolean zipFile(String fileName, String zipName)
	{
		try
		{
			byte[] buf = new byte[1024];
			ZipOutputStream out = new ZipOutputStream(new FileOutputStream(zipName));
			FileInputStream in = new FileInputStream(fileName);
			out.putNextEntry(new ZipEntry(fileName));
			int len;
			while ((len = in.read(buf)) > 0)
			{
				out.write(buf, 0, len);
			}
			out.closeEntry();
			in.close();
			out.flush();
			out.close();
			return true;
		}
		catch (IOException ioe)
		{
			System.out.println("versioning_util.zipFile - IOException:");
			ioe.printStackTrace();
			return false;
		}
	}
	
	
	/****************************************************************************/
	// zipDir - Compatta in un file zip una directory con le sottodirectory
	//			Ritorna true o false a seconda di come e' andata l'operazione
	/****************************************************************************/
	public boolean zipDir(String directory, String zipName)
	{
		try
		{
			// create a ZipOutputStream to zip the data to
			ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(zipName));
			String path = directory+File.separator;
			if (!zipDir( directory, zos, path ))
			{
				return false;
			}
			zos.flush();
			zos.close();
			return true;
		}
		catch (IOException ioe)
		{
			System.out.println("versioning_util.zipDir(2) - IOException:");
			ioe.printStackTrace();
			return false;
		}
	}
	//
	private boolean zipDir(String directory, ZipOutputStream zos, String path)
	{
		try
		{
			File zipDir = new File(directory);
			// get a listing of the directory content
			String[] dirList = zipDir.list();
			byte[] readBuffer = new byte[2156];
			int bytesIn = 0;
			// loop through dirList, and zip the files
			for (int i = 0; i < dirList.length; i++)
			{
				File f = new File(zipDir, dirList[i]);
				if (f.isDirectory())
				{
					String filePath = f.getPath();
					if (!zipDir(filePath, zos, path + f.getName() + File.separator))
					{
						return false;
					}
					continue;
				}
				FileInputStream fis = new FileInputStream(f);
				try
				{
					ZipEntry anEntry = new ZipEntry(path + f.getName());
					zos.putNextEntry(anEntry);
					bytesIn = fis.read(readBuffer);
					while (bytesIn != -1)
					{
						zos.write(readBuffer, 0, bytesIn);
						bytesIn = fis.read(readBuffer);
					}
				}
				finally
				{
					fis.close();
				}
			}
			return true;
		}
		catch (IOException ioe)
		{
			System.out.println("versioning_util.zipDir(3) - IOException:");
			ioe.printStackTrace();
			return false;
		}
	}
	/****************************************************************************/
	// unzip - Scompatta un file zip nella directory corrente
	//			Ritorna true o false a seconda di come e' andata l'operazione
	/****************************************************************************/
	public boolean unzip(String file)
	{
		if (!new java.io.File( file ).exists())
		{
			System.out.println( "mrm_util.unzip - non esiste il file "+file );
			return false;
		}
		try
		{
			ZipFile zipFile = new ZipFile(file);
			Enumeration<? extends java.util.zip.ZipEntry> entries = zipFile.entries();
			while(entries.hasMoreElements())
			{
				ZipEntry entry = (ZipEntry)entries.nextElement();
				if(entry.isDirectory())
				{
					// Assume che le directory siano memorizzte prima i genitori e poi i figli.
//					System.out.println("mrm_util.unzip - Estrazione della directory: " + entry.getName());
					// Verificare questa riga per renderla sicura
					(new File(entry.getName())).mkdirs();
					continue;
				}
//				System.out.println("mrm_util.unzip - Estrazione del file: " + entry.getName());
				// crea la directory se non esiste
				File outputFile = new File( entry.getName() );
				if ( !outputFile.getParentFile().exists() )
				{
					File dir = outputFile.getParentFile();
					if(!dir.mkdirs()) throw new RuntimeException("ut.unzip - Non posso creare la directory "+dir);
				}
				BufferedInputStream inputStream = new BufferedInputStream(zipFile.getInputStream(entry));
				BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(outputFile));
				copyInputStream(inputStream, outputStream);
				outputStream.close();
				inputStream.close();
			}
			zipFile.close();
			return true;
		}
		catch (IOException ioe)
		{
			System.out.println("mrm_util.unzip - IOException:");
			ioe.printStackTrace();
			return false;
		}
	}	// 
	private void copyInputStream(InputStream in, OutputStream out) throws IOException
	{
		byte[] buffer = new byte[1024];
		int len;

		while((len = in.read(buffer)) >= 0)
			out.write(buffer, 0, len);

		in.close();
		out.flush();
		out.close();
	}
	// ritardoMillisec( long millesimi di secondo )
	public static void ritardoMillisec( long ms )
	{
		long startime = System.currentTimeMillis();
		while ( (System.currentTimeMillis() - startime) < ms )
		{
			//non fa niente!
		}
		return;
	}
}
/** versioning_util END */
///////////////////////////////////////////////////////



///////////////////////////////////////////////////////
/** versioning_sqlFunctions START */
class versioning_sqlFunctions
{
	private String[] columnTypeString = {"ARRAY","BIGINT","BINARY","BIT","BLOB","BOOLEAN","CHAR",
							"CLOB","DATALINK","DATE","DECIMAL","DISTINCT","DOUBLE","FLOAT","INTEGER",
							"JAVA_OBJECT","LONGNVARCHAR","LONGVARBINARY","LONGVARCHAR","NCHAR",
							"NCLOB","NULL","NUMERIC","NVARCHAR","OTHER","REAL","REF","ROWID",
							"SMALLINT","SQLXML","STRUCT","TIME","TIMESTAMP","TINYINT","VARBINARY",
							"VARCHAR"};
	private int columnTypeInt[] = {2003, -5, -2, -7, 2004, 16, 1, 2005, 70, 91, 3, 2001, 8, 6, 4,
							2000, -16, -4, -1, -15, 2011, 0, 2, -9, 1111, 7, 2006, -8, 5, 2009,
							2002, 92, 93, -6, -3, 12};
	private Connection conDb;
	private String jdbc_driver;
	private String jdbc_url;
	private String jdbc_name;
	private String jdbc_password;
	private String jdbc_query;
	private int jdbc_columns;
	private Vector<Object> jdbc_select = new Vector<>();
	private Vector<String> jdbc_columnsname = new Vector<>();
	private Exception jdbc_exception;
	//// set
	synchronized void setConDb( Connection c ){conDb = c;}
	synchronized void setJdbcDriver( String s ){jdbc_driver = s;}
	synchronized void setJdbcUrl( String s ){jdbc_url = s;}
	synchronized void setJdbcName( String s ){jdbc_name = s;}
	synchronized void setJdbcPassword( String s ){jdbc_password = s;}
	synchronized void setJdbcQuery( String s ){jdbc_query = s;}
	synchronized void setJdbcColumns( int i ){jdbc_columns = i;}
	synchronized void setException( Exception e ){jdbc_exception = e;}
	synchronized void resetException(){jdbc_exception = null;}
	synchronized void addJdbcSelect( Object s ){jdbc_select.add(s);}
	synchronized void delJdbcSelect(){jdbc_select.removeAllElements();}
	synchronized void addJdbcColumnsName( String s ){jdbc_columnsname.add(s);}
	synchronized void delJdbcColumnsName(){jdbc_columnsname.removeAllElements();}
	//// get
	Connection getConDb(){return conDb;}
	String getJdbcDriver(){return jdbc_driver;}
	String getJdbcUrl(){return jdbc_url;}
	String getJdbcName(){return jdbc_name;}
	String getJdbcPassword(){return jdbc_password;}
	String getJdbcQuery(){return jdbc_query;}
	int getJdbcColumns(){return jdbc_columns;}
	Vector<Object> getJdbcSelect(){return jdbc_select;}
	
	Exception getException(){return jdbc_exception;}
	
	
	
	//// Class forName
	synchronized boolean classForName( String s )
	{
		resetException();
		setJdbcDriver( s );
		try{Class.forName( getJdbcDriver() );return true;}
		catch (ClassNotFoundException e){exception( e , "[versioning_sqlFunctions.ClassNotFoundException.classForName()]" );return false;}
	}
	synchronized boolean classForName(){return classForName( getJdbcDriver() );}
	
	
	
	//// connect e disconnect
	synchronized boolean connect( Connection c, String u, String n, String p )
	{
		resetException();
		setConDb( c ); setJdbcUrl( u ); setJdbcName( n ); setJdbcPassword( p );
		////////////////////////////////////
		// new	
		// new	try {
		// new			conDb = DriverManager.getConnection( getJdbcUrl(), getJdbcName(), getJdbcPassword());
		// new			conDb.setAutoCommit( false );
		// new			setConnected(true);
		// new			return true;
		// new		}
			// new	
			Properties properties = new Properties();
			properties.setProperty( "user", n);
			properties.setProperty( "password", p );
			properties.setProperty( "useSSL", "false");
			properties.setProperty( "autoReconnect", "true");
			// AGGIUNGI QUESTA RIGA:
			properties.setProperty( "allowPublicKeyRetrieval", "true");
			// Indica al driver di chiedere la chiave pubblica al server
		
		
			try {
					conDb = DriverManager.getConnection( getJdbcUrl(), properties );
					conDb.setAutoCommit( false );
					setConnected(true);
					return true;
				}
		////////////////////////////////////
		catch (SQLException e){exception( e , "[versioning_sqlFunctions.SQLException.setConnection()]" );setConnected(false);return false;}
	}
	synchronized boolean connect( Connection c ){resetException();setConDb( c );return connect( getConDb(), getJdbcUrl(), getJdbcName(), getJdbcPassword() );}
	synchronized boolean connect(){return connect( getConDb(), getJdbcUrl(), getJdbcName(), getJdbcPassword() );}
	synchronized boolean disconnect()
	{
		resetException();
		setConnected(false);
		if (conDb!=null)
		{
			try{conDb.close();conDb=null;return true;}
			catch (SQLException e){exception( e , "[versioning_sqlFunctions.SQLException.disconnect()]" );return false;}
		}
		else
		{
			return false;
		}
	}
	
	
	
	//// select
	synchronized boolean select( String s )
	{
		resetException();
		setJdbcQuery( s );
		try
		{
			PreparedStatement ps = conDb.prepareStatement( getJdbcQuery() );
			ResultSet rs = ps.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			setJdbcColumns( rsmd.getColumnCount() );
			delJdbcColumnsName();
			for (int i=1; i<=getJdbcColumns(); i++){addJdbcColumnsName( rsmd.getColumnLabel( i ) );}
			delJdbcSelect();
			while (rs.next()){for (int i=1; i<=getJdbcColumns(); i++){addJdbcSelect( rs.getString( i ) );}}
			commit();
			rs.close();ps.close();
			return true;
		}
		catch (SQLException e){exception( e , "[versioning_sqlFunctions.SQLException.select()]" );return false;}
	}
	synchronized boolean select( String s , Vector<Object> parametri )
	{
		resetException();
		setJdbcQuery( s );
		try
		{
			PreparedStatement ps = conDb.prepareStatement( getJdbcQuery() );
			for (int i=1; i<=parametri.size(); i++){ps.setString(i, (String)parametri.get(i-1));}
			ResultSet rs = ps.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			setJdbcColumns( rsmd.getColumnCount() );
			delJdbcColumnsName();
			for (int i=1; i<=getJdbcColumns(); i++){addJdbcColumnsName( rsmd.getColumnLabel( i ) );}
			delJdbcSelect();
			while (rs.next()){for (int i=1; i<=getJdbcColumns(); i++){addJdbcSelect( rs.getString( i ) );}}
			commit();
			rs.close();ps.close();
			return true;
		}
		catch (SQLException e){exception( e , "[versioning_sqlFunctions.SQLException.select()]" );return false;}
	}
	synchronized boolean select( Vector<Object> parametri){return select(getJdbcQuery(),parametri);}
	synchronized boolean select(){return select(getJdbcQuery());}
	
	
	
	//// execute
	synchronized boolean execute( String s )
	{
		resetException();
		setJdbcQuery( s );
		try
		{
			PreparedStatement ps = conDb.prepareStatement( getJdbcQuery() );
			ps.execute();
			delJdbcColumnsName();
			delJdbcSelect();
			commit();
			ps.close();
			return true;
		}
		catch (SQLException e){exception( e , "[versioning_sqlFunctions.SQLException.execute()]" );return false;}
	}
	synchronized boolean execute( String s , Vector<Object> parametri )
	{
		resetException();
		setJdbcQuery( s );
		try
		{
			PreparedStatement ps = conDb.prepareStatement( getJdbcQuery() );
			for (int i=1; i<=parametri.size(); i++){ps.setString(i, (String)parametri.get(i-1));}
			ps.executeUpdate();
			delJdbcColumnsName();
			delJdbcSelect();
			commit();
			ps.close();
			return true;
		}
		catch (SQLException e){exception( e , "[versioning_sqlFunctions.SQLException.execute()]" );return false;}
	}
	synchronized boolean execute(){return execute(getJdbcQuery());}
	
	
	
	//// delete
	synchronized boolean delete( String s )
	{
		resetException();
		setJdbcQuery( s );
		try
		{
			PreparedStatement ps = conDb.prepareStatement( getJdbcQuery() );
			ps.executeUpdate( getJdbcQuery() );
			commit();
			ps.close();
			return true;
		}
		catch (SQLException e){exception( e , "[versioning_sqlFunctions.SQLException.delete()]" );return false;}
	}
	synchronized boolean delete(){return delete(getJdbcQuery());}
	
	
	
	//// commit
	synchronized boolean commit( Connection c )
	{
		resetException();
		setConDb( c );
		try
		{
			getConDb().commit();
			return true;
		}
		catch (SQLException e){exception( e , "[versioning_sqlFunctions.SQLException.commit()]" );return false;}
	}
	synchronized boolean commit(){return commit(getConDb());}
	
	
	
	//// rollback
	synchronized boolean rollback( Connection c )
	{
		resetException();
		setConDb( c );
		try{getConDb().rollback();return true;}
		catch (SQLException e){exception( e , "[versioning_sqlFunctions.SQLException.rollback()]" );return false;}
	}
	synchronized boolean rollback(){return rollback(getConDb());}
	
	
	
	//// update ( usato per UPDATE , INSERT , DELETE )
	synchronized boolean update( String s )
	{
		resetException();
		setJdbcQuery( s );
		delJdbcColumnsName();
		delJdbcSelect();
		try
		{
			PreparedStatement ps = conDb.prepareStatement( getJdbcQuery() );
			ps.executeUpdate();
			commit();
			ps.close();
			return true;
		}
		catch (SQLException e){exception( e , "[versioning_sqlFunctions.SQLException.update()]" );return false;}
	}
	synchronized boolean update( String s , Vector<Object> parametri )
	{
		resetException();
		setJdbcQuery( s );
		try
		{
			PreparedStatement ps = conDb.prepareStatement( getJdbcQuery() );
			for (int i=1; i<=parametri.size(); i++){ps.setString(i, (String)parametri.get(i-1));}
			ps.executeUpdate();
			delJdbcColumnsName();
			delJdbcSelect();
			commit();
			ps.close();
			return true;
		}
		catch (SQLException e){exception( e , "[versioning_sqlFunctions.SQLException.update()]" );return false;}
	}
	synchronized boolean update(){return update(getJdbcQuery());}
	
	
	
	//// tipo colonna
	synchronized private String columnType( int t )
	{
		resetException();
		String risultato = "";
		for (int n=0;n<columnTypeInt.length;n++){if (columnTypeInt[n]==t){risultato = columnTypeString[n];break;}}
		return risultato;
	}
	synchronized private int columnType( String t )
	{
		resetException();
		int risultato = -9999999;
		for (int n=0;n<columnTypeString.length;n++){if (t.equals(columnTypeString[n])){risultato = columnTypeInt[n];break;}}
		return risultato;
	}
	
	
	
	//// exception
	synchronized private void exception( Exception e , String s )
	{
		setException( e );
		System.out.println( "\n*** EXCEPTION ***" );
		if (s!=null){System.out.println( "ERROR: "+s );}
		if (e.getCause()!=null){System.out.println( "CAUSE: "+e.getCause() );}
		System.out.println( "DESCRIPTION = "+e.getMessage() );
		e.printStackTrace();
		System.out.println( "*****************\n" );
	}
	synchronized private void exception( Exception e ){exception( e , null );}
	
	
	//// stampa dello Status
	synchronized public void printStatus()
	{
		System.out.println( "\n\n" );
		System.out.println( "conDb ................: "+conDb );
		System.out.println( "jdbc_driver ..........: "+jdbc_driver );
		System.out.println( "jdbc_url .............: "+jdbc_url );
		System.out.println( "jdbc_name ............: "+jdbc_name );
		System.out.println( "jdbc_password ........: "+jdbc_password );
		System.out.println( "jdbc_query ...........: "+jdbc_query );
		System.out.println( "jdbc_columns .........: "+jdbc_columns );
		System.out.println( "jdbc_exception .......: "+jdbc_exception );
		System.out.print(   "jdbc_columnsname .....: *" );
		int ii=1;
		for (int i = 0; i<jdbc_columnsname.size(); i++)
		{
			System.out.print( jdbc_columnsname.get( i )+" * " );
		}
		System.out.println( "" );
		System.out.print( "jdbc_select..........: * " );
		ii=1;
		for (int i = 0; i<jdbc_select.size(); i++)
		{
			System.out.print( jdbc_select.get( i )+" * " );
			if (ii<jdbc_columns){++ii;}else{System.out.print( "\n					   * " );ii=1;}
		}
		System.out.println( "\n" );
	}
	
	
	private boolean isConnected = false;
	// isConnected()
	synchronized public boolean isConnected()
	{
		return isConnected;
	}
	// setConnected(boolean b)
	synchronized public void setConnected(boolean b)
	{
		isConnected = b;
	}
	
	//// DatabaseMetaData
	// getURL()
	synchronized public String getCurrentURL()
	{
		resetException();
		String s = "";
		try
		{
			s = (getConDb().getMetaData()).getURL();
		}
		catch (SQLException e){exception( e , "[versioning_sqlFunctions.SQLException.getURL()]" );return "";}
		return s;
	}
	
}
/** versioning_sqlFunctions END */
///////////////////////////////////////////////////////



///////////////////////////////////////////////////////
/** versioning_db START */
class versioning_db implements versioning_constants
{
	// crea database e tabelle SE NON ESISTONO
	public boolean creaDbIfNotExist()
	{
		if (Sql.isConnected())
		{
			System.out.println( "versioning_db.creaDbIfNotExist() - Creazione del database e delle tabelle se non esistono" );
			String query;
			System.out.println( "versioning_db.creaDbIfNotExist() - Creazione del database 'versioning'" );
			query = "CREATE DATABASE IF NOT EXISTS versioning";
			Sql.execute( query );
			
			System.out.println( "versioning_db.creaDbIfNotExist() - Creazione della tabella 'applicazioni'" );
			query = "CREATE TABLE IF NOT EXISTS versioning.applicazioni "+
				"(NUMEROAPPLICAZIONE CHARACTER (4) NOT NULL UNIQUE ,"+
				" RUNNINGSTOPPED CHARACTER (7) NOT NULL ,"+
				" DESCRIZIONE CHARACTER (40) NOT NULL UNIQUE ,"+
				" NUMEROVERSIONEATTIVA CHARACTER (6) NOT NULL)";

			Sql.execute( query );
			
			System.out.println( "versioning_db.creaDbIfNotExist() - Creazione della tabella 'versioni'" );
			query = "CREATE TABLE IF NOT EXISTS versioning.versioni "+
				"(NUMEROAPPLICAZIONE CHARACTER (4) NOT NULL ,"+
				" NUMEROVERSIONE CHARACTER (6) NOT NULL ,"+
				" DATA CHARACTER (10) NOT NULL ,"+
				" ATTIVASTORED CHARACTER (6) NOT NULL ,"+
				" DESCRIZIONE CHARACTER (120) NOT NULL ,"+
				" UNIQUE(NUMEROAPPLICAZIONE,NUMEROVERSIONE))";
			Sql.execute( query );
			
			System.out.println( "versioning_db.creaDbIfNotExist() - Creazione della tabella 'files'" );
			query = "CREATE TABLE IF NOT EXISTS versioning.files "+
				"(NUMEROAPPLICAZIONE CHARACTER (4) NOT NULL ,"+
				" NUMEROVERSIONE CHARACTER (6) NOT NULL ,"+
				" OLDNEWUP CHARACTER (3) NOT NULL ,"+
				" TIPO CHARACTER (3) NOT NULL,"+
				" DIRECTORY CHARACTER (40) NOT NULL ,"+
				" FILE CHARACTER (80) NOT NULL,"+
				" HASH CHARACTER (32) NOT NULL,"+
				" BLOBFILE LONGBLOB NOT NULL ,"+
				" UNIQUE (NUMEROAPPLICAZIONE,NUMEROVERSIONE,DIRECTORY,FILE) )";
			Sql.execute( query );
			
			return true;
		}
		else
		{
			System.out.println( "versioning_db.creaDbIfNotExist() - Errore: non si e' connessi al db" );
			return false;
		}
	}
}
/** versioning_db END */
///////////////////////////////////////////////////////



///////////////////////////////////////////////////////
/** versioning_fileDropper START */
/** Questa classe gestisce il rilascio (drop) di File */
class versioning_fileDropper extends DropTargetAdapter implements versioning_constants
{
	/** Questo metodo e' invocato dal meccanismo
	AWT di drag and drop quando e' rilevato il
	tentativo di rilasciare qualcosa su un componente
	AWT. Il componente AWT in questione e' quello
	associato a questo DropTargetListener tramite
	un DropTarget. */
	public void drop(DropTargetDropEvent e)
	{
		/* La prima cosa da fare e' stabilire se
		cio' che si tenta di rilasciare e' qualcosa
		che sappiamo come gestire. Per capirlo
		confrontiamo il tipo di dati che si cerca di
		trasferire con quello che vorremmo trasferire. */
		if(e.isDataFlavorSupported(DataFlavor.javaFileListFlavor))
		{
			/* cio' che si sta tentando di rilasciare e' una
			lista (java.util.List<?>) di java.io.File */
			System.out.println( "E' una lista" );
			handleFileTransfer(e);
		}
		else if(e.isDataFlavorSupported(DataFlavor.stringFlavor))
		{
			/* Cio' che si sta tentando di rilasciare e' una
			stringa di testo. In certi sistemi (KDE) i file
			sono trasferiti come URL in formato stringa. */
			System.out.println( "E' una stringa di testo" );
			handleURLStringsTransfer(e);
		}
		else
		{
			/* Non e' un file o una stringa, rifiutiamo il drop */
			System.out.println( "Ne' file ne' lista. Rifiuto il drop" );
			e.rejectDrop();
		}
	}
	
	
	/** Gestiamo il rilascio di una lista (java.util.List<?>) di
	java.io.File */
	private void handleFileTransfer(DropTargetDropEvent e)
	{
		/* Questa e' la lista di file che riempiamo con cio' che e'
		stato trasferito */
		ArrayList<File> fileList = new ArrayList<File>();
 
		/* Questo valore e' usato alla fine per stabilire se
		il rilascio sia avvenuto con successo */
		boolean success = false;
 
		/* Accettiamo il rilascio. */
		e.acceptDrop(DnDConstants.ACTION_COPY);
 
		/* I dati trasferiti sono incapsulati in un oggetto
		java.awt.datatransfer.Transferable. Lo prendiamo...*/
		Transferable transferable = e.getTransferable();
 
		/* Dal trasferable prendiamo la lista di file. */
		try
		{
			Object data = transferable.getTransferData(DataFlavor.javaFileListFlavor);
			if(data instanceof List)
			{
				System.out.println( "E' una istanza di List" );
				fillFileList(fileList, data);
			}
			success = true;
		}
		catch(IOException ex)
		{
			/* Il rilascio fallisce */
			System.out.println( "Rilascio fallito" );
			success = false;
		}
		catch(UnsupportedFlavorException ex)
		{
			/* Questo non dovrebbe verificarsi perche' abbiamo
			gia' controllato la compatibilita'. Comunque, se
			dovesse bizzarramente capitare, indichiamo il
			fallimento delle operazioni di rilascio. */
			System.out.println( "Fallito!" );
			success = false;
		}
		e.dropComplete(success);
 
		/* alla fine facciamo quello che dobbiamo con la lista di file */
		listaFilesDrop(fileList);
	}
	
	
	/** Gestiamo il rilascio di una stringa che potrebbe contenere dei
	un elenco di URL */
	private void handleURLStringsTransfer(DropTargetDropEvent e)
	{
		/* Questa e' la lista di file che riempiamo con cio' che e'
		stato trasferito */
		ArrayList<File> fileList = new ArrayList<File>();
		/* Questo valore e' usato alla fine per stabilire se
		il rilascio sia avvenuto con successo */
		boolean success = false;
		/* Accettiamo il rilascio. */
		e.acceptDrop(DnDConstants.ACTION_COPY);
		/* I dati trasferiti sono incapsulati in un oggetto
		java.awt.datatransfer.Transferable. Lo prendiamo...*/
		Transferable transferable = e.getTransferable();
		/* Dal trasferable prendiamo la stringa che potrebbe contenere un
		elenco di URL */
		try
		{
			Object data = transferable.getTransferData(DataFlavor.stringFlavor);
			if(data instanceof String)
			{
				System.out.println( "E' una istanza di String" );
				fillFileListWithURLs(fileList, data);
				success = true;
			}
		}
		catch(IOException ex)
		{
			/* Il rilascio fallisce */
			System.out.println( "Rilascio di String fallito" );
			success = false;
			System.out.println( "Rilascio fallito" );
		}
		catch(UnsupportedFlavorException ex)
		{
			/* Questo non dovrebbe verificarsi perche' abbiamo
			gia' controllato la compatibilita'. Comunque, se
			dovesse bizzarramente capitare, indichiamo il
			fallimento delle operazioni di rilascio. */
			success = false;
			System.out.println( "Flavor non supportato" );
		}
		e.dropComplete(success);
 
		/* alla fine facciamo quello che dobbiamo con la lista di file */
		listaFilesDrop(fileList);
	}
	
	
	/* Riempie la lista fileList con i valori di data. Data e' suppposto
	essere un riferimento ad un oggetto di tipo java.util.List che contiene
	degli oggetti di tipo java.io.File.*/
	private void fillFileList(java.util.List<File> fileList, Object data)
	{
		java.util.List<?> dataList = (java.util.List)data;
		for(Object item : dataList)
		{
			fileList.add((File)item);
		}
	}
	
	
	/** Riempie la lista fileList con i valori di data. Data e' supposto essere
	un riferimento ad un oggetto di tipo java.lang.String che contiene
	un elenco di percorsi URL, uno per riga */
	private void fillFileListWithURLs(java.util.List<File> fileList, Object data)
	{
		String source = (String)data;
		Scanner scanner = new Scanner(source);
		while(scanner.hasNextLine())
		{
			String line = scanner.nextLine();
			File file = urlToFile(line);
			if(file != null)
			{
				fileList.add(file);
			}
		}
	}
	
	
/** Trasforma un percorso URL in File, se possibile */
	private File urlToFile(String path) {
		System.out.println( "path --> "+path );
		File answer = null; // Inizializza a null
		try
		{
			// Approccio preferito: crea prima un URI, poi un File direttamente dal URI.
			// Questo evita il costruttore deprecato di URL e gestisce meglio la codifica.
			URI uri = new URI(path);
			answer = new File(uri);
		}
		// Cattura eccezioni specifiche per problemi di sintassi o malformazione
		catch(URISyntaxException ex) // Cattura URISyntaxException (path non e' un URI valido)
		{
			System.err.println("urlToFile(): Errore di sintassi URI per: " + path + " - " + ex.getMessage());
			// Non e' necessario impostare answer a null, e' gia' cosi' dall'inizializzazione
		}
		catch(IllegalArgumentException ex) // Cattura IllegalArgumentException (es. URI non gerarchico per File)
		{
			System.err.println("urlToFile(): Errore argomento non valido per: " + path + " - " + ex.getMessage());
			// Non e' necessario impostare answer a null
		}
		// Rimuovi catch(MalformedURLException ex)
		// Poiche' non stiamo piu' creando un URL direttamente dalla stringa,
		// MalformedURLException non verra' piu' lanciata qui.
		// Qualsiasi problema legato alla malformazione URL verra' gestito da URISyntaxException
		// o IllegalArgumentException se il URI non puo' essere convertito in File.

		return answer; // Restituisce null se si e' verificata un'eccezione, altrimenti il File
	}	
	
	/** Qui facciamo qualcosa con i file trasferiti. */
	private boolean listaFilesDrop(List<File> fileList)
	{
		System.out.println("versioning_fileDropper.listaFilesDrop - start");
		versioning_MyThread th = new versioning_MyThread();
		th.setFileList(fileList);
		th.start();
		/*
		try
		{
			// join aspetta bloccandosi in attesa che termini run()
			System.out.println( "Join start" );
			th.join();
			System.out.println( "Join end" );
		}
		catch (InterruptedException errInt)
		{
			System.out.println( "InterruptedException" );
		}
		*/
		return th.ritorno;
	}
}
/** versioning_fileDropper END */
///////////////////////////////////////////////////////



///////////////////////////////////////////////////////
/** versioning_MyThread START */
class versioning_MyThread extends Thread implements versioning_constants
{
	// Thread che memorizza files e directory e usa la ProgressBar
	boolean ritorno = false;
	List<File> fileList;
	int val;
	int ciclo;
	String attNumApp;
	int nDir;
	long nDirSize;
	int nFil;
	int nErr;
	long nFilSize;
	String attVerDes;
	String attVer1;
	String attVer2;
	Vector<Object> v;
	Object[] o;
	// setta la lista dei files da copiare in versioning.files
	void setFileList(List<File> fileList)
	{
		this.fileList = fileList;
	}
	// Thread della copia dei files con ProgressiveBar
	public void run()
	{
		ver.setComponentsEnabled4();
		// cerca il numero applicazione
		attNumApp= ver.getNumAppFromCombo();
		if (attNumApp==null)
		{
			return;
		}
		System.out.println( "attNumApp = "+attNumApp );
		val = 0;
		ciclo = 0;
		nDir=0;
		nDirSize=0L;
		nFil=0;
		nErr=0;
		nFilSize=0;
		attVerDes = (String)jCB_listaVersioni.getSelectedItem();
		attVer1 = attVerDes.substring( 11, 14 );
		attVer2 = attVerDes.substring( 15, 17 );
		v = new Vector<>();
		o = new Object[jT_listaFiles.getColumnCount()];
		o[colVER1] = attVer1; o[colVER2] = attVer2;
		jPB_progress.setMaximum(fileList.size());
		jPB_progress.setValue(0);
		for(File f : fileList)
		{
			if (f.isDirectory())
			{
				/*
				o[colOLD_NEW_UP] = "Up";
				o[colTIPO] = "Dir";
				o[colDIR] = f.getName();
				o[colFILE] = "";
				o[colHASH] = "";
				jT_listaFilesMod.insertRow( 0, o );
				*/
				boolean b = insertFile( f , "Dir" );
				if (b)
				{
					++nDir;
					nDirSize+=ut.getDirSize(f);
					System.out.println( "versioning_MyThread.run() - Dir Ok, b e' true" );
				}
				else
				{
					++nErr;
				}
			}
			else if (f.isFile())
			{
				boolean b = insertFile( f , "Fil" );
				if (b)
				{
					++nFil;
					nFilSize+=f.length();
					System.out.println( "versioning_MyThread.run() - File Ok, b e' true" );
				}
				else
				{
					++nErr;
				}
			}
			else	// ne' Fil ne' Dir!
			{
				++nErr;
			}
			jPB_progress.setValue(++ciclo);
			//ut.ritardoMillisec( 500 );
			
			/*
			System.out.println( "" );
			System.out.println("path ------------------> "+f.getPath());
			System.out.println("	 fileName ---------> "+f.getName());
			System.out.println("	 e' un file? -------> "+f.isFile());
			System.out.println("	 e' un directory? --> "+f.isDirectory());
			System.out.println("	 ultima modifica --> "+f.lastModified());
			System.out.println("	 lunghezza --------> "+f.length());
			System.out.println("	 parent -----------> "+f.getParent());
			*/
		}
		System.out.println("versioning_fileDropper.listaFilesDrop - fare il caricamento delle directory");
		System.out.println("versioning_fileDropper.listaFilesDrop - fare il caricamento di BLOBFILE");
		ut.dialogInfo( "Caricamento effettuato.\nDirectory  "+nDir+"  ("+nDirSize+"  bytes)\nFiles  "+nFil+"  ("+nFilSize+"  bytes)\nErrori  "+nErr );
		ritorno = true;
		ver.setComponentsEnabled3();
		return;
	}
	// inserisce un file nella tabella versioning.files
	private boolean insertFile( File f , String FilDir /* "Fil" o "Dir" */ )
	{
		// e' directory? se si f diventa uno zip
		if (FilDir.equals("Dir"))
		{
			f.getName();
			System.out.println( "f.getName() - "+f.getName() );
			String zipName=f.getName()+".zip";
			File zipFile = new File( zipName );
			System.out.println( "f.getName() - "+f.getName() );
			
			if (ut.zipDir(f.getPath(), f.getName()+".zip"))
			{
				System.out.println( "(versioning_MyThread.insertFile() - ut.zipDir(\""+f.getName()+"\", \""+f.getName()+".zip\")) --> Ok!" );		
			}
			else
			{
				System.out.println( "(versioning_MyThread.insertFile() - ut.zipDir(\""+f.getName()+"\", \""+f.getName()+".zip\")) --> FALLITO!" );
				return false;
			}
			// adesso non si parla di Dir ma di Fil
			f = new File( zipName );
			//System.exit(0);
		}
		String hash = ut.fileHashing( f.getPath() , "MD5" );
		System.out.println( "hash di "+f.getPath()+" --> "+hash );
		if (hash==null)
		{
			System.out.println("versioning_fileDropper.listaFilesDrop - ERRORE di hashing");
			return false;
		}
		else
		{
			//System.out.println("versioning_fileDropper.listaFilesDrop - hash: "+hash);
			// check: se e' new o up inserisce, altrimenti ignora
			int row=ut.isRowInJTable( jT_listaFiles , colFILE , f.getName() );
			if ( row>-1 )	// trovato nome file in JTable
			{
				String exHash = (String)jT_listaFiles.getValueAt( row, colHASH );
				if ( exHash.equals( hash ) )	// hash e' uguale? Non succede nulla
				{
					return true;	//++++ e i valori statistici vengono ricontabilizzati!
				}
				else	// hash e' diverso. E' un update
				{
					// update file
					try
					{
						Connection conn = Sql.getConDb();
						conn.setAutoCommit(false);
						FileInputStream fis = new FileInputStream(f);
						String query1 = "UPDATE versioning.files"+
								" SET OLDNEWUP = ?,"+
								" TIPO = ?,"+
								" DIRECTORY = ?,"+
								" FILE = ?,"+
								" HASH = ?,"+
								" BLOBFILE = ? "+	// ultimo
								" WHERE NUMEROAPPLICAZIONE = ? AND NUMEROVERSIONE = ? AND HASH = ?";
						System.out.println( "query1 = "+query1 );
						PreparedStatement ps = conn.prepareStatement(query1);
						try
						{
							System.out.println( "2" );
							ps.setString(1, "Old");
							ps.setString(2, FilDir);
							ps.setString(3, "");
							ps.setString(4, f.getName());
							ps.setString(5, hash);
							System.out.println( "21" );
							ps.setBinaryStream(6, fis, (int) f.length());	// LONGBLOB
							ps.setString(7, attNumApp);
							ps.setString(8, attVer1+attVer2);
							ps.setString(9, exHash);
							System.out.println( "3" );
							ps.executeUpdate();
							System.out.println( "4" );
							conn.commit();
							ps.close();
							fis.close();
							o[colOLD_NEW_UP] = "Up";
							o[colTIPO] = FilDir;
							o[colDIR] = "";
							o[colFILE] = f.getName();
							o[colHASH] = hash;
							jT_listaFilesMod.removeRow( row );
							jT_listaFilesMod.insertRow( 0, o );
							System.out.println( "versioning_main.listaFilesDrop - Inserito file "+f.getName() );
							return true;
						}
						catch ( SQLException e )
						{
							System.out.println( "versioning_main.listaFilesDrop - Errore SQL nell'update del file: "+e.getMessage() );
							ut.dialogError("Errore SQL nell'update del file!\n\n"+e.getMessage());
							ver.setComponentsEnabled3();
							return false;
						}
						catch ( IOException e )
						{
							System.out.println( "versioning_main.listaFilesDrop - Errore di I/O nell'update del file: "+e.getMessage() );
							ut.dialogError("Errore di I/O  nell'update del file!\n\n"+e.getMessage());
							ver.setComponentsEnabled3();
							return false;
						}
						catch ( Exception e )
						{
							System.out.println( "versioning_main.listaFilesDrop - Errore nell'update del file: "+e.getMessage() );
							ut.dialogError("Errore nell'update del file!\n\n"+e.getMessage());
							ver.setComponentsEnabled3();
							return false;
						}
					}
					catch ( SQLException e )
					{
						System.out.println( "versioning_main.listaFilesDrop - Errore SQL nell'update del file: "+e.getMessage() );
						ut.dialogError("Errore SQL nell'update del file!\n\n"+e.getMessage());
						ver.setComponentsEnabled3();
						return false;
					}
					catch ( FileNotFoundException e )
					{
						System.out.println( "versioning_main.listaFilesDrop - File '"+f+"' non trovato: "+e.getMessage() );
						ut.dialogError("File '"+f+"' non trovato!\n\n"+e.getMessage());
						ver.setComponentsEnabled3();
						return false;
					}
				}
			}
			else	// non trovato nome file in JTable
			{
				// inserimento file
				try
				{
					Connection conn = Sql.getConDb();
					conn.setAutoCommit(false);
					FileInputStream fis = new FileInputStream(f);
					String query1 = "INSERT INTO versioning.files"+
							" (NUMEROAPPLICAZIONE,NUMEROVERSIONE,OLDNEWUP,TIPO,DIRECTORY,FILE,HASH,BLOBFILE)"+
							" VALUES (?,?,?,?,?,?,?,?)";
					PreparedStatement ps = conn.prepareStatement(query1);
					System.out.println( "query1 = "+query1 );
					System.out.println( "attVer1 = "+attVer1 );
					System.out.println( "attVer2 = "+attVer2 );
					try
					{
						ps.setString(1, attNumApp);
						ps.setString(2, attVer1+attVer2);
						ps.setString(3, "Old");
						ps.setString(4, FilDir);
						ps.setString(5, "");
						ps.setString(6, f.getName());
						ps.setString(7, hash);
						ps.setBinaryStream(8, fis, (int) f.length());	// LONGBLOB
						ps.executeUpdate();
						conn.commit();
						ps.close();
						fis.close();
						o[colOLD_NEW_UP] = "New";
						o[colTIPO] = FilDir;
						o[colDIR] = "";
						o[colFILE] = f.getName();
						o[colHASH] = hash;
						jT_listaFilesMod.insertRow( 0, o );
						System.out.println( "versioning_main.listaFilesDrop - Inserito file "+f.getName() );
						return true;
					}
					catch ( SQLException e )
					{
						System.out.println( "versioning_main.listaFilesDrop - Errore SQL nell'inserimento del file: "+e.getMessage() );
						ut.dialogError("Errore SQL nell'inserimento del file!\n\n"+e.getMessage());
						ver.setComponentsEnabled3();
						return false;
					}
					catch ( IOException e )
					{
						System.out.println( "versioning_main.listaFilesDrop - Errore di I/O nell'inserimento del file: "+e.getMessage() );
						ut.dialogError("Errore di I/O  nell'inserimento del file!\n\n"+e.getMessage());
						ver.setComponentsEnabled3();
						return false;
					}
					catch ( Exception e )
					{
						System.out.println( "versioning_main.listaFilesDrop - Errore nell'inserimento del file: "+e.getMessage() );
						ut.dialogError("Errore nell'inserimento del file!\n\n"+e.getMessage());
						ver.setComponentsEnabled3();
						return false;
					}
				}
				catch ( SQLException e )
				{
					System.out.println( "versioning_main.listaFilesDrop - Errore SQL nell'inserimento del file: "+e.getMessage() );
					++nErr;
					ut.dialogError("Errore SQL nell'inserimento del file!\n\n"+e.getMessage());
					ver.setComponentsEnabled3();
					return false;
				}
				catch ( FileNotFoundException e )
				{
					System.out.println( "versioning_main.listaFilesDrop - File '"+f+"' non trovato: "+e.getMessage() );
					++nErr;
					ut.dialogError("File '"+f+"' non trovato!\n\n"+e.getMessage());
					ver.setComponentsEnabled3();
					return false;
				}
			}
		}
	}
}
/** versioning_MyThread END */
///////////////////////////////////////////////////////
