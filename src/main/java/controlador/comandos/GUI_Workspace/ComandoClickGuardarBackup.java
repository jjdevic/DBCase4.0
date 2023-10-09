package controlador.comandos.GUI_Workspace;

import static vista.utils.Otros.DIRECTORY;
import static vista.utils.Otros.INCIDENCES;

import java.io.File;
import java.util.Objects;

import controlador.Controlador;
import controlador.comandos.Comando;

public class ComandoClickGuardarBackup extends Comando {

	public ComandoClickGuardarBackup(Controlador ctrl) {
		super(ctrl);
	}

	@Override
	public void ejecutar(Object datos) {
		String guardarPath = (String) datos;
        String tempPath = ctrl.getFiletemp().getAbsolutePath();
        Controlador.FileCopy(tempPath, guardarPath);
        ctrl.getTheGUIWorkSpace().setInactiva();
        ctrl.setCambios(false);
        
        //this.tiempoGuardado = System.currentTimeMillis()/1000;
        if (ctrl.getFileguardar().getPath() != datos) {
            File directory = new File(System.getProperty("user.dir") + DIRECTORY + INCIDENCES);
            if (directory.exists()) {
                for (File file : Objects.requireNonNull(directory.listFiles())) {
                    if (!file.isDirectory()) {
                        file.delete();
                    }
                }
            }
            File temp = new File(guardarPath);
            //this.setFileguardar(temp);
            //this.contFicherosDeshacer = 0;
            //this.limiteFicherosDeshacer = 0;
            //this.guardarDeshacer();
        }
	}

}
