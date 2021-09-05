package Examination.Cau4;

public class Passenger {
        private String hoTen, gioiTinh;
        private int tuoi;
        private Ticket[] danhSachVe;

        public Passenger() {

        }

        public Passenger(String hoTen, String gioiTinh, int tuoi, Ticket[] danhSachVe) {
            this.hoTen = hoTen;
            this.gioiTinh = gioiTinh;
            this.tuoi = tuoi;
            this.danhSachVe = danhSachVe;
        }

        public String getHoTen() {
            return this.hoTen;
        }

        public String getGioiTinh() {
            return this.gioiTinh;
        }

        public int getAge() {
            return this.tuoi;
        }

        public Ticket[] getListTicket() {
            return this.danhSachVe;
        }
}
