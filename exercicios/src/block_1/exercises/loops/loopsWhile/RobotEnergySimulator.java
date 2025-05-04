package block_1.exercises.loops.loopsWhile;

public class RobotEnergySimulator {
    public static void main(String[] args) {
        int energy = 0;

        while (energy < 100) {
            energy += 10;
            System.out.println("Charging... energy at " + energy + "%");
        }

        System.out.println("✅ Full energy! Robot is ready for the mission.");
    }
}
