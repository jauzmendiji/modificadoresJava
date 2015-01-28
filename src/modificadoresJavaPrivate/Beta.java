import modificadoresJavaPrivate;
import modificadoresJavaPublic.*;

class Beta{
    void metodoAccesor() {
        Alpha a = new Alpha();
        a.soyPrivado = 10;      // ilegal
        a.metodoPrivado();      // ilegal
    }
}