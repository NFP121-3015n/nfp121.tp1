package question3;

/**
 * NFP121 TpIntroduction, usage de BlueJ et du "Submitter".
 * 
 * @version septembre 2009
 * @author � compl�ter
 * @see java.lang.String, java.lang.Math
 */
public class AuditeurCNAM {
    /** l'attribut nom de chaque auditeur. */
    private String nom;
    /** l'attribut prenom de chaque auditeur. */
    private String prenom;
    /** l'attribut matricule de chaque auditeur. */
    private String matricule;

    /**
     * "Cr�ation", le constructeur d'un auditeur avec son nom, son pr�nom et son
     * matricule.
     * 
     * @param nom
     *            le nom de l'auditeur
     * @param prenom
     *            son pr�nom
     * @param matricule
     *            sur la carte d'inscription, pr�s de la photo
     */
    public AuditeurCNAM(String nom, String prenom, String matricule) {
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
    }

    /**
     * le login au Cnam : 6 premi�res lettres du nom suivies de la premi�re
     * lettre du pr�nom s�par�es de '_' . le login retourn� est en minuscules,
     * le trait d'union, ou sp�ciaux <i>(pour unix)</i> sont remplac�s par des
     * '_' pas de caract�res accentu�s pour le login voir les classes
     * pr�d�fines, java.lang.String : les m�thodes replaceAll, toLowerCase et
     * substring java.lang.Math : la m�thode min<br>
     * <b>BlueJ : Menu Aide</b>
     * 
     * @return le login du Cnam simplifi�, sans les adaptations dues aux
     *         homonymes...
     */
    public String login() {
        String name;
        if(this.nom.length() < 6){
            name = this.nom + "_" + this.prenom.substring(0, 1);
        }
        else name = this.nom.substring(0, 6) + "_" + this.prenom.substring(0, 1);
        // replace all '-' with '_' and characters like '�' with 'c' ...
        name = name.replaceAll("-", "_");
        name = name.replaceAll("�", "c");
        name = name.replaceAll("�", "c");
        name = name.replaceAll("�", "u");
        name = name.replaceAll("�", "e");
        name = name.replaceAll("�", "a");
        name = name.replaceAll("�", "a");
        name = name.replaceAll("�", "a");
        name = name.replaceAll("�", "a");
        name = name.replaceAll("�", "e");
        name = name.replaceAll("�", "e");
        name = name.replaceAll("�", "e");
        name = name.replaceAll("�", "i");
        name = name.replaceAll("�", "i");
        name = name.replaceAll("�", "i");
        name = name.replaceAll("�", "a");
        name = name.replaceAll("�", "a");
        name = name.replaceAll("�", "e");
        name = name.replaceAll("�", "a");
        name = name.replaceAll("�", "a");
        name = name.replaceAll("�", "o");
        name = name.replaceAll("�", "o");
        name = name.replaceAll("�", "o");
        name = name.replaceAll("�", "u");
        name = name.replaceAll("�", "y");
        name = name.replaceAll("�", "o");
        name = name.replaceAll("�", "u");
        name = name.replaceAll("�", "c");
        name = name.replaceAll("�", "f");
        name = name.replaceAll("�", "a");
        name = name.replaceAll("�", "i");
        name = name.replaceAll("�", "o");
        name = name.replaceAll("�", "u");
        name = name.replaceAll("�", "n");
        name = name.replaceAll("�", "n");
        name = name.replaceAll("�", "a");
        name = name.replaceAll("�", "o");
        for(int i = 0; i < name.length(); i++){
            if(!(name.charAt(i)>='a' && name.charAt(i)<='z') && !(name.charAt(i)>='A' && name.charAt(i)<='Z')){
                name = name.replace(name.charAt(i), '_');
            }
        }
        return name.toLowerCase();
    }

    /**
     * Lecture du nom de l'auditeur.
     * 
     * @return son nom
     */
    public String nom() {
        return this.nom;
    }

    /**
     * Lecture du pr�nom de l'auditeur.
     * 
     * @return son pr�nom
     */
    public String prenom() {
        return this.prenom;
    }

    /**
     * Lecture du matricule de l'auditeur.
     * 
     * @return son matricule
     */
    public String matricule() {
        return this.matricule;
    }

    /**
     * m�thode toString ( m�thode red�finie de la classe Object).
     * 
     * @return la concat�nation du nom, du pr�nom et du login, selon cette
     *         syntaxe
     *         <code>nom() + " " + prenom() +  " login : " + login()</code>
     */
    @Override
    public String toString() {
        return nom() + " " + prenom() + " login : " + login();
    }

}
