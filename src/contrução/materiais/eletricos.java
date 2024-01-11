package contrução.materiais;

public class eletricos implements orçamentoInterface {

    private String tomadasq = "uma a cada 5m dependendo do projeto",
            interupitoresq = "1 ou 2 por comodo dependendo do projeto";
    double fiosq = 0.75;
    private double tomadasp = 5, interupitoresp = 6.20, fiosp = 8;
    double m2;
    private double fiostq, fiostp, totalp;

    String resumoPreço, resumoQuantidade;

    public void setM2(double m2) {
        this.m2 = m2;
    }

    public String getTomadasq() {
        return tomadasq;
    }

    public String getInterupitoresq() {
        return interupitoresq;
    }

    public double getFiosq() {
        return fiosq;
    }

    public double getTomadasp() {
        return tomadasp;
    }

    public double getInterupitoresp() {
        return interupitoresp;
    }

    public double getFiosp() {
        return fiosp;
    }

    @Override
    public void fazerorçamento() {
        fiostp = fiostq * fiosp;
        resumoPreço = "VALORES: \n"
                + "cada tomada custa " + tomadasp + " reais,\n"
                + "os interuptores são " + interupitoresp + ",\n"
                + "os fios vam ficar: "
                + fiostp + " reais.";
        System.out.println(resumoPreço);

    }

    @Override
    public void quantidadeMateriais() {
        fiostq = m2 * fiosq;
        resumoQuantidade = "QUANTIDADE:\n"
                + "Tomadas: " + tomadasq + ",\n"
                + "Interuptores: " + interupitoresq + ",\n"
                + "Fios: " + fiostq + " metros.";
        System.out.println(resumoQuantidade);

    }

}
