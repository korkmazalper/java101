package hayvanatbahcesi;

import java.time.LocalDateTime;

public class Kedigil extends Hayvan{
    @Override
    public int getDosage(Ilac ilac) {
        System.out.println("Kedigillerin Dozaji: ");
        return this.dozaj;
    }

    @Override
    public LocalDateTime[] getFeedSchedule() {
        System.out.println("Kedigillerin Beslenme Saatleri: ");
        return this.Schedule;
    }
}
