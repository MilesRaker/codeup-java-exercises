import util.Input;

public class InputTest {
    public static void main(String[] args) {
        Input dut = new Input();

        // testing util.Input
        System.out.println(dut.getString());
        System.out.println(dut.yesNo());
        System.out.println(dut.getInt());
        System.out.println(dut.getInt(1, 20));
        System.out.println(dut.getDouble());
        System.out.println(dut.getDouble(-300, -50));

    }
}
