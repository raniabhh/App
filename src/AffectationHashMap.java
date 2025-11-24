import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AffectationHashMap  {
    private HashMap <Employe ,Departement> map;
    public AffectationHashMap() {
        map = new HashMap<>();
    }
    public void ajouterEmployeDepartement(Employe e, Departement d) {
        map.put(e, d);
    }
    public void afficherEmployesEtDepartements() {
        for (Employe e : map.keySet()) {
            System.out.println(e + " : " + map.get(e));
        }
    }
    public void supprimerEmploye(Employe e) {
        map.remove(e);
    }
    public void supprimerEmployeEtDepartement(Employe e, Departement d) {
        map.remove(e, d);
    }
    public void afficherEmployes() {
        for (Employe e : map.keySet()) {
            System.out.println(e);
        }
    }
    public void afficherDepartements() {
        for (Departement d : map.values()) {
            System.out.println(d);
        }
    }
    public boolean rechercherEmploye(Employe e) {
        return map.containsKey(e);
    }
    public boolean rechercherDepartement(Departement d) {
        return map.containsValue(d);
    }
    public TreeMap<Employe, Departement> trierMap() {
        return new TreeMap<>(map);
    }

}
