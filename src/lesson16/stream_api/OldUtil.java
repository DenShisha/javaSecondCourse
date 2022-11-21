package lesson16.stream_api;

import java.util.List;

public class OldUtil {
    //поиск специалиста с мин зп
    public static Specialist findWithMinSalary(List<Specialist> list) {
        Specialist specialist = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (specialist.getSalaru() > list.get(i).getSalaru()) {
                specialist = list.get(i);
            }
        }
        return specialist;
    }

    public static void printSpecialist(Specialist specialist) {
        System.out.println(specialist.getName() + " " +
                specialist.getSalaru() + " " +
                specialist.getSpecialty());
    }
}
