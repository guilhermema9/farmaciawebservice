/*
 * ALUNOS:
 *      GUILHERME MENDES ARAUJO
 *      MARCOS VINICIUS RIBEIRO DE CARVALHO ARAUJO
 */

package servicos;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

import daos.PedidoDAO;
import modelos.Pedido;
import modelos.Usuario;

import java.util.List;

@WebService
public class PedidoService {

    private PedidoDAO pedidoDAO = new PedidoDAO();

    @WebMethod
    @WebResult(name = "pedido")
    public List<Pedido> listarPedidos() {
        return pedidoDAO.listarPedidos();
    }

    @WebMethod
    @WebResult(name = "pedido")
    public Pedido buscarPedidoPorId(@WebParam(name = "id") String id) {
        return pedidoDAO.buscarPedidoPorId(id);
    }
    
    @WebMethod
    @WebResult(name = "pedido")
    public List<Pedido> listarPedidosPaginacao(@WebParam(name = "numeroDaPagina") int numeroDaPagina,
                                               @WebParam(name = "tamanhoDaPagina") int tamanhoDaPagina) {
        return pedidoDAO.listarPedidosPaginacao(numeroDaPagina, tamanhoDaPagina);
    }

    @WebMethod
    public void criarPedido(@WebParam(name = "pedido") Pedido pedido, 
                            @WebParam(name = "usuario", header = true) Usuario usuario) throws UsuarioNaoAutorizadoException {
        if (usuario.getLogin().equals("soa") && usuario.getSenha().equals("soa")) {
            pedidoDAO.criarPedido(pedido);
        } else {
            throw new UsuarioNaoAutorizadoException("Usuário não autorizado");
        }
        pedidoDAO.criarPedido(pedido);
    }

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/pedidos", new PedidoService());
        System.out.println("Serviço de Pedidos inicializado!");
    }
}