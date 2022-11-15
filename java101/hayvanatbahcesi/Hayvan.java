package hayvanatbahcesi;

import java.time.LocalDateTime;


public abstract class Hayvan {
    public String türAdi;
    public int agirlik;
    public int yas;
    int dozaj;
    LocalDateTime[] Schedule;
    public abstract int getDosage(Ilac ilac);
    public abstract LocalDateTime[] getFeedSchedule();
    public String getTürAdi() {
        return türAdi;
    }

    public void setTürAdi(String türAdi) {
        this.türAdi = türAdi;
    }

    public int getAgirlik() {
        return agirlik;
    }

    public void setAgirlik(int agirlik) {
        this.agirlik = agirlik;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }


}
