package co.uniquindio.poo;

import co.uniquindio.poo.comportamiento.chain.HandlerCobertura;
import co.uniquindio.poo.comportamiento.chain.HandlerMonto;
import co.uniquindio.poo.comportamiento.chain.HandlerProductos;
import co.uniquindio.poo.comportamiento.chain.HandlerValidador;
import co.uniquindio.poo.comportamiento.command.CommandHistorial;
import co.uniquindio.poo.comportamiento.mediator.MediatorControl;
import co.uniquindio.poo.comportamiento.mediator.MediatorDespacho;
import co.uniquindio.poo.comportamiento.mediator.MediatorPagos;
import co.uniquindio.poo.comportamiento.mediator.MediatorTienda;
import co.uniquindio.poo.comportamiento.memento.CaretakerPedido;
import co.uniquindio.poo.comportamiento.observer.ObserverAuditoria;
import co.uniquindio.poo.comportamiento.observer.ObserverCliente;
import co.uniquindio.poo.comportamiento.observer.ObserverRepartidor;
import co.uniquindio.poo.comportamiento.observer.ObserverTienda;
import co.uniquindio.poo.comportamiento.state.StateCreado;
import co.uniquindio.poo.comportamiento.strategy.ContextAsignacion;
import co.uniquindio.poo.comportamiento.strategy.StrategyMasCercano;
import co.uniquindio.poo.comportamiento.strategy.StrategyMejorCalificado;
import co.uniquindio.poo.comportamiento.strategy.StrategyMenorCarga;
import co.uniquindio.poo.comportamiento.template.TemplateProcesador;
import co.uniquindio.poo.comportamiento.template.TemplateRecogida;
import co.uniquindio.poo.estructural.composite.Combo;
import co.uniquindio.poo.estructural.composite.Producto;
import co.uniquindio.poo.estructural.composite.ProductoIndividual;
import co.uniquindio.poo.estructural.decorator.Pedido;
import co.uniquindio.poo.estructural.decorator.PedidoBase;
import co.uniquindio.poo.estructural.decorator.PedidoEmpaque;
import co.uniquindio.poo.estructural.decorator.PedidoPrioritario;
import co.uniquindio.poo.estructural.decorator.PedidoPropina;
import co.uniquindio.poo.estructural.facade.PedidoFacade;
import co.uniquindio.poo.model.Cliente;
import co.uniquindio.poo.model.Repartidor;
import co.uniquindio.poo.model.Tienda;

import java.util.List;

