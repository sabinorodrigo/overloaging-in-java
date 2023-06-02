package timeTest;

import hora.Time;

public class TimeTest {
    public static void main(String[] args) {
        Time t = new Time(0);
        t.setTime(10, 15, 38);


        System.out.println(t.exibirHoraUniversal());
        System.out.println(t.exibirHoraPadrao());
    }
}
