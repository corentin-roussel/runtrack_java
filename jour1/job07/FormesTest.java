package job07;

public class FormesTest {

    public int rayonCercle = 5;
    public int aireCarre = 4;

    public static void main(String[] args)
    {
        FormesTest forme = new FormesTest();

        forme.calculCercle();
        forme.calculCarre();
    }

    public void calculCercle()
    {
        double airCercle = (5 * this.rayonCercle) * 3.14;
        System.out.println("Aire du cercle de rayon" + this.rayonCercle + ": " + airCercle);
    }

    public void calculCarre()
    {
        double aireCarre = this.aireCarre * this.aireCarre;
        System.out.println("Aire du cercle de rayon" + this.aireCarre+ ": " + aireCarre);
    }


}
