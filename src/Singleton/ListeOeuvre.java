package Singleton;

import TypeOeuvre.Anime;
import TypeOeuvre.Film;
import TypeOeuvre.Serie;
import TypeOeuvre.Trailer;
import Utilisateur.Administrateur;
import Utilisateur.client;

import java.util.ArrayList;

public class ListeOeuvre
{
    private ArrayList<Film> listeFilm = new ArrayList<Film>();
    private ArrayList<Serie> listeSerie = new ArrayList<Serie>();
    private ArrayList<Anime> listeAnime = new ArrayList<Anime>();
    private ArrayList<Trailer> listeTrailer = new ArrayList<Trailer>();

    private ArrayList<client> listeClient = new ArrayList<client>();

    private ArrayList<Administrateur> listeAdmin = new ArrayList<Administrateur>();
    private Administrateur AdminCourant;
    private client ClientCourant;





    //utilisateur à rajouter
    private static ListeOeuvre instance = null;

    private ListeOeuvre()
    {
        //constructeur privé pour empêcher l'instanciation directe de la classe
    }
    public static ListeOeuvre getInstance()
    {
        if(instance == null)
            instance = new ListeOeuvre();
        return instance;
    }

    public void AffichageClient()
    {
        for (client clienttmp : listeClient)
        {
            System.out.println("Nom :" + clienttmp.getNompersonne() + "Prenom : " + clienttmp.getNompersonne() + "LOgin : " + clienttmp.getLogin() + "Mdp :" + clienttmp.getMotDePasse() + "Tel : " + clienttmp.getTelephone() + "Pref : "+ clienttmp.getPreference()+ "Id :" + clienttmp.getIdentifiant());
        }
    }

    public void ajouterFilm(Film film)
    {

        listeFilm.add(film);
    }

    public void ajouterSerie(Serie serie) {
        listeSerie.add(serie);
    }

    public void ajouterAnime(Anime anime) {
        listeAnime.add(anime);
    }

    public void ajouterTrailer(Trailer trailer) {
        listeTrailer.add(trailer);
    }

    public void ajouterClient(client client1) {listeClient.add(client1);}

    public void ajouterAdmin( Administrateur administrateur) {listeAdmin.add(administrateur);}
}