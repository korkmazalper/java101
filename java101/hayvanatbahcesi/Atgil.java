package hayvanatbahcesi;

import java.time.LocalDateTime;

public class Atgil extends Hayvan{
    @Override
    public int getDosage(Ilac ilac) {
        System.out.println("Atgillerin dozajini al");
        return this.dozaj;
    }

    @Override
    public LocalDateTime[] getFeedSchedule() {
        System.out.println("Atgillerin Beslenme Saatleri:");
        return this.Schedule;
    }
}
