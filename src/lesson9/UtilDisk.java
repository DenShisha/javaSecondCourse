package lesson9;

public class UtilDisk {
    public static void findOldDisk(Disk[] disks) {
        Disk old = disks[0];
        for (int i = 0; i < disks.length; i++) {
            if (disks[i].getYeaк() < old.getYeaк()) {
                old = disks[i];
            }
        }
        System.out.println(old);
    }
}
