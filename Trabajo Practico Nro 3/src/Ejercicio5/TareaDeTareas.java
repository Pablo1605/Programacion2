package Ejercicio5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class ListaDeTareas implements Iterable<Tarea> {
    private List<Tarea> listaTareas;

    public ListaDeTareas() {
        listaTareas = new ArrayList<>();
    }

    public void agregarTarea(Tarea tarea) {
        listaTareas.add(tarea);
    }

    public void eliminarTarea(String descripcion) {
        for (Iterator<Tarea> iterator = listaTareas.iterator(); iterator.hasNext();) {
            Tarea tarea = iterator.next();
            if (tarea.getDescripcion().equals(descripcion)) {
                iterator.remove();
                break;
            }
        }
    }

    public int obtenerNumeroTareas() {
        return listaTareas.size();
    }

    @Override
    public Iterator<Tarea> iterator() {
        listaTareas.sort((t1, t2) -> Integer.compare(t2.getPrioridad(), t1.getPrioridad()));
        return listaTareas.iterator();
    }
}
