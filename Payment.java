public class Payment {
    private double totalPrice;
    private String paymentMethod;
    private String paymentStatus;

    public Payment(double totalPrice, String paymentMethod) {
        this.totalPrice = totalPrice;
        this.paymentMethod = paymentMethod;
        this.paymentStatus = "Pembayaran Berhasil dengan " + paymentMethod;
    }
    public double hitungTotalHarga(double persentaseDiskon) {
        if (pembayaranVoucher(paymentMethod)) {
            double diskon = (persentaseDiskon / 100) * totalPrice;
            return totalPrice - diskon;
        }
        return totalPrice;
    }
    private boolean pembayaranVoucher(String metode) {
        return metode.startsWith("Voucher");
    }

    public void setPaymentMethod(String method) {
        this.paymentMethod = method;
    }
    public void setPaymentMethod(String method, boolean updateStatus) {
        this.paymentMethod = method;
        if (updateStatus) {
            this.paymentStatus = "Pembayaran Berhasil dengan " + method;
        }
    }
    public void paymentDetails() {
        System.out.println("Metode Pembayaran: " + paymentMethod);
        System.out.println("Status Pembayaran: " + paymentStatus);
    }
    public double getTotalPrice() {
        return totalPrice;
}
}
