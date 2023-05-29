package Tema9.Ex2;

interface PersoanaInterface extends Comparable<PersoanaInterface> {
    public double calculMedieGenerala();

    public String getNume();

    public void setNume(String nume);

    public void addMedie(double medie);
}
