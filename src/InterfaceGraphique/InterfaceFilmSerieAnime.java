package InterfaceGraphique;

import Controleur.controleur;
import Properties.PropertiesPerso;

import javax.swing.*;
import java.awt.*;

public class InterfaceFilmSerieAnime extends JDialog
{
    private JTextField idTextField ;

    private JTextField TitreTextField;

    private JTextField Date_SortieTextField;

    private JTextField descriptionTextField;

    private JTextField DureeTextField;

    private JPanel PanelMain;
    private boolean Confirmer;
    private JLabel  descriptionLabel ,date_SortieLabel , dureeLabel,titreLabel,idLabel ,PegiLabel,catégorieLabel,ComboboxLabel;

    //Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();

    //idTextField = new JTextField(10);
    //titreTextField = new JTextField(20);
    //dureeTextField = new JTextField(10);
    //date_SortieTextField = new JTextField(10);
    //descriptionTextField = new JTextField(30);


    private JPanel PanelPegi;




    private JRadioButton Pegi6Button;
    private boolean pegi;
    private  int Pegi;
    private JRadioButton Pegi12Button;
    private JRadioButton Pegi14Button;
    private JRadioButton Pegi16Button;
    private JRadioButton GenreSCIENCEFICTION;
    private JRadioButton GenreDrame;
    private JRadioButton GenreHorreur;
    private JRadioButton GenreAction;


    private boolean genre;
    private  String Genre;
    private JLabel Editeur;
    private JTextField EditeurTextField;

    private JLabel AudioLabel;

    private ButtonGroup buttonGroupGenre;

    private ButtonGroup buttonGroupPegi;

    private JLabel SousTitreLabel;
    private JButton ButtonConfrimer;
    private JTextField SousTitreTextField;

    private JTextField AudioTextField;
    private JRadioButton GenreAventure;
    private JRadioButton Pegi18Button;



    public InterfaceFilmSerieAnime(JFrame parent, boolean modal,String titre)
    {

        super(parent,modal);
        setTitle(titre);
        setContentPane(PanelMain);
        setLocationRelativeTo(null);
        setModal(true);
        pack();
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(1200, 700);
        setLocation((screen.width - this.getSize().width)/2,(screen.height - this.getSize().height)/2);


        ImageIcon logoIcon = new ImageIcon(PropertiesPerso.PropertiesTest());
        setIconImage(logoIcon.getImage());

        buttonGroupGenre = new ButtonGroup();
        buttonGroupGenre.add(GenreAction);
        buttonGroupGenre.add(GenreAventure);
        buttonGroupGenre.add(GenreDrame);
        buttonGroupGenre.add(GenreSCIENCEFICTION);
        buttonGroupGenre.add(GenreHorreur);

        buttonGroupPegi = new ButtonGroup();
        buttonGroupPegi.add(Pegi6Button);
        buttonGroupPegi.add(Pegi12Button);
        buttonGroupPegi.add(Pegi14Button);
        buttonGroupPegi.add(Pegi16Button);
        buttonGroupPegi.add(Pegi18Button);



    }


    public boolean isValidId(String id)
    {

        return id != null && !id.isEmpty();
    }

    public boolean isValidTitre(String titre)
    {

        return titre != null && !titre.isEmpty();
    }

    public boolean isValidDescription(String description)
    {

        return description != null && !description.isEmpty();
    }

    public boolean isValidDuree(String duree)
    {

        return duree != null && !duree.isEmpty();
    }

    public JTextField getId() {
        return idTextField;
    }

   public JRadioButton getPegi6Button() {
        return Pegi6Button;
    }

    public JRadioButton getPegi12Button() {
        return Pegi12Button;
    }

    public JRadioButton getPegi16Button() {
        return Pegi14Button;
    }

    public JRadioButton getPegi18Button() {
        return Pegi16Button;
    }

    public  JRadioButton getPegi14Button(){return Pegi14Button;}

       public JTextField getTitre() {
        return TitreTextField;
    }

    public JTextField getSoustitre()
    {
        return  SousTitreTextField;
    }

    public JTextField getDuree()
    {
        return  DureeTextField;
    }

   public JTextField getDescription()
    {
        return  descriptionTextField;
    }

    public JTextField getDate() {
        return Date_SortieTextField;
    }

    public JRadioButton getGenreSF(){return GenreSCIENCEFICTION;}
    public JRadioButton getGenreHorreur(){return GenreHorreur;}
    public JRadioButton getGenreDrame(){return GenreDrame;}
    public JRadioButton getGenreAction(){return GenreAction;}

    public JRadioButton getGenreAventure(){return GenreAventure;}


   public JTextField getAudio() {
        return AudioTextField;
    }

   public JTextField getEditeur() {
        return EditeurTextField;
    }

    public ButtonGroup getButtonGrp1(){return buttonGroupGenre;}

    public ButtonGroup getButtonGroupPegi(){return buttonGroupPegi;}

    public boolean isConfirmerFSA()
    {
        return Confirmer;
    }

    public static void main(String[] args)
    {

        InterfaceFilmSerieAnime frame = new InterfaceFilmSerieAnime(null,true,"zzzzz");
        frame.setVisible(true);
    }


    public void setControleur(controleur controleur1)
    {
        ButtonConfrimer.addActionListener(controleur1);
        //this.addWindowListener(controleur1);


    }

}
