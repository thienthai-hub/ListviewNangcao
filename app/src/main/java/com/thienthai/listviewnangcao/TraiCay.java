package com.thienthai.listviewnangcao;
//b2
    public class TraiCay {
        private String Ten;
        private String MoTa;
        private int Hinh;

        //contructor

        public TraiCay(String ten, String moTa, int hinh) {
            Ten = ten;
            MoTa = moTa;
            Hinh = hinh;
        }

        //getSet

        public String getTen() {
            return Ten;
        }

        public void setTen(String ten) {
            Ten = ten;
        }

        public String getMoTa() {
            return MoTa;
        }

        public void setMoTa(String moTa) {
            MoTa = moTa;
        }

        public int getHinh() {
            return Hinh;
        }

        public void setHinh(int hinh) {
            Hinh = hinh;
        }
}
