
public class Usuario {
	
	private int notas;
	private String comentarios;
	private int data;
	private int notaNm;
	
	
	public  Usuario(){
		notas = this.notas;
		comentarios = this.comentarios;
		
	}
		public void opinarNota(int notas ){
			

			if (notas == -2 || notas == -1 || notas == 0 || notas == 1 || notas == 2){
				System.out.println("Voc� opinou " + notas);
			}
			
			else {
				System.out.println("Voc� nao pode opinar com essa nota");
			}
			
			
		}
		
		public void comentarAgora(String comentarios){
			if (comentarios.length() > 140 ){
				System.out.println("Voc� nao pode comentar, caracteres ultrapassaram");
			}
		}
		
		public void notaNamosca(){
			
		}
	
	

}
