package maven.demo;

public class Principal {
	
	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
		dao.conectar();

		
       
		Produto compra = new Produto (4, "feijão", 1);
		if(dao.inserirProduto(compra) == true) {
			System.out.println("Inser��o com sucesso -> " + compra.toString());
		}
		


		Produto[] compras = dao.getProdutos();
		System.out.println("==== Mostrar produtos === ");		
		for(int i = 0; i < compras.length; i++) {
			System.out.println(compras[i].toString());
		}
		
		dao.close();
	}
}