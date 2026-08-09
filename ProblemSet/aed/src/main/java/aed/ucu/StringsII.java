package aed.ucu;

public class StringsII {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Able was I ere I saw Elba.");

        System.out.println("capacidad inicial: " + sb.capacity());
        sb.append("!");
        System.out.println("append: " + sb);
        sb.insert(0, "Inicio ");
        System.out.println("insert: " + sb);
        sb.delete(0, 7);
        System.out.println("delete: " + sb);
        sb.deleteCharAt(sb.length() - 1);
        System.out.println("deleteCharAt: " + sb);
        sb.reverse();
        System.out.println("reverse: " + sb);
        sb.setLength(10);
        System.out.println("setLength: " + sb);
        sb.ensureCapacity(80);
        System.out.println("ensureCapacity: " + sb.capacity());

        String a = "1";
        String b = new String("1");
        System.out.println("==: " + (a == b));
        System.out.println("equals: " + a.equals(b));
        System.out.println("intern ==: " + (a == b.intern()));
    }
}
