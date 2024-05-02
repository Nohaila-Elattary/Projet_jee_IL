
package gestionprojet;

import java.sql.Date;


class Projet {
    private int projet_id;
    private String project_name;
    private Date dateDebut;
    private Date dateFin;
    private String membre;
    private String etat;
    private int projet_manager_id;
     
    public Projet(int projet_id, String project_name,Date dateDebut, Date dateFin, String membre, String etat, int projet_manager_id ){
        this.projet_id=projet_id;
        this.project_name=project_name;
        this.dateDebut=dateDebut;
        this.dateFin=dateFin;
        this.membre=membre;
        this.etat=etat;
        this.projet_manager_id=projet_manager_id;
    
    
    }
    public int getID(){
        return projet_id;
    }
    public String getName(){
        return project_name;
    }
    public Date getDB(){
        return dateDebut;
    }
    public Date getDF(){
        return dateFin;
    }
    public String getMembresEquipe(){
        return membre;
    }
    public String getEtat(){
        return etat;
    }
    public int getProjet_manager_id(){
        return projet_manager_id;
    }
    

}