//toca importar todo eso por lo que separamos tantas carpetas
public class Main {
    public static void main(String[] args) {


        //Aqui se crean todas las vainas importantes, tienda, cliente, repartidor
        Tienda tienda = new Tienda("T1", "Panadería Centro", "Calle 15 #14-20");
        Cliente cliente = new Cliente("C1", "Laura Gómez", 28, "3001234567", "Carrera 14 #10-05", true);

        Repartidor carlos = new Repartidor("R1", "Carlos Ruiz", 30, "3011111111", "Moto", 4.2, 0.8);
        Repartidor andrea = new Repartidor("R2", "Andrea Peña", 25, "3022222222", "Bicicleta", 4.9, 2.5);
        Repartidor mateo = new Repartidor("R3", "Mateo Díaz", 35, "3033333333", "Moto", 4.5, 1.5);
        carlos.setPedidosActivos(2);
        andrea.setPedidosActivos(1);

        // mateo tiene 0 pedidos es el de menor carga

        // Parte el strategy, aplicando el metodo para escoger el repartidor más cercano

        ContextAsignacion contexto = new ContextAsignacion(
                new StrategyMasCercano(), List.of(carlos, andrea, mateo));

        // Parte del mediator, la torre de control

        MediatorPagos pagos = new MediatorPagos();
        MediatorTienda tiendaMed = new MediatorTienda();
        MediatorDespacho despacho = new MediatorDespacho(contexto);
        MediatorControl torre = new MediatorControl(pagos, tiendaMed, despacho);

       // Chain of responsability
        HandlerValidador productosH = new HandlerProductos();
        HandlerValidador coberturaH = new HandlerCobertura();
        HandlerValidador montoH = new HandlerMonto();
        productosH.setNext(coberturaH);
        coberturaH.setNext(montoH);

       // Trabajo de command, memento y facade
        CommandHistorial historial = new CommandHistorial();
        CaretakerPedido caretaker = new CaretakerPedido();
        PedidoFacade facade = new PedidoFacade(torre, historial, caretaker, productosH);

       // Observer, el log auditoria se encarga de observar todos los pedidos

        ObserverAuditoria auditoria = new ObserverAuditoria();

        // Parte del composite para agregar productos

        Producto pan = new ProductoIndividual("P1", "Pan artesanal", 4000);
        Producto cafe = new ProductoIndividual("P2", "Café", 3500);
        Producto jugo = new ProductoIndividual("P3", "Jugo natural", 5000);
        Producto torta = new ProductoIndividual("P4", "Torta de chocolate", 18000);
        Combo desayuno = new Combo("Combo desayuno", 0.10);
        desayuno.getProductos().add(pan);
        desayuno.getProductos().add(cafe);
        desayuno.getProductos().add(jugo);

        // Escenario 1 de flujo completo

        System.out.println("\n----- ESCENA 1: flujo completo de un pedido -----");

        PedidoBase pedido1 = new PedidoBase("P-001", tienda, cliente, 3000, 4.5, new StateCreado());
        pedido1.getProductos().add(desayuno);
        pedido1.getProductos().add(torta);
        pedido1.subscribir(new ObserverCliente(cliente));
        pedido1.subscribir(new ObserverTienda(tienda));
        pedido1.subscribir(auditoria);

        // La tienda crea el pedido, Chain valida, Command crea, Memento guarda la "foto"

        facade.crearPedido(pedido1, "tienda");

        // El pago avisa la torre, la tienda prepara y despacho asigna repartidor (Strategy)

        facade.pagarPedido(pedido1);
        System.out.println("Estado: " + pedido1.getState().getNombre());
        if (pedido1.getRepartidor() != null) {
            pedido1.subscribir(new ObserverRepartidor(pedido1.getRepartidor()));
        }

        // La tienda termina la torre manda a despachar

        tiendaMed.marcarListo(pedido1);
        System.out.println("Estado: " + pedido1.getState().getNombre());

        // Parte del state, se aplica la regla de que un pedido en camino no se puede reembolsar

        try {
            pedido1.reembolsar();
        } catch (IllegalStateException e) {
            System.out.println("State bloqueó la acción: " + e.getMessage());
        }

        despacho.entregar(pedido1);
        System.out.println("Estado final: " + pedido1.getState().getNombre());

        // Decorator el costo final se arma con extras opcionales (Estan puestos aca para no quemarlos en las clases de ellos)

        Pedido total = new PedidoPrioritario(
                new PedidoPropina(new PedidoEmpaque(pedido1, 1500), 3000), 2000);
        System.out.println(total.getDescripcion() + " -> $" + total.getCosto());


        // Escenario 2


        System.out.println("\n----- ESCENARIO 2: cancelar y deshacer -----");

        PedidoBase pedido2 = new PedidoBase("P-002", tienda, cliente, 3000, 2.0, new StateCreado());
        pedido2.getProductos().add(pan);
        pedido2.getProductos().add(torta);
        pedido2.subscribir(new ObserverCliente(cliente));
        pedido2.subscribir(auditoria);

        facade.crearPedido(pedido2, "tienda");
        facade.cancelarPedido(pedido2, "tienda", "el cliente se arrepintió");
        System.out.println("Tras cancelar: " + pedido2.getState().getNombre());

        facade.deshacerUltimo();   // el Memento restaura el pedido
        System.out.println("Tras deshacer: " + pedido2.getState().getNombre());


      // Escenario 3


        System.out.println("\n----- ESCENA 3: pedido inválido -----");

        PedidoBase vacio = new PedidoBase("P-003", tienda, cliente, 3000, 30.0, new StateCreado());
        facade.crearPedido(vacio, "tienda");   // sin productos y fuera de cobertura


        //Escenario 4


        System.out.println("\n----- ESCENA 4: cambio de estrategia -----");

        PedidoBase pedido4 = new PedidoBase("P-004", tienda, cliente, 3000, 3.0, new StateCreado());
        pedido4.getProductos().add(pan);

        contexto.setStrategy(new StrategyMejorCalificado());
        Repartidor elegido = contexto.asignar(pedido4);
        System.out.println("Mejor calificado " + (elegido == null ? "ninguno" : elegido.getNombre()));

        contexto.setStrategy(new StrategyMenorCarga());
        elegido = contexto.asignar(pedido4);
        System.out.println("Menor carga " + (elegido == null ? "ninguno" : elegido.getNombre()));


        // Escenario 5


        System.out.println("\n----- ESCENA 5: pedido para recoger en tienda -----");

        PedidoBase pedido5 = new PedidoBase("P-005", tienda, cliente, 0, 0.5, new StateCreado());
        pedido5.getProductos().add(desayuno);
        pedido5.subscribir(auditoria);

        TemplateProcesador procesador = new TemplateRecogida();
        procesador.procesar(pedido5);

        //Lo que quedo en log de observer

        System.out.println("\n----- AUDITORÍA -----");
        auditoria.getRegistros().forEach(System.out::println);
    }
}


