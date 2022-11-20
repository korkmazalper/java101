package hayvanatbahcesi;

import java.time.LocalDateTime;

public class Kemirgen extends Hayvan{
    @Override
    public int getDosage(Ilac ilac) {
        System.out.println("Kemirgen Dozaji: ");
        return this.dozaj;
    }

    @Override
    public LocalDateTime[] getFeedSchedule() {
        System.out.println("Kemirgen Beslenme Saatleri: ");
        return this.Schedule;
    }
}
