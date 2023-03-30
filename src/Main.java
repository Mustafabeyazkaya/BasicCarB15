public class Main {
    public static void main(String[] args) {
       BasicStructure audi=new BasicStructure();
       audi.color="black";
       audi.model="A3";
       audi.power="5000cc";

       Engine engine=new Engine();
       engine.cylender="8";
       engine.Size="1234cc";
       engine.weight="6453k";

       Lights neon=new Lights();
       neon.intensity="7675lumin";
       neon.color="red";
       neon.size="15cm";
    }
}