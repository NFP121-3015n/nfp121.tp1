package question3;

/**
 * NFP121 TpIntroduction, usage de BlueJ et du "Submitter".
 * 
 * @version septembre 2009
 * @author à compléter
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
     * "Création", le constructeur d'un auditeur avec son nom, son prénom et son
     * matricule.
     * 
     * @param nom
     *            le nom de l'auditeur
     * @param prenom
     *            son prénom
     * @param matricule
     *            sur la carte d'inscription, près de la photo
     */
    public AuditeurCNAM(String nom, String prenom, String matricule) {
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
    }

    /**
     * le login au Cnam : 6 premières lettres du nom suivies de la première
     * lettre du prénom séparées de '_' . le login retourné est en minuscules,
     * le trait d'union, ou spéciaux <i>(pour unix)</i> sont remplacés par des
     * '_' pas de caractères accentués pour le login voir les classes
     * prédéfines, java.lang.String : les méthodes replaceAll, toLowerCase et
     * substring java.lang.Math : la méthode min<br>
     * <b>BlueJ : Menu Aide</b>
     * 
     * @return le login du Cnam simplifié, sans les adaptations dues aux
     *         homonymes...
     */
    public String login() {
        String name;
        if(this.nom.length() < 6){
            name = this.nom + "_" + this.prenom.substring(0, 1);
        }
        else name = this.nom.substring(0, 6) + "_" + this.prenom.substring(0, 1);
        // replace all '-' with '_' and characters like 'ç' with 'c' ...
        name = name.replaceAll("-", "_");
        name = name.replaceAll("Ç", "c");
        name = name.replaceAll("ç", "c");
        name = name.replaceAll("ü", "u");
        name = name.replaceAll("é", "e");
        name = name.replaceAll("â", "a");
        name = name.replaceAll("ä", "a");
        name = name.replaceAll("à", "a");
        name = name.replaceAll("å", "a");
        name = name.replaceAll("ê", "e");
        name = name.replaceAll("ë", "e");
        name = name.replaceAll("è", "e");
        name = name.replaceAll("ï", "i");
        name = name.replaceAll("î", "i");
        name = name.replaceAll("ì", "i");
        name = name.replaceAll("Ä", "a");
        name = name.replaceAll("Å", "a");
        name = name.replaceAll("É", "e");
        name = name.replaceAll("æ", "a");
        name = name.replaceAll("Æ", "a");
        name = name.replaceAll("ô", "o");
        name = name.replaceAll("ö", "o");
        name = name.replaceAll("ò", "o");
        name = name.replaceAll("ù", "u");
        name = name.replaceAll("ÿ", "y");
        name = name.replaceAll("Ö", "o");
        name = name.replaceAll("Ü", "u");
        name = name.replaceAll("¢", "c");
        name = name.replaceAll("ƒ", "f");
        name = name.replaceAll("á", "a");
        name = name.replaceAll("í", "i");
        name = name.replaceAll("ó", "o");
        name = name.replaceAll("ú", "u");
        name = name.replaceAll("ñ", "n");
        name = name.replaceAll("Ñ", "n");
        name = name.replaceAll("ª", "a");
        name = name.replaceAll("º", "o");
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
     * Lecture du prénom de l'auditeur.
     * 
     * @return son prénom
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
     * méthode toString ( méthode redéfinie de la classe Object).
     * 
     * @return la concaténation du nom, du prénom et du login, selon cette
     *         syntaxe
     *         <code>nom() + " " + prenom() +  " login : " + login()</code>
     */
    @Override
    public String toString() {
        return nom() + " " + prenom() + " login : " + login();
    }

}
