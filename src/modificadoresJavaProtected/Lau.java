public class Lau extends Hiru{
	void metodoAccesor() {
        Hiru h = new Hiru();
        h.soyPrivado = 10;      // ilegal
        h.metodoPrivado();      // ilegal
    }
}
