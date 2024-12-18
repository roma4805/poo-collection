package src;


public class ClientFidel extends Client {
    private String CodeFidelite;
    private float TauxReduction;

    public ClientFidel(String CodeClient, String NomClient, String AdrClient, String CodeFidelite, float TauxReduction) {
        super(CodeClient, NomClient, AdrClient);
        this.CodeFidelite = CodeFidelite;
        this.TauxReduction = TauxReduction;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", CodeFidelite='" + CodeFidelite + '\'' +
                ", TauxReduction=" + TauxReduction;
    }
}
