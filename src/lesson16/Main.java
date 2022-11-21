package lesson16;

import lesson16.stream_api.OldUtil;
import lesson16.stream_api.Specialist;
import lesson16.stream_api.StreamUtil;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Specialist spec1 = new Specialist("Ivanov Ivan", 10000, Specialty.BACKEND_DEVELOPER);
        Specialist spec2 = new Specialist("Semenov Semen", 9500, Specialty.FRONTEND_DEVELOPER);
        Specialist spec3 = new Specialist("Aleksandrov Aleksander", 9000, Specialty.FRONTEND_DEVELOPER);
        Specialist spec4 = new Specialist("Sergeev Sergey", 6500, Specialty.DEVOPS);
        Specialist spec5 = new Specialist("Amanov Aman", 12000, Specialty.BACKEND_DEVELOPER);

        List<Specialist> specialists = new ArrayList<>();
        specialists.add(spec1);
        specialists.add(spec2);
        specialists.add(spec3);
        specialists.add(spec4);
        specialists.add(spec5);

        Specialist sp1 = OldUtil.findWithMinSalary(specialists);
        Specialist sp2 = StreamUtil.findWithMinSalary(specialists);

        //StreamUtil.printCollection(StreamUtil.filterBySpecialty(specialists, Specialty.BACKEND_DEVELOPER));
        StreamUtil.printCollection(StreamUtil.sortCollection(specialists));

        //OldUtil.printSpecialist(sp1);
        //OldUtil.printSpecialist(sp2);

        //System.out.println(StreamUtil.matchAllDevops(specialists));
        //System.out.println(StreamUtil.matchAnyDevops(specialists));

        System.out.println(StreamUtil.matchAllSalaryMoreThan(specialists, 6000));

    }
}
