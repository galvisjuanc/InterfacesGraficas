package files.Ex3;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class AgregarContenido extends ObjectOutputStream {
    public AgregarContenido(OutputStream out) throws IOException {
        super(out);
    }

    protected AgregarContenido() throws IOException, SecurityException {
    }

    @Override
    public void writeStreamHeader() throws IOException {
        reset();
    }
}
