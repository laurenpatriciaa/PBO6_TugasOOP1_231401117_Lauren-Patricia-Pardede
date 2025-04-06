public class Main {
    public static void main(String[] args) {
        System.out.println("--- Pembayaran Siti ---");
        Payment Siti = new Payment(3500000, "Kartu Kredit");
        System.out.println("Total Harga : Rp " + (int) Siti.getTotalPrice());
        Siti.paymentDetails();
        System.out.println();

        System.out.println("--- Pembayaran Ciciripi ---");
        Payment Ciciripi = new Payment(10000000, "Voucher");
        double totalCiciripi = Ciciripi.hitungTotalHarga(15);
        System.out.println("Total Harga Sebelum Diskon: Rp " + (int) Ciciripi.getTotalPrice());
        System.out.println("Voucher Diskon: 15%");
        Ciciripi.paymentDetails();
        System.out.println("Total Harga Setelah Diskon: Rp " + (int) totalCiciripi);
        System.out.println();

        System.out.println("--- Pembayaran Asnawi ---");
        Payment Asnawi = new Payment(1200000, "Transfer Bank");
        System.out.println("Total Harga : Rp " + (int) Asnawi.getTotalPrice());
        Asnawi.paymentDetails();
    }
}
