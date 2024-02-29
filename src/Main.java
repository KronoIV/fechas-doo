public class Main {
    public static void main(String[] args) {
        Fecha miFecha= Fecha.Crear((byte)29,(byte)2,(short)2023);
        System.out.println(miFecha.getDia());
        System.out.println(miFecha.getMes());
        System.out.println(miFecha.getAnio());
    }
}