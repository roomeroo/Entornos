public class ServicioNotificacion {
    private ProveedorNotificaciones notificacion;
    
    public ServicioNotificacion(ProveedorNotificaciones notificacion){
        this.notificacion = notificacion;
    }

    public boolean notificar (String mensaje){
        return (notificacion.enviarNotificacion(mensaje));
    }
}
